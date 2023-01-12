package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.nori_part_of_speech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisNoriPartOfSpeechTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var stoptags: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: nori_part_of_speech
}
object AnalysisNoriPartOfSpeechTokenFilter {
  
  inline def apply(): AnalysisNoriPartOfSpeechTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nori_part_of_speech")
    __obj.asInstanceOf[AnalysisNoriPartOfSpeechTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisNoriPartOfSpeechTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setStoptags(value: js.Array[String]): Self = StObject.set(x, "stoptags", value.asInstanceOf[js.Any])
    
    inline def setStoptagsUndefined: Self = StObject.set(x, "stoptags", js.undefined)
    
    inline def setStoptagsVarargs(value: String*): Self = StObject.set(x, "stoptags", js.Array(value*))
    
    inline def setType(value: nori_part_of_speech): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
