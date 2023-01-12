package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.kuromoji_stemmer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisKuromojiStemmerTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var minimum_length: integer
  
  var `type`: kuromoji_stemmer
}
object AnalysisKuromojiStemmerTokenFilter {
  
  inline def apply(minimum_length: integer): AnalysisKuromojiStemmerTokenFilter = {
    val __obj = js.Dynamic.literal(minimum_length = minimum_length.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_stemmer")
    __obj.asInstanceOf[AnalysisKuromojiStemmerTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisKuromojiStemmerTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setMinimum_length(value: integer): Self = StObject.set(x, "minimum_length", value.asInstanceOf[js.Any])
    
    inline def setType(value: kuromoji_stemmer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
