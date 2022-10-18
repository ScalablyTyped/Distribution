package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsScriptedHeuristic extends StObject {
  
  var script: Script
}
object AggregationsScriptedHeuristic {
  
  inline def apply(script: Script): AggregationsScriptedHeuristic = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsScriptedHeuristic]
  }
  
  extension [Self <: AggregationsScriptedHeuristic](x: Self) {
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
