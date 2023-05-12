package typings.fluentBundle

import typings.fluentBundle.anon.Functions
import typings.fluentBundle.esmBundleMod.FluentVariable
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluent/bundle", "FluentBundle")
  @js.native
  open class FluentBundle protected ()
    extends typings.fluentBundle.esmBundleMod.FluentBundle {
    /**
      * Create an instance of `FluentBundle`.
      *
      * @example
      * ```js
      * let bundle = new FluentBundle(["en-US", "en"]);
      *
      * let bundle = new FluentBundle(locales, {useIsolating: false});
      *
      * let bundle = new FluentBundle(locales, {
      *   useIsolating: true,
      *   functions: {
      *     NODE_ENV: () => process.env.NODE_ENV
      *   }
      * });
      * ```
      *
      * @param locales - Used to instantiate `Intl` formatters used by translations.
      * @param options - Optional configuration for the bundle.
      */
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, param1: Functions) = this()
    def this(locales: js.Array[String], param1: Functions) = this()
  }
  
  @JSImport("@fluent/bundle", "FluentDateTime")
  @js.native
  open class FluentDateTime protected ()
    extends typings.fluentBundle.esmTypesMod.FluentDateTime {
    /**
      * Create an instance of `FluentDateTime` with options to the
      * `Intl.DateTimeFormat` constructor.
      *
      * @param value The number value of this `FluentDateTime`, in milliseconds.
      * @param opts Options which will be passed to `Intl.DateTimeFormat`.
      */
    def this(value: Double) = this()
    def this(value: Double, opts: DateTimeFormatOptions) = this()
  }
  
  @JSImport("@fluent/bundle", "FluentNone")
  @js.native
  /**
    * Create an instance of `FluentNone` with an optional fallback value.
    * @param value The fallback value of this `FluentNone`.
    */
  open class FluentNone ()
    extends typings.fluentBundle.esmTypesMod.FluentNone {
    def this(value: String) = this()
  }
  
  @JSImport("@fluent/bundle", "FluentNumber")
  @js.native
  open class FluentNumber protected ()
    extends typings.fluentBundle.esmTypesMod.FluentNumber {
    /**
      * Create an instance of `FluentNumber` with options to the
      * `Intl.NumberFormat` constructor.
      *
      * @param value The number value of this `FluentNumber`.
      * @param opts Options which will be passed to `Intl.NumberFormat`.
      */
    def this(value: Double) = this()
    def this(value: Double, opts: NumberFormatOptions) = this()
  }
  
  @JSImport("@fluent/bundle", "FluentResource")
  @js.native
  open class FluentResource protected ()
    extends typings.fluentBundle.esmResourceMod.FluentResource {
    def this(source: String) = this()
  }
  
  /* note: abstract class */ @JSImport("@fluent/bundle", "FluentType")
  @js.native
  open class FluentType[T] protected ()
    extends typings.fluentBundle.esmTypesMod.FluentType[T] {
    /**
      * Create a `FluentType` instance.
      *
      * @param value The JavaScript value to wrap.
      */
    def this(value: T) = this()
  }
  
  @JSImport("@fluent/bundle", "Scope")
  @js.native
  open class Scope protected ()
    extends typings.fluentBundle.esmScopeMod.Scope {
    def this(bundle: typings.fluentBundle.esmBundleMod.FluentBundle) = this()
    def this(bundle: typings.fluentBundle.esmBundleMod.FluentBundle, errors: js.Array[js.Error]) = this()
    def this(
      bundle: typings.fluentBundle.esmBundleMod.FluentBundle,
      errors: js.Array[js.Error],
      args: Record[String, FluentVariable]
    ) = this()
    def this(
      bundle: typings.fluentBundle.esmBundleMod.FluentBundle,
      errors: Null,
      args: Record[String, FluentVariable]
    ) = this()
  }
}
