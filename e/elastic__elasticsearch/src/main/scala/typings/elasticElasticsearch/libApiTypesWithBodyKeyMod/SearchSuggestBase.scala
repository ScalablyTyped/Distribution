package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSuggestBase extends StObject {
  
  var length: integer
  
  var offset: integer
  
  var text: String
}
object SearchSuggestBase {
  
  inline def apply(length: integer, offset: integer, text: String): SearchSuggestBase = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestBase]
  }
  
  extension [Self <: SearchSuggestBase](x: Self) {
    
    inline def setLength(value: integer): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
