package typings.fluentBundle

import typings.fluentBundle.esmScopeMod.Scope
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmTypesMod {
  
  @JSImport("@fluent/bundle/esm/types", "FluentDateTime")
  @js.native
  open class FluentDateTime protected () extends FluentType[Double] {
    /**
      * Create an instance of `FluentDateTime` with options to the
      * `Intl.DateTimeFormat` constructor.
      *
      * @param value The number value of this `FluentDateTime`, in milliseconds.
      * @param opts Options which will be passed to `Intl.DateTimeFormat`.
      */
    def this(value: Double) = this()
    def this(value: Double, opts: DateTimeFormatOptions) = this()
    
    /** Options passed to `Intl.DateTimeFormat`. */
    var opts: DateTimeFormatOptions = js.native
  }
  
  @JSImport("@fluent/bundle/esm/types", "FluentNone")
  @js.native
  /**
    * Create an instance of `FluentNone` with an optional fallback value.
    * @param value The fallback value of this `FluentNone`.
    */
  open class FluentNone () extends FluentType[String] {
    def this(value: String) = this()
  }
  
  @JSImport("@fluent/bundle/esm/types", "FluentNumber")
  @js.native
  open class FluentNumber protected () extends FluentType[Double] {
    /**
      * Create an instance of `FluentNumber` with options to the
      * `Intl.NumberFormat` constructor.
      *
      * @param value The number value of this `FluentNumber`.
      * @param opts Options which will be passed to `Intl.NumberFormat`.
      */
    def this(value: Double) = this()
    def this(value: Double, opts: NumberFormatOptions) = this()
    
    /** Options passed to `Intl.NumberFormat`. */
    var opts: NumberFormatOptions = js.native
  }
  
  /* note: abstract class */ @JSImport("@fluent/bundle/esm/types", "FluentType")
  @js.native
  open class FluentType[T] protected () extends StObject {
    /**
      * Create a `FluentType` instance.
      *
      * @param value The JavaScript value to wrap.
      */
    def this(value: T) = this()
    
    /**
      * Format this instance of `FluentType` to a string.
      *
      * Formatted values are suitable for use outside of the `FluentBundle`.
      * This method can use `Intl` formatters available through the `scope`
      * argument.
      */
    def toString(scope: Scope): String = js.native
    
    /** The wrapped native value. */
    var value: T = js.native
  }
  
  type FluentFunction = js.Function2[
    /* positional */ js.Array[FluentValue], 
    /* named */ Record[String, FluentValue], 
    FluentValue
  ]
  
  type FluentValue = FluentType[Any] | String
}
