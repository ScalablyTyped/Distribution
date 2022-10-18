package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetRollupIndexCapsIndexCapabilities extends StObject {
  
  var rollup_jobs: js.Array[RollupGetRollupIndexCapsRollupJobSummary]
}
object RollupGetRollupIndexCapsIndexCapabilities {
  
  inline def apply(rollup_jobs: js.Array[RollupGetRollupIndexCapsRollupJobSummary]): RollupGetRollupIndexCapsIndexCapabilities = {
    val __obj = js.Dynamic.literal(rollup_jobs = rollup_jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetRollupIndexCapsIndexCapabilities]
  }
  
  extension [Self <: RollupGetRollupIndexCapsIndexCapabilities](x: Self) {
    
    inline def setRollup_jobs(value: js.Array[RollupGetRollupIndexCapsRollupJobSummary]): Self = StObject.set(x, "rollup_jobs", value.asInstanceOf[js.Any])
    
    inline def setRollup_jobsVarargs(value: RollupGetRollupIndexCapsRollupJobSummary*): Self = StObject.set(x, "rollup_jobs", js.Array(value*))
  }
}
