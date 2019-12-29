package typings.atFormatjsIntlDashUtils.distNumberDashTypesMod

import typings.atFormatjsIntlDashUtils.Anon_Long
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawNumberData extends js.Object {
  var currency: Record[NumberingSystem, RawCurrencyData]
  var decimal: Record[NumberingSystem, Anon_Long]
  var nu: js.Array[String]
  var percent: Record[NumberingSystem, String]
  var symbols: Record[NumberingSystem, SymbolsData]
}

object RawNumberData {
  @scala.inline
  def apply(
    currency: Record[NumberingSystem, RawCurrencyData],
    decimal: Record[NumberingSystem, Anon_Long],
    nu: js.Array[String],
    percent: Record[NumberingSystem, String],
    symbols: Record[NumberingSystem, SymbolsData]
  ): RawNumberData = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RawNumberData]
  }
}

