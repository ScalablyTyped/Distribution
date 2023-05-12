package typings.gestalt.mod

import typings.gestalt.anon.DangerouslydangerouslyDisableOnNavigation
import typings.gestalt.anon.Event
import typings.gestalt.gestaltInts.`-1`
import typings.gestalt.gestaltInts.`0`
import typings.gestalt.gestaltStrings.compress
import typings.gestalt.gestaltStrings.copy
import typings.gestalt.gestaltStrings.grab
import typings.gestalt.gestaltStrings.grabbing
import typings.gestalt.gestaltStrings.move
import typings.gestalt.gestaltStrings.noDrop
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.pointer
import typings.gestalt.gestaltStrings.zoomIn
import typings.gestalt.gestaltStrings.zoomOut
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonTapAreaProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var children: Node
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var fullHeight: js.UndefOr[Boolean] = js.undefined
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  var mouseCursor: js.UndefOr[copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut] = js.undefined
  
  var onBlur: js.UndefOr[
    AbstractEventHandler[FocusEvent[HTMLDivElement | HTMLAnchorElement, Element], js.Object]
  ] = js.undefined
  
  var onFocus: js.UndefOr[
    AbstractEventHandler[FocusEvent[HTMLDivElement | HTMLAnchorElement, Element], js.Object]
  ] = js.undefined
  
  var onKeyDown: js.UndefOr[
    AbstractEventHandler[KeyboardEvent[HTMLDivElement | HTMLAnchorElement], js.Object]
  ] = js.undefined
  
  var onMouseDown: js.UndefOr[
    AbstractEventHandler[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent], js.Object]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    AbstractEventHandler[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent], js.Object]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    AbstractEventHandler[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent], js.Object]
  ] = js.undefined
  
  var onMouseUp: js.UndefOr[
    AbstractEventHandler[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent], js.Object]
  ] = js.undefined
  
  var onTap: js.UndefOr[TapAreaEventHandlerType] = js.undefined
  
  var rounding: js.UndefOr[RoundingType] = js.undefined
  
  var tabIndex: js.UndefOr[`-1` | `0`] = js.undefined
  
  var tapStyle: js.UndefOr[none | compress] = js.undefined
}
object CommonTapAreaProps {
  
  inline def apply(): CommonTapAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonTapAreaProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonTapAreaProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFullHeight(value: Boolean): Self = StObject.set(x, "fullHeight", value.asInstanceOf[js.Any])
    
    inline def setFullHeightUndefined: Self = StObject.set(x, "fullHeight", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setMouseCursor(value: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut): Self = StObject.set(x, "mouseCursor", value.asInstanceOf[js.Any])
    
    inline def setMouseCursorUndefined: Self = StObject.set(x, "mouseCursor", js.undefined)
    
    inline def setOnBlur(
      value: /* arg */ js.Object & (Event[FocusEvent[HTMLDivElement | HTMLAnchorElement, Element]]) => Unit
    ): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnFocus(
      value: /* arg */ js.Object & (Event[FocusEvent[HTMLDivElement | HTMLAnchorElement, Element]]) => Unit
    ): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: /* arg */ js.Object & (Event[KeyboardEvent[HTMLDivElement | HTMLAnchorElement]]) => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnMouseDown(
      value: /* arg */ js.Object & (Event[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(
      value: /* arg */ js.Object & (Event[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: /* arg */ js.Object & (Event[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseUp(
      value: /* arg */ js.Object & (Event[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnTap(
      value: /* arg */ DangerouslydangerouslyDisableOnNavigation & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLDivElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLDivElement])
        ]) => Unit
    ): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
    
    inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
    
    inline def setRounding(value: RoundingType): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    inline def setTabIndex(value: `-1` | `0`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTapStyle(value: none | compress): Self = StObject.set(x, "tapStyle", value.asInstanceOf[js.Any])
    
    inline def setTapStyleUndefined: Self = StObject.set(x, "tapStyle", js.undefined)
  }
}
