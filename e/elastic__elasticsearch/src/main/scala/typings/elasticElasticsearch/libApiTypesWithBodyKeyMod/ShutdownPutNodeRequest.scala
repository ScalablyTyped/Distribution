package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Allocationdelay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShutdownPutNodeRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Allocationdelay] = js.undefined
  
  var master_timeout: js.UndefOr[TimeUnit] = js.undefined
  
  var node_id: NodeId
  
  var timeout: js.UndefOr[TimeUnit] = js.undefined
}
object ShutdownPutNodeRequest {
  
  inline def apply(node_id: NodeId): ShutdownPutNodeRequest = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShutdownPutNodeRequest]
  }
  
  extension [Self <: ShutdownPutNodeRequest](x: Self) {
    
    inline def setBody(value: Allocationdelay): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMaster_timeout(value: TimeUnit): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setNode_id(value: NodeId): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: TimeUnit): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
