package typings.fluent

import typings.std.Error
import typings.std.IterableIterator
import typings.std.Map
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fluent", "FluentBundle")
  @js.native
  class FluentBundle protected () extends StObject {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: FluentBundleContructorOptions) = this()
    def this(locales: js.Array[String], options: FluentBundleContructorOptions) = this()
    
    def addMessages(source: String): js.Array[String] = js.native
    
    def addResource(res: FluentResource): js.Array[String] = js.native
    
    def format(message: js.Array[FluentNode]): String = js.native
    def format(message: js.Array[FluentNode], args: js.Object): String = js.native
    def format(message: js.Array[FluentNode], args: js.Object, errors: js.Array[String | Error]): String = js.native
    def format(message: js.Array[FluentNode], args: Unit, errors: js.Array[String | Error]): String = js.native
    
    def getMessage(id: String): js.UndefOr[js.Array[FluentNode]] = js.native
    
    def hasMessage(id: String): Boolean = js.native
    
    var locales: js.Array[String] = js.native
    
    var messages: IterableIterator[js.Tuple2[String, js.Array[FluentNode]]] = js.native
  }
  
  @JSImport("fluent", "FluentDateTime")
  @js.native
  class FluentDateTime protected () extends FluentType {
    def this(value: js.Any, opts: js.Object) = this()
  }
  
  @JSImport("fluent", "FluentNone")
  @js.native
  class FluentNone protected () extends FluentType {
    def this(value: js.Any, opts: js.Object) = this()
  }
  
  @JSImport("fluent", "FluentNumber")
  @js.native
  class FluentNumber protected () extends FluentType {
    def this(value: js.Any, opts: js.Object) = this()
  }
  
  @JSImport("fluent", "FluentResource")
  @js.native
  class FluentResource ()
    extends StObject
       with Map[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for K */ js.Any, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ js.Any
        ]
  /* static members */
  object FluentResource {
    
    @JSImport("fluent", "FluentResource")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromString(source: String): FluentResource = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(source.asInstanceOf[js.Any]).asInstanceOf[FluentResource]
  }
  
  @JSImport("fluent", "FluentType")
  @js.native
  class FluentType protected () extends StObject {
    def this(value: js.Any, opts: js.Object) = this()
    
    def toString(bundle: FluentBundle): String = js.native
  }
  
  @scala.inline
  def ftl(strings: TemplateStringsArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ftl")(strings.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait FluentBundleContructorOptions extends StObject {
    
    var functions: js.UndefOr[js.Object] = js.undefined
    
    var transform: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var useIsolating: js.UndefOr[Boolean] = js.undefined
  }
  object FluentBundleContructorOptions {
    
    @scala.inline
    def apply(): FluentBundleContructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FluentBundleContructorOptions]
    }
    
    @scala.inline
    implicit class FluentBundleContructorOptionsMutableBuilder[Self <: FluentBundleContructorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctions(value: js.Object): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      @scala.inline
      def setTransform(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setUseIsolating(value: Boolean): Self = StObject.set(x, "useIsolating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseIsolatingUndefined: Self = StObject.set(x, "useIsolating", js.undefined)
    }
  }
  
  type FluentNode = FluentType | String
}
