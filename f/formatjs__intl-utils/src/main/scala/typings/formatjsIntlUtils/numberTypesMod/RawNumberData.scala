package typings.formatjsIntlUtils.numberTypesMod

import typings.formatjsIntlUtils.anon.LongRecordDecimalFormatNumLDM1000
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawNumberData extends js.Object {
  var currency: Record[NumberingSystem, RawCurrencyData] = js.native
  var decimal: Record[NumberingSystem, LongRecordDecimalFormatNumLDM1000] = js.native
  var nu: js.Array[String] = js.native
  var percent: Record[NumberingSystem, String] = js.native
  var symbols: Record[NumberingSystem, SymbolsData] = js.native
}

object RawNumberData {
  @scala.inline
  def apply(
    currency: Record[NumberingSystem, RawCurrencyData],
    decimal: Record[NumberingSystem, LongRecordDecimalFormatNumLDM1000],
    nu: js.Array[String],
    percent: Record[NumberingSystem, String],
    symbols: Record[NumberingSystem, SymbolsData]
  ): RawNumberData = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawNumberData]
  }
  @scala.inline
  implicit class RawNumberDataOps[Self <: RawNumberData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrency(value: Record[NumberingSystem, RawCurrencyData]): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecimal(value: Record[NumberingSystem, LongRecordDecimalFormatNumLDM1000]): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def setNuVarargs(value: String*): Self = this.set("nu", js.Array(value :_*))
    @scala.inline
    def setNu(value: js.Array[String]): Self = this.set("nu", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercent(value: Record[NumberingSystem, String]): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbols(value: Record[NumberingSystem, SymbolsData]): Self = this.set("symbols", value.asInstanceOf[js.Any])
  }
  
}

