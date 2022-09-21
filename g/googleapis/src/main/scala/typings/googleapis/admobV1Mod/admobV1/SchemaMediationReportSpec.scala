package typings.googleapis.admobV1Mod.admobV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMediationReportSpec extends StObject {
  
  /**
    * The date range for which the report is generated.
    */
  var dateRange: js.UndefOr[SchemaDateRange] = js.undefined
  
  /**
    * Describes which report rows to match based on their dimension values.
    */
  var dimensionFilters: js.UndefOr[js.Array[SchemaMediationReportSpecDimensionFilter]] = js.undefined
  
  /**
    * List of dimensions of the report. The value combination of these dimensions determines the row of the report. If no dimensions are specified, the report returns a single row of requested metrics for the entire account.
    */
  var dimensions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Localization settings of the report.
    */
  var localizationSettings: js.UndefOr[SchemaLocalizationSettings] = js.undefined
  
  /**
    * Maximum number of report data rows to return. If the value is not set, the API returns as many rows as possible, up to 100000. Acceptable values are 1-100000, inclusive. Values larger than 100000 return an error.
    */
  var maxReportRows: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * List of metrics of the report. A report must specify at least one metric.
    */
  var metrics: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Describes the sorting of report rows. The order of the condition in the list defines its precedence; the earlier the condition, the higher its precedence. If no sort conditions are specified, the row ordering is undefined.
    */
  var sortConditions: js.UndefOr[js.Array[SchemaMediationReportSpecSortCondition]] = js.undefined
  
  /**
    * A report time zone. Accepts an IANA TZ name values, such as "America/Los_Angeles." If no time zone is defined, the account default takes effect. Check default value by the get account action. **Warning:** The "America/Los_Angeles" is the only supported value at the moment.
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaMediationReportSpec {
  
  inline def apply(): SchemaMediationReportSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMediationReportSpec]
  }
  
  extension [Self <: SchemaMediationReportSpec](x: Self) {
    
    inline def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setDimensionFilters(value: js.Array[SchemaMediationReportSpecDimensionFilter]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    inline def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    inline def setDimensionFiltersVarargs(value: SchemaMediationReportSpecDimensionFilter*): Self = StObject.set(x, "dimensionFilters", js.Array(value*))
    
    inline def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsNull: Self = StObject.set(x, "dimensions", null)
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setLocalizationSettings(value: SchemaLocalizationSettings): Self = StObject.set(x, "localizationSettings", value.asInstanceOf[js.Any])
    
    inline def setLocalizationSettingsUndefined: Self = StObject.set(x, "localizationSettings", js.undefined)
    
    inline def setMaxReportRows(value: Double): Self = StObject.set(x, "maxReportRows", value.asInstanceOf[js.Any])
    
    inline def setMaxReportRowsNull: Self = StObject.set(x, "maxReportRows", null)
    
    inline def setMaxReportRowsUndefined: Self = StObject.set(x, "maxReportRows", js.undefined)
    
    inline def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsNull: Self = StObject.set(x, "metrics", null)
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setSortConditions(value: js.Array[SchemaMediationReportSpecSortCondition]): Self = StObject.set(x, "sortConditions", value.asInstanceOf[js.Any])
    
    inline def setSortConditionsUndefined: Self = StObject.set(x, "sortConditions", js.undefined)
    
    inline def setSortConditionsVarargs(value: SchemaMediationReportSpecSortCondition*): Self = StObject.set(x, "sortConditions", js.Array(value*))
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
