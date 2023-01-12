package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetRollupCapsRollupCapabilities extends StObject {
  
  var rollup_jobs: js.Array[RollupGetRollupCapsRollupCapabilitySummary]
}
object RollupGetRollupCapsRollupCapabilities {
  
  inline def apply(rollup_jobs: js.Array[RollupGetRollupCapsRollupCapabilitySummary]): RollupGetRollupCapsRollupCapabilities = {
    val __obj = js.Dynamic.literal(rollup_jobs = rollup_jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetRollupCapsRollupCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupGetRollupCapsRollupCapabilities] (val x: Self) extends AnyVal {
    
    inline def setRollup_jobs(value: js.Array[RollupGetRollupCapsRollupCapabilitySummary]): Self = StObject.set(x, "rollup_jobs", value.asInstanceOf[js.Any])
    
    inline def setRollup_jobsVarargs(value: RollupGetRollupCapsRollupCapabilitySummary*): Self = StObject.set(x, "rollup_jobs", js.Array(value*))
  }
}
