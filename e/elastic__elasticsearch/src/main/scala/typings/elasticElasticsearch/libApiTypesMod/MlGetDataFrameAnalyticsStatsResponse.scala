package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetDataFrameAnalyticsStatsResponse extends StObject {
  
  var count: long
  
  var data_frame_analytics: js.Array[MlDataframeAnalytics]
}
object MlGetDataFrameAnalyticsStatsResponse {
  
  inline def apply(count: long, data_frame_analytics: js.Array[MlDataframeAnalytics]): MlGetDataFrameAnalyticsStatsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data_frame_analytics = data_frame_analytics.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetDataFrameAnalyticsStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetDataFrameAnalyticsStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setData_frame_analytics(value: js.Array[MlDataframeAnalytics]): Self = StObject.set(x, "data_frame_analytics", value.asInstanceOf[js.Any])
    
    inline def setData_frame_analyticsVarargs(value: MlDataframeAnalytics*): Self = StObject.set(x, "data_frame_analytics", js.Array(value*))
  }
}
