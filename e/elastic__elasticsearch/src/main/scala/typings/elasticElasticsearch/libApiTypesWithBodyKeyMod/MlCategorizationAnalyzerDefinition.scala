package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlCategorizationAnalyzerDefinition extends StObject {
  
  var char_filter: js.UndefOr[js.Array[AnalysisCharFilter]] = js.undefined
  
  var filter: js.UndefOr[js.Array[AnalysisTokenFilter]] = js.undefined
  
  var tokenizer: js.UndefOr[AnalysisTokenizer] = js.undefined
}
object MlCategorizationAnalyzerDefinition {
  
  inline def apply(): MlCategorizationAnalyzerDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlCategorizationAnalyzerDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlCategorizationAnalyzerDefinition] (val x: Self) extends AnyVal {
    
    inline def setChar_filter(value: js.Array[AnalysisCharFilter]): Self = StObject.set(x, "char_filter", value.asInstanceOf[js.Any])
    
    inline def setChar_filterUndefined: Self = StObject.set(x, "char_filter", js.undefined)
    
    inline def setChar_filterVarargs(value: AnalysisCharFilter*): Self = StObject.set(x, "char_filter", js.Array(value*))
    
    inline def setFilter(value: js.Array[AnalysisTokenFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: AnalysisTokenFilter*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setTokenizer(value: AnalysisTokenizer): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
  }
}
