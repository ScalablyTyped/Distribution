package typings.gestalt.mod

import typings.gestalt.anon.AccessibilityLabel
import typings.gestalt.anon.Href
import typings.gestalt.gestaltStrings.complete
import typings.gestalt.gestaltStrings.needsAttention
import typings.gestalt.gestaltStrings.notStarted
import typings.gestalt.gestaltStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivationCardProps extends StObject {
  
  var dismissButton: js.UndefOr[AccessibilityLabel] = js.undefined
  
  var link: js.UndefOr[Href] = js.undefined
  
  var message: String
  
  var status: notStarted | pending | needsAttention | complete
  
  var statusMessage: String
  
  var title: String
}
object ActivationCardProps {
  
  inline def apply(
    message: String,
    status: notStarted | pending | needsAttention | complete,
    statusMessage: String,
    title: String
  ): ActivationCardProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationCardProps]
  }
  
  extension [Self <: ActivationCardProps](x: Self) {
    
    inline def setDismissButton(value: AccessibilityLabel): Self = StObject.set(x, "dismissButton", value.asInstanceOf[js.Any])
    
    inline def setDismissButtonUndefined: Self = StObject.set(x, "dismissButton", js.undefined)
    
    inline def setLink(value: Href): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: notStarted | pending | needsAttention | complete): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
