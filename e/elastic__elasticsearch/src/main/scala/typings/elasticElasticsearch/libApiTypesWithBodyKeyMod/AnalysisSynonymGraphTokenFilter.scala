package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.synonym_graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSynonymGraphTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var expand: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[AnalysisSynonymFormat] = js.undefined
  
  var lenient: js.UndefOr[Boolean] = js.undefined
  
  var synonyms: js.UndefOr[js.Array[String]] = js.undefined
  
  var synonyms_path: js.UndefOr[String] = js.undefined
  
  var tokenizer: js.UndefOr[String] = js.undefined
  
  var `type`: synonym_graph
  
  var updateable: js.UndefOr[Boolean] = js.undefined
}
object AnalysisSynonymGraphTokenFilter {
  
  inline def apply(): AnalysisSynonymGraphTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("synonym_graph")
    __obj.asInstanceOf[AnalysisSynonymGraphTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisSynonymGraphTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFormat(value: AnalysisSynonymFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    inline def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    inline def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    inline def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value*))
    
    inline def setSynonyms_path(value: String): Self = StObject.set(x, "synonyms_path", value.asInstanceOf[js.Any])
    
    inline def setSynonyms_pathUndefined: Self = StObject.set(x, "synonyms_path", js.undefined)
    
    inline def setTokenizer(value: String): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
    
    inline def setType(value: synonym_graph): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateable(value: Boolean): Self = StObject.set(x, "updateable", value.asInstanceOf[js.Any])
    
    inline def setUpdateableUndefined: Self = StObject.set(x, "updateable", js.undefined)
  }
}
