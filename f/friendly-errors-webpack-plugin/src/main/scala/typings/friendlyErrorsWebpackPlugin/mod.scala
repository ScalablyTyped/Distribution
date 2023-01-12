package typings.friendlyErrorsWebpackPlugin

import typings.friendlyErrorsWebpackPlugin.anon.Messages
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("friendly-errors-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FriendlyErrorsWebpackPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  @js.native
  sealed trait Severity extends StObject
  @JSImport("friendly-errors-webpack-plugin", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Severity & String] = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with Severity
    /* "error" */ val Error: typings.friendlyErrorsWebpackPlugin.mod.Severity.Error & String = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with Severity
    /* "warning" */ val Warning: typings.friendlyErrorsWebpackPlugin.mod.Severity.Warning & String = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ trait FriendlyErrorsWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object FriendlyErrorsWebpackPlugin {
    
    inline def apply(apply: Compiler => Unit): FriendlyErrorsWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[FriendlyErrorsWebpackPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FriendlyErrorsWebpackPlugin] (val x: Self) extends AnyVal {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    var additionalFormatters: js.UndefOr[
        js.Array[
          js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]]
        ]
      ] = js.undefined
    
    var additionalTransformers: js.UndefOr[js.Array[js.Function1[/* error */ Any, Any]]] = js.undefined
    
    var clearConsole: js.UndefOr[Boolean] = js.undefined
    
    var compilationSuccessInfo: js.UndefOr[Messages] = js.undefined
    
    var onErrors: js.UndefOr[js.Function2[/* severity */ Severity, /* errors */ String, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAdditionalFormatters(
        value: js.Array[
              js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]]
            ]
      ): Self = StObject.set(x, "additionalFormatters", value.asInstanceOf[js.Any])
      
      inline def setAdditionalFormattersUndefined: Self = StObject.set(x, "additionalFormatters", js.undefined)
      
      inline def setAdditionalFormattersVarargs(value: (js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]])*): Self = StObject.set(x, "additionalFormatters", js.Array(value*))
      
      inline def setAdditionalTransformers(value: js.Array[js.Function1[/* error */ Any, Any]]): Self = StObject.set(x, "additionalTransformers", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTransformersUndefined: Self = StObject.set(x, "additionalTransformers", js.undefined)
      
      inline def setAdditionalTransformersVarargs(value: (js.Function1[/* error */ Any, Any])*): Self = StObject.set(x, "additionalTransformers", js.Array(value*))
      
      inline def setClearConsole(value: Boolean): Self = StObject.set(x, "clearConsole", value.asInstanceOf[js.Any])
      
      inline def setClearConsoleUndefined: Self = StObject.set(x, "clearConsole", js.undefined)
      
      inline def setCompilationSuccessInfo(value: Messages): Self = StObject.set(x, "compilationSuccessInfo", value.asInstanceOf[js.Any])
      
      inline def setCompilationSuccessInfoUndefined: Self = StObject.set(x, "compilationSuccessInfo", js.undefined)
      
      inline def setOnErrors(value: (/* severity */ Severity, /* errors */ String) => Unit): Self = StObject.set(x, "onErrors", js.Any.fromFunction2(value))
      
      inline def setOnErrorsUndefined: Self = StObject.set(x, "onErrors", js.undefined)
    }
  }
  
  trait WebpackError extends StObject {
    
    var file: String
    
    var message: String
    
    var name: String
    
    var origin: String
    
    var severity: Severity
    
    var webpackError: Any
  }
  object WebpackError {
    
    inline def apply(file: String, message: String, name: String, origin: String, severity: Severity, webpackError: Any): WebpackError = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], webpackError = webpackError.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebpackError] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setWebpackError(value: Any): Self = StObject.set(x, "webpackError", value.asInstanceOf[js.Any])
    }
  }
}
