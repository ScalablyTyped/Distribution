package typings.friendlyErrorsWebpackPlugin

import typings.friendlyErrorsWebpackPlugin.anon.Messages
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("friendly-errors-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with FriendlyErrorsWebpackPlugin {
    def this(options: Options) = this()
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
  
  @js.native
  trait FriendlyErrorsWebpackPlugin
    extends StObject
       with Plugin {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var additionalFormatters: js.UndefOr[
        js.Array[
          js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]]
        ]
      ] = js.undefined
    
    var additionalTransformers: js.UndefOr[js.Array[js.Function1[/* error */ js.Any, js.Any]]] = js.undefined
    
    var clearConsole: js.UndefOr[Boolean] = js.undefined
    
    var compilationSuccessInfo: js.UndefOr[Messages] = js.undefined
    
    var onErrors: js.UndefOr[js.Function2[/* severity */ Severity, /* errors */ String, Unit]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalFormatters(
        value: js.Array[
              js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]]
            ]
      ): Self = StObject.set(x, "additionalFormatters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalFormattersUndefined: Self = StObject.set(x, "additionalFormatters", js.undefined)
      
      @scala.inline
      def setAdditionalFormattersVarargs(value: (js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]])*): Self = StObject.set(x, "additionalFormatters", js.Array(value :_*))
      
      @scala.inline
      def setAdditionalTransformers(value: js.Array[js.Function1[/* error */ js.Any, js.Any]]): Self = StObject.set(x, "additionalTransformers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalTransformersUndefined: Self = StObject.set(x, "additionalTransformers", js.undefined)
      
      @scala.inline
      def setAdditionalTransformersVarargs(value: (js.Function1[/* error */ js.Any, js.Any])*): Self = StObject.set(x, "additionalTransformers", js.Array(value :_*))
      
      @scala.inline
      def setClearConsole(value: Boolean): Self = StObject.set(x, "clearConsole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearConsoleUndefined: Self = StObject.set(x, "clearConsole", js.undefined)
      
      @scala.inline
      def setCompilationSuccessInfo(value: Messages): Self = StObject.set(x, "compilationSuccessInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilationSuccessInfoUndefined: Self = StObject.set(x, "compilationSuccessInfo", js.undefined)
      
      @scala.inline
      def setOnErrors(value: (/* severity */ Severity, /* errors */ String) => Unit): Self = StObject.set(x, "onErrors", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnErrorsUndefined: Self = StObject.set(x, "onErrors", js.undefined)
    }
  }
  
  trait WebpackError extends StObject {
    
    var file: String
    
    var message: String
    
    var name: String
    
    var origin: String
    
    var severity: Severity
    
    var webpackError: js.Any
  }
  object WebpackError {
    
    @scala.inline
    def apply(
      file: String,
      message: String,
      name: String,
      origin: String,
      severity: Severity,
      webpackError: js.Any
    ): WebpackError = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], webpackError = webpackError.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackError]
    }
    
    @scala.inline
    implicit class WebpackErrorMutableBuilder[Self <: WebpackError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebpackError(value: js.Any): Self = StObject.set(x, "webpackError", value.asInstanceOf[js.Any])
    }
  }
}
