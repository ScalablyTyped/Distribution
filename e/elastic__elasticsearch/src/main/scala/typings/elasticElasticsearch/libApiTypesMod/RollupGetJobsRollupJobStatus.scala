package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetJobsRollupJobStatus extends StObject {
  
  var current_position: js.UndefOr[Record[String, Any]] = js.undefined
  
  var job_state: RollupGetJobsIndexingJobState
  
  var upgraded_doc_id: js.UndefOr[Boolean] = js.undefined
}
object RollupGetJobsRollupJobStatus {
  
  inline def apply(job_state: RollupGetJobsIndexingJobState): RollupGetJobsRollupJobStatus = {
    val __obj = js.Dynamic.literal(job_state = job_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetJobsRollupJobStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupGetJobsRollupJobStatus] (val x: Self) extends AnyVal {
    
    inline def setCurrent_position(value: Record[String, Any]): Self = StObject.set(x, "current_position", value.asInstanceOf[js.Any])
    
    inline def setCurrent_positionUndefined: Self = StObject.set(x, "current_position", js.undefined)
    
    inline def setJob_state(value: RollupGetJobsIndexingJobState): Self = StObject.set(x, "job_state", value.asInstanceOf[js.Any])
    
    inline def setUpgraded_doc_id(value: Boolean): Self = StObject.set(x, "upgraded_doc_id", value.asInstanceOf[js.Any])
    
    inline def setUpgraded_doc_idUndefined: Self = StObject.set(x, "upgraded_doc_id", js.undefined)
  }
}
