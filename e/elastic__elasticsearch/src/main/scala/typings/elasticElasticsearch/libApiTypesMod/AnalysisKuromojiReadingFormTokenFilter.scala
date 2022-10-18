package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.kuromoji_readingform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisKuromojiReadingFormTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var `type`: kuromoji_readingform
  
  var use_romaji: Boolean
}
object AnalysisKuromojiReadingFormTokenFilter {
  
  inline def apply(use_romaji: Boolean): AnalysisKuromojiReadingFormTokenFilter = {
    val __obj = js.Dynamic.literal(use_romaji = use_romaji.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_readingform")
    __obj.asInstanceOf[AnalysisKuromojiReadingFormTokenFilter]
  }
  
  extension [Self <: AnalysisKuromojiReadingFormTokenFilter](x: Self) {
    
    inline def setType(value: kuromoji_readingform): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUse_romaji(value: Boolean): Self = StObject.set(x, "use_romaji", value.asInstanceOf[js.Any])
  }
}
