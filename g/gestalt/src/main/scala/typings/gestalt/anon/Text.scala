package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var href: String
  
  var text: js.Any
}
object Text {
  
  @scala.inline
  def apply(href: String, text: js.Any): Text = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
