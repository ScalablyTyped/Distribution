package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStopDataFrameAnalyticsResponse extends StObject {
  
  var stopped: Boolean
}
object MlStopDataFrameAnalyticsResponse {
  
  inline def apply(stopped: Boolean): MlStopDataFrameAnalyticsResponse = {
    val __obj = js.Dynamic.literal(stopped = stopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStopDataFrameAnalyticsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlStopDataFrameAnalyticsResponse] (val x: Self) extends AnyVal {
    
    inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
  }
}
