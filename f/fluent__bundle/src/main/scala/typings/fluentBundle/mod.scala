package typings.fluentBundle

import org.scalablytyped.runtime.Instantiable2
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluent/bundle", "FluentBundle")
  @js.native
  class FluentBundle protected () extends StObject {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: FluentBundleConstructorOptions) = this()
    def this(locales: js.Array[String], options: FluentBundleConstructorOptions) = this()
    
    def addResource(res: FluentResource): js.Array[String] = js.native
    def addResource(res: FluentResource, options: FluentBundleAddResourceOptions): js.Array[String] = js.native
    
    def formatPattern(pattern: String): String = js.native
    def formatPattern(pattern: String, args: js.Object): String = js.native
    def formatPattern(pattern: String, args: js.Object, errors: js.Array[Error]): String = js.native
    def formatPattern(pattern: String, args: Unit, errors: js.Array[Error]): String = js.native
    def formatPattern(pattern: Pattern): String = js.native
    def formatPattern(pattern: Pattern, args: js.Object): String = js.native
    def formatPattern(pattern: Pattern, args: js.Object, errors: js.Array[Error]): String = js.native
    def formatPattern(pattern: Pattern, args: Unit, errors: js.Array[Error]): String = js.native
    
    def getMessage(id: String): RawMessage = js.native
    
    def hasMessage(id: String): Boolean = js.native
    
    var locales: js.Array[String] = js.native
  }
  
  @JSImport("@fluent/bundle", "FluentDateTime")
  @js.native
  class FluentDateTime protected () extends FluentType {
    /** Options passed to Intl.DateFormat. */
    def this(value: js.Any) = this()
    def this(value: js.Any, opts: js.Any) = this()
  }
  
  @JSImport("@fluent/bundle", "FluentError")
  @js.native
  class FluentError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@fluent/bundle", "FluentNumber")
  @js.native
  class FluentNumber protected () extends FluentType {
    /** Options passed to Intl.NumberFormat. */
    def this(value: js.Any) = this()
    def this(value: js.Any, opts: js.Any) = this()
  }
  
  @JSImport("@fluent/bundle", "FluentResource")
  @js.native
  class FluentResource protected () extends StObject {
    def this(source: String) = this()
  }
  
  @JSImport("@fluent/bundle", "FluentType")
  @js.native
  class FluentType protected () extends StObject {
    def this(value: js.Any) = this()
    
    def toString(scope: Scope): String = js.native
  }
  
  trait FluentBundleAddResourceOptions extends StObject {
    
    var allowOverrides: js.UndefOr[Boolean] = js.undefined
  }
  object FluentBundleAddResourceOptions {
    
    inline def apply(): FluentBundleAddResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FluentBundleAddResourceOptions]
    }
    
    extension [Self <: FluentBundleAddResourceOptions](x: Self) {
      
      inline def setAllowOverrides(value: Boolean): Self = StObject.set(x, "allowOverrides", value.asInstanceOf[js.Any])
      
      inline def setAllowOverridesUndefined: Self = StObject.set(x, "allowOverrides", js.undefined)
    }
  }
  
  trait FluentBundleConstructorOptions extends StObject {
    
    var functions: js.UndefOr[js.Object] = js.undefined
    
    var transform: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var useIsolating: js.UndefOr[Boolean] = js.undefined
  }
  object FluentBundleConstructorOptions {
    
    inline def apply(): FluentBundleConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FluentBundleConstructorOptions]
    }
    
    extension [Self <: FluentBundleConstructorOptions](x: Self) {
      
      inline def setFunctions(value: js.Object): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setTransform(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setUseIsolating(value: Boolean): Self = StObject.set(x, "useIsolating", value.asInstanceOf[js.Any])
      
      inline def setUseIsolatingUndefined: Self = StObject.set(x, "useIsolating", js.undefined)
    }
  }
  
  trait Pattern extends StObject
  
  trait RawMessage extends StObject {
    
    var attributes: Record[String, Pattern]
    
    var value: Pattern | Null
  }
  object RawMessage {
    
    inline def apply(attributes: Record[String, Pattern]): RawMessage = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[RawMessage]
    }
    
    extension [Self <: RawMessage](x: Self) {
      
      inline def setAttributes(value: Record[String, Pattern]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Pattern): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait Scope extends StObject {
    
    def cloneForTermReference(args: js.Object): Scope
    
    def memoizeIntlObject[OptsType, ObjectType](
      ctor: Instantiable2[/* locales */ js.Array[String], /* opts */ OptsType, ObjectType],
      opts: OptsType
    ): ObjectType
    
    def reportError(error: String): Unit
  }
  object Scope {
    
    inline def apply(
      cloneForTermReference: js.Object => Scope,
      memoizeIntlObject: (Instantiable2[/* locales */ js.Array[String], js.Any, js.Any], js.Any) => js.Any,
      reportError: String => Unit
    ): Scope = {
      val __obj = js.Dynamic.literal(cloneForTermReference = js.Any.fromFunction1(cloneForTermReference), memoizeIntlObject = js.Any.fromFunction2(memoizeIntlObject), reportError = js.Any.fromFunction1(reportError))
      __obj.asInstanceOf[Scope]
    }
    
    extension [Self <: Scope](x: Self) {
      
      inline def setCloneForTermReference(value: js.Object => Scope): Self = StObject.set(x, "cloneForTermReference", js.Any.fromFunction1(value))
      
      inline def setMemoizeIntlObject(value: (Instantiable2[/* locales */ js.Array[String], js.Any, js.Any], js.Any) => js.Any): Self = StObject.set(x, "memoizeIntlObject", js.Any.fromFunction2(value))
      
      inline def setReportError(value: String => Unit): Self = StObject.set(x, "reportError", js.Any.fromFunction1(value))
    }
  }
}
