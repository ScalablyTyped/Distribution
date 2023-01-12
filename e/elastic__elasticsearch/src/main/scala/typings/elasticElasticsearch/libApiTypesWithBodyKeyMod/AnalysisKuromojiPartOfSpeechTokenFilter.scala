package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.kuromoji_part_of_speech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisKuromojiPartOfSpeechTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var stoptags: js.Array[String]
  
  var `type`: kuromoji_part_of_speech
}
object AnalysisKuromojiPartOfSpeechTokenFilter {
  
  inline def apply(stoptags: js.Array[String]): AnalysisKuromojiPartOfSpeechTokenFilter = {
    val __obj = js.Dynamic.literal(stoptags = stoptags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_part_of_speech")
    __obj.asInstanceOf[AnalysisKuromojiPartOfSpeechTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisKuromojiPartOfSpeechTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setStoptags(value: js.Array[String]): Self = StObject.set(x, "stoptags", value.asInstanceOf[js.Any])
    
    inline def setStoptagsVarargs(value: String*): Self = StObject.set(x, "stoptags", js.Array(value*))
    
    inline def setType(value: kuromoji_part_of_speech): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
