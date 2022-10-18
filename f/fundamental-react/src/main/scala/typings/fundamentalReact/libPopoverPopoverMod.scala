package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactStrings.menu_
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.FocusEvent
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverPopoverMod {
  
  @JSImport("fundamental-react/lib/Popover/Popover", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PopoverProps, js.Object, Any]
  
  type Popover = Component[PopoverProps, js.Object, Any]
  
  trait PopoverProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var body: ReactNode
    
    var control: ReactNode
    
    var disableEdgeDetection: js.UndefOr[Boolean] = js.undefined
    
    var disableKeyPressHandler: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var noArrow: js.UndefOr[Boolean] = js.undefined
    
    var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent | FocusEvent, Unit]] = js.undefined
    
    var onEscapeKey: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[PopperPlacement] = js.undefined
    
    var popperClassName: js.UndefOr[String] = js.undefined
    
    var popperProps: js.UndefOr[Any] = js.undefined
    
    var `type`: js.UndefOr[PopoverTypes] = js.undefined
    
    var useArrowKeyNavigation: js.UndefOr[Boolean] = js.undefined
    
    var widthSizingType: js.UndefOr[PopperSizingTypes] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setBody(value: ReactNode): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setControl(value: ReactNode): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setDisableEdgeDetection(value: Boolean): Self = StObject.set(x, "disableEdgeDetection", value.asInstanceOf[js.Any])
      
      inline def setDisableEdgeDetectionUndefined: Self = StObject.set(x, "disableEdgeDetection", js.undefined)
      
      inline def setDisableKeyPressHandler(value: Boolean): Self = StObject.set(x, "disableKeyPressHandler", value.asInstanceOf[js.Any])
      
      inline def setDisableKeyPressHandlerUndefined: Self = StObject.set(x, "disableKeyPressHandler", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setNoArrow(value: Boolean): Self = StObject.set(x, "noArrow", value.asInstanceOf[js.Any])
      
      inline def setNoArrowUndefined: Self = StObject.set(x, "noArrow", js.undefined)
      
      inline def setOnClickOutside(value: /* event */ MouseEvent | TouchEvent | FocusEvent => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnEscapeKey(value: () => Unit): Self = StObject.set(x, "onEscapeKey", js.Any.fromFunction0(value))
      
      inline def setOnEscapeKeyUndefined: Self = StObject.set(x, "onEscapeKey", js.undefined)
      
      inline def setPlacement(value: PopperPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperClassName(value: String): Self = StObject.set(x, "popperClassName", value.asInstanceOf[js.Any])
      
      inline def setPopperClassNameUndefined: Self = StObject.set(x, "popperClassName", js.undefined)
      
      inline def setPopperProps(value: Any): Self = StObject.set(x, "popperProps", value.asInstanceOf[js.Any])
      
      inline def setPopperPropsUndefined: Self = StObject.set(x, "popperProps", js.undefined)
      
      inline def setType(value: PopoverTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseArrowKeyNavigation(value: Boolean): Self = StObject.set(x, "useArrowKeyNavigation", value.asInstanceOf[js.Any])
      
      inline def setUseArrowKeyNavigationUndefined: Self = StObject.set(x, "useArrowKeyNavigation", js.undefined)
      
      inline def setWidthSizingType(value: PopperSizingTypes): Self = StObject.set(x, "widthSizingType", value.asInstanceOf[js.Any])
      
      inline def setWidthSizingTypeUndefined: Self = StObject.set(x, "widthSizingType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactBooleans.`true`
    - typings.fundamentalReact.fundamentalReactStrings.dialog
    - typings.fundamentalReact.fundamentalReactStrings.grid
    - typings.fundamentalReact.fundamentalReactStrings.listbox
    - typings.fundamentalReact.fundamentalReactStrings.menu_
    - typings.fundamentalReact.fundamentalReactStrings.tree
  */
  trait PopoverTypes extends StObject
  object PopoverTypes {
    
    inline def dialog: typings.fundamentalReact.fundamentalReactStrings.dialog = "dialog".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.dialog]
    
    inline def grid: typings.fundamentalReact.fundamentalReactStrings.grid = "grid".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.grid]
    
    inline def listbox: typings.fundamentalReact.fundamentalReactStrings.listbox = "listbox".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.listbox]
    
    inline def menu: menu_ = "menu".asInstanceOf[menu_]
    
    inline def tree: typings.fundamentalReact.fundamentalReactStrings.tree = "tree".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.tree]
    
    inline def `true`: typings.fundamentalReact.fundamentalReactBooleans.`true` = true.asInstanceOf[typings.fundamentalReact.fundamentalReactBooleans.`true`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.`bottom-start`
    - typings.fundamentalReact.fundamentalReactStrings.bottom
    - typings.fundamentalReact.fundamentalReactStrings.`bottom-end`
    - typings.fundamentalReact.fundamentalReactStrings.`left-start`
    - typings.fundamentalReact.fundamentalReactStrings.left
    - typings.fundamentalReact.fundamentalReactStrings.`left-end`
    - typings.fundamentalReact.fundamentalReactStrings.`right-start`
    - typings.fundamentalReact.fundamentalReactStrings.right
    - typings.fundamentalReact.fundamentalReactStrings.`right-end`
    - typings.fundamentalReact.fundamentalReactStrings.`top-start`
    - typings.fundamentalReact.fundamentalReactStrings.top
    - typings.fundamentalReact.fundamentalReactStrings.`top-end`
  */
  trait PopperPlacement extends StObject
  object PopperPlacement {
    
    inline def bottom: typings.fundamentalReact.fundamentalReactStrings.bottom = "bottom".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.bottom]
    
    inline def `bottom-end`: typings.fundamentalReact.fundamentalReactStrings.`bottom-end` = "bottom-end".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`bottom-end`]
    
    inline def `bottom-start`: typings.fundamentalReact.fundamentalReactStrings.`bottom-start` = "bottom-start".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`bottom-start`]
    
    inline def left: typings.fundamentalReact.fundamentalReactStrings.left = "left".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.left]
    
    inline def `left-end`: typings.fundamentalReact.fundamentalReactStrings.`left-end` = "left-end".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`left-end`]
    
    inline def `left-start`: typings.fundamentalReact.fundamentalReactStrings.`left-start` = "left-start".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`left-start`]
    
    inline def right: typings.fundamentalReact.fundamentalReactStrings.right = "right".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.right]
    
    inline def `right-end`: typings.fundamentalReact.fundamentalReactStrings.`right-end` = "right-end".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`right-end`]
    
    inline def `right-start`: typings.fundamentalReact.fundamentalReactStrings.`right-start` = "right-start".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`right-start`]
    
    inline def top: typings.fundamentalReact.fundamentalReactStrings.top = "top".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.top]
    
    inline def `top-end`: typings.fundamentalReact.fundamentalReactStrings.`top-end` = "top-end".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`top-end`]
    
    inline def `top-start`: typings.fundamentalReact.fundamentalReactStrings.`top-start` = "top-start".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`top-start`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.none
    - typings.fundamentalReact.fundamentalReactStrings.matchTarget
    - typings.fundamentalReact.fundamentalReactStrings.minTarget
    - typings.fundamentalReact.fundamentalReactStrings.maxTarget
  */
  trait PopperSizingTypes extends StObject
  object PopperSizingTypes {
    
    inline def matchTarget: typings.fundamentalReact.fundamentalReactStrings.matchTarget = "matchTarget".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.matchTarget]
    
    inline def maxTarget: typings.fundamentalReact.fundamentalReactStrings.maxTarget = "maxTarget".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.maxTarget]
    
    inline def minTarget: typings.fundamentalReact.fundamentalReactStrings.minTarget = "minTarget".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.minTarget]
    
    inline def none: typings.fundamentalReact.fundamentalReactStrings.none = "none".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.none]
  }
}
