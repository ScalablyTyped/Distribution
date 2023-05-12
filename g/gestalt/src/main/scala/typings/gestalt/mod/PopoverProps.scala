package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.gestalt.gestaltStrings.`30vh`
import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.dialog
import typings.gestalt.gestaltStrings.flexible
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.listbox
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.menu
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.tooltip
import typings.gestalt.gestaltStrings.white
import typings.gestalt.gestaltStrings.xl
import typings.gestalt.gestaltStrings.xs
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverProps extends StObject {
  
  var __dangerouslySetMaxHeight: js.UndefOr[`30vh`] = js.undefined
  
  var accessibilityDismissButtonLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var anchor: js.UndefOr[HTMLElement | Null] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var color: js.UndefOr[blue | red | white | darkGray] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var idealDirection: js.UndefOr[FourDirections] = js.undefined
  
  def onDismiss(): Unit
  
  var onKeyDown: js.UndefOr[AbstractEventHandler[KeyboardEvent[HTMLElement], js.Object]] = js.undefined
  
  var positionRelativeToAnchor: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[dialog | listbox | menu | tooltip] = js.undefined
  
  var shouldFocus: js.UndefOr[Boolean] = js.undefined
  
  var showCaret: js.UndefOr[Boolean] = js.undefined
  
  var showDismissButton: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[xs | sm | md | lg | xl | flexible | Double] = js.undefined
}
object PopoverProps {
  
  inline def apply(onDismiss: () => Unit): PopoverProps = {
    val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[PopoverProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityDismissButtonLabel(value: String): Self = StObject.set(x, "accessibilityDismissButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityDismissButtonLabelUndefined: Self = StObject.set(x, "accessibilityDismissButtonLabel", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: blue | red | white | darkGray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdealDirection(value: FourDirections): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
    
    inline def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setOnKeyDown(value: /* arg */ js.Object & Event[KeyboardEvent[HTMLElement]] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setPositionRelativeToAnchor(value: Boolean): Self = StObject.set(x, "positionRelativeToAnchor", value.asInstanceOf[js.Any])
    
    inline def setPositionRelativeToAnchorUndefined: Self = StObject.set(x, "positionRelativeToAnchor", js.undefined)
    
    inline def setRole(value: dialog | listbox | menu | tooltip): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setShouldFocus(value: Boolean): Self = StObject.set(x, "shouldFocus", value.asInstanceOf[js.Any])
    
    inline def setShouldFocusUndefined: Self = StObject.set(x, "shouldFocus", js.undefined)
    
    inline def setShowCaret(value: Boolean): Self = StObject.set(x, "showCaret", value.asInstanceOf[js.Any])
    
    inline def setShowCaretUndefined: Self = StObject.set(x, "showCaret", js.undefined)
    
    inline def setShowDismissButton(value: Boolean): Self = StObject.set(x, "showDismissButton", value.asInstanceOf[js.Any])
    
    inline def setShowDismissButtonUndefined: Self = StObject.set(x, "showDismissButton", js.undefined)
    
    inline def setSize(value: xs | sm | md | lg | xl | flexible | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def set__dangerouslySetMaxHeight(value: `30vh`): Self = StObject.set(x, "__dangerouslySetMaxHeight", value.asInstanceOf[js.Any])
    
    inline def set__dangerouslySetMaxHeightUndefined: Self = StObject.set(x, "__dangerouslySetMaxHeight", js.undefined)
  }
}
