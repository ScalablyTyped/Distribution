package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboBox extends StObject {
  
  var ComboBox: AccessibilityClearButtonLabel
  
  var HelpButton: TooltipMessage
  
  var Link: AccessibilityNewTabLabel
  
  var Modal: AccessibilityDismissButtonLabel
  
  var OverlayPanel: DismissConfirmationMessage
  
  var Popover: AccessibilityDismissButtonLabel
  
  var SheetMobile: AccessibilityGrabberLabel
  
  var Tag: AccessibilityErrorIconLabel
  
  var TextField: AccessibilityHidePasswordLabel
  
  var Toast: AccessibilityIconErrorLabel
}
object ComboBox {
  
  inline def apply(
    ComboBox: AccessibilityClearButtonLabel,
    HelpButton: TooltipMessage,
    Link: AccessibilityNewTabLabel,
    Modal: AccessibilityDismissButtonLabel,
    OverlayPanel: DismissConfirmationMessage,
    Popover: AccessibilityDismissButtonLabel,
    SheetMobile: AccessibilityGrabberLabel,
    Tag: AccessibilityErrorIconLabel,
    TextField: AccessibilityHidePasswordLabel,
    Toast: AccessibilityIconErrorLabel
  ): ComboBox = {
    val __obj = js.Dynamic.literal(ComboBox = ComboBox.asInstanceOf[js.Any], HelpButton = HelpButton.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Modal = Modal.asInstanceOf[js.Any], OverlayPanel = OverlayPanel.asInstanceOf[js.Any], Popover = Popover.asInstanceOf[js.Any], SheetMobile = SheetMobile.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TextField = TextField.asInstanceOf[js.Any], Toast = Toast.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComboBox] (val x: Self) extends AnyVal {
    
    inline def setComboBox(value: AccessibilityClearButtonLabel): Self = StObject.set(x, "ComboBox", value.asInstanceOf[js.Any])
    
    inline def setHelpButton(value: TooltipMessage): Self = StObject.set(x, "HelpButton", value.asInstanceOf[js.Any])
    
    inline def setLink(value: AccessibilityNewTabLabel): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setModal(value: AccessibilityDismissButtonLabel): Self = StObject.set(x, "Modal", value.asInstanceOf[js.Any])
    
    inline def setOverlayPanel(value: DismissConfirmationMessage): Self = StObject.set(x, "OverlayPanel", value.asInstanceOf[js.Any])
    
    inline def setPopover(value: AccessibilityDismissButtonLabel): Self = StObject.set(x, "Popover", value.asInstanceOf[js.Any])
    
    inline def setSheetMobile(value: AccessibilityGrabberLabel): Self = StObject.set(x, "SheetMobile", value.asInstanceOf[js.Any])
    
    inline def setTag(value: AccessibilityErrorIconLabel): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTextField(value: AccessibilityHidePasswordLabel): Self = StObject.set(x, "TextField", value.asInstanceOf[js.Any])
    
    inline def setToast(value: AccessibilityIconErrorLabel): Self = StObject.set(x, "Toast", value.asInstanceOf[js.Any])
  }
}
