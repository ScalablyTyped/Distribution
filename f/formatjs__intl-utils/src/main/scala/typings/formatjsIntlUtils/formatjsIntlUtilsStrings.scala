package typings.formatjsIntlUtils

import typings.formatjsIntlUtils.diffMod.Unit
import typings.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typings.formatjsIntlUtils.numberTypesMod.NumberFormatNotation
import typings.formatjsIntlUtils.numberTypesMod.NumberFormatRoundingType
import typings.formatjsIntlUtils.pluralRulesTypesMod.LDMLPluralRule
import typings.formatjsIntlUtils.relativeTimeTypesMod.RelativeTimeField
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

object formatjsIntlUtilsStrings {
  @js.native
  sealed trait `1000` extends DecimalFormatNum
  
  @js.native
  sealed trait `10000` extends DecimalFormatNum
  
  @js.native
  sealed trait `100000` extends DecimalFormatNum
  
  @js.native
  sealed trait `1000000` extends DecimalFormatNum
  
  @js.native
  sealed trait `10000000` extends DecimalFormatNum
  
  @js.native
  sealed trait `100000000` extends DecimalFormatNum
  
  @js.native
  sealed trait `1000000000` extends DecimalFormatNum
  
  @js.native
  sealed trait `10000000000` extends DecimalFormatNum
  
  @js.native
  sealed trait `100000000000` extends DecimalFormatNum
  
  @js.native
  sealed trait `1000000000000` extends DecimalFormatNum
  
  @js.native
  sealed trait `10000000000000` extends DecimalFormatNum
  
  @js.native
  sealed trait `100000000000000` extends DecimalFormatNum
  
  @js.native
  sealed trait RelativeTimeData extends js.Object
  
  @js.native
  sealed trait accounting extends UnifiedNumberFormatOptionsCurrencySign
  
  @js.native
  sealed trait always extends UnifiedNumberFormatOptionsSignDisplay
  
  @js.native
  sealed trait auto extends UnifiedNumberFormatOptionsSignDisplay
  
  @js.native
  sealed trait `best fit` extends UnifiedNumberFormatOptionsLocaleMatcher
  
  @js.native
  sealed trait boolean extends js.Object
  
  @js.native
  sealed trait code extends UnifiedNumberFormatOptionsCurrencyDisplay
  
  @js.native
  sealed trait compact
    extends NumberFormatNotation
       with UnifiedNumberFormatOptionsNotation
  
  @js.native
  sealed trait compactRounding extends NumberFormatRoundingType
  
  @js.native
  sealed trait createResolveLocale extends js.Object
  
  @js.native
  sealed trait currency extends UnifiedNumberFormatOptionsStyle
  
  @js.native
  sealed trait day
    extends RelativeTimeField
       with Unit
  
  @js.native
  sealed trait `day-narrow` extends RelativeTimeField
  
  @js.native
  sealed trait `day-short` extends RelativeTimeField
  
  @js.native
  sealed trait decimal extends UnifiedNumberFormatOptionsStyle
  
  @js.native
  sealed trait engineering
    extends NumberFormatNotation
       with UnifiedNumberFormatOptionsNotation
  
  @js.native
  sealed trait exceptZero extends UnifiedNumberFormatOptionsSignDisplay
  
  @js.native
  sealed trait few extends LDMLPluralRule
  
  @js.native
  sealed trait fractionDigits extends NumberFormatRoundingType
  
  @js.native
  sealed trait hour
    extends RelativeTimeField
       with Unit
  
  @js.native
  sealed trait `hour-narrow` extends RelativeTimeField
  
  @js.native
  sealed trait `hour-short` extends RelativeTimeField
  
  @js.native
  sealed trait literal extends js.Object
  
  @js.native
  sealed trait long
    extends UnifiedNumberFormatOptionsCompactDisplay
       with UnifiedNumberFormatOptionsUnitDisplay
  
  @js.native
  sealed trait lookup extends UnifiedNumberFormatOptionsLocaleMatcher
  
  @js.native
  sealed trait many extends LDMLPluralRule
  
  @js.native
  sealed trait minute
    extends RelativeTimeField
       with Unit
  
  @js.native
  sealed trait `minute-narrow` extends RelativeTimeField
  
