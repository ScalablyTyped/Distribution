package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.keyword_marker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisKeywordMarkerTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var ignore_case: js.UndefOr[Boolean] = js.undefined
  
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  var keywords_path: js.UndefOr[String] = js.undefined
  
  var keywords_pattern: js.UndefOr[String] = js.undefined
  
  var `type`: keyword_marker
}
object AnalysisKeywordMarkerTokenFilter {
  
  inline def apply(): AnalysisKeywordMarkerTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyword_marker")
    __obj.asInstanceOf[AnalysisKeywordMarkerTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisKeywordMarkerTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setIgnore_case(value: Boolean): Self = StObject.set(x, "ignore_case", value.asInstanceOf[js.Any])
    
    inline def setIgnore_caseUndefined: Self = StObject.set(x, "ignore_case", js.undefined)
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setKeywords_path(value: String): Self = StObject.set(x, "keywords_path", value.asInstanceOf[js.Any])
    
    inline def setKeywords_pathUndefined: Self = StObject.set(x, "keywords_path", js.undefined)
    
    inline def setKeywords_pattern(value: String): Self = StObject.set(x, "keywords_pattern", value.asInstanceOf[js.Any])
    
    inline def setKeywords_patternUndefined: Self = StObject.set(x, "keywords_pattern", js.undefined)
    
    inline def setType(value: keyword_marker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
