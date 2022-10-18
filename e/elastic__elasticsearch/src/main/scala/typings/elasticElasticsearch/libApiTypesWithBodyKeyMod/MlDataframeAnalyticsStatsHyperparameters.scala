package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalyticsStatsHyperparameters extends StObject {
  
  var hyperparameters: MlHyperparameters
  
  var iteration: integer
  
  var timestamp: EpochTime[UnitMillis]
  
  var timing_stats: MlTimingStats
  
  var validation_loss: MlValidationLoss
}
object MlDataframeAnalyticsStatsHyperparameters {
  
  inline def apply(
    hyperparameters: MlHyperparameters,
    iteration: integer,
    timestamp: EpochTime[UnitMillis],
    timing_stats: MlTimingStats,
    validation_loss: MlValidationLoss
  ): MlDataframeAnalyticsStatsHyperparameters = {
    val __obj = js.Dynamic.literal(hyperparameters = hyperparameters.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timing_stats = timing_stats.asInstanceOf[js.Any], validation_loss = validation_loss.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalyticsStatsHyperparameters]
  }
  
  extension [Self <: MlDataframeAnalyticsStatsHyperparameters](x: Self) {
    
    inline def setHyperparameters(value: MlHyperparameters): Self = StObject.set(x, "hyperparameters", value.asInstanceOf[js.Any])
    
    inline def setIteration(value: integer): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: EpochTime[UnitMillis]): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTiming_stats(value: MlTimingStats): Self = StObject.set(x, "timing_stats", value.asInstanceOf[js.Any])
    
    inline def setValidation_loss(value: MlValidationLoss): Self = StObject.set(x, "validation_loss", value.asInstanceOf[js.Any])
  }
}
