package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTimingStats extends StObject {
  
  var elapsed_time: DurationValue[UnitMillis]
  
  var iteration_time: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
}
object MlTimingStats {
  
  inline def apply(elapsed_time: DurationValue[UnitMillis]): MlTimingStats = {
    val __obj = js.Dynamic.literal(elapsed_time = elapsed_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTimingStats]
  }
  
  extension [Self <: MlTimingStats](x: Self) {
    
    inline def setElapsed_time(value: DurationValue[UnitMillis]): Self = StObject.set(x, "elapsed_time", value.asInstanceOf[js.Any])
    
    inline def setIteration_time(value: DurationValue[UnitMillis]): Self = StObject.set(x, "iteration_time", value.asInstanceOf[js.Any])
    
    inline def setIteration_timeUndefined: Self = StObject.set(x, "iteration_time", js.undefined)
  }
}
