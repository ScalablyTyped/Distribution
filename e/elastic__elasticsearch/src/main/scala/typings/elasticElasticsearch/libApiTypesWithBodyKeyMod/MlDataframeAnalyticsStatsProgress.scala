package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalyticsStatsProgress extends StObject {
  
  var phase: String
  
  var progress_percent: integer
}
object MlDataframeAnalyticsStatsProgress {
  
  inline def apply(phase: String, progress_percent: integer): MlDataframeAnalyticsStatsProgress = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any], progress_percent = progress_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalyticsStatsProgress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeAnalyticsStatsProgress] (val x: Self) extends AnyVal {
    
    inline def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setProgress_percent(value: integer): Self = StObject.set(x, "progress_percent", value.asInstanceOf[js.Any])
  }
}
