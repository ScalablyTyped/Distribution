package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.kuromoji
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisKuromojiAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var mode: AnalysisKuromojiTokenizationMode
  
  var `type`: kuromoji
  
  var user_dictionary: js.UndefOr[String] = js.undefined
}
object AnalysisKuromojiAnalyzer {
  
  inline def apply(mode: AnalysisKuromojiTokenizationMode): AnalysisKuromojiAnalyzer = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji")
    __obj.asInstanceOf[AnalysisKuromojiAnalyzer]
  }
  
  extension [Self <: AnalysisKuromojiAnalyzer](x: Self) {
    
    inline def setMode(value: AnalysisKuromojiTokenizationMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setType(value: kuromoji): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser_dictionary(value: String): Self = StObject.set(x, "user_dictionary", value.asInstanceOf[js.Any])
    
    inline def setUser_dictionaryUndefined: Self = StObject.set(x, "user_dictionary", js.undefined)
  }
}
