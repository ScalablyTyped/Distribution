package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.typesCoreMod.LocaleData
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import typings.std.Intl.RelativeTimeFormatNumeric
import typings.std.Intl.RelativeTimeFormatStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRelativeTimeMod {
  
  trait FieldData extends StObject {
    
    var `-1`: js.UndefOr[String] = js.undefined
    
    var `-2`: js.UndefOr[String] = js.undefined
    
    var `-3`: js.UndefOr[String] = js.undefined
    
    var `0`: js.UndefOr[String] = js.undefined
    
    var `1`: js.UndefOr[String] = js.undefined
    
    var `2`: js.UndefOr[String] = js.undefined
    
    var `3`: js.UndefOr[String] = js.undefined
    
    var future: RelativeTimeData
    
    var past: RelativeTimeData
  }
  object FieldData {
    
    inline def apply(future: RelativeTimeData, past: RelativeTimeData): FieldData = {
      val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldData] (val x: Self) extends AnyVal {
      
      inline def `set-1`(value: String): Self = StObject.set(x, "-1", value.asInstanceOf[js.Any])
      
      inline def `set-1Undefined`: Self = StObject.set(x, "-1", js.undefined)
      
      inline def `set-2`(value: String): Self = StObject.set(x, "-2", value.asInstanceOf[js.Any])
      
      inline def `set-2Undefined`: Self = StObject.set(x, "-2", js.undefined)
      
      inline def `set-3`(value: String): Self = StObject.set(x, "-3", value.asInstanceOf[js.Any])
      
      inline def `set-3Undefined`: Self = StObject.set(x, "-3", js.undefined)
      
      inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set0Undefined: Self = StObject.set(x, "0", js.undefined)
      
      inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set1Undefined: Self = StObject.set(x, "1", js.undefined)
      
      inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set2Undefined: Self = StObject.set(x, "2", js.undefined)
      
      inline def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set3Undefined: Self = StObject.set(x, "3", js.undefined)
      
      inline def setFuture(value: RelativeTimeData): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setPast(value: RelativeTimeData): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ f in @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeField ]:? @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.FieldData} & {  nu :std.Array<string | null> | undefined} */
  trait LocaleFieldsData extends StObject {
    
    var day: js.UndefOr[FieldData] = js.undefined
    
    var `day-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `day-short`: js.UndefOr[FieldData] = js.undefined
    
    var hour: js.UndefOr[FieldData] = js.undefined
    
    var `hour-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `hour-short`: js.UndefOr[FieldData] = js.undefined
    
    var minute: js.UndefOr[FieldData] = js.undefined
    
    var `minute-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `minute-short`: js.UndefOr[FieldData] = js.undefined
    
    var month: js.UndefOr[FieldData] = js.undefined
    
    var `month-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `month-short`: js.UndefOr[FieldData] = js.undefined
    
    var nu: js.UndefOr[js.Array[String | Null]] = js.undefined
    
    var quarter: js.UndefOr[FieldData] = js.undefined
    
    var `quarter-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `quarter-short`: js.UndefOr[FieldData] = js.undefined
    
    var second: js.UndefOr[FieldData] = js.undefined
    
    var `second-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `second-short`: js.UndefOr[FieldData] = js.undefined
    
    var week: js.UndefOr[FieldData] = js.undefined
    
    var `week-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `week-short`: js.UndefOr[FieldData] = js.undefined
    
    var year: js.UndefOr[FieldData] = js.undefined
    
    var `year-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `year-short`: js.UndefOr[FieldData] = js.undefined
  }
  object LocaleFieldsData {
    
    inline def apply(): LocaleFieldsData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocaleFieldsData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocaleFieldsData] (val x: Self) extends AnyVal {
      
      inline def setDay(value: FieldData): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def `setDay-narrow`(value: FieldData): Self = StObject.set(x, "day-narrow", value.asInstanceOf[js.Any])
      
      inline def `setDay-narrowUndefined`: Self = StObject.set(x, "day-narrow", js.undefined)
      
      inline def `setDay-short`(value: FieldData): Self = StObject.set(x, "day-short", value.asInstanceOf[js.Any])
      
      inline def `setDay-shortUndefined`: Self = StObject.set(x, "day-short", js.undefined)
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setHour(value: FieldData): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def `setHour-narrow`(value: FieldData): Self = StObject.set(x, "hour-narrow", value.asInstanceOf[js.Any])
      
      inline def `setHour-narrowUndefined`: Self = StObject.set(x, "hour-narrow", js.undefined)
      
      inline def `setHour-short`(value: FieldData): Self = StObject.set(x, "hour-short", value.asInstanceOf[js.Any])
      
      inline def `setHour-shortUndefined`: Self = StObject.set(x, "hour-short", js.undefined)
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMinute(value: FieldData): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def `setMinute-narrow`(value: FieldData): Self = StObject.set(x, "minute-narrow", value.asInstanceOf[js.Any])
      
      inline def `setMinute-narrowUndefined`: Self = StObject.set(x, "minute-narrow", js.undefined)
      
      inline def `setMinute-short`(value: FieldData): Self = StObject.set(x, "minute-short", value.asInstanceOf[js.Any])
      
      inline def `setMinute-shortUndefined`: Self = StObject.set(x, "minute-short", js.undefined)
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: FieldData): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def `setMonth-narrow`(value: FieldData): Self = StObject.set(x, "month-narrow", value.asInstanceOf[js.Any])
      
      inline def `setMonth-narrowUndefined`: Self = StObject.set(x, "month-narrow", js.undefined)
      
      inline def `setMonth-short`(value: FieldData): Self = StObject.set(x, "month-short", value.asInstanceOf[js.Any])
      
      inline def `setMonth-shortUndefined`: Self = StObject.set(x, "month-short", js.undefined)
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setNu(value: js.Array[String | Null]): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
      
      inline def setNuUndefined: Self = StObject.set(x, "nu", js.undefined)
      
      inline def setNuVarargs(value: (String | Null)*): Self = StObject.set(x, "nu", js.Array(value*))
      
      inline def setQuarter(value: FieldData): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
      
      inline def `setQuarter-narrow`(value: FieldData): Self = StObject.set(x, "quarter-narrow", value.asInstanceOf[js.Any])
      
      inline def `setQuarter-narrowUndefined`: Self = StObject.set(x, "quarter-narrow", js.undefined)
      
      inline def `setQuarter-short`(value: FieldData): Self = StObject.set(x, "quarter-short", value.asInstanceOf[js.Any])
      
      inline def `setQuarter-shortUndefined`: Self = StObject.set(x, "quarter-short", js.undefined)
      
      inline def setQuarterUndefined: Self = StObject.set(x, "quarter", js.undefined)
      
      inline def setSecond(value: FieldData): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def `setSecond-narrow`(value: FieldData): Self = StObject.set(x, "second-narrow", value.asInstanceOf[js.Any])
      
      inline def `setSecond-narrowUndefined`: Self = StObject.set(x, "second-narrow", js.undefined)
      
      inline def `setSecond-short`(value: FieldData): Self = StObject.set(x, "second-short", value.asInstanceOf[js.Any])
      
      inline def `setSecond-shortUndefined`: Self = StObject.set(x, "second-short", js.undefined)
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setWeek(value: FieldData): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      inline def `setWeek-narrow`(value: FieldData): Self = StObject.set(x, "week-narrow", value.asInstanceOf[js.Any])
      
      inline def `setWeek-narrowUndefined`: Self = StObject.set(x, "week-narrow", js.undefined)
      
      inline def `setWeek-short`(value: FieldData): Self = StObject.set(x, "week-short", value.asInstanceOf[js.Any])
      
      inline def `setWeek-shortUndefined`: Self = StObject.set(x, "week-short", js.undefined)
      
      inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
      
      inline def setYear(value: FieldData): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def `setYear-narrow`(value: FieldData): Self = StObject.set(x, "year-narrow", value.asInstanceOf[js.Any])
      
      inline def `setYear-narrowUndefined`: Self = StObject.set(x, "year-narrow", js.undefined)
      
      inline def `setYear-short`(value: FieldData): Self = StObject.set(x, "year-short", value.asInstanceOf[js.Any])
      
      inline def `setYear-shortUndefined`: Self = StObject.set(x, "year-short", js.undefined)
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  /* Inlined {[ u in @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/plural-rules.LDMLPluralRule ]:? string} */
  trait RelativeTimeData extends StObject {
    
    var few: js.UndefOr[String] = js.undefined
    
    var many: js.UndefOr[String] = js.undefined
    
    var one: js.UndefOr[String] = js.undefined
    
    var other: js.UndefOr[String] = js.undefined
    
    var two: js.UndefOr[String] = js.undefined
    
    var zero: js.UndefOr[String] = js.undefined
  }
  object RelativeTimeData {
    
    inline def apply(): RelativeTimeData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelativeTimeData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelativeTimeData] (val x: Self) extends AnyVal {
      
      inline def setFew(value: String): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      inline def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      inline def setMany(value: String): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      inline def setOne(value: String): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setTwo(value: String): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      inline def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
      
      inline def setZero(value: String): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`second-short`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`second-narrow`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`minute-short`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`minute-narrow`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`hour-short`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`hour-narrow`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`day-short`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`day-narrow`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`week-short`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`week-narrow`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`month-short`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`month-narrow`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`quarter-short`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`quarter-narrow`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`year-short`
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`year-narrow`
  */
  trait RelativeTimeField extends StObject
  object RelativeTimeField {
    
    inline def day: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day = "day".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day]
    
    inline def `day-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`day-narrow` = "day-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`day-narrow`]
    
    inline def `day-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`day-short` = "day-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`day-short`]
    
    inline def hour: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour = "hour".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour]
    
    inline def `hour-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`hour-narrow` = "hour-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`hour-narrow`]
    
    inline def `hour-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`hour-short` = "hour-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`hour-short`]
    
    inline def minute: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute = "minute".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute]
    
    inline def `minute-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`minute-narrow` = "minute-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`minute-narrow`]
    
    inline def `minute-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`minute-short` = "minute-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`minute-short`]
    
    inline def month: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month = "month".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month]
    
    inline def `month-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`month-narrow` = "month-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`month-narrow`]
    
    inline def `month-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`month-short` = "month-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`month-short`]
    
    inline def quarter: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter = "quarter".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter]
    
    inline def `quarter-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`quarter-narrow` = "quarter-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`quarter-narrow`]
    
    inline def `quarter-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`quarter-short` = "quarter-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`quarter-short`]
    
    inline def second: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second = "second".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second]
    
    inline def `second-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`second-narrow` = "second-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`second-narrow`]
    
    inline def `second-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`second-short` = "second-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`second-short`]
    
    inline def week: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week = "week".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week]
    
    inline def `week-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`week-narrow` = "week-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`week-narrow`]
    
    inline def `week-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`week-short` = "week-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`week-short`]
    
    inline def year: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year = "year".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year]
    
    inline def `year-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`year-narrow` = "year-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`year-narrow`]
    
    inline def `year-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`year-short` = "year-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`year-short`]
  }
  
  trait RelativeTimeFormatInternal extends StObject {
    
    var fields: LocaleFieldsData
    
    var initializedRelativeTimeFormat: Boolean
    
    var locale: String
    
    var numberFormat: NumberFormat
    
    var numberingSystem: String
    
    var numeric: RelativeTimeFormatNumeric
    
    var pluralRules: PluralRules
    
    var style: RelativeTimeFormatStyle
  }
  object RelativeTimeFormatInternal {
    
    inline def apply(
      fields: LocaleFieldsData,
      initializedRelativeTimeFormat: Boolean,
      locale: String,
      numberFormat: NumberFormat,
      numberingSystem: String,
      numeric: RelativeTimeFormatNumeric,
      pluralRules: PluralRules,
      style: RelativeTimeFormatStyle
    ): RelativeTimeFormatInternal = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], initializedRelativeTimeFormat = initializedRelativeTimeFormat.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], pluralRules = pluralRules.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeTimeFormatInternal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelativeTimeFormatInternal] (val x: Self) extends AnyVal {
      
      inline def setFields(value: LocaleFieldsData): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setInitializedRelativeTimeFormat(value: Boolean): Self = StObject.set(x, "initializedRelativeTimeFormat", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setNumberFormat(value: NumberFormat): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
      
      inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      inline def setNumeric(value: RelativeTimeFormatNumeric): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setPluralRules(value: PluralRules): Self = StObject.set(x, "pluralRules", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: RelativeTimeFormatStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Exclude<std.Intl.RelativeTimeFormatUnit, 'seconds' | 'minutes' | 'hours' | 'days' | 'weeks' | 'months' | 'quarters' | 'years'> */
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month
  */
  trait RelativeTimeFormatSingularUnit extends StObject
  object RelativeTimeFormatSingularUnit {
    
    inline def day: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day = "day".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day]
    
    inline def hour: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour = "hour".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour]
    
    inline def minute: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute = "minute".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute]
    
    inline def month: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month = "month".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month]
    
    inline def quarter: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter = "quarter".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter]
    
    inline def second: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second = "second".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second]
    
    inline def week: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week = "week".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week]
    
    inline def year: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year = "year".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year]
  }
  
  type RelativeTimeLocaleData = LocaleData[LocaleFieldsData]
  
  /* Inlined {[ f in @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeField ]:? @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.FieldData} & {  nu :std.Array<string | null>} */
  trait UnpackedLocaleFieldsData extends StObject {
    
    var day: js.UndefOr[FieldData] = js.undefined
    
    var `day-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `day-short`: js.UndefOr[FieldData] = js.undefined
    
    var hour: js.UndefOr[FieldData] = js.undefined
    
    var `hour-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `hour-short`: js.UndefOr[FieldData] = js.undefined
    
    var minute: js.UndefOr[FieldData] = js.undefined
    
    var `minute-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `minute-short`: js.UndefOr[FieldData] = js.undefined
    
    var month: js.UndefOr[FieldData] = js.undefined
    
    var `month-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `month-short`: js.UndefOr[FieldData] = js.undefined
    
    var nu: js.Array[String | Null]
    
    var quarter: js.UndefOr[FieldData] = js.undefined
    
    var `quarter-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `quarter-short`: js.UndefOr[FieldData] = js.undefined
    
    var second: js.UndefOr[FieldData] = js.undefined
    
    var `second-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `second-short`: js.UndefOr[FieldData] = js.undefined
    
    var week: js.UndefOr[FieldData] = js.undefined
    
    var `week-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `week-short`: js.UndefOr[FieldData] = js.undefined
    
    var year: js.UndefOr[FieldData] = js.undefined
    
    var `year-narrow`: js.UndefOr[FieldData] = js.undefined
    
    var `year-short`: js.UndefOr[FieldData] = js.undefined
  }
  object UnpackedLocaleFieldsData {
    
    inline def apply(nu: js.Array[String | Null]): UnpackedLocaleFieldsData = {
      val __obj = js.Dynamic.literal(nu = nu.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnpackedLocaleFieldsData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnpackedLocaleFieldsData] (val x: Self) extends AnyVal {
      
      inline def setDay(value: FieldData): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def `setDay-narrow`(value: FieldData): Self = StObject.set(x, "day-narrow", value.asInstanceOf[js.Any])
      
      inline def `setDay-narrowUndefined`: Self = StObject.set(x, "day-narrow", js.undefined)
      
      inline def `setDay-short`(value: FieldData): Self = StObject.set(x, "day-short", value.asInstanceOf[js.Any])
      
      inline def `setDay-shortUndefined`: Self = StObject.set(x, "day-short", js.undefined)
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setHour(value: FieldData): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def `setHour-narrow`(value: FieldData): Self = StObject.set(x, "hour-narrow", value.asInstanceOf[js.Any])
      
      inline def `setHour-narrowUndefined`: Self = StObject.set(x, "hour-narrow", js.undefined)
      
      inline def `setHour-short`(value: FieldData): Self = StObject.set(x, "hour-short", value.asInstanceOf[js.Any])
      
      inline def `setHour-shortUndefined`: Self = StObject.set(x, "hour-short", js.undefined)
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMinute(value: FieldData): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def `setMinute-narrow`(value: FieldData): Self = StObject.set(x, "minute-narrow", value.asInstanceOf[js.Any])
      
      inline def `setMinute-narrowUndefined`: Self = StObject.set(x, "minute-narrow", js.undefined)
      
      inline def `setMinute-short`(value: FieldData): Self = StObject.set(x, "minute-short", value.asInstanceOf[js.Any])
      
      inline def `setMinute-shortUndefined`: Self = StObject.set(x, "minute-short", js.undefined)
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: FieldData): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def `setMonth-narrow`(value: FieldData): Self = StObject.set(x, "month-narrow", value.asInstanceOf[js.Any])
      
      inline def `setMonth-narrowUndefined`: Self = StObject.set(x, "month-narrow", js.undefined)
      
      inline def `setMonth-short`(value: FieldData): Self = StObject.set(x, "month-short", value.asInstanceOf[js.Any])
      
      inline def `setMonth-shortUndefined`: Self = StObject.set(x, "month-short", js.undefined)
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setNu(value: js.Array[String | Null]): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
      
      inline def setNuVarargs(value: (String | Null)*): Self = StObject.set(x, "nu", js.Array(value*))
      
      inline def setQuarter(value: FieldData): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
      
      inline def `setQuarter-narrow`(value: FieldData): Self = StObject.set(x, "quarter-narrow", value.asInstanceOf[js.Any])
      
      inline def `setQuarter-narrowUndefined`: Self = StObject.set(x, "quarter-narrow", js.undefined)
      
      inline def `setQuarter-short`(value: FieldData): Self = StObject.set(x, "quarter-short", value.asInstanceOf[js.Any])
      
      inline def `setQuarter-shortUndefined`: Self = StObject.set(x, "quarter-short", js.undefined)
      
      inline def setQuarterUndefined: Self = StObject.set(x, "quarter", js.undefined)
      
      inline def setSecond(value: FieldData): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def `setSecond-narrow`(value: FieldData): Self = StObject.set(x, "second-narrow", value.asInstanceOf[js.Any])
      
      inline def `setSecond-narrowUndefined`: Self = StObject.set(x, "second-narrow", js.undefined)
      
      inline def `setSecond-short`(value: FieldData): Self = StObject.set(x, "second-short", value.asInstanceOf[js.Any])
      
      inline def `setSecond-shortUndefined`: Self = StObject.set(x, "second-short", js.undefined)
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setWeek(value: FieldData): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      inline def `setWeek-narrow`(value: FieldData): Self = StObject.set(x, "week-narrow", value.asInstanceOf[js.Any])
      
      inline def `setWeek-narrowUndefined`: Self = StObject.set(x, "week-narrow", js.undefined)
      
      inline def `setWeek-short`(value: FieldData): Self = StObject.set(x, "week-short", value.asInstanceOf[js.Any])
      
      inline def `setWeek-shortUndefined`: Self = StObject.set(x, "week-short", js.undefined)
      
      inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
      
      inline def setYear(value: FieldData): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def `setYear-narrow`(value: FieldData): Self = StObject.set(x, "year-narrow", value.asInstanceOf[js.Any])
      
      inline def `setYear-narrowUndefined`: Self = StObject.set(x, "year-narrow", js.undefined)
      
      inline def `setYear-short`(value: FieldData): Self = StObject.set(x, "year-short", value.asInstanceOf[js.Any])
      
      inline def `setYear-shortUndefined`: Self = StObject.set(x, "year-short", js.undefined)
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
}
