package typings.gestalt.mod

import typings.gestalt.gestaltStrings.darkWash
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.info
import typings.gestalt.gestaltStrings.lightWash
import typings.gestalt.gestaltStrings.neutral
import typings.gestalt.gestaltStrings.success
import typings.gestalt.gestaltStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeObject extends StObject {
  
  var text: String
  
  var `type`: js.UndefOr[info | error | warning | success | neutral | darkWash | lightWash] = js.undefined
}
object BadgeObject {
  
  inline def apply(text: String): BadgeObject = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BadgeObject] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: info | error | warning | success | neutral | darkWash | lightWash): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
