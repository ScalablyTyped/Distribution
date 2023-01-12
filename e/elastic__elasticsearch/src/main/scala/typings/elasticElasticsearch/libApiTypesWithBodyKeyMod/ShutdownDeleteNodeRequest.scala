package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShutdownDeleteNodeRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var master_timeout: js.UndefOr[TimeUnit] = js.undefined
  
  var node_id: NodeId
  
  var timeout: js.UndefOr[TimeUnit] = js.undefined
}
object ShutdownDeleteNodeRequest {
  
  inline def apply(node_id: NodeId): ShutdownDeleteNodeRequest = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShutdownDeleteNodeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShutdownDeleteNodeRequest] (val x: Self) extends AnyVal {
    
    inline def setMaster_timeout(value: TimeUnit): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setNode_id(value: NodeId): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: TimeUnit): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
