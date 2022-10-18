package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsIndexingPressure extends StObject {
  
  var memory: ClusterStatsIndexingPressureMemory
}
object ClusterStatsIndexingPressure {
  
  inline def apply(memory: ClusterStatsIndexingPressureMemory): ClusterStatsIndexingPressure = {
    val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsIndexingPressure]
  }
  
  extension [Self <: ClusterStatsIndexingPressure](x: Self) {
    
    inline def setMemory(value: ClusterStatsIndexingPressureMemory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
  }
}
