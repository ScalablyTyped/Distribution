package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShutdownPutNodeRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allocation_delay: js.UndefOr[String] = js.undefined
  
  var master_timeout: js.UndefOr[TimeUnit] = js.undefined
  
  var node_id: NodeId
  
  var reason: String
  
  var target_node_name: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[TimeUnit] = js.undefined
  
  var `type`: ShutdownType
}
object ShutdownPutNodeRequest {
  
  inline def apply(node_id: NodeId, reason: String, `type`: ShutdownType): ShutdownPutNodeRequest = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShutdownPutNodeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShutdownPutNodeRequest] (val x: Self) extends AnyVal {
    
    inline def setAllocation_delay(value: String): Self = StObject.set(x, "allocation_delay", value.asInstanceOf[js.Any])
    
    inline def setAllocation_delayUndefined: Self = StObject.set(x, "allocation_delay", js.undefined)
    
    inline def setMaster_timeout(value: TimeUnit): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setNode_id(value: NodeId): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTarget_node_name(value: String): Self = StObject.set(x, "target_node_name", value.asInstanceOf[js.Any])
    
    inline def setTarget_node_nameUndefined: Self = StObject.set(x, "target_node_name", js.undefined)
    
    inline def setTimeout(value: TimeUnit): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: ShutdownType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
