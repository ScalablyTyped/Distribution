package typings.formatjsIntlUtils.numberTypesMod

import typings.formatjsIntlUtils.RecordDecimalFormatNumLDM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawCurrencyData extends js.Object {
  var accounting: String
  var currencySpacing: CurrencySpacingData
  var short: js.UndefOr[RecordDecimalFormatNumLDM] = js.undefined
  var standard: String
  var unitPattern: String
}

object RawCurrencyData {
  @scala.inline
  def apply(
    accounting: String,
    currencySpacing: CurrencySpacingData,
    standard: String,
    unitPattern: String,
    short: RecordDecimalFormatNumLDM = null
  ): RawCurrencyData = {
    val __obj = js.Dynamic.literal(accounting = accounting.asInstanceOf[js.Any], currencySpacing = currencySpacing.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], unitPattern = unitPattern.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawCurrencyData]
  }
}

