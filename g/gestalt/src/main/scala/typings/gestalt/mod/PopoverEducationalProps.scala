package typings.gestalt.mod

import typings.gestalt.anon.Rel
import typings.gestalt.gestaltStrings.dialog
import typings.gestalt.gestaltStrings.flexible
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.tooltip
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverEducationalProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var anchor: js.UndefOr[HTMLElement | Null] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var idealDirection: js.UndefOr[FourDirections] = js.undefined
  
  var message: js.UndefOr[String | ReactElement] = js.undefined
  
  def onDismiss(): Unit
  
  var primaryAction: js.UndefOr[Rel] = js.undefined
  
  var role: js.UndefOr[dialog | tooltip] = js.undefined
  
  var shouldFocus: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[sm | flexible] = js.undefined
  
  var zIndex: js.UndefOr[Indexable] = js.undefined
}
object PopoverEducationalProps {
  
  inline def apply(onDismiss: () => Unit): PopoverEducationalProps = {
    val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[PopoverEducationalProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopoverEducationalProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdealDirection(value: FourDirections): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
    
    inline def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
    
    inline def setMessage(value: String | ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setPrimaryAction(value: Rel): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
    
    inline def setPrimaryActionUndefined: Self = StObject.set(x, "primaryAction", js.undefined)
    
    inline def setRole(value: dialog | tooltip): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setShouldFocus(value: Boolean): Self = StObject.set(x, "shouldFocus", value.asInstanceOf[js.Any])
    
    inline def setShouldFocusUndefined: Self = StObject.set(x, "shouldFocus", js.undefined)
    
    inline def setSize(value: sm | flexible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setZIndex(value: Indexable): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
