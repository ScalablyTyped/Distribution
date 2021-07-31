package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.coreMod.LocaleData
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`best fit`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.always
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.auto
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.lookup
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.narrow
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatPart
import typings.std.Intl.NumberFormatPartTypes
import typings.std.Intl.PluralRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relativeTimeMod {
  
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
    
    @scala.inline
    def apply(future: RelativeTimeData, past: RelativeTimeData): FieldData = {
      val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldData]
    }
    
    @scala.inline
    implicit class FieldDataMutableBuilder[Self <: FieldData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set-1`(value: String): Self = StObject.set(x, "-1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-1Undefined`: Self = StObject.set(x, "-1", js.undefined)
      
      @scala.inline
      def `set-2`(value: String): Self = StObject.set(x, "-2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-2Undefined`: Self = StObject.set(x, "-2", js.undefined)
      
      @scala.inline
      def `set-3`(value: String): Self = StObject.set(x, "-3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-3Undefined`: Self = StObject.set(x, "-3", js.undefined)
      
      @scala.inline
      def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set0Undefined: Self = StObject.set(x, "0", js.undefined)
      
      @scala.inline
      def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1Undefined: Self = StObject.set(x, "1", js.undefined)
      
      @scala.inline
      def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2Undefined: Self = StObject.set(x, "2", js.undefined)
      
      @scala.inline
      def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set3Undefined: Self = StObject.set(x, "3", js.undefined)
      
      @scala.inline
      def setFuture(value: RelativeTimeData): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPast(value: RelativeTimeData): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntlRelativeTimeFormatOptions extends StObject {
    
    /**
      * The locale matching algorithm to use.
      * Possible values are "lookup" and "best fit"; the default is "best fit".
      * For information about this option, see
      * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation.
      */
    var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
    
    /**
      * The format of output message. Possible values are:
      * - "always" (default, e.g., 1 day ago),
      * - or "auto" (e.g., yesterday).
      * The "auto" value allows to not always have to
      * use numeric values in the output.
      */
    var numeric: js.UndefOr[always | auto] = js.undefined
    
    /**
      * The length of the internationalized message. Possible values are:
      * - "long" (default, e.g., in 1 month)
      * - "short" (e.g., in 1 mo.),
      * - or "narrow" (e.g., in 1 mo.).
      * The narrow style could be similar to the short style for some locales.
      */
    var style: js.UndefOr[long | short | narrow] = js.undefined
  }
  object IntlRelativeTimeFormatOptions {
    
    @scala.inline
    def apply(): IntlRelativeTimeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntlRelativeTimeFormatOptions]
    }
    
    @scala.inline
    implicit class IntlRelativeTimeFormatOptionsMutableBuilder[Self <: IntlRelativeTimeFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setNumeric(value: always | auto): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      @scala.inline
      def setStyle(value: long | short | narrow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined {[ f in @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/relative-time.RelativeTimeField ]:? @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/relative-time.FieldData} & {  nu :std.Array<string | null> | undefined} */
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
    
    @scala.inline
    def apply(): LocaleFieldsData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocaleFieldsData]
    }
    
    @scala.inline
    implicit class LocaleFieldsDataMutableBuilder[Self <: LocaleFieldsData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: FieldData): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDay-narrow`(value: FieldData): Self = StObject.set(x, "day-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDay-narrowUndefined`: Self = StObject.set(x, "day-narrow", js.undefined)
      
      @scala.inline
      def `setDay-short`(value: FieldData): Self = StObject.set(x, "day-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDay-shortUndefined`: Self = StObject.set(x, "day-short", js.undefined)
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setHour(value: FieldData): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHour-narrow`(value: FieldData): Self = StObject.set(x, "hour-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHour-narrowUndefined`: Self = StObject.set(x, "hour-narrow", js.undefined)
      
      @scala.inline
      def `setHour-short`(value: FieldData): Self = StObject.set(x, "hour-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHour-shortUndefined`: Self = StObject.set(x, "hour-short", js.undefined)
      
      @scala.inline
      def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      @scala.inline
      def setMinute(value: FieldData): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMinute-narrow`(value: FieldData): Self = StObject.set(x, "minute-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMinute-narrowUndefined`: Self = StObject.set(x, "minute-narrow", js.undefined)
      
      @scala.inline
      def `setMinute-short`(value: FieldData): Self = StObject.set(x, "minute-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMinute-shortUndefined`: Self = StObject.set(x, "minute-short", js.undefined)
      
      @scala.inline
      def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      @scala.inline
      def setMonth(value: FieldData): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMonth-narrow`(value: FieldData): Self = StObject.set(x, "month-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMonth-narrowUndefined`: Self = StObject.set(x, "month-narrow", js.undefined)
      
      @scala.inline
      def `setMonth-short`(value: FieldData): Self = StObject.set(x, "month-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMonth-shortUndefined`: Self = StObject.set(x, "month-short", js.undefined)
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setNu(value: js.Array[String | Null]): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNuUndefined: Self = StObject.set(x, "nu", js.undefined)
      
      @scala.inline
      def setNuVarargs(value: (String | Null)*): Self = StObject.set(x, "nu", js.Array(value :_*))
      
      @scala.inline
      def setQuarter(value: FieldData): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setQuarter-narrow`(value: FieldData): Self = StObject.set(x, "quarter-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setQuarter-narrowUndefined`: Self = StObject.set(x, "quarter-narrow", js.undefined)
      
      @scala.inline
      def `setQuarter-short`(value: FieldData): Self = StObject.set(x, "quarter-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setQuarter-shortUndefined`: Self = StObject.set(x, "quarter-short", js.undefined)
      
      @scala.inline
      def setQuarterUndefined: Self = StObject.set(x, "quarter", js.undefined)
      
      @scala.inline
      def setSecond(value: FieldData): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSecond-narrow`(value: FieldData): Self = StObject.set(x, "second-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSecond-narrowUndefined`: Self = StObject.set(x, "second-narrow", js.undefined)
      
      @scala.inline
      def `setSecond-short`(value: FieldData): Self = StObject.set(x, "second-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSecond-shortUndefined`: Self = StObject.set(x, "second-short", js.undefined)
      
      @scala.inline
      def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      @scala.inline
      def setWeek(value: FieldData): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWeek-narrow`(value: FieldData): Self = StObject.set(x, "week-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWeek-narrowUndefined`: Self = StObject.set(x, "week-narrow", js.undefined)
      
      @scala.inline
      def `setWeek-short`(value: FieldData): Self = StObject.set(x, "week-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWeek-shortUndefined`: Self = StObject.set(x, "week-short", js.undefined)
      
      @scala.inline
      def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
      
      @scala.inline
      def setYear(value: FieldData): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setYear-narrow`(value: FieldData): Self = StObject.set(x, "year-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setYear-narrowUndefined`: Self = StObject.set(x, "year-narrow", js.undefined)
      
      @scala.inline
      def `setYear-short`(value: FieldData): Self = StObject.set(x, "year-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setYear-shortUndefined`: Self = StObject.set(x, "year-short", js.undefined)
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  /* Inlined {[ u in @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/plural-rules.LDMLPluralRule ]:? string} */
  trait RelativeTimeData extends StObject {
    
    var few: js.UndefOr[String] = js.undefined
    
    var many: js.UndefOr[String] = js.undefined
    
    var one: js.UndefOr[String] = js.undefined
    
    var other: js.UndefOr[String] = js.undefined
    
    var two: js.UndefOr[String] = js.undefined
    
    var zero: js.UndefOr[String] = js.undefined
  }
  object RelativeTimeData {
    
    @scala.inline
    def apply(): RelativeTimeData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelativeTimeData]
    }
    
    @scala.inline
    implicit class RelativeTimeDataMutableBuilder[Self <: RelativeTimeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFew(value: String): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      @scala.inline
      def setMany(value: String): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      @scala.inline
      def setOne(value: String): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      @scala.inline
      def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      @scala.inline
      def setTwo(value: String): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
      
      @scala.inline
      def setZero(value: String): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
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
    
    @scala.inline
    def day: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day = "day".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day]
    
    @scala.inline
    def `day-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`day-narrow` = "day-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`day-narrow`]
    
    @scala.inline
    def `day-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`day-short` = "day-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`day-short`]
    
    @scala.inline
    def hour: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour = "hour".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour]
    
    @scala.inline
    def `hour-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`hour-narrow` = "hour-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`hour-narrow`]
    
    @scala.inline
    def `hour-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`hour-short` = "hour-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`hour-short`]
    
    @scala.inline
    def minute: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute = "minute".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute]
    
    @scala.inline
    def `minute-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`minute-narrow` = "minute-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`minute-narrow`]
    
    @scala.inline
    def `minute-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`minute-short` = "minute-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`minute-short`]
    
    @scala.inline
    def month: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month = "month".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month]
    
    @scala.inline
    def `month-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`month-narrow` = "month-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`month-narrow`]
    
    @scala.inline
    def `month-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`month-short` = "month-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`month-short`]
    
    @scala.inline
    def quarter: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter = "quarter".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter]
    
    @scala.inline
    def `quarter-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`quarter-narrow` = "quarter-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`quarter-narrow`]
    
    @scala.inline
    def `quarter-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`quarter-short` = "quarter-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`quarter-short`]
    
    @scala.inline
    def second: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second = "second".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second]
    
    @scala.inline
    def `second-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`second-narrow` = "second-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`second-narrow`]
    
    @scala.inline
    def `second-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`second-short` = "second-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`second-short`]
    
    @scala.inline
    def week: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week = "week".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week]
    
    @scala.inline
    def `week-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`week-narrow` = "week-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`week-narrow`]
    
    @scala.inline
    def `week-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`week-short` = "week-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`week-short`]
    
    @scala.inline
    def year: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year = "year".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year]
    
    @scala.inline
    def `year-narrow`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`year-narrow` = "year-narrow".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`year-narrow`]
    
    @scala.inline
    def `year-short`: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`year-short` = "year-short".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`year-short`]
  }
  
  trait RelativeTimeFormat extends StObject {
    
    def format(value: Double, unit: RelativeTimeFormattableUnit): String
    
    def formatToParts(value: Double, unit: RelativeTimeFormattableUnit): js.Array[RelativeTimePart]
    
    def resolvedOptions(): ResolvedIntlRelativeTimeFormatOptions
  }
  object RelativeTimeFormat {
    
    @scala.inline
    def apply(
      format: (Double, RelativeTimeFormattableUnit) => String,
      formatToParts: (Double, RelativeTimeFormattableUnit) => js.Array[RelativeTimePart],
      resolvedOptions: () => ResolvedIntlRelativeTimeFormatOptions
    ): RelativeTimeFormat = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), formatToParts = js.Any.fromFunction2(formatToParts), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
      __obj.asInstanceOf[RelativeTimeFormat]
    }
    
    @scala.inline
    implicit class RelativeTimeFormatMutableBuilder[Self <: RelativeTimeFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: (Double, RelativeTimeFormattableUnit) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatToParts(value: (Double, RelativeTimeFormattableUnit) => js.Array[RelativeTimePart]): Self = StObject.set(x, "formatToParts", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolvedOptions(value: () => ResolvedIntlRelativeTimeFormatOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    }
  }
  
  trait RelativeTimeFormatInternal extends StObject {
    
    var fields: LocaleFieldsData
    
    var initializedRelativeTimeFormat: Boolean
    
    var locale: String
    
    var numberFormat: NumberFormat
    
    var numberingSystem: String
    
    var numeric: js.UndefOr[always | auto] = js.undefined
    
    var pluralRules: PluralRules
    
    var style: js.UndefOr[long | short | narrow] = js.undefined
  }
  object RelativeTimeFormatInternal {
    
    @scala.inline
    def apply(
      fields: LocaleFieldsData,
      initializedRelativeTimeFormat: Boolean,
      locale: String,
      numberFormat: NumberFormat,
      numberingSystem: String,
      pluralRules: PluralRules
    ): RelativeTimeFormatInternal = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], initializedRelativeTimeFormat = initializedRelativeTimeFormat.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], pluralRules = pluralRules.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeTimeFormatInternal]
    }
    
    @scala.inline
    implicit class RelativeTimeFormatInternalMutableBuilder[Self <: RelativeTimeFormatInternal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: LocaleFieldsData): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitializedRelativeTimeFormat(value: Boolean): Self = StObject.set(x, "initializedRelativeTimeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormat(value: NumberFormat): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeric(value: always | auto): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      @scala.inline
      def setPluralRules(value: PluralRules): Self = StObject.set(x, "pluralRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: long | short | narrow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait RelativeTimeFormatNumberPart
    extends StObject
       with NumberFormatPart
       with RelativeTimePart {
    
    var unit: RelativeTimeUnit
  }
  object RelativeTimeFormatNumberPart {
    
    @scala.inline
    def apply(`type`: NumberFormatPartTypes, unit: RelativeTimeUnit, value: String): RelativeTimeFormatNumberPart = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeTimeFormatNumberPart]
    }
    
    @scala.inline
    implicit class RelativeTimeFormatNumberPartMutableBuilder[Self <: RelativeTimeFormatNumberPart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnit(value: RelativeTimeUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.seconds
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minutes
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hours
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.days
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weeks
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.months
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarters
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.years
  */
  trait RelativeTimeFormattableUnit extends StObject
  object RelativeTimeFormattableUnit {
    
    @scala.inline
    def day: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day = "day".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day]
    
    @scala.inline
    def days: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.days = "days".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.days]
    
    @scala.inline
    def hour: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour = "hour".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour]
    
    @scala.inline
    def hours: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hours = "hours".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hours]
    
    @scala.inline
    def minute: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute = "minute".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute]
    
    @scala.inline
    def minutes: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minutes = "minutes".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minutes]
    
    @scala.inline
    def month: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month = "month".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month]
    
    @scala.inline
    def months: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.months = "months".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.months]
    
    @scala.inline
    def quarter: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter = "quarter".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter]
    
    @scala.inline
    def quarters: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarters = "quarters".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarters]
    
    @scala.inline
    def second: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second = "second".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second]
    
    @scala.inline
    def seconds: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.seconds = "seconds".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.seconds]
    
    @scala.inline
    def week: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week = "week".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week]
    
    @scala.inline
    def weeks: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weeks = "weeks".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weeks]
    
    @scala.inline
    def year: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year = "year".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year]
    
    @scala.inline
    def years: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.years = "years".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.years]
  }
  
  type RelativeTimeLocaleData = LocaleData[LocaleFieldsData]
  
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsEcma402Abstract.utilsMod.LiteralPart
    - typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormatNumberPart
  */
  trait RelativeTimePart extends StObject
  object RelativeTimePart {
    
    @scala.inline
    def LiteralPart(value: String): typings.formatjsEcma402Abstract.utilsMod.LiteralPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("literal")
      __obj.asInstanceOf[typings.formatjsEcma402Abstract.utilsMod.LiteralPart]
    }
    
    @scala.inline
    def RelativeTimeFormatNumberPart(`type`: NumberFormatPartTypes, unit: RelativeTimeUnit, value: String): typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormatNumberPart = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormatNumberPart]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year
  */
  trait RelativeTimeUnit extends StObject
  object RelativeTimeUnit {
    
    @scala.inline
    def day: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day = "day".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day]
    
    @scala.inline
    def hour: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour = "hour".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour]
    
    @scala.inline
    def minute: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute = "minute".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute]
    
    @scala.inline
    def month: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month = "month".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month]
    
    @scala.inline
    def quarter: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter = "quarter".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarter]
    
    @scala.inline
    def second: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second = "second".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second]
    
    @scala.inline
    def week: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week = "week".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.week]
    
    @scala.inline
    def year: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year = "year".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.seconds
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minutes
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hours
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.days
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weeks
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.months
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarters
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.years
  */
  trait RelativeTimeUnits extends StObject
  object RelativeTimeUnits {
    
    @scala.inline
    def days: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.days = "days".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.days]
    
    @scala.inline
    def hours: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hours = "hours".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hours]
    
    @scala.inline
    def minutes: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minutes = "minutes".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minutes]
    
    @scala.inline
    def months: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.months = "months".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.months]
    
    @scala.inline
    def quarters: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarters = "quarters".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.quarters]
    
    @scala.inline
    def seconds: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.seconds = "seconds".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.seconds]
    
    @scala.inline
    def weeks: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weeks = "weeks".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weeks]
    
    @scala.inline
    def years: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.years = "years".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.years]
  }
  
  /* Inlined parent std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/relative-time.IntlRelativeTimeFormatOptions, 'style' | 'numeric'> */
  trait ResolvedIntlRelativeTimeFormatOptions extends StObject {
    
    /**
      * The BCP 47 language tag for the locale actually used.
      * If any Unicode extension values were requested in the
      * input BCP 47 language tag that led to this locale,
      * the key-value pairs that were requested and are
      * supported for this locale are included in locale.
      */
    var locale: String
    
    /**
      * The value requested using the Unicode
      * extension key "nu" or filled in as a default.
      */
    var numberingSystem: String
    
    var numeric: js.UndefOr[always | auto] = js.undefined
    
    var style: js.UndefOr[long | short | narrow] = js.undefined
  }
  object ResolvedIntlRelativeTimeFormatOptions {
    
    @scala.inline
    def apply(locale: String, numberingSystem: String): ResolvedIntlRelativeTimeFormatOptions = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedIntlRelativeTimeFormatOptions]
    }
    
    @scala.inline
    implicit class ResolvedIntlRelativeTimeFormatOptionsMutableBuilder[Self <: ResolvedIntlRelativeTimeFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeric(value: always | auto): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      @scala.inline
      def setStyle(value: long | short | narrow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined {[ f in @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/relative-time.RelativeTimeField ]:? @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/relative-time.FieldData} & {  nu :std.Array<string | null>} */
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
    
    @scala.inline
    def apply(nu: js.Array[String | Null]): UnpackedLocaleFieldsData = {
      val __obj = js.Dynamic.literal(nu = nu.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnpackedLocaleFieldsData]
    }
    
    @scala.inline
    implicit class UnpackedLocaleFieldsDataMutableBuilder[Self <: UnpackedLocaleFieldsData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: FieldData): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDay-narrow`(value: FieldData): Self = StObject.set(x, "day-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDay-narrowUndefined`: Self = StObject.set(x, "day-narrow", js.undefined)
      
      @scala.inline
      def `setDay-short`(value: FieldData): Self = StObject.set(x, "day-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDay-shortUndefined`: Self = StObject.set(x, "day-short", js.undefined)
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setHour(value: FieldData): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHour-narrow`(value: FieldData): Self = StObject.set(x, "hour-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHour-narrowUndefined`: Self = StObject.set(x, "hour-narrow", js.undefined)
      
      @scala.inline
      def `setHour-short`(value: FieldData): Self = StObject.set(x, "hour-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHour-shortUndefined`: Self = StObject.set(x, "hour-short", js.undefined)
      
      @scala.inline
      def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      @scala.inline
      def setMinute(value: FieldData): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMinute-narrow`(value: FieldData): Self = StObject.set(x, "minute-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMinute-narrowUndefined`: Self = StObject.set(x, "minute-narrow", js.undefined)
      
      @scala.inline
      def `setMinute-short`(value: FieldData): Self = StObject.set(x, "minute-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMinute-shortUndefined`: Self = StObject.set(x, "minute-short", js.undefined)
      
      @scala.inline
      def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      @scala.inline
      def setMonth(value: FieldData): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMonth-narrow`(value: FieldData): Self = StObject.set(x, "month-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMonth-narrowUndefined`: Self = StObject.set(x, "month-narrow", js.undefined)
      
      @scala.inline
      def `setMonth-short`(value: FieldData): Self = StObject.set(x, "month-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMonth-shortUndefined`: Self = StObject.set(x, "month-short", js.undefined)
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setNu(value: js.Array[String | Null]): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNuVarargs(value: (String | Null)*): Self = StObject.set(x, "nu", js.Array(value :_*))
      
      @scala.inline
      def setQuarter(value: FieldData): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setQuarter-narrow`(value: FieldData): Self = StObject.set(x, "quarter-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setQuarter-narrowUndefined`: Self = StObject.set(x, "quarter-narrow", js.undefined)
      
      @scala.inline
      def `setQuarter-short`(value: FieldData): Self = StObject.set(x, "quarter-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setQuarter-shortUndefined`: Self = StObject.set(x, "quarter-short", js.undefined)
      
      @scala.inline
      def setQuarterUndefined: Self = StObject.set(x, "quarter", js.undefined)
      
      @scala.inline
      def setSecond(value: FieldData): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSecond-narrow`(value: FieldData): Self = StObject.set(x, "second-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSecond-narrowUndefined`: Self = StObject.set(x, "second-narrow", js.undefined)
      
      @scala.inline
      def `setSecond-short`(value: FieldData): Self = StObject.set(x, "second-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSecond-shortUndefined`: Self = StObject.set(x, "second-short", js.undefined)
      
      @scala.inline
      def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      @scala.inline
      def setWeek(value: FieldData): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWeek-narrow`(value: FieldData): Self = StObject.set(x, "week-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWeek-narrowUndefined`: Self = StObject.set(x, "week-narrow", js.undefined)
      
      @scala.inline
      def `setWeek-short`(value: FieldData): Self = StObject.set(x, "week-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWeek-shortUndefined`: Self = StObject.set(x, "week-short", js.undefined)
      
      @scala.inline
      def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
      
      @scala.inline
      def setYear(value: FieldData): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setYear-narrow`(value: FieldData): Self = StObject.set(x, "year-narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setYear-narrowUndefined`: Self = StObject.set(x, "year-narrow", js.undefined)
      
      @scala.inline
      def `setYear-short`(value: FieldData): Self = StObject.set(x, "year-short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setYear-shortUndefined`: Self = StObject.set(x, "year-short", js.undefined)
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
}
