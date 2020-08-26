package typings.formatjsIntlUtils.numberTypesMod

import typings.formatjsIntlUtils.anon.RecordDecimalFormatNumLDM1000
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawCurrencyData extends js.Object {
  var accounting: String = js.native
  var currencySpacing: CurrencySpacingData = js.native
  var short: js.UndefOr[RecordDecimalFormatNumLDM1000] = js.native
  var standard: String = js.native
  var unitPattern: String = js.native
}

object RawCurrencyData {
  @scala.inline
  def apply(accounting: String, currencySpacing: CurrencySpacingData, standard: String, unitPattern: String): RawCurrencyData = {
    val __obj = js.Dynamic.literal(accounting = accounting.asInstanceOf[js.Any], currencySpacing = currencySpacing.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], unitPattern = unitPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawCurrencyData]
  }
  @scala.inline
  implicit class RawCurrencyDataOps[Self <: RawCurrencyData] (val x: Self) extends AnyVal {
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
    def setAccounting(value: String): Self = this.set("accounting", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrencySpacing(value: CurrencySpacingData): Self = this.set("currencySpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandard(value: String): Self = this.set("standard", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnitPattern(value: String): Self = this.set("unitPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: RecordDecimalFormatNumLDM1000): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
  }
  
}

