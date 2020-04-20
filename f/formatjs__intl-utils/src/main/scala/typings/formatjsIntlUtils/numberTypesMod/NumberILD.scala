package typings.formatjsIntlUtils.numberTypesMod

import typings.formatjsIntlUtils.AnonCompactLong
import typings.formatjsIntlUtils.AnonCurrencyName
import typings.formatjsIntlUtils.AnonDecimal
import typings.formatjsIntlUtils.AnonUnitName
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberILD extends js.Object {
  var currency: AnonCompactLong
  var currencySymbols: Record[String, AnonCurrencyName]
  var decimal: AnonCompactLong
  var symbols: AnonDecimal
  var unitSymbols: Record[String, AnonUnitName]
}

object NumberILD {
  @scala.inline
  def apply(
    currency: AnonCompactLong,
    currencySymbols: Record[String, AnonCurrencyName],
    decimal: AnonCompactLong,
    symbols: AnonDecimal,
    unitSymbols: Record[String, AnonUnitName]
  ): NumberILD = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], currencySymbols = currencySymbols.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], unitSymbols = unitSymbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberILD]
  }
}

