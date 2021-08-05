package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlOpenJob
  extends StObject
     with Generic {
  
  var job_id: String
}
object MlOpenJob {
  
  inline def apply(job_id: String): MlOpenJob = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlOpenJob]
  }
  
  extension [Self <: MlOpenJob](x: Self) {
    
    inline def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
  }
}
