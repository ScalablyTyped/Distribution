package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteModelSnapshot
  extends StObject
     with Generic {
  
  var job_id: String
  
  var snapshot_id: String
}
object MlDeleteModelSnapshot {
  
  inline def apply(job_id: String, snapshot_id: String): MlDeleteModelSnapshot = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteModelSnapshot]
  }
  
  extension [Self <: MlDeleteModelSnapshot](x: Self) {
    
    inline def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_id(value: String): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
  }
}
