package typings.gestalt.mod

import typings.gestalt.gestaltStrings.darkWash
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.info
import typings.gestalt.gestaltStrings.lightWash
import typings.gestalt.gestaltStrings.middle
import typings.gestalt.gestaltStrings.neutral
import typings.gestalt.gestaltStrings.success
import typings.gestalt.gestaltStrings.top
import typings.gestalt.gestaltStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeProps extends StObject {
  
  var position: js.UndefOr[middle | top] = js.undefined
  
  var text: String
  
  var `type`: js.UndefOr[info | error | warning | success | neutral | darkWash | lightWash] = js.undefined
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
    
    inline def setType(value: info | error | warning | success | neutral | darkWash | lightWash): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
