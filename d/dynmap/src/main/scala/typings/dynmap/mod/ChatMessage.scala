package typings.dynmap.mod

import typings.dynmap.anon.Cyrillic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessage extends StObject {
  
  var options: Cyrillic
  
  var source: String
  
  var text: String
}
object ChatMessage {
  
  inline def apply(options: Cyrillic, source: String, text: String): ChatMessage = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMessage] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Cyrillic): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
