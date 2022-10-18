package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetMemoryStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var node_id: js.UndefOr[Id] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object MlGetMemoryStatsRequest {
  
  inline def apply(): MlGetMemoryStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetMemoryStatsRequest]
  }
  
  extension [Self <: MlGetMemoryStatsRequest](x: Self) {
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setNode_id(value: Id): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
