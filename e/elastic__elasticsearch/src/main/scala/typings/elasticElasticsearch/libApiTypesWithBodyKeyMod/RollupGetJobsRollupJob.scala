package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetJobsRollupJob extends StObject {
  
  var config: RollupGetJobsRollupJobConfiguration
  
  var stats: RollupGetJobsRollupJobStats
  
  var status: RollupGetJobsRollupJobStatus
}
object RollupGetJobsRollupJob {
  
  inline def apply(
    config: RollupGetJobsRollupJobConfiguration,
    stats: RollupGetJobsRollupJobStats,
    status: RollupGetJobsRollupJobStatus
  ): RollupGetJobsRollupJob = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetJobsRollupJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupGetJobsRollupJob] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: RollupGetJobsRollupJobConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setStats(value: RollupGetJobsRollupJobStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RollupGetJobsRollupJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
