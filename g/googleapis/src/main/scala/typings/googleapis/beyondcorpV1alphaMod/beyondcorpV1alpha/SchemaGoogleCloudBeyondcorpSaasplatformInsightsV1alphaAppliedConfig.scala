package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaAppliedConfig extends StObject {
  
  /**
    * Output only. Aggregation type applied.
    */
  var aggregation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Customised grouping applied.
    */
  var customGrouping: js.UndefOr[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaCustomGrouping] = js.undefined
  
  /**
    * Output only. Ending time for the duration for which insight was pulled.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Filters applied.
    */
  var fieldFilter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Group id of the grouping applied.
    */
  var group: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Starting time for the duration for which insight was pulled.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaAppliedConfig {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaAppliedConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaAppliedConfig]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaAppliedConfig](x: Self) {
    
    inline def setAggregation(value: String): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationNull: Self = StObject.set(x, "aggregation", null)
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setCustomGrouping(value: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaCustomGrouping): Self = StObject.set(x, "customGrouping", value.asInstanceOf[js.Any])
    
    inline def setCustomGroupingUndefined: Self = StObject.set(x, "customGrouping", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFieldFilter(value: String): Self = StObject.set(x, "fieldFilter", value.asInstanceOf[js.Any])
    
    inline def setFieldFilterNull: Self = StObject.set(x, "fieldFilter", null)
    
    inline def setFieldFilterUndefined: Self = StObject.set(x, "fieldFilter", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
