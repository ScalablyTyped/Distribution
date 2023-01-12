package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.keep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisKeepWordsTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var keep_words: js.UndefOr[js.Array[String]] = js.undefined
  
  var keep_words_case: js.UndefOr[Boolean] = js.undefined
  
  var keep_words_path: js.UndefOr[String] = js.undefined
  
  var `type`: keep
}
object AnalysisKeepWordsTokenFilter {
  
  inline def apply(): AnalysisKeepWordsTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keep")
    __obj.asInstanceOf[AnalysisKeepWordsTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisKeepWordsTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setKeep_words(value: js.Array[String]): Self = StObject.set(x, "keep_words", value.asInstanceOf[js.Any])
    
    inline def setKeep_wordsUndefined: Self = StObject.set(x, "keep_words", js.undefined)
    
    inline def setKeep_wordsVarargs(value: String*): Self = StObject.set(x, "keep_words", js.Array(value*))
    
    inline def setKeep_words_case(value: Boolean): Self = StObject.set(x, "keep_words_case", value.asInstanceOf[js.Any])
    
    inline def setKeep_words_caseUndefined: Self = StObject.set(x, "keep_words_case", js.undefined)
    
    inline def setKeep_words_path(value: String): Self = StObject.set(x, "keep_words_path", value.asInstanceOf[js.Any])
    
    inline def setKeep_words_pathUndefined: Self = StObject.set(x, "keep_words_path", js.undefined)
    
    inline def setType(value: keep): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
