package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTermSuggestOption extends StObject {
  
  var collate_match: js.UndefOr[Boolean] = js.undefined
  
  var freq: long
  
  var highlighted: js.UndefOr[String] = js.undefined
  
  var score: double
  
  var text: String
}
object SearchTermSuggestOption {
  
  inline def apply(freq: long, score: double, text: String): SearchTermSuggestOption = {
    val __obj = js.Dynamic.literal(freq = freq.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTermSuggestOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchTermSuggestOption] (val x: Self) extends AnyVal {
    
    inline def setCollate_match(value: Boolean): Self = StObject.set(x, "collate_match", value.asInstanceOf[js.Any])
    
    inline def setCollate_matchUndefined: Self = StObject.set(x, "collate_match", js.undefined)
    
    inline def setFreq(value: long): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    inline def setHighlighted(value: String): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    inline def setScore(value: double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
