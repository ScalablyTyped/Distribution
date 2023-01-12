package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetJobsResponse extends StObject {
  
  var count: long
  
  var jobs: js.Array[MlJob]
}
object MlGetJobsResponse {
  
  inline def apply(count: long, jobs: js.Array[MlJob]): MlGetJobsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setJobs(value: js.Array[MlJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: MlJob*): Self = StObject.set(x, "jobs", js.Array(value*))
  }
}
