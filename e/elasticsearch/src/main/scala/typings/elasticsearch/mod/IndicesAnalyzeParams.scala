package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAnalyzeParams
  extends StObject
     with GenericParams {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var attributes: js.UndefOr[NameList] = js.undefined
  
  var charFilter: js.UndefOr[NameList] = js.undefined
  
  var explain: js.UndefOr[Boolean] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[NameList] = js.undefined
  
  var format: js.UndefOr[_empty] = js.undefined
  
  var index: js.UndefOr[String] = js.undefined
  
  var perferLocal: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[NameList] = js.undefined
  
  var tokenizer: js.UndefOr[String] = js.undefined
}
object IndicesAnalyzeParams {
  
  inline def apply(): IndicesAnalyzeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesAnalyzeParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesAnalyzeParams] (val x: Self) extends AnyVal {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setAttributes(value: NameList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setCharFilter(value: NameList): Self = StObject.set(x, "charFilter", value.asInstanceOf[js.Any])
    
    inline def setCharFilterUndefined: Self = StObject.set(x, "charFilter", js.undefined)
    
    inline def setCharFilterVarargs(value: String*): Self = StObject.set(x, "charFilter", js.Array(value*))
    
    inline def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFilter(value: NameList): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setFormat(value: _empty): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPerferLocal(value: Boolean): Self = StObject.set(x, "perferLocal", value.asInstanceOf[js.Any])
    
    inline def setPerferLocalUndefined: Self = StObject.set(x, "perferLocal", js.undefined)
    
    inline def setText(value: NameList): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setTokenizer(value: String): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
  }
}
