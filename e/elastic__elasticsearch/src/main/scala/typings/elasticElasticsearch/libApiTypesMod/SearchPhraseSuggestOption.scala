package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPhraseSuggestOption extends StObject {
  
  var highlighted: String
  
  var score: double
  
  var text: String
}
object SearchPhraseSuggestOption {
  
  inline def apply(highlighted: String, score: double, text: String): SearchPhraseSuggestOption = {
    val __obj = js.Dynamic.literal(highlighted = highlighted.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPhraseSuggestOption]
  }
  
  extension [Self <: SearchPhraseSuggestOption](x: Self) {
    
    inline def setHighlighted(value: String): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setScore(value: double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
