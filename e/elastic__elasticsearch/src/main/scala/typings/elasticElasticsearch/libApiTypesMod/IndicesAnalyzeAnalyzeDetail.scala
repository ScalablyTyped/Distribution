package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAnalyzeAnalyzeDetail extends StObject {
  
  var analyzer: js.UndefOr[IndicesAnalyzeAnalyzerDetail] = js.undefined
  
  var charfilters: js.UndefOr[js.Array[IndicesAnalyzeCharFilterDetail]] = js.undefined
  
  var custom_analyzer: Boolean
  
  var tokenfilters: js.UndefOr[js.Array[IndicesAnalyzeTokenDetail]] = js.undefined
  
  var tokenizer: js.UndefOr[IndicesAnalyzeTokenDetail] = js.undefined
}
object IndicesAnalyzeAnalyzeDetail {
  
  inline def apply(custom_analyzer: Boolean): IndicesAnalyzeAnalyzeDetail = {
    val __obj = js.Dynamic.literal(custom_analyzer = custom_analyzer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesAnalyzeAnalyzeDetail]
  }
  
  extension [Self <: IndicesAnalyzeAnalyzeDetail](x: Self) {
    
    inline def setAnalyzer(value: IndicesAnalyzeAnalyzerDetail): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setCharfilters(value: js.Array[IndicesAnalyzeCharFilterDetail]): Self = StObject.set(x, "charfilters", value.asInstanceOf[js.Any])
    
    inline def setCharfiltersUndefined: Self = StObject.set(x, "charfilters", js.undefined)
    
    inline def setCharfiltersVarargs(value: IndicesAnalyzeCharFilterDetail*): Self = StObject.set(x, "charfilters", js.Array(value*))
    
    inline def setCustom_analyzer(value: Boolean): Self = StObject.set(x, "custom_analyzer", value.asInstanceOf[js.Any])
    
    inline def setTokenfilters(value: js.Array[IndicesAnalyzeTokenDetail]): Self = StObject.set(x, "tokenfilters", value.asInstanceOf[js.Any])
    
    inline def setTokenfiltersUndefined: Self = StObject.set(x, "tokenfilters", js.undefined)
    
    inline def setTokenfiltersVarargs(value: IndicesAnalyzeTokenDetail*): Self = StObject.set(x, "tokenfilters", js.Array(value*))
    
    inline def setTokenizer(value: IndicesAnalyzeTokenDetail): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
  }
}
