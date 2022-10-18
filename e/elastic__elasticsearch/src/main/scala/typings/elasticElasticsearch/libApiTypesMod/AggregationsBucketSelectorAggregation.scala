package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsBucketSelectorAggregation
  extends StObject
     with AggregationsPipelineAggregationBase {
  
  var script: js.UndefOr[Script] = js.undefined
}
object AggregationsBucketSelectorAggregation {
  
  inline def apply(): AggregationsBucketSelectorAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsBucketSelectorAggregation]
  }
  
  extension [Self <: AggregationsBucketSelectorAggregation](x: Self) {
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
