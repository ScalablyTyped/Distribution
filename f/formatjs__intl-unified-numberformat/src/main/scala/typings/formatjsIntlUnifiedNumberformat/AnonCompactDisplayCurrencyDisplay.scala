package typings.formatjsIntlUnifiedNumberformat

import typings.formatjsIntlUnifiedNumberformat.mod.Unit
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCompactDisplay
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencyDisplay
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencySign
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsLocaleMatcher
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsNotation
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsSignDisplay
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsStyle
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsUnitDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompactDisplayCurrencyDisplay extends js.Object {
  var compactDisplay: js.UndefOr[UnifiedNumberFormatOptionsCompactDisplay] = js.undefined
  var currencyDisplay: js.UndefOr[UnifiedNumberFormatOptionsCurrencyDisplay] = js.undefined
  var currencySign: js.UndefOr[UnifiedNumberFormatOptionsCurrencySign] = js.undefined
  var localeMatcher: js.UndefOr[UnifiedNumberFormatOptionsLocaleMatcher] = js.undefined
  var notation: js.UndefOr[UnifiedNumberFormatOptionsNotation] = js.undefined
  var signDisplay: js.UndefOr[UnifiedNumberFormatOptionsSignDisplay] = js.undefined
  var style: js.UndefOr[UnifiedNumberFormatOptionsStyle] = js.undefined
  var unit: js.UndefOr[Unit] = js.undefined
  var unitDisplay: js.UndefOr[UnifiedNumberFormatOptionsUnitDisplay] = js.undefined
}

object AnonCompactDisplayCurrencyDisplay {
  @scala.inline
  def apply(
    compactDisplay: UnifiedNumberFormatOptionsCompactDisplay = null,
    currencyDisplay: UnifiedNumberFormatOptionsCurrencyDisplay = null,
    currencySign: UnifiedNumberFormatOptionsCurrencySign = null,
    localeMatcher: UnifiedNumberFormatOptionsLocaleMatcher = null,
    notation: UnifiedNumberFormatOptionsNotation = null,
    signDisplay: UnifiedNumberFormatOptionsSignDisplay = null,
    style: UnifiedNumberFormatOptionsStyle = null,
    unit: Unit = null,
    unitDisplay: UnifiedNumberFormatOptionsUnitDisplay = null
  ): AnonCompactDisplayCurrencyDisplay = {
    val __obj = js.Dynamic.literal()
    if (compactDisplay != null) __obj.updateDynamic("compactDisplay")(compactDisplay.asInstanceOf[js.Any])
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
    if (currencySign != null) __obj.updateDynamic("currencySign")(currencySign.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unitDisplay != null) __obj.updateDynamic("unitDisplay")(unitDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompactDisplayCurrencyDisplay]
  }
}

