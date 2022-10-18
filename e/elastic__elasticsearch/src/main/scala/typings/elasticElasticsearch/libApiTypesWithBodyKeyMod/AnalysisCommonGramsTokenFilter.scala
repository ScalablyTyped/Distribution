package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.common_grams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisCommonGramsTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var common_words: js.UndefOr[js.Array[String]] = js.undefined
  
  var common_words_path: js.UndefOr[String] = js.undefined
  
  var ignore_case: js.UndefOr[Boolean] = js.undefined
  
  var query_mode: js.UndefOr[Boolean] = js.undefined
  
  var `type`: common_grams
}
object AnalysisCommonGramsTokenFilter {
  
  inline def apply(): AnalysisCommonGramsTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("common_grams")
    __obj.asInstanceOf[AnalysisCommonGramsTokenFilter]
  }
  
  extension [Self <: AnalysisCommonGramsTokenFilter](x: Self) {
    
    inline def setCommon_words(value: js.Array[String]): Self = StObject.set(x, "common_words", value.asInstanceOf[js.Any])
    
    inline def setCommon_wordsUndefined: Self = StObject.set(x, "common_words", js.undefined)
    
    inline def setCommon_wordsVarargs(value: String*): Self = StObject.set(x, "common_words", js.Array(value*))
    
    inline def setCommon_words_path(value: String): Self = StObject.set(x, "common_words_path", value.asInstanceOf[js.Any])
    
    inline def setCommon_words_pathUndefined: Self = StObject.set(x, "common_words_path", js.undefined)
    
    inline def setIgnore_case(value: Boolean): Self = StObject.set(x, "ignore_case", value.asInstanceOf[js.Any])
    
    inline def setIgnore_caseUndefined: Self = StObject.set(x, "ignore_case", js.undefined)
    
    inline def setQuery_mode(value: Boolean): Self = StObject.set(x, "query_mode", value.asInstanceOf[js.Any])
    
    inline def setQuery_modeUndefined: Self = StObject.set(x, "query_mode", js.undefined)
    
    inline def setType(value: common_grams): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
