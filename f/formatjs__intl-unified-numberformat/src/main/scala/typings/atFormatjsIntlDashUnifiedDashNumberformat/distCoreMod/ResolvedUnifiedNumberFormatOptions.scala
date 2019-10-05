package typings.atFormatjsIntlDashUnifiedDashNumberformat.distCoreMod

import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.long
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.narrow
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.short
import typings.atFormatjsIntlDashUnifiedDashNumberformat.distUnitsDashConstantsMod.Unit
import typings.std.Intl.ResolvedNumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedUnifiedNumberFormatOptions extends ResolvedNumberFormatOptions {
  var unit: js.UndefOr[Unit] = js.undefined
  var unitDisplay: js.UndefOr[long | short | narrow] = js.undefined
}

object ResolvedUnifiedNumberFormatOptions {
  @scala.inline
  def apply(
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    numberingSystem: String,
    style: String,
    useGrouping: Boolean,
    currency: String = null,
    currencyDisplay: String = null,
    maximumSignificantDigits: Int | Double = null,
    minimumSignificantDigits: Int | Double = null,
    unit: Unit = null,
    unitDisplay: long | short | narrow = null
  ): ResolvedUnifiedNumberFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale, maximumFractionDigits = maximumFractionDigits, minimumFractionDigits = minimumFractionDigits, minimumIntegerDigits = minimumIntegerDigits, numberingSystem = numberingSystem, style = style, useGrouping = useGrouping)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay)
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (unitDisplay != null) __obj.updateDynamic("unitDisplay")(unitDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedUnifiedNumberFormatOptions]
  }
}

