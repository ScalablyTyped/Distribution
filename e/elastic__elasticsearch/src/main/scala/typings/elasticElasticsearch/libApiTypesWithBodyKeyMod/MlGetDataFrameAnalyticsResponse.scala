package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetDataFrameAnalyticsResponse extends StObject {
  
  var count: integer
  
  var data_frame_analytics: js.Array[MlDataframeAnalyticsSummary]
}
object MlGetDataFrameAnalyticsResponse {
  
  inline def apply(count: integer, data_frame_analytics: js.Array[MlDataframeAnalyticsSummary]): MlGetDataFrameAnalyticsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data_frame_analytics = data_frame_analytics.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetDataFrameAnalyticsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetDataFrameAnalyticsResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setData_frame_analytics(value: js.Array[MlDataframeAnalyticsSummary]): Self = StObject.set(x, "data_frame_analytics", value.asInstanceOf[js.Any])
    
    inline def setData_frame_analyticsVarargs(value: MlDataframeAnalyticsSummary*): Self = StObject.set(x, "data_frame_analytics", js.Array(value*))
  }
}
