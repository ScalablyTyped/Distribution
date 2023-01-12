package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStartDataFrameAnalyticsResponse extends StObject {
  
  var acknowledged: Boolean
  
  var node: NodeId
}
object MlStartDataFrameAnalyticsResponse {
  
  inline def apply(acknowledged: Boolean, node: NodeId): MlStartDataFrameAnalyticsResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStartDataFrameAnalyticsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlStartDataFrameAnalyticsResponse] (val x: Self) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setNode(value: NodeId): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