  @js.native
  sealed trait `minute-short` extends RelativeTimeField
  
  @js.native
  sealed trait month
    extends RelativeTimeField
       with Unit
  
  @js.native
  sealed trait `month-narrow` extends RelativeTimeField
  
  @js.native
  sealed trait `month-short` extends RelativeTimeField
  
  @js.native
  sealed trait name extends UnifiedNumberFormatOptionsCurrencyDisplay
  
  @js.native
  sealed trait narrow extends UnifiedNumberFormatOptionsUnitDisplay
  
  @js.native
  sealed trait narrowSymbol extends UnifiedNumberFormatOptionsCurrencyDisplay
  
  @js.native
  sealed trait never extends UnifiedNumberFormatOptionsSignDisplay
  
  @js.native
  sealed trait one extends LDMLPluralRule
  
  @js.native
  sealed trait other extends LDMLPluralRule
  
  @js.native
  sealed trait percent extends UnifiedNumberFormatOptionsStyle
  
  @js.native
  sealed trait quarter
    extends RelativeTimeField
       with Unit
  
  @js.native
  sealed trait `quarter-narrow` extends RelativeTimeField
  
  @js.native
  sealed trait `quarter-short` extends RelativeTimeField
  
  @js.native
  sealed trait scientific
    extends NumberFormatNotation
       with UnifiedNumberFormatOptionsNotation
  
  @js.native
  sealed trait second
    extends RelativeTimeField
       with Unit
  
  @js.native
  sealed trait `second-narrow` extends RelativeTimeField
  
  @js.native
  sealed trait `second-short` extends RelativeTimeField
  
  @js.native
  sealed trait short
    extends UnifiedNumberFormatOptionsCompactDisplay
       with UnifiedNumberFormatOptionsUnitDisplay
  
  @js.native
  sealed trait significantDigits extends NumberFormatRoundingType
  
  @js.native
  sealed trait standard
    extends NumberFormatNotation
       with UnifiedNumberFormatOptionsCurrencySign
       with UnifiedNumberFormatOptionsNotation
  
  @js.native
  sealed trait string extends js.Object
  
  @js.native
  sealed trait symbol extends UnifiedNumberFormatOptionsCurrencyDisplay
  
  @js.native
  sealed trait two extends LDMLPluralRule
  
  @js.native
  sealed trait unit extends UnifiedNumberFormatOptionsStyle
  
  @js.native
  sealed trait week
    extends RelativeTimeField
       with Unit
  
  @js.native
  sealed trait `week-narrow` extends RelativeTimeField
  
  @js.native
  sealed trait `week-short` extends RelativeTimeField
  
  @js.native
  sealed trait year
    extends RelativeTimeField
       with Unit
  
  @js.native
  sealed trait `year-narrow` extends RelativeTimeField
  
  @js.native
  sealed trait `year-short` extends RelativeTimeField
  
  @js.native
  sealed trait zero extends LDMLPluralRule
  
