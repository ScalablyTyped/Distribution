package typings.fluentBundle

import typings.fluentBundle.mod.FluentBundleConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compatMod {
  
  @JSImport("@fluent/bundle/compat", "FluentBundle")
  @js.native
  class FluentBundle protected ()
    extends typings.fluentBundle.mod.FluentBundle {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: FluentBundleConstructorOptions) = this()
    def this(locales: js.Array[String], options: FluentBundleConstructorOptions) = this()
  }
  
  @JSImport("@fluent/bundle/compat", "FluentDateTime")
  @js.native
  class FluentDateTime protected ()
    extends typings.fluentBundle.mod.FluentDateTime {
    /** Options passed to Intl.DateFormat. */
    def this(value: js.Any) = this()
    def this(value: js.Any, opts: js.Any) = this()
  }
  
  @JSImport("@fluent/bundle/compat", "FluentError")
  @js.native
  class FluentError ()
    extends typings.fluentBundle.mod.FluentError
  
  @JSImport("@fluent/bundle/compat", "FluentNumber")
  @js.native
  class FluentNumber protected ()
    extends typings.fluentBundle.mod.FluentNumber {
    /** Options passed to Intl.NumberFormat. */
    def this(value: js.Any) = this()
    def this(value: js.Any, opts: js.Any) = this()
  }
  
  @JSImport("@fluent/bundle/compat", "FluentResource")
  @js.native
  class FluentResource protected ()
    extends typings.fluentBundle.mod.FluentResource {
    def this(source: String) = this()
  }
  
  @JSImport("@fluent/bundle/compat", "FluentType")
  @js.native
  class FluentType protected ()
    extends typings.fluentBundle.mod.FluentType {
    def this(value: js.Any) = this()
  }
}
