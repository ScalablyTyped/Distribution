package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlGetJobStats extends Generic {
  
  var allow_no_jobs: js.UndefOr[Boolean] = js.native
  
  var allow_no_match: js.UndefOr[Boolean] = js.native
  
  var job_id: js.UndefOr[String] = js.native
}
object MlGetJobStats {
  
  @scala.inline
  def apply(): MlGetJobStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetJobStats]
  }
  
  @scala.inline
  implicit class MlGetJobStatsMutableBuilder[Self <: MlGetJobStats] (val x: Self) extends AnyVal {
    
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
