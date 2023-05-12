package typings.gestalt.mod

import typings.gestalt.gestaltStrings.alertdialog
import typings.gestalt.gestaltStrings.center
import typings.gestalt.gestaltStrings.defaut
import typings.gestalt.gestaltStrings.dialog
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalProps extends StObject {
  
  var _dangerouslyDisableScrollBoundaryContainer: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityModalLabel: String
  
  var align: js.UndefOr[center | start] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined
  
  var footer: js.UndefOr[Node] = js.undefined
  
  var heading: js.UndefOr[Node] = js.undefined
  
  def onDismiss(): Unit
  
  var padding: js.UndefOr[defaut | none] = js.undefined
  
  var role: js.UndefOr[alertdialog | dialog] = js.undefined
  
  var size: js.UndefOr[sm | md | lg | Double] = js.undefined
  
  var subHeading: js.UndefOr[String] = js.undefined
}
object ModalProps {
  
  inline def apply(accessibilityModalLabel: String, onDismiss: () => Unit): ModalProps = {
    val __obj = js.Dynamic.literal(accessibilityModalLabel = accessibilityModalLabel.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[ModalProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityModalLabel(value: String): Self = StObject.set(x, "accessibilityModalLabel", value.asInstanceOf[js.Any])
    
    inline def setAlign(value: center | start): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCloseOnOutsideClick(value: Boolean): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
    
    inline def setFooter(value: Node): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeading(value: Node): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setPadding(value: defaut | none): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRole(value: alertdialog | dialog): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSize(value: sm | md | lg | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSubHeading(value: String): Self = StObject.set(x, "subHeading", value.asInstanceOf[js.Any])
    
    inline def setSubHeadingUndefined: Self = StObject.set(x, "subHeading", js.undefined)
    
    inline def set_dangerouslyDisableScrollBoundaryContainer(value: Boolean): Self = StObject.set(x, "_dangerouslyDisableScrollBoundaryContainer", value.asInstanceOf[js.Any])
    
    inline def set_dangerouslyDisableScrollBoundaryContainerUndefined: Self = StObject.set(x, "_dangerouslyDisableScrollBoundaryContainer", js.undefined)
  }
}
