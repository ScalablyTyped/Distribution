package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlCloseJob[T]
  extends StObject
     with Generic {
  
  var allow_no_jobs: js.UndefOr[Boolean] = js.undefined
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var body: js.UndefOr[T] = js.undefined
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var job_id: String
  
  var timeout: js.UndefOr[String] = js.undefined
}
object MlCloseJob {
  
  @scala.inline
  def apply[T](job_id: String): MlCloseJob[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlCloseJob[T]]
  }
  
  @scala.inline
  implicit class MlCloseJobMutableBuilder[Self <: MlCloseJob[?], T] (val x: Self & MlCloseJob[T]) extends AnyVal {
    
    @scala.inline
    def setAllow_no_jobs(value: Boolean): Self = StObject.set(x, "allow_no_jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_jobsUndefined: Self = StObject.set(x, "allow_no_jobs", js.undefined)
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
