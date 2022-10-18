package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetGlobalCheckpointsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var checkpoints: js.UndefOr[js.Array[FleetCheckpoint]] = js.undefined
  
  var index: IndexName | IndexAlias
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var wait_for_advance: js.UndefOr[Boolean] = js.undefined
  
  var wait_for_index: js.UndefOr[Boolean] = js.undefined
}
object FleetGlobalCheckpointsRequest {
  
  inline def apply(index: IndexName | IndexAlias): FleetGlobalCheckpointsRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetGlobalCheckpointsRequest]
  }
  
  extension [Self <: FleetGlobalCheckpointsRequest](x: Self) {
    
    inline def setCheckpoints(value: js.Array[FleetCheckpoint]): Self = StObject.set(x, "checkpoints", value.asInstanceOf[js.Any])
    
    inline def setCheckpointsUndefined: Self = StObject.set(x, "checkpoints", js.undefined)
    
    inline def setCheckpointsVarargs(value: FleetCheckpoint*): Self = StObject.set(x, "checkpoints", js.Array(value*))
    
    inline def setIndex(value: IndexName | IndexAlias): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_for_advance(value: Boolean): Self = StObject.set(x, "wait_for_advance", value.asInstanceOf[js.Any])
    
    inline def setWait_for_advanceUndefined: Self = StObject.set(x, "wait_for_advance", js.undefined)
    
    inline def setWait_for_index(value: Boolean): Self = StObject.set(x, "wait_for_index", value.asInstanceOf[js.Any])
    
    inline def setWait_for_indexUndefined: Self = StObject.set(x, "wait_for_index", js.undefined)
  }
}
