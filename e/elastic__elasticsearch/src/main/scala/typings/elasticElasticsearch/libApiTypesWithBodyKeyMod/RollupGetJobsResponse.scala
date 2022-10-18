package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetJobsResponse extends StObject {
  
  var jobs: js.Array[RollupGetJobsRollupJob]
}
object RollupGetJobsResponse {
  
  inline def apply(jobs: js.Array[RollupGetJobsRollupJob]): RollupGetJobsResponse = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetJobsResponse]
  }
  
  extension [Self <: RollupGetJobsResponse](x: Self) {
    
    inline def setJobs(value: js.Array[RollupGetJobsRollupJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: RollupGetJobsRollupJob*): Self = StObject.set(x, "jobs", js.Array(value*))
  }
}
