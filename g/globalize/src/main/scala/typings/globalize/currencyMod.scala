package typings.globalize

import org.scalablytyped.runtime.Shortcut
import typings.cldrjs.mod.CldrStatic
import typings.globalize.globalizeMod.CommonNumberFormatterOptions
import typings.globalize.globalizeMod.Shared
import typings.globalize.globalizeMod.Static
import typings.globalize.globalizeStrings.accounting
import typings.globalize.globalizeStrings.code
import typings.globalize.globalizeStrings.name
import typings.globalize.globalizeStrings.symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object currencyMod extends Shortcut {
  
  @JSImport("globalize/dist/globalize/currency", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("globalize/dist/globalize/currency", JSImport.Namespace)
  @js.native
  class Class protected () extends Shared {
    /**
      * Create a Globalize instance.
      * @param cldr Cldr instance of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(cldr: CldrStatic) = this()
    /**
      * Create a Globalize instance.
      * @param {string} Locale string of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(locale: String) = this()
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `currencyMod.foo` */
  override def _to: Static = ^
  
  /* augmented module */
  object globalizeDistGlobalizeAugmentingMod {
    
    @js.native
    trait CurrencyFormatterOptions extends CommonNumberFormatterOptions {
      
      /**
        * symbol (default), accounting, code or name.
        */
      var style: js.UndefOr[symbol | accounting | code | name] = js.native
    }
    object CurrencyFormatterOptions {
      
      @scala.inline
      def apply(): CurrencyFormatterOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CurrencyFormatterOptions]
      }
      
      @scala.inline
      implicit class CurrencyFormatterOptionsMutableBuilder[Self <: CurrencyFormatterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStyle(value: symbol | accounting | code | name): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
    
    @js.native
    trait Shared extends StObject {
      
      /**
        * Return a function that formats a currency according to the given options or locale's defaults.
        * The returned function is invoked with one argument: the Number value to be formatted.
        * @param {string} currency 3-letter currency code as defined by ISO 4217, eg. USD.
        * @param {CurrencyFormatterOptions} options A JSON object including none or any of the following options.
        * @returns {Function} Return a function that formats a currency
        */
      def currencyFormatter(currency: String): js.Function1[/* value */ Double, String] = js.native
      def currencyFormatter(currency: String, options: CurrencyFormatterOptions): js.Function1[/* value */ Double, String] = js.native
      
      /**
        * Return a currency formatted according to the given options or locale's defaults.
        * @param {number} value The value to format.
        * @param {string} currency 3-letter currency code as defined by ISO 4217, eg. USD.
        * @param {CurrencyFormatterOptions} options A JSON object including none or any of the following options.
        * @returns {string} Return a string formatted in the currency according to the value and the options
        */
      def formatCurrency(value: Double, currency: String): String = js.native
      def formatCurrency(value: Double, currency: String, options: CurrencyFormatterOptions): String = js.native
    }
  }
}
