package typings.fluentBundle

import typings.fluentBundle.anon.Functions
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
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
      * The `locales` argument is used to instantiate `Intl` formatters used by
      * translations. The `options` object can be used to configure the bundle.
      *
      * Examples:
      *
      *     let bundle = new FluentBundle(["en-US", "en"]);
      *
      *     let bundle = new FluentBundle(locales, {useIsolating: false});
      *
      *     let bundle = new FluentBundle(locales, {
      *       useIsolating: true,
      *       functions: {
      *         NODE_ENV: () => process.env.NODE_ENV
      *       }
      *     });
      *
      * Available options:
      *
      *   - `functions` - an object of additional functions available to
      *     translations as builtins.
      *
      *   - `useIsolating` - boolean specifying whether to use Unicode isolation
      *     marks (FSI, PDI) for bidi interpolations. Default: `true`.
      *
      *   - `transform` - a function used to transform string parts of patterns.
      */
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, hasFunctionsUseIsolatingTransform: Functions) = this()
    def this(locales: js.Array[String], hasFunctionsUseIsolatingTransform: Functions) = this()
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
}
