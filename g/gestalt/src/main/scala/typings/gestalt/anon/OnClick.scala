package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  var href: String
  
  def onClick(args: `1`): Unit
  
  var text: String
}
object OnClick {
  
  inline def apply(href: String, onClick: `1` => Unit, text: String): OnClick = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClick]
  }
  
  extension [Self <: OnClick](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: `1` => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
