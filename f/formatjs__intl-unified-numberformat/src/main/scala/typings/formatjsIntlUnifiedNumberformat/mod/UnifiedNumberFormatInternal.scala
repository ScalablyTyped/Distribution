package typings.formatjsIntlUnifiedNumberformat.mod

import typings.formatjsIntlUtils.numberTypesMod.NumberFormatDigitInternalSlots
import typings.formatjsIntlUtils.numberTypesMod.NumberFormatRoundingType
import typings.formatjsIntlUtils.numberTypesMod.NumberILD
import typings.formatjsIntlUtils.numberTypesMod.NumberLocalePatternData
import typings.std.Intl.PluralRules
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnifiedNumberFormatInternal extends NumberFormatDigitInternalSlots {
  var boundFormat: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
  var compactDisplay: NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['compactDisplay'] */ js.Any
  ]
  var currency: js.UndefOr[String] = js.undefined
  var currencyDisplay: NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['currencyDisplay'] */ js.Any
  ]
  var currencySign: NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['currencySign'] */ js.Any
  ]
  var dataLocale: String
  var ild: NumberILD
  var locale: String
  @JSName("notation")
  var notation_UnifiedNumberFormatInternal: NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['notation'] */ js.Any
  ]
  var numberingSystem: String
  var patterns: NumberLocalePatternData
  var pl: PluralRules
  var signDisplay: NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['signDisplay'] */ js.Any
  ]
  var style: NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['style'] */ js.Any
  ]
  var unit: js.UndefOr[String] = js.undefined
  var unitDisplay: NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['unitDisplay'] */ js.Any
  ]
  var useGrouping: Boolean
}

object UnifiedNumberFormatInternal {
  @scala.inline
  def apply(
    compactDisplay: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['compactDisplay'] */ js.Any
    ],
    currencyDisplay: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['currencyDisplay'] */ js.Any
    ],
    currencySign: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['currencySign'] */ js.Any
    ],
    dataLocale: String,
    ild: NumberILD,
    locale: String,
    minimumIntegerDigits: Double,
    notation: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['notation'] */ js.Any
    ],
    numberingSystem: String,
    patterns: NumberLocalePatternData,
    pl: PluralRules,
    roundingType: NumberFormatRoundingType,
    signDisplay: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['signDisplay'] */ js.Any
    ],
    style: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['style'] */ js.Any
    ],
    unitDisplay: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions['unitDisplay'] */ js.Any
    ],
    useGrouping: Boolean,
    boundFormat: /* value */ Double => String = null,
    currency: String = null,
    maximumFractionDigits: Int | Double = null,
    maximumSignificantDigits: Int | Double = null,
    minimumFractionDigits: Int | Double = null,
    minimumSignificantDigits: Int | Double = null,
    unit: String = null
  ): UnifiedNumberFormatInternal = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencyDisplay = currencyDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], dataLocale = dataLocale.asInstanceOf[js.Any], ild = ild.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], pl = pl.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any], signDisplay = signDisplay.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    if (boundFormat != null) __obj.updateDynamic("boundFormat")(js.Any.fromFunction1(boundFormat))
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedNumberFormatInternal]
  }
}

