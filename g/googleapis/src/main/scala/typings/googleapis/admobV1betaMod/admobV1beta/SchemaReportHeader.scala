package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportHeader extends StObject {
  
  /**
    * The date range for which the report is generated. This is identical to the range specified in the report request.
    */
  var dateRange: js.UndefOr[SchemaDateRange] = js.undefined
  
  /**
    * Localization settings of the report. This is identical to the settings in the report request.
    */
  var localizationSettings: js.UndefOr[SchemaLocalizationSettings] = js.undefined
  
  /**
    * The report time zone. The value is a time-zone ID as specified by the CLDR project, for example, "America/Los_Angeles".
    */
  var reportingTimeZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportHeader {
  
  inline def apply(): SchemaReportHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportHeader]
  }
  
  extension [Self <: SchemaReportHeader](x: Self) {
    
    inline def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setLocalizationSettings(value: SchemaLocalizationSettings): Self = StObject.set(x, "localizationSettings", value.asInstanceOf[js.Any])
    
    inline def setLocalizationSettingsUndefined: Self = StObject.set(x, "localizationSettings", js.undefined)
    
    inline def setReportingTimeZone(value: String): Self = StObject.set(x, "reportingTimeZone", value.asInstanceOf[js.Any])
    
    inline def setReportingTimeZoneNull: Self = StObject.set(x, "reportingTimeZone", null)
    
    inline def setReportingTimeZoneUndefined: Self = StObject.set(x, "reportingTimeZone", js.undefined)
  }
}
