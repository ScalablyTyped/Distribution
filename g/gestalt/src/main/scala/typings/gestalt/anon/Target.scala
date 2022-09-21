package typings.gestalt.anon

import typings.gestalt.gestaltStrings.blank
import typings.gestalt.gestaltStrings.self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var accessibilityLabel: String
  
  var href: String
  
  def onClick(args: `1`): Unit
  
  var target: js.UndefOr[Null | self | blank] = js.undefined
  
  var text: String
}
object Target {
  
  inline def apply(accessibilityLabel: String, href: String, onClick: `1` => Unit, text: String): Target = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: `1` => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setTarget(value: self | blank): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
