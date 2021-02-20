package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesAnalyzeParams extends GenericParams {
  
  var analyzer: js.UndefOr[String] = js.native
  
  var attributes: js.UndefOr[NameList] = js.native
  
  var charFilter: js.UndefOr[NameList] = js.native
  
  var explain: js.UndefOr[Boolean] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[NameList] = js.native
  
  var format: js.UndefOr[_empty] = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var perferLocal: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[NameList] = js.native
  
  var tokenizer: js.UndefOr[String] = js.native
}
object IndicesAnalyzeParams {
  
  @scala.inline
  def apply(): IndicesAnalyzeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesAnalyzeParams]
  }
  
  @scala.inline
  implicit class IndicesAnalyzeParamsMutableBuilder[Self <: IndicesAnalyzeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    @scala.inline
    def setAttributes(value: NameList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setCharFilter(value: NameList): Self = StObject.set(x, "charFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharFilterUndefined: Self = StObject.set(x, "charFilter", js.undefined)
    
    @scala.inline
    def setCharFilterVarargs(value: String*): Self = StObject.set(x, "charFilter", js.Array(value :_*))
    
    @scala.inline
    def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFilter(value: NameList): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: _empty): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setPerferLocal(value: Boolean): Self = StObject.set(x, "perferLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerferLocalUndefined: Self = StObject.set(x, "perferLocal", js.undefined)
    
    @scala.inline
    def setText(value: NameList): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    
    @scala.inline
    def setTokenizer(value: String): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
  }
}
