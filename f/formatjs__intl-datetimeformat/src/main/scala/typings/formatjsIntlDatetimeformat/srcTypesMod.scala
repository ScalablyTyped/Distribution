package typings.formatjsIntlDatetimeformat

import typings.formatjsEcma402Abstract.anon.LongEraData
import typings.formatjsEcma402Abstract.anon.Narrow
import typings.formatjsEcma402Abstract.typesCoreMod.LocaleData
import typings.formatjsEcma402Abstract.typesDateTimeMod.IntervalFormatsData
import typings.formatjsIntlDatetimeformat.anon.Full
import typings.formatjsIntlDatetimeformat.anon.Long
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTypesMod {
  
  trait PackedData extends StObject {
    
    var abbrvs: String
    
    var offsets: String
    
    var zones: js.Array[String]
  }
  object PackedData {
    
    inline def apply(abbrvs: String, offsets: String, zones: js.Array[String]): PackedData = {
      val __obj = js.Dynamic.literal(abbrvs = abbrvs.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackedData]
    }
    
    extension [Self <: PackedData](x: Self) {
      
      inline def setAbbrvs(value: String): Self = StObject.set(x, "abbrvs", value.asInstanceOf[js.Any])
      
      inline def setOffsets(value: String): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
      
      inline def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
      
      inline def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value :_*))
    }
  }
  
  type RawDateTimeLocaleData = LocaleData[RawDateTimeLocaleInternalData]
  
  /* Inlined std.Omit<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract.DateTimeFormatLocaleInternalData, 'dateFormat' | 'timeFormat' | 'dateTimeFormat' | 'formats' | 'intervalFormats'> & {  formats :std.Record<string, std.Record<string, string>>,   dateFormat :{  full :string,   long :string,   medium :string,   short :string},   timeFormat :{  full :string,   long :string,   medium :string,   short :string},   intervalFormats :@formatjs/ecma402-abstract.@formatjs/ecma402-abstract.IntervalFormatsData,   dateTimeFormat :{  full :string,   long :string,   medium :string,   short :string}} */
  trait RawDateTimeLocaleInternalData extends StObject {
    
    var am: String
    
    var ca: js.Array[String]
    
    var dateFormat: Full
    
    var dateTimeFormat: Full
    
    var era: LongEraData
    
    var formats: Record[String, Record[String, String]]
    
    var gmtFormat: String
    
    var hc: js.Array[String]
    
    var hourCycle: String
    
    var hourFormat: String
    
    var intervalFormats: IntervalFormatsData
    
    var month: Narrow
    
    var nu: js.Array[String]
    
    var pm: String
    
    var timeFormat: Full
    
    var timeZoneName: typings.formatjsEcma402Abstract.typesDateTimeMod.TimeZoneNameData
    
    var weekday: Narrow
  }
  object RawDateTimeLocaleInternalData {
    
    inline def apply(
      am: String,
      ca: js.Array[String],
      dateFormat: Full,
      dateTimeFormat: Full,
      era: LongEraData,
      formats: Record[String, Record[String, String]],
      gmtFormat: String,
      hc: js.Array[String],
      hourCycle: String,
      hourFormat: String,
      intervalFormats: IntervalFormatsData,
      month: Narrow,
      nu: js.Array[String],
      pm: String,
      timeFormat: Full,
      timeZoneName: typings.formatjsEcma402Abstract.typesDateTimeMod.TimeZoneNameData,
      weekday: Narrow
    ): RawDateTimeLocaleInternalData = {
      val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], ca = ca.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], era = era.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], gmtFormat = gmtFormat.asInstanceOf[js.Any], hc = hc.asInstanceOf[js.Any], hourCycle = hourCycle.asInstanceOf[js.Any], hourFormat = hourFormat.asInstanceOf[js.Any], intervalFormats = intervalFormats.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], timeFormat = timeFormat.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDateTimeLocaleInternalData]
    }
    
    extension [Self <: RawDateTimeLocaleInternalData](x: Self) {
      
      inline def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
      
      inline def setCa(value: js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      inline def setDateFormat(value: Full): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateTimeFormat(value: Full): Self = StObject.set(x, "dateTimeFormat", value.asInstanceOf[js.Any])
      
      inline def setEra(value: LongEraData): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setFormats(value: Record[String, Record[String, String]]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setGmtFormat(value: String): Self = StObject.set(x, "gmtFormat", value.asInstanceOf[js.Any])
      
      inline def setHc(value: js.Array[String]): Self = StObject.set(x, "hc", value.asInstanceOf[js.Any])
      
      inline def setHcVarargs(value: String*): Self = StObject.set(x, "hc", js.Array(value :_*))
      
      inline def setHourCycle(value: String): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
      
      inline def setHourFormat(value: String): Self = StObject.set(x, "hourFormat", value.asInstanceOf[js.Any])
      
      inline def setIntervalFormats(value: IntervalFormatsData): Self = StObject.set(x, "intervalFormats", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Narrow): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setNu(value: js.Array[String]): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
      
      inline def setNuVarargs(value: String*): Self = StObject.set(x, "nu", js.Array(value :_*))
      
      inline def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
      
      inline def setTimeFormat(value: Full): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneName(value: typings.formatjsEcma402Abstract.typesDateTimeMod.TimeZoneNameData): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      inline def setWeekday(value: Narrow): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    }
  }
  
  type TimeZoneNameData = Record[String, Long]
  
  trait UnpackedData extends StObject {
    
    var abbrvs: js.Array[String]
    
    /**
      * Offset in seconds, base 36
      */
    var offsets: js.Array[Double]
    
    var zones: Record[String, js.Array[ZoneData]]
  }
  object UnpackedData {
    
    inline def apply(abbrvs: js.Array[String], offsets: js.Array[Double], zones: Record[String, js.Array[ZoneData]]): UnpackedData = {
      val __obj = js.Dynamic.literal(abbrvs = abbrvs.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnpackedData]
    }
    
    extension [Self <: UnpackedData](x: Self) {
      
      inline def setAbbrvs(value: js.Array[String]): Self = StObject.set(x, "abbrvs", value.asInstanceOf[js.Any])
      
      inline def setAbbrvsVarargs(value: String*): Self = StObject.set(x, "abbrvs", js.Array(value :_*))
      
      inline def setOffsets(value: js.Array[Double]): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
      
      inline def setOffsetsVarargs(value: Double*): Self = StObject.set(x, "offsets", js.Array(value :_*))
      
      inline def setZones(value: Record[String, js.Array[ZoneData]]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    }
  }
  
  type ZoneData = js.Tuple4[Double | String, Double, Double, Double]
}