  @scala.inline
  def `1000`: `1000` = "1000".asInstanceOf[`1000`]
  @scala.inline
  def `10000`: `10000` = "10000".asInstanceOf[`10000`]
  @scala.inline
  def `100000`: `100000` = "100000".asInstanceOf[`100000`]
  @scala.inline
  def `1000000`: `1000000` = "1000000".asInstanceOf[`1000000`]
  @scala.inline
  def `10000000`: `10000000` = "10000000".asInstanceOf[`10000000`]
  @scala.inline
  def `100000000`: `100000000` = "100000000".asInstanceOf[`100000000`]
  @scala.inline
  def `1000000000`: `1000000000` = "1000000000".asInstanceOf[`1000000000`]
  @scala.inline
  def `10000000000`: `10000000000` = "10000000000".asInstanceOf[`10000000000`]
  @scala.inline
  def `100000000000`: `100000000000` = "100000000000".asInstanceOf[`100000000000`]
  @scala.inline
  def `1000000000000`: `1000000000000` = "1000000000000".asInstanceOf[`1000000000000`]
  @scala.inline
  def `10000000000000`: `10000000000000` = "10000000000000".asInstanceOf[`10000000000000`]
  @scala.inline
  def `100000000000000`: `100000000000000` = "100000000000000".asInstanceOf[`100000000000000`]
  @scala.inline
  def RelativeTimeData: RelativeTimeData = "RelativeTimeData".asInstanceOf[RelativeTimeData]
  @scala.inline
  def accounting: accounting = "accounting".asInstanceOf[accounting]
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def `best fit`: `best fit` = "best fit".asInstanceOf[`best fit`]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  @scala.inline
  def compact: compact = "compact".asInstanceOf[compact]
  @scala.inline
  def compactRounding: compactRounding = "compactRounding".asInstanceOf[compactRounding]
  @scala.inline
  def createResolveLocale: createResolveLocale = "createResolveLocale".asInstanceOf[createResolveLocale]
  @scala.inline
  def currency: currency = "currency".asInstanceOf[currency]
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def `day-narrow`: `day-narrow` = "day-narrow".asInstanceOf[`day-narrow`]
  @scala.inline
  def `day-short`: `day-short` = "day-short".asInstanceOf[`day-short`]
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  @scala.inline
  def engineering: engineering = "engineering".asInstanceOf[engineering]
  @scala.inline
  def exceptZero: exceptZero = "exceptZero".asInstanceOf[exceptZero]
  @scala.inline
  def few: few = "few".asInstanceOf[few]
  @scala.inline
  def fractionDigits: fractionDigits = "fractionDigits".asInstanceOf[fractionDigits]
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  @scala.inline
  def `hour-narrow`: `hour-narrow` = "hour-narrow".asInstanceOf[`hour-narrow`]
  @scala.inline
  def `hour-short`: `hour-short` = "hour-short".asInstanceOf[`hour-short`]
  @scala.inline
  def literal: literal = "literal".asInstanceOf[literal]
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  @scala.inline
  def lookup: lookup = "lookup".asInstanceOf[lookup]
  @scala.inline
  def many: many = "many".asInstanceOf[many]
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  @scala.inline
  def `minute-narrow`: `minute-narrow` = "minute-narrow".asInstanceOf[`minute-narrow`]
  @scala.inline
  def `minute-short`: `minute-short` = "minute-short".asInstanceOf[`minute-short`]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def `month-narrow`: `month-narrow` = "month-narrow".asInstanceOf[`month-narrow`]
  @scala.inline
  def `month-short`: `month-short` = "month-short".asInstanceOf[`month-short`]
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  @scala.inline
  def narrow: narrow = "narrow".asInstanceOf[narrow]
  @scala.inline
  def narrowSymbol: narrowSymbol = "narrowSymbol".asInstanceOf[narrowSymbol]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def one: one = "one".asInstanceOf[one]
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  @scala.inline
  def percent: percent = "percent".asInstanceOf[percent]
  @scala.inline
  def quarter: quarter = "quarter".asInstanceOf[quarter]
  @scala.inline
  def `quarter-narrow`: `quarter-narrow` = "quarter-narrow".asInstanceOf[`quarter-narrow`]
  @scala.inline
  def `quarter-short`: `quarter-short` = "quarter-short".asInstanceOf[`quarter-short`]
  @scala.inline
  def scientific: scientific = "scientific".asInstanceOf[scientific]
  @scala.inline
  def second: second = "second".asInstanceOf[second]
  @scala.inline
  def `second-narrow`: `second-narrow` = "second-narrow".asInstanceOf[`second-narrow`]
  @scala.inline
  def `second-short`: `second-short` = "second-short".asInstanceOf[`second-short`]
  @scala.inline
  def short: short = "short".asInstanceOf[short]
  @scala.inline
  def significantDigits: significantDigits = "significantDigits".asInstanceOf[significantDigits]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
  @scala.inline
  def two: two = "two".asInstanceOf[two]
  @scala.inline
  def unit: unit = "unit".asInstanceOf[unit]
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  @scala.inline
  def `week-narrow`: `week-narrow` = "week-narrow".asInstanceOf[`week-narrow`]
  @scala.inline
  def `week-short`: `week-short` = "week-short".asInstanceOf[`week-short`]
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  @scala.inline
  def `year-narrow`: `year-narrow` = "year-narrow".asInstanceOf[`year-narrow`]
  @scala.inline
  def `year-short`: `year-short` = "year-short".asInstanceOf[`year-short`]
  @scala.inline
  def zero: zero = "zero".asInstanceOf[zero]
}

