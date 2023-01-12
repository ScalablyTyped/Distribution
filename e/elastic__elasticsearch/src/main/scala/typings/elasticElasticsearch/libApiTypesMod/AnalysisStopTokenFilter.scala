package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisStopTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var ignore_case: js.UndefOr[Boolean] = js.undefined
  
  var remove_trailing: js.UndefOr[Boolean] = js.undefined
  
  var stopwords: js.UndefOr[AnalysisStopWords] = js.undefined
  
  var stopwords_path: js.UndefOr[String] = js.undefined
  
  var `type`: stop
}
object AnalysisStopTokenFilter {
  
  inline def apply(): AnalysisStopTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stop")
    __obj.asInstanceOf[AnalysisStopTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisStopTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setIgnore_case(value: Boolean): Self = StObject.set(x, "ignore_case", value.asInstanceOf[js.Any])
    
    inline def setIgnore_caseUndefined: Self = StObject.set(x, "ignore_case", js.undefined)
    
    inline def setRemove_trailing(value: Boolean): Self = StObject.set(x, "remove_trailing", value.asInstanceOf[js.Any])
    
    inline def setRemove_trailingUndefined: Self = StObject.set(x, "remove_trailing", js.undefined)
    
    inline def setStopwords(value: AnalysisStopWords): Self = StObject.set(x, "stopwords", value.asInstanceOf[js.Any])
    
    inline def setStopwordsUndefined: Self = StObject.set(x, "stopwords", js.undefined)
    
    inline def setStopwordsVarargs(value: String*): Self = StObject.set(x, "stopwords", js.Array(value*))
    
    inline def setStopwords_path(value: String): Self = StObject.set(x, "stopwords_path", value.asInstanceOf[js.Any])
    
    inline def setStopwords_pathUndefined: Self = StObject.set(x, "stopwords_path", js.undefined)
    
    inline def setType(value: stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
