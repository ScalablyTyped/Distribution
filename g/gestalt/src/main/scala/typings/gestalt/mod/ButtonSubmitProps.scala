package typings.gestalt.mod

import typings.gestalt.gestaltStrings.button
import typings.gestalt.gestaltStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonSubmitProps
  extends StObject
     with CommonButtonProps
     with ButtonProps {
  
  var role: button
  
  var `type`: submit
}
object ButtonSubmitProps {
  
  inline def apply(text: String): ButtonSubmitProps = {
    val __obj = js.Dynamic.literal(role = "button", text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("submit")
    __obj.asInstanceOf[ButtonSubmitProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonSubmitProps] (val x: Self) extends AnyVal {
    
    inline def setRole(value: button): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setType(value: submit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
