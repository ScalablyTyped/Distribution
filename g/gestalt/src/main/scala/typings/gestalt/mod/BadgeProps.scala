package typings.gestalt.mod

import typings.gestalt.gestaltStrings.middle
import typings.gestalt.gestaltStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeProps extends StObject {
  
  var position: js.UndefOr[middle | top] = js.undefined
  
  var text: String
}
object BadgeProps {
  
  inline def apply(text: String): BadgeProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
  
  extension [Self <: BadgeProps](x: Self) {
    
    inline def setPosition(value: middle | top): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
