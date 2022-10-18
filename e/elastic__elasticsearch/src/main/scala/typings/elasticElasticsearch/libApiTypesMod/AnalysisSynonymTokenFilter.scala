package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.synonym
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSynonymTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var expand: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[AnalysisSynonymFormat] = js.undefined
  
  var lenient: js.UndefOr[Boolean] = js.undefined
  
  var synonyms: js.UndefOr[js.Array[String]] = js.undefined
  
  var synonyms_path: js.UndefOr[String] = js.undefined
  
  var tokenizer: js.UndefOr[String] = js.undefined
  
  var `type`: synonym
  
  var updateable: js.UndefOr[Boolean] = js.undefined
}
object AnalysisSynonymTokenFilter {
  
  inline def apply(): AnalysisSynonymTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("synonym")
    __obj.asInstanceOf[AnalysisSynonymTokenFilter]
  }
  
  extension [Self <: AnalysisSynonymTokenFilter](x: Self) {
    
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
    
    inline def setType(value: synonym): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateable(value: Boolean): Self = StObject.set(x, "updateable", value.asInstanceOf[js.Any])
    
    inline def setUpdateableUndefined: Self = StObject.set(x, "updateable", js.undefined)
  }
}
