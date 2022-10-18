package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisLimitTokenCountTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var consume_all_tokens: js.UndefOr[Boolean] = js.undefined
  
  var max_token_count: js.UndefOr[integer] = js.undefined
  
  var `type`: limit
}
object AnalysisLimitTokenCountTokenFilter {
  
  inline def apply(): AnalysisLimitTokenCountTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("limit")
    __obj.asInstanceOf[AnalysisLimitTokenCountTokenFilter]
  }
  
  extension [Self <: AnalysisLimitTokenCountTokenFilter](x: Self) {
    
    inline def setConsume_all_tokens(value: Boolean): Self = StObject.set(x, "consume_all_tokens", value.asInstanceOf[js.Any])
    
    inline def setConsume_all_tokensUndefined: Self = StObject.set(x, "consume_all_tokens", js.undefined)
    
    inline def setMax_token_count(value: integer): Self = StObject.set(x, "max_token_count", value.asInstanceOf[js.Any])
    
    inline def setMax_token_countUndefined: Self = StObject.set(x, "max_token_count", js.undefined)
    
    inline def setType(value: limit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
