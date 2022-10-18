package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.edge_ngram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisEdgeNGramTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var max_gram: js.UndefOr[integer] = js.undefined
  
  var min_gram: js.UndefOr[integer] = js.undefined
  
  var preserve_original: js.UndefOr[Boolean] = js.undefined
  
  var side: js.UndefOr[AnalysisEdgeNGramSide] = js.undefined
  
  var `type`: edge_ngram
}
object AnalysisEdgeNGramTokenFilter {
  
  inline def apply(): AnalysisEdgeNGramTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("edge_ngram")
    __obj.asInstanceOf[AnalysisEdgeNGramTokenFilter]
  }
  
  extension [Self <: AnalysisEdgeNGramTokenFilter](x: Self) {
    
    inline def setMax_gram(value: integer): Self = StObject.set(x, "max_gram", value.asInstanceOf[js.Any])
    
    inline def setMax_gramUndefined: Self = StObject.set(x, "max_gram", js.undefined)
    
    inline def setMin_gram(value: integer): Self = StObject.set(x, "min_gram", value.asInstanceOf[js.Any])
    
    inline def setMin_gramUndefined: Self = StObject.set(x, "min_gram", js.undefined)
    
    inline def setPreserve_original(value: Boolean): Self = StObject.set(x, "preserve_original", value.asInstanceOf[js.Any])
    
    inline def setPreserve_originalUndefined: Self = StObject.set(x, "preserve_original", js.undefined)
    
    inline def setSide(value: AnalysisEdgeNGramSide): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setType(value: edge_ngram): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
