package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DismissConfirmationMessage extends StObject {
  
  var accessibilityDismissButtonLabel: String
  
  var dismissConfirmationMessage: String
  
  var dismissConfirmationPrimaryActionText: String
  
  var dismissConfirmationPrimaryActionTextLabel: String
  
  var dismissConfirmationSecondaryActionText: String
  
  var dismissConfirmationSecondaryActionTextLabel: String
  
  var dismissConfirmationSubtext: String
}
object DismissConfirmationMessage {
  
  inline def apply(
    accessibilityDismissButtonLabel: String,
    dismissConfirmationMessage: String,
    dismissConfirmationPrimaryActionText: String,
    dismissConfirmationPrimaryActionTextLabel: String,
    dismissConfirmationSecondaryActionText: String,
    dismissConfirmationSecondaryActionTextLabel: String,
    dismissConfirmationSubtext: String
  ): DismissConfirmationMessage = {
    val __obj = js.Dynamic.literal(accessibilityDismissButtonLabel = accessibilityDismissButtonLabel.asInstanceOf[js.Any], dismissConfirmationMessage = dismissConfirmationMessage.asInstanceOf[js.Any], dismissConfirmationPrimaryActionText = dismissConfirmationPrimaryActionText.asInstanceOf[js.Any], dismissConfirmationPrimaryActionTextLabel = dismissConfirmationPrimaryActionTextLabel.asInstanceOf[js.Any], dismissConfirmationSecondaryActionText = dismissConfirmationSecondaryActionText.asInstanceOf[js.Any], dismissConfirmationSecondaryActionTextLabel = dismissConfirmationSecondaryActionTextLabel.asInstanceOf[js.Any], dismissConfirmationSubtext = dismissConfirmationSubtext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DismissConfirmationMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DismissConfirmationMessage] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityDismissButtonLabel(value: String): Self = StObject.set(x, "accessibilityDismissButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setDismissConfirmationMessage(value: String): Self = StObject.set(x, "dismissConfirmationMessage", value.asInstanceOf[js.Any])
    
    inline def setDismissConfirmationPrimaryActionText(value: String): Self = StObject.set(x, "dismissConfirmationPrimaryActionText", value.asInstanceOf[js.Any])
    
    inline def setDismissConfirmationPrimaryActionTextLabel(value: String): Self = StObject.set(x, "dismissConfirmationPrimaryActionTextLabel", value.asInstanceOf[js.Any])
    
    inline def setDismissConfirmationSecondaryActionText(value: String): Self = StObject.set(x, "dismissConfirmationSecondaryActionText", value.asInstanceOf[js.Any])
    
    inline def setDismissConfirmationSecondaryActionTextLabel(value: String): Self = StObject.set(x, "dismissConfirmationSecondaryActionTextLabel", value.asInstanceOf[js.Any])
    
    inline def setDismissConfirmationSubtext(value: String): Self = StObject.set(x, "dismissConfirmationSubtext", value.asInstanceOf[js.Any])
  }
}
