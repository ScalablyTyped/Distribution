package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlResetJobRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var job_id: Id
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object MlResetJobRequest {
  
  inline def apply(job_id: Id): MlResetJobRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlResetJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlResetJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
