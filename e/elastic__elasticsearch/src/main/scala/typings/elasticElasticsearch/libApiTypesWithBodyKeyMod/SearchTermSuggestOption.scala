package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTermSuggestOption extends StObject {
  
  var freq: long
  
  var score: double
  
  var text: String
}
object SearchTermSuggestOption {
  
  inline def apply(freq: long, score: double, text: String): SearchTermSuggestOption = {
    val __obj = js.Dynamic.literal(freq = freq.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTermSuggestOption]
  }
  
  extension [Self <: SearchTermSuggestOption](x: Self) {
    
    inline def setFreq(value: long): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    inline def setScore(value: double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
