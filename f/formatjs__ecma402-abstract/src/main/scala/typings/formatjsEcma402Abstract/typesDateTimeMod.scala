package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.FnCall
import typings.formatjsEcma402Abstract.anon.FullLong
import typings.formatjsEcma402Abstract.anon.IntervalFormatFallback
import typings.formatjsEcma402Abstract.anon.Long
import typings.formatjsEcma402Abstract.anon.LongEraData
import typings.formatjsEcma402Abstract.anon.Medium
import typings.formatjsEcma402Abstract.anon.Narrow
import typings.formatjsEcma402Abstract.anon.RecordTABLE2defaultRangePAmpm
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`2-digit`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.buddhist
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.chinese
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.coptic
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ethiopia
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ethiopic
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.full
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.gregory
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.h11
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.h12
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.h23
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.h24
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hebrew
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.indian
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.islamic
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.iso8601
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.japanese
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.medium
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.narrow
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.numeric
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.persian
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.roc
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import typings.std.Date
import typings.std.Intl.DateTimeFormatPartTypes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDateTimeMod {
  
  @js.native
  trait DateTimeFormat
    extends StObject
       with typings.std.Intl.DateTimeFormat {
    
    def formatRange(startDate: Double, endDate: Double): String = js.native
    def formatRange(startDate: Double, endDate: Date): String = js.native
    def formatRange(startDate: Date, endDate: Double): String = js.native
    def formatRange(startDate: Date, endDate: Date): String = js.native
    
    def formatRangeToParts(startDate: Double, endDate: Double): js.Array[IntlDateTimeFormatPart] = js.native
    def formatRangeToParts(startDate: Double, endDate: Date): js.Array[IntlDateTimeFormatPart] = js.native
    def formatRangeToParts(startDate: Date, endDate: Double): js.Array[IntlDateTimeFormatPart] = js.native
    def formatRangeToParts(startDate: Date, endDate: Date): js.Array[IntlDateTimeFormatPart] = js.native
  }
  
  trait DateTimeFormatLocaleInternalData extends StObject {
    
    var am: String
    
    var ca: js.Array[String]
    
    var dateFormat: FullLong
    
    var dateTimeFormat: Medium
    
    var era: LongEraData
    
    var formats: Record[String, js.Array[Formats]]
    
    /**
      * So we can construct GMT+08:00
      */
    var gmtFormat: String
    
    var hc: js.Array[String]
    
    var hourCycle: String
    
    /**
      * So we can construct GMT+08:00
      */
    var hourFormat: String
    
    var month: Narrow
    
    var nu: js.Array[String]
    
    var pm: String
    
    var timeFormat: FullLong
    
    var timeZoneName: TimeZoneNameData
    
    var weekday: Narrow
  }
  object DateTimeFormatLocaleInternalData {
    
    inline def apply(
      am: String,
      ca: js.Array[String],
      dateFormat: FullLong,
      dateTimeFormat: Medium,
      era: LongEraData,
      formats: Record[String, js.Array[Formats]],
      gmtFormat: String,
      hc: js.Array[String],
      hourCycle: String,
      hourFormat: String,
      month: Narrow,
      nu: js.Array[String],
      pm: String,
      timeFormat: FullLong,
      timeZoneName: TimeZoneNameData,
      weekday: Narrow
    ): DateTimeFormatLocaleInternalData = {
      val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], ca = ca.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], era = era.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], gmtFormat = gmtFormat.asInstanceOf[js.Any], hc = hc.asInstanceOf[js.Any], hourCycle = hourCycle.asInstanceOf[js.Any], hourFormat = hourFormat.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], timeFormat = timeFormat.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateTimeFormatLocaleInternalData]
    }
    
    extension [Self <: DateTimeFormatLocaleInternalData](x: Self) {
      
      inline def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
      
      inline def setCa(value: js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      inline def setDateFormat(value: FullLong): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateTimeFormat(value: Medium): Self = StObject.set(x, "dateTimeFormat", value.asInstanceOf[js.Any])
      
      inline def setEra(value: LongEraData): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setFormats(value: Record[String, js.Array[Formats]]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setGmtFormat(value: String): Self = StObject.set(x, "gmtFormat", value.asInstanceOf[js.Any])
      
      inline def setHc(value: js.Array[String]): Self = StObject.set(x, "hc", value.asInstanceOf[js.Any])
      
      inline def setHcVarargs(value: String*): Self = StObject.set(x, "hc", js.Array(value :_*))
      
      inline def setHourCycle(value: String): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
      
      inline def setHourFormat(value: String): Self = StObject.set(x, "hourFormat", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Narrow): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setNu(value: js.Array[String]): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
      
      inline def setNuVarargs(value: String*): Self = StObject.set(x, "nu", js.Array(value :_*))
      
      inline def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
      
      inline def setTimeFormat(value: FullLong): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneName(value: TimeZoneNameData): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      inline def setWeekday(value: Narrow): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    }
  }
  
  trait DateTimeFormatOptions
    extends StObject
       with typings.std.Intl.DateTimeFormatOptions {
    
    var calendar: js.UndefOr[
        buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
      ] = js.undefined
    
    var dateStyle: js.UndefOr[full | long | medium | short] = js.undefined
    
    var fractionalSecondDigits: js.UndefOr[Double] = js.undefined
    
    var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.undefined
    
    var numberingSystem: js.UndefOr[String] = js.undefined
    
    var timeStyle: js.UndefOr[full | long | medium | short] = js.undefined
  }
  object DateTimeFormatOptions {
    
    inline def apply(): DateTimeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeFormatOptions]
    }
    
    extension [Self <: DateTimeFormatOptions](x: Self) {
      
      inline def setCalendar(
        value: buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
      ): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
      
      inline def setDateStyle(value: full | long | medium | short): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
      
      inline def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
      
      inline def setFractionalSecondDigits(value: Double): Self = StObject.set(x, "fractionalSecondDigits", value.asInstanceOf[js.Any])
      
      inline def setFractionalSecondDigitsUndefined: Self = StObject.set(x, "fractionalSecondDigits", js.undefined)
      
      inline def setHourCycle(value: h11 | h12 | h23 | h24): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
      
      inline def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
      
      inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
      
      inline def setTimeStyle(value: full | long | medium | short): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
      
      inline def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
    }
  }
  
  trait EraData extends StObject {
    
    var AD: String
    
    var BC: String
  }
  object EraData {
    
    inline def apply(AD: String, BC: String): EraData = {
      val __obj = js.Dynamic.literal(AD = AD.asInstanceOf[js.Any], BC = BC.asInstanceOf[js.Any])
      __obj.asInstanceOf[EraData]
    }
    
    extension [Self <: EraData](x: Self) {
      
      inline def setAD(value: String): Self = StObject.set(x, "AD", value.asInstanceOf[js.Any])
      
      inline def setBC(value: String): Self = StObject.set(x, "BC", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.DateTimeFormatOptions, 'weekday' | 'era' | 'year' | 'month' | 'day' | 'hour' | 'minute' | 'second' | 'timeZoneName'> & {  hour12 :boolean | undefined,   pattern :string,   pattern12 :string,   skeleton :string,   rawPattern :string,   rangePatterns :std.Record<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.TABLE_2 | 'default', @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.RangePatterns>,   rangePatterns12 :std.Record<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.TABLE_2 | 'default', @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.RangePatterns>} */
  trait Formats extends StObject {
    
    var day: js.UndefOr[String] = js.undefined
    
    var era: js.UndefOr[String] = js.undefined
    
    var hour: js.UndefOr[String] = js.undefined
    
    var hour12: js.UndefOr[Boolean] = js.undefined
    
    var minute: js.UndefOr[String] = js.undefined
    
    var month: js.UndefOr[String] = js.undefined
    
    var pattern: String
    
    var pattern12: String
    
    var rangePatterns: RecordTABLE2defaultRangePAmpm
    
    var rangePatterns12: RecordTABLE2defaultRangePAmpm
    
    var rawPattern: String
    
    var second: js.UndefOr[String] = js.undefined
    
    var skeleton: String
    
    var timeZoneName: js.UndefOr[String] = js.undefined
    
    var weekday: js.UndefOr[String] = js.undefined
    
    var year: js.UndefOr[String] = js.undefined
  }
  object Formats {
    
    inline def apply(
      pattern: String,
      pattern12: String,
      rangePatterns: RecordTABLE2defaultRangePAmpm,
      rangePatterns12: RecordTABLE2defaultRangePAmpm,
      rawPattern: String,
      skeleton: String
    ): Formats = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], pattern12 = pattern12.asInstanceOf[js.Any], rangePatterns = rangePatterns.asInstanceOf[js.Any], rangePatterns12 = rangePatterns12.asInstanceOf[js.Any], rawPattern = rawPattern.asInstanceOf[js.Any], skeleton = skeleton.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formats]
    }
    
    extension [Self <: Formats](x: Self) {
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setEra(value: String): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
      
      inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPattern12(value: String): Self = StObject.set(x, "pattern12", value.asInstanceOf[js.Any])
      
      inline def setRangePatterns(value: RecordTABLE2defaultRangePAmpm): Self = StObject.set(x, "rangePatterns", value.asInstanceOf[js.Any])
      
      inline def setRangePatterns12(value: RecordTABLE2defaultRangePAmpm): Self = StObject.set(x, "rangePatterns12", value.asInstanceOf[js.Any])
      
      inline def setRawPattern(value: String): Self = StObject.set(x, "rawPattern", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setSkeleton(value: String): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneName(value: String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      inline def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  type IntervalFormatsData = IntervalFormatFallback & (Record[String, Record[String, String]])
  
  trait IntlDateTimeFormatInternal extends StObject {
    
    var boundFormat: js.UndefOr[FnCall] = js.undefined
    
    var calendar: js.UndefOr[String] = js.undefined
    
    var dataLocale: String
    
    var dateStyle: js.UndefOr[full | long | medium | short] = js.undefined
    
    var day: `2-digit` | numeric
    
    var era: narrow | short | long
    
    var format: Formats
    
    var hour: `2-digit` | numeric
    
    var hourCycle: String
    
    var locale: String
    
    var minute: `2-digit` | numeric
    
    var month: `2-digit` | numeric | narrow | short | long
    
    var numberingSystem: String
    
    var pattern: String
    
    var rangePatterns: RecordTABLE2defaultRangePAmpm
    
    var second: `2-digit` | numeric
    
    var timeStyle: js.UndefOr[full | long | medium | short] = js.undefined
    
    var timeZone: String
    
    var timeZoneName: short | long
    
    var weekday: narrow | short | long
    
    var year: `2-digit` | numeric
  }
  object IntlDateTimeFormatInternal {
    
    inline def apply(
      dataLocale: String,
      day: `2-digit` | numeric,
      era: narrow | short | long,
      format: Formats,
      hour: `2-digit` | numeric,
      hourCycle: String,
      locale: String,
      minute: `2-digit` | numeric,
      month: `2-digit` | numeric | narrow | short | long,
      numberingSystem: String,
      pattern: String,
      rangePatterns: RecordTABLE2defaultRangePAmpm,
      second: `2-digit` | numeric,
      timeZone: String,
      timeZoneName: short | long,
      weekday: narrow | short | long,
      year: `2-digit` | numeric
    ): IntlDateTimeFormatInternal = {
      val __obj = js.Dynamic.literal(dataLocale = dataLocale.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], era = era.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], hourCycle = hourCycle.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], rangePatterns = rangePatterns.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlDateTimeFormatInternal]
    }
    
    extension [Self <: IntlDateTimeFormatInternal](x: Self) {
      
      inline def setBoundFormat(value: FnCall): Self = StObject.set(x, "boundFormat", value.asInstanceOf[js.Any])
      
      inline def setBoundFormatUndefined: Self = StObject.set(x, "boundFormat", js.undefined)
      
      inline def setCalendar(value: String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
      
      inline def setDataLocale(value: String): Self = StObject.set(x, "dataLocale", value.asInstanceOf[js.Any])
      
      inline def setDateStyle(value: full | long | medium | short): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
      
      inline def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
      
      inline def setDay(value: `2-digit` | numeric): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setEra(value: narrow | short | long): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Formats): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHour(value: `2-digit` | numeric): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourCycle(value: String): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: `2-digit` | numeric): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: `2-digit` | numeric | narrow | short | long): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setRangePatterns(value: RecordTABLE2defaultRangePAmpm): Self = StObject.set(x, "rangePatterns", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: `2-digit` | numeric): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setTimeStyle(value: full | long | medium | short): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
      
      inline def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneName(value: short | long): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      inline def setWeekday(value: narrow | short | long): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setYear(value: `2-digit` | numeric): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntlDateTimeFormatPart extends StObject {
    
    var source: js.UndefOr[RangePatternType] = js.undefined
    
    var `type`: IntlDateTimeFormatPartType
    
    var value: js.UndefOr[String] = js.undefined
  }
  object IntlDateTimeFormatPart {
    
    inline def apply(`type`: IntlDateTimeFormatPartType): IntlDateTimeFormatPart = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlDateTimeFormatPart]
    }
    
    extension [Self <: IntlDateTimeFormatPart](x: Self) {
      
      inline def setSource(value: RangePatternType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setType(value: IntlDateTimeFormatPartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.Intl.DateTimeFormatPartTypes
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ampm
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.relatedYear
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.yearName
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.unknown
  */
  type IntlDateTimeFormatPartType = _IntlDateTimeFormatPartType | DateTimeFormatPartTypes
  
  trait RangePatternPart[T /* <: RangePatternType */] extends StObject {
    
    var pattern: String
    
    var source: T
  }
  object RangePatternPart {
    
    inline def apply[T /* <: RangePatternType */](pattern: String, source: T): RangePatternPart[T] = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangePatternPart[T]]
    }
    
    extension [Self <: RangePatternPart[?], T /* <: RangePatternType */](x: Self & RangePatternPart[T]) {
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setSource(value: T): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.startRange
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.shared
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.endRange
  */
  trait RangePatternType extends StObject
  object RangePatternType {
    
    inline def endRange: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.endRange = "endRange".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.endRange]
    
    inline def shared: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.shared = "shared".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.shared]
    
    inline def startRange: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.startRange = "startRange".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.startRange]
  }
  
  /* Inlined std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.DateTimeFormatOptions, 'weekday' | 'era' | 'year' | 'month' | 'day' | 'hour' | 'minute' | 'second' | 'timeZoneName'> & {  hour12 :boolean | undefined,   patternParts :std.Array<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.RangePatternPart<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.RangePatternType>>} */
  trait RangePatterns extends StObject {
    
    var day: js.UndefOr[String] = js.undefined
    
    var era: js.UndefOr[String] = js.undefined
    
    var hour: js.UndefOr[String] = js.undefined
    
    var hour12: js.UndefOr[Boolean] = js.undefined
    
    var minute: js.UndefOr[String] = js.undefined
    
    var month: js.UndefOr[String] = js.undefined
    
    var patternParts: js.Array[RangePatternPart[RangePatternType]]
    
    var second: js.UndefOr[String] = js.undefined
    
    var timeZoneName: js.UndefOr[String] = js.undefined
    
    var weekday: js.UndefOr[String] = js.undefined
    
    var year: js.UndefOr[String] = js.undefined
  }
  object RangePatterns {
    
    inline def apply(patternParts: js.Array[RangePatternPart[RangePatternType]]): RangePatterns = {
      val __obj = js.Dynamic.literal(patternParts = patternParts.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangePatterns]
    }
    
    extension [Self <: RangePatterns](x: Self) {
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setEra(value: String): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
      
      inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setPatternParts(value: js.Array[RangePatternPart[RangePatternType]]): Self = StObject.set(x, "patternParts", value.asInstanceOf[js.Any])
      
      inline def setPatternPartsVarargs(value: RangePatternPart[RangePatternType]*): Self = StObject.set(x, "patternParts", js.Array(value :_*))
      
      inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setTimeZoneName(value: String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      inline def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait ResolvedDateTimeFormatOptions
    extends StObject
       with typings.std.Intl.ResolvedDateTimeFormatOptions {
    
    var dateStyle: js.UndefOr[full | long | medium | short] = js.undefined
    
    var hourCycle: String
    
    var timeStyle: js.UndefOr[full | long | medium | short] = js.undefined
  }
  object ResolvedDateTimeFormatOptions {
    
    inline def apply(calendar: String, hourCycle: String, locale: String, numberingSystem: String, timeZone: String): ResolvedDateTimeFormatOptions = {
      val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], hourCycle = hourCycle.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedDateTimeFormatOptions]
    }
    
    extension [Self <: ResolvedDateTimeFormatOptions](x: Self) {
      
      inline def setDateStyle(value: full | long | medium | short): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
      
      inline def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
      
      inline def setHourCycle(value: String): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
      
      inline def setTimeStyle(value: full | long | medium | short): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
      
      inline def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ampm
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second
  */
  trait TABLE_2 extends StObject
  object TABLE_2 {
    
    inline def ampm: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ampm = "ampm".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ampm]
    
    inline def day: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day = "day".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day]
    
    inline def era: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era = "era".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era]
    
    inline def hour: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour = "hour".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour]
    
    inline def minute: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute = "minute".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute]
    
    inline def month: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month = "month".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month]
    
    inline def second: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second = "second".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second]
    
    inline def year: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year = "year".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weekday
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.timeZoneName
  */
  trait TABLE_6 extends StObject
  object TABLE_6 {
    
    inline def day: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day = "day".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day]
    
    inline def era: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era = "era".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era]
    
    inline def hour: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour = "hour".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour]
    
    inline def minute: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute = "minute".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute]
    
    inline def month: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month = "month".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month]
    
    inline def second: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second = "second".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second]
    
    inline def timeZoneName: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.timeZoneName = "timeZoneName".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.timeZoneName]
    
    inline def weekday: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weekday = "weekday".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weekday]
    
    inline def year: typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year = "year".asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year]
  }
  
  type TimeZoneNameData = Record[String, Long]
  
  type UnpackedZoneData = js.Tuple4[Double, String, Double, Boolean]
  
  trait _IntlDateTimeFormatPartType extends StObject
}
