package typings.formatjsIntlUnifiedNumberformat.coreMod

import typings.formatjsIntlUtils.numberTypesMod.NumberFormatDigitInternalSlots
import typings.formatjsIntlUtils.numberTypesMod.NumberFormatRoundingType
import typings.formatjsIntlUtils.numberTypesMod.NumberILD
import typings.formatjsIntlUtils.numberTypesMod.NumberLocalePatternData
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCompactDisplay
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencyDisplay
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencySign
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsNotation
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsSignDisplay
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsStyle
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsUnitDisplay
import typings.std.Intl.PluralRules
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnifiedNumberFormatInternal extends NumberFormatDigitInternalSlots {
  var boundFormat: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
  var compactDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCompactDisplay]]
  var currency: js.UndefOr[String] = js.undefined
  var currencyDisplay: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsCurrencyDisplay]]
  var currencySign: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCurrencySign]]
  var dataLocale: String
  var ild: NumberILD
  var locale: String
  @JSName("notation")
  var notation_UnifiedNumberFormatInternal: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsNotation]]
  var numberingSystem: String
  var patterns: NumberLocalePatternData
  var pl: PluralRules
  var signDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsSignDisplay]]
  var style: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsStyle]]
  var unit: js.UndefOr[String] = js.undefined
  var unitDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsUnitDisplay]]
  var useGrouping: Boolean
}

object UnifiedNumberFormatInternal {
  @scala.inline
  def apply(
    currencyDisplay: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsCurrencyDisplay]],
    dataLocale: String,
    ild: NumberILD,
    locale: String,
    minimumIntegerDigits: Double,
    numberingSystem: String,
    patterns: NumberLocalePatternData,
    pl: PluralRules,
    roundingType: NumberFormatRoundingType,
    style: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsStyle]],
    useGrouping: Boolean,
    boundFormat: /* value */ Double => String = null,
    compactDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCompactDisplay]] = null,
    currency: String = null,
    currencySign: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCurrencySign]] = null,
    maximumFractionDigits: js.UndefOr[Double] = js.undefined,
    maximumSignificantDigits: js.UndefOr[Double] = js.undefined,
    minimumFractionDigits: js.UndefOr[Double] = js.undefined,
    minimumSignificantDigits: js.UndefOr[Double] = js.undefined,
    notation: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsNotation]] = null,
    signDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsSignDisplay]] = null,
    unit: String = null,
    unitDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsUnitDisplay]] = null
  ): UnifiedNumberFormatInternal = {
    val __obj = js.Dynamic.literal(currencyDisplay = currencyDisplay.asInstanceOf[js.Any], dataLocale = dataLocale.asInstanceOf[js.Any], ild = ild.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], pl = pl.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    if (boundFormat != null) __obj.updateDynamic("boundFormat")(js.Any.fromFunction1(boundFormat))
    if (compactDisplay != null) __obj.updateDynamic("compactDisplay")(compactDisplay.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (currencySign != null) __obj.updateDynamic("currencySign")(currencySign.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumFractionDigits)) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumSignificantDigits)) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumFractionDigits)) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumSignificantDigits)) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.get.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unitDisplay != null) __obj.updateDynamic("unitDisplay")(unitDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedNumberFormatInternal]
  }
}

