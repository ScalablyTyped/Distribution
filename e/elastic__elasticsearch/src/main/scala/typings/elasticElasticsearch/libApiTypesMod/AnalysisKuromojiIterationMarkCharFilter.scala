package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.kuromoji_iteration_mark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisKuromojiIterationMarkCharFilter
  extends StObject
     with AnalysisCharFilterBase
     with AnalysisCharFilterDefinition {
  
  var normalize_kana: Boolean
  
  var normalize_kanji: Boolean
  
  var `type`: kuromoji_iteration_mark
}
object AnalysisKuromojiIterationMarkCharFilter {
  
  inline def apply(normalize_kana: Boolean, normalize_kanji: Boolean): AnalysisKuromojiIterationMarkCharFilter = {
    val __obj = js.Dynamic.literal(normalize_kana = normalize_kana.asInstanceOf[js.Any], normalize_kanji = normalize_kanji.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_iteration_mark")
    __obj.asInstanceOf[AnalysisKuromojiIterationMarkCharFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisKuromojiIterationMarkCharFilter] (val x: Self) extends AnyVal {
    
    inline def setNormalize_kana(value: Boolean): Self = StObject.set(x, "normalize_kana", value.asInstanceOf[js.Any])
    
    inline def setNormalize_kanji(value: Boolean): Self = StObject.set(x, "normalize_kanji", value.asInstanceOf[js.Any])
    
    inline def setType(value: kuromoji_iteration_mark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
