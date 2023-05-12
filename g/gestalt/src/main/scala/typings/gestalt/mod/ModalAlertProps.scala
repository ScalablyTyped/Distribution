package typings.gestalt.mod

import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalAlertProps extends StObject {
  
  var accessibilityDismissButtonLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityModalLabel: String
  
  var children: Node
  
  var heading: String
  
  def onDismiss(): Unit
  
  var primaryAction: ModalAlertActionDataType
  
  var secondaryAction: js.UndefOr[ModalAlertActionDataType] = js.undefined
  
  var `type`: js.UndefOr[default | warning | error] = js.undefined
}
object ModalAlertProps {
  
  inline def apply(
    accessibilityModalLabel: String,
    heading: String,
    onDismiss: () => Unit,
    primaryAction: ModalAlertActionDataType
  ): ModalAlertProps = {
    val __obj = js.Dynamic.literal(accessibilityModalLabel = accessibilityModalLabel.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss), primaryAction = primaryAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalAlertProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModalAlertProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityDismissButtonLabel(value: String): Self = StObject.set(x, "accessibilityDismissButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityDismissButtonLabelUndefined: Self = StObject.set(x, "accessibilityDismissButtonLabel", js.undefined)
    
    inline def setAccessibilityModalLabel(value: String): Self = StObject.set(x, "accessibilityModalLabel", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setPrimaryAction(value: ModalAlertActionDataType): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
    
    inline def setSecondaryAction(value: ModalAlertActionDataType): Self = StObject.set(x, "secondaryAction", value.asInstanceOf[js.Any])
    
    inline def setSecondaryActionUndefined: Self = StObject.set(x, "secondaryAction", js.undefined)
    
    inline def setType(value: default | warning | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
