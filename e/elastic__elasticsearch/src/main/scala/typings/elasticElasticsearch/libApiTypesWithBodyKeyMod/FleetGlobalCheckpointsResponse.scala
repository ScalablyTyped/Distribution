package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetGlobalCheckpointsResponse extends StObject {
  
  var global_checkpoints: js.Array[FleetCheckpoint]
  
  var timed_out: Boolean
}
object FleetGlobalCheckpointsResponse {
  
  inline def apply(global_checkpoints: js.Array[FleetCheckpoint], timed_out: Boolean): FleetGlobalCheckpointsResponse = {
    val __obj = js.Dynamic.literal(global_checkpoints = global_checkpoints.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetGlobalCheckpointsResponse]
  }
  
  extension [Self <: FleetGlobalCheckpointsResponse](x: Self) {
    
    inline def setGlobal_checkpoints(value: js.Array[FleetCheckpoint]): Self = StObject.set(x, "global_checkpoints", value.asInstanceOf[js.Any])
    
    inline def setGlobal_checkpointsVarargs(value: FleetCheckpoint*): Self = StObject.set(x, "global_checkpoints", js.Array(value*))
    
    inline def setTimed_out(value: Boolean): Self = StObject.set(x, "timed_out", value.asInstanceOf[js.Any])
  }
}
