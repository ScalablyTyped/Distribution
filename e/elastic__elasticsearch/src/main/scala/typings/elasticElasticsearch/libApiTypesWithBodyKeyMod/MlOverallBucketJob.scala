package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlOverallBucketJob extends StObject {
  
  var job_id: Id
  
  var max_anomaly_score: double
}
object MlOverallBucketJob {
  
  inline def apply(job_id: Id, max_anomaly_score: double): MlOverallBucketJob = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], max_anomaly_score = max_anomaly_score.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlOverallBucketJob]
  }
  
  extension [Self <: MlOverallBucketJob](x: Self) {
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setMax_anomaly_score(value: double): Self = StObject.set(x, "max_anomaly_score", value.asInstanceOf[js.Any])
  }
}
