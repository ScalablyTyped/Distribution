package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexSettingsAnalysis extends StObject {
  
  var analyzer: js.UndefOr[Record[String, AnalysisAnalyzer]] = js.undefined
  
  var char_filter: js.UndefOr[Record[String, AnalysisCharFilter]] = js.undefined
  
  var filter: js.UndefOr[Record[String, AnalysisTokenFilter]] = js.undefined
  
  var normalizer: js.UndefOr[Record[String, AnalysisNormalizer]] = js.undefined
  
  var tokenizer: js.UndefOr[Record[String, AnalysisTokenizer]] = js.undefined
}
object IndicesIndexSettingsAnalysis {
  
  inline def apply(): IndicesIndexSettingsAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexSettingsAnalysis]
  }
  
  extension [Self <: IndicesIndexSettingsAnalysis](x: Self) {
    
    inline def setAnalyzer(value: Record[String, AnalysisAnalyzer]): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setChar_filter(value: Record[String, AnalysisCharFilter]): Self = StObject.set(x, "char_filter", value.asInstanceOf[js.Any])
    
    inline def setChar_filterUndefined: Self = StObject.set(x, "char_filter", js.undefined)
    
    inline def setFilter(value: Record[String, AnalysisTokenFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setNormalizer(value: Record[String, AnalysisNormalizer]): Self = StObject.set(x, "normalizer", value.asInstanceOf[js.Any])
    
    inline def setNormalizerUndefined: Self = StObject.set(x, "normalizer", js.undefined)
    
    inline def setTokenizer(value: Record[String, AnalysisTokenizer]): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
  }
}
