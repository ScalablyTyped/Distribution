package typings.globalize.distGlobalizeCurrencyMod.distGlobalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shared extends js.Object {
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

