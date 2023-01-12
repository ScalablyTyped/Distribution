package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsCustomCategorizeTextAnalyzer extends StObject {
  
  var char_filter: js.UndefOr[js.Array[String]] = js.undefined
  
  var filter: js.UndefOr[js.Array[String]] = js.undefined
  
  var tokenizer: js.UndefOr[String] = js.undefined
}
object AggregationsCustomCategorizeTextAnalyzer {
  
  inline def apply(): AggregationsCustomCategorizeTextAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsCustomCategorizeTextAnalyzer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsCustomCategorizeTextAnalyzer] (val x: Self) extends AnyVal {
    
    inline def setChar_filter(value: js.Array[String]): Self = StObject.set(x, "char_filter", value.asInstanceOf[js.Any])
    
    inline def setChar_filterUndefined: Self = StObject.set(x, "char_filter", js.undefined)
    
    inline def setChar_filterVarargs(value: String*): Self = StObject.set(x, "char_filter", js.Array(value*))
    
    inline def setFilter(value: js.Array[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setTokenizer(value: String): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
  }
}
