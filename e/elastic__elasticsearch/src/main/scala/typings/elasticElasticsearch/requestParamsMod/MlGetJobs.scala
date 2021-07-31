package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetJobs
  extends StObject
     with Generic {
  
  var allow_no_jobs: js.UndefOr[Boolean] = js.undefined
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var job_id: js.UndefOr[String] = js.undefined
}
object MlGetJobs {
  
  @scala.inline
  def apply(): MlGetJobs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetJobs]
  }
  
  @scala.inline
  implicit class MlGetJobsMutableBuilder[Self <: MlGetJobs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_no_jobs(value: Boolean): Self = StObject.set(x, "allow_no_jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_jobsUndefined: Self = StObject.set(x, "allow_no_jobs", js.undefined)
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
  }
}
