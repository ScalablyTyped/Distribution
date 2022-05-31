package typings.fluentBundle

import typings.fluentBundle.mod.FluentBundleConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object FluentBundle {
    
    @JSGlobal("FluentBundle.FluentBundle")
    @js.native
    class FluentBundle protected ()
      extends typings.fluentBundle.mod.FluentBundle {
      def this(locales: String) = this()
      def this(locales: js.Array[String]) = this()
      def this(locales: String, options: FluentBundleConstructorOptions) = this()
      def this(locales: js.Array[String], options: FluentBundleConstructorOptions) = this()
    }
    
    @JSGlobal("FluentBundle.FluentDateTime")
    @js.native
    class FluentDateTime protected ()
      extends typings.fluentBundle.mod.FluentDateTime {
      /** Options passed to Intl.DateFormat. */
      def this(value: js.Any) = this()
      def this(value: js.Any, opts: js.Any) = this()
    }
    
    @JSGlobal("FluentBundle.FluentError")
    @js.native
    class FluentError ()
      extends typings.fluentBundle.mod.FluentError
    
    @JSGlobal("FluentBundle.FluentNumber")
    @js.native
    class FluentNumber protected ()
      extends typings.fluentBundle.mod.FluentNumber {
      /** Options passed to Intl.NumberFormat. */
      def this(value: js.Any) = this()
      def this(value: js.Any, opts: js.Any) = this()
    }
    
    @JSGlobal("FluentBundle.FluentResource")
    @js.native
    class FluentResource protected ()
      extends typings.fluentBundle.mod.FluentResource {
      def this(source: String) = this()
    }
    
    @JSGlobal("FluentBundle.FluentType")
    @js.native
    class FluentType protected ()
      extends typings.fluentBundle.mod.FluentType {
      def this(value: js.Any) = this()
    }
  }
}
