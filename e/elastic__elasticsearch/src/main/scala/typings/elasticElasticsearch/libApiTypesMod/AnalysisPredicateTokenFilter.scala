package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.predicate_token_filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisPredicateTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var script: Script
  
  var `type`: predicate_token_filter
}
object AnalysisPredicateTokenFilter {
  
  inline def apply(script: Script): AnalysisPredicateTokenFilter = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("predicate_token_filter")
    __obj.asInstanceOf[AnalysisPredicateTokenFilter]
  }
  
  extension [Self <: AnalysisPredicateTokenFilter](x: Self) {
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setType(value: predicate_token_filter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
