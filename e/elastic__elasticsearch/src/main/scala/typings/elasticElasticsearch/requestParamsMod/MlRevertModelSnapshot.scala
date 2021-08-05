package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlRevertModelSnapshot[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
  
  var delete_intervening_results: js.UndefOr[Boolean] = js.undefined
  
  var job_id: String
  
  var snapshot_id: String
}
object MlRevertModelSnapshot {
  
  inline def apply[T](job_id: String, snapshot_id: String): MlRevertModelSnapshot[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlRevertModelSnapshot[T]]
  }
  
  extension [Self <: MlRevertModelSnapshot[?], T](x: Self & MlRevertModelSnapshot[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDelete_intervening_results(value: Boolean): Self = StObject.set(x, "delete_intervening_results", value.asInstanceOf[js.Any])
    
    inline def setDelete_intervening_resultsUndefined: Self = StObject.set(x, "delete_intervening_results", js.undefined)
    
    inline def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_id(value: String): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
  }
}
