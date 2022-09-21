package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInsightsConfiguredinsight
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Aggregation type. Available aggregation could be fetched by calling insight list and get APIs in `BASIC` view.
    */
  var aggregation: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Filterable parameters to be added to the grouping clause. Available fields could be fetched by calling insight list and get APIs in `BASIC` view. `=` is the only comparison operator supported. `AND` is the only logical operator supported. Usage: field_filter="fieldName1=fieldVal1 AND fieldName2=fieldVal2". NOTE: Only `AND` conditions are allowed. NOTE: Use the `filter_alias` from `Insight.Metadata.Field` message for the filtering the corresponding fields in this filter field. (These expressions are based on the filter language described at https://google.aip.dev/160).
    */
  @JSName("customGrouping.fieldFilter")
  var customGroupingDotfieldFilter: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Fields to be used for grouping. NOTE: Use the `filter_alias` from `Insight.Metadata.Field` message for declaring the fields to be grouped-by here.
    */
  @JSName("customGrouping.groupFields")
  var customGroupingDotgroupFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. Ending time for the duration for which insight is to be pulled.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Other filterable/configurable parameters as applicable to the selected insight. Available fields could be fetched by calling insight list and get APIs in `BASIC` view. `=` is the only comparison operator supported. `AND` is the only logical operator supported. Usage: field_filter="fieldName1=fieldVal1 AND fieldName2=fieldVal2". NOTE: Only `AND` conditions are allowed. NOTE: Use the `filter_alias` from `Insight.Metadata.Field` message for the filtering the corresponding fields in this filter field. (These expressions are based on the filter language described at https://google.aip.dev/160).
    */
  var fieldFilter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Group id of the available groupings for the insight. Available groupings could be fetched by calling insight list and get APIs in `BASIC` view.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the insight using the form: `organizations/{organization_id\}/locations/{location_id\}/insights/{insight_id\}` `projects/{project_id\}/locations/{location_id\}/insights/{insight_id\}`.
    */
  var insight: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Used to fetch the page represented by the token. Fetches the first page when not set.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Starting time for the duration for which insight is to be pulled.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInsightsConfiguredinsight {
  
  inline def apply(): ParamsResourceProjectsLocationsInsightsConfiguredinsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInsightsConfiguredinsight]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInsightsConfiguredinsight](x: Self) {
    
    inline def setAggregation(value: String): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setCustomGroupingDotfieldFilter(value: String): Self = StObject.set(x, "customGrouping.fieldFilter", value.asInstanceOf[js.Any])
    
    inline def setCustomGroupingDotfieldFilterUndefined: Self = StObject.set(x, "customGrouping.fieldFilter", js.undefined)
    
    inline def setCustomGroupingDotgroupFields(value: js.Array[String]): Self = StObject.set(x, "customGrouping.groupFields", value.asInstanceOf[js.Any])
    
    inline def setCustomGroupingDotgroupFieldsUndefined: Self = StObject.set(x, "customGrouping.groupFields", js.undefined)
    
    inline def setCustomGroupingDotgroupFieldsVarargs(value: String*): Self = StObject.set(x, "customGrouping.groupFields", js.Array(value*))
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFieldFilter(value: String): Self = StObject.set(x, "fieldFilter", value.asInstanceOf[js.Any])
    
    inline def setFieldFilterUndefined: Self = StObject.set(x, "fieldFilter", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setInsight(value: String): Self = StObject.set(x, "insight", value.asInstanceOf[js.Any])
    
    inline def setInsightUndefined: Self = StObject.set(x, "insight", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
