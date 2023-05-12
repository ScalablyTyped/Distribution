package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipMessage extends StObject {
  
  var tooltipMessage: String
}
object TooltipMessage {
  
  inline def apply(tooltipMessage: String): TooltipMessage = {
    val __obj = js.Dynamic.literal(tooltipMessage = tooltipMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipMessage] (val x: Self) extends AnyVal {
    
    inline def setTooltipMessage(value: String): Self = StObject.set(x, "tooltipMessage", value.asInstanceOf[js.Any])
  }
}
