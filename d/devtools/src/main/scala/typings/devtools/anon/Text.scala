package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var elementId: String
  
  var text: String
}
object Text {
  
  @scala.inline
  def apply(elementId: String, text: String): Text = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
