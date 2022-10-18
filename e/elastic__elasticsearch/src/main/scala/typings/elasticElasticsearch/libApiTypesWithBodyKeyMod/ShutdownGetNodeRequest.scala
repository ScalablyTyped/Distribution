package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShutdownGetNodeRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var master_timeout: js.UndefOr[TimeUnit] = js.undefined
  
  var node_id: js.UndefOr[NodeIds] = js.undefined
  
  var timeout: js.UndefOr[TimeUnit] = js.undefined
}
object ShutdownGetNodeRequest {
  
  inline def apply(): ShutdownGetNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShutdownGetNodeRequest]
  }
  
  extension [Self <: ShutdownGetNodeRequest](x: Self) {
    
    inline def setMaster_timeout(value: TimeUnit): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setNode_id(value: NodeIds): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNode_idVarargs(value: NodeId*): Self = StObject.set(x, "node_id", js.Array(value*))
    
    inline def setTimeout(value: TimeUnit): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
