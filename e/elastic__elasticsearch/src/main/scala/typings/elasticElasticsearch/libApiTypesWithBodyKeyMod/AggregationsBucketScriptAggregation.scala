package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsBucketScriptAggregation
  extends StObject
     with AggregationsPipelineAggregationBase {
  
  var script: js.UndefOr[Script] = js.undefined
}
object AggregationsBucketScriptAggregation {
  
  inline def apply(): AggregationsBucketScriptAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsBucketScriptAggregation]
  }
  
  extension [Self <: AggregationsBucketScriptAggregation](x: Self) {
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
