package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAnalyzeRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  
  var char_filter: js.UndefOr[js.Array[AnalysisCharFilter]] = js.undefined
  
  var explain: js.UndefOr[Boolean] = js.undefined
  
  var field: js.UndefOr[Field] = js.undefined
  
  var filter: js.UndefOr[js.Array[AnalysisTokenFilter]] = js.undefined
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var normalizer: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[IndicesAnalyzeTextToAnalyze] = js.undefined
  
  var tokenizer: js.UndefOr[AnalysisTokenizer] = js.undefined
}
object IndicesAnalyzeRequest {
  
  inline def apply(): IndicesAnalyzeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesAnalyzeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesAnalyzeRequest] (val x: Self) extends AnyVal {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setChar_filter(value: js.Array[AnalysisCharFilter]): Self = StObject.set(x, "char_filter", value.asInstanceOf[js.Any])
    
    inline def setChar_filterUndefined: Self = StObject.set(x, "char_filter", js.undefined)
    
    inline def setChar_filterVarargs(value: AnalysisCharFilter*): Self = StObject.set(x, "char_filter", js.Array(value*))
    
    inline def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFilter(value: js.Array[AnalysisTokenFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: AnalysisTokenFilter*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNormalizer(value: String): Self = StObject.set(x, "normalizer", value.asInstanceOf[js.Any])
    
    inline def setNormalizerUndefined: Self = StObject.set(x, "normalizer", js.undefined)
    
    inline def setText(value: IndicesAnalyzeTextToAnalyze): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setTokenizer(value: AnalysisTokenizer): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
  }
}
