package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsPipelineAggregationBase
  extends StObject
     with AggregationsBucketPathAggregation {
  
  var format: js.UndefOr[String] = js.undefined
  
  var gap_policy: js.UndefOr[AggregationsGapPolicy] = js.undefined
}
object AggregationsPipelineAggregationBase {
  
  inline def apply(): AggregationsPipelineAggregationBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsPipelineAggregationBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsPipelineAggregationBase] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGap_policy(value: AggregationsGapPolicy): Self = StObject.set(x, "gap_policy", value.asInstanceOf[js.Any])
    
    inline def setGap_policyUndefined: Self = StObject.set(x, "gap_policy", js.undefined)
  }
}
