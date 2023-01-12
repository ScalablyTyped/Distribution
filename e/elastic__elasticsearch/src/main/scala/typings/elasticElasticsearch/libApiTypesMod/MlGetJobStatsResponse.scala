package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetJobStatsResponse extends StObject {
  
  var count: long
  
  var jobs: js.Array[MlJobStats]
}
object MlGetJobStatsResponse {
  
  inline def apply(count: long, jobs: js.Array[MlJobStats]): MlGetJobStatsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetJobStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetJobStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setJobs(value: js.Array[MlJobStats]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: MlJobStats*): Self = StObject.set(x, "jobs", js.Array(value*))
  }
}
