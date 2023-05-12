package typings.gestalt.mod

import typings.gestalt.gestaltStrings.button
import typings.gestalt.gestaltStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconButtonSubmitProps
  extends StObject
     with CommonIconButtonProps
     with IconButtonProps {
  
  var role: js.UndefOr[button] = js.undefined
  
  var `type`: submit
}
object IconButtonSubmitProps {
  
  inline def apply(accessibilityLabel: String): IconButtonSubmitProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("submit")
    __obj.asInstanceOf[IconButtonSubmitProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconButtonSubmitProps] (val x: Self) extends AnyVal {
    
    inline def setRole(value: button): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setType(value: submit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
