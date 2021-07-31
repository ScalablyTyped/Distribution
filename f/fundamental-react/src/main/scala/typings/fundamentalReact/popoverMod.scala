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

object popoverMod {
  
  @JSImport("fundamental-react/lib/Popover/Popover", JSImport.Default)
  @js.native
  class default ()
    extends Component[PopoverProps, js.Object, js.Any]
  
  type Popover = Component[PopoverProps, js.Object, js.Any]
  
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
    
    var popperProps: js.UndefOr[js.Any] = js.undefined
    
    var `type`: js.UndefOr[PopoverTypes] = js.undefined
    
    var useArrowKeyNavigation: js.UndefOr[Boolean] = js.undefined
    
    var widthSizingType: js.UndefOr[PopperSizingTypes] = js.undefined
  }
  object PopoverProps {
    
    @scala.inline
    def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: ReactNode): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setControl(value: ReactNode): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      @scala.inline
      def setDisableEdgeDetection(value: Boolean): Self = StObject.set(x, "disableEdgeDetection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEdgeDetectionUndefined: Self = StObject.set(x, "disableEdgeDetection", js.undefined)
      
      @scala.inline
      def setDisableKeyPressHandler(value: Boolean): Self = StObject.set(x, "disableKeyPressHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableKeyPressHandlerUndefined: Self = StObject.set(x, "disableKeyPressHandler", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setNoArrow(value: Boolean): Self = StObject.set(x, "noArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoArrowUndefined: Self = StObject.set(x, "noArrow", js.undefined)
      
      @scala.inline
      def setOnClickOutside(value: /* event */ MouseEvent | TouchEvent | FocusEvent => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      @scala.inline
      def setOnEscapeKey(value: () => Unit): Self = StObject.set(x, "onEscapeKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEscapeKeyUndefined: Self = StObject.set(x, "onEscapeKey", js.undefined)
      
      @scala.inline
      def setPlacement(value: PopperPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopperClassName(value: String): Self = StObject.set(x, "popperClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperClassNameUndefined: Self = StObject.set(x, "popperClassName", js.undefined)
      
      @scala.inline
      def setPopperProps(value: js.Any): Self = StObject.set(x, "popperProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperPropsUndefined: Self = StObject.set(x, "popperProps", js.undefined)
      
      @scala.inline
      def setType(value: PopoverTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUseArrowKeyNavigation(value: Boolean): Self = StObject.set(x, "useArrowKeyNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseArrowKeyNavigationUndefined: Self = StObject.set(x, "useArrowKeyNavigation", js.undefined)
      
      @scala.inline
      def setWidthSizingType(value: PopperSizingTypes): Self = StObject.set(x, "widthSizingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthSizingTypeUndefined: Self = StObject.set(x, "widthSizingType", js.undefined)
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
    
    @scala.inline
    def dialog: typings.fundamentalReact.fundamentalReactStrings.dialog = "dialog".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.dialog]
    
    @scala.inline
    def grid: typings.fundamentalReact.fundamentalReactStrings.grid = "grid".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.grid]
    
    @scala.inline
    def listbox: typings.fundamentalReact.fundamentalReactStrings.listbox = "listbox".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.listbox]
    
    @scala.inline
    def menu: menu_ = "menu".asInstanceOf[menu_]
    
    @scala.inline
    def tree: typings.fundamentalReact.fundamentalReactStrings.tree = "tree".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.tree]
    
    @scala.inline
    def `true`: typings.fundamentalReact.fundamentalReactBooleans.`true` = true.asInstanceOf[typings.fundamentalReact.fundamentalReactBooleans.`true`]
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
    
    @scala.inline
    def bottom: typings.fundamentalReact.fundamentalReactStrings.bottom = "bottom".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.bottom]
    
    @scala.inline
    def `bottom-end`: typings.fundamentalReact.fundamentalReactStrings.`bottom-end` = "bottom-end".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`bottom-end`]
    
    @scala.inline
    def `bottom-start`: typings.fundamentalReact.fundamentalReactStrings.`bottom-start` = "bottom-start".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`bottom-start`]
    
    @scala.inline
    def left: typings.fundamentalReact.fundamentalReactStrings.left = "left".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.left]
    
    @scala.inline
    def `left-end`: typings.fundamentalReact.fundamentalReactStrings.`left-end` = "left-end".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`left-end`]
    
    @scala.inline
    def `left-start`: typings.fundamentalReact.fundamentalReactStrings.`left-start` = "left-start".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`left-start`]
    
    @scala.inline
    def right: typings.fundamentalReact.fundamentalReactStrings.right = "right".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.right]
    
    @scala.inline
    def `right-end`: typings.fundamentalReact.fundamentalReactStrings.`right-end` = "right-end".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`right-end`]
    
    @scala.inline
    def `right-start`: typings.fundamentalReact.fundamentalReactStrings.`right-start` = "right-start".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`right-start`]
    
    @scala.inline
    def top: typings.fundamentalReact.fundamentalReactStrings.top = "top".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.top]
    
    @scala.inline
    def `top-end`: typings.fundamentalReact.fundamentalReactStrings.`top-end` = "top-end".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`top-end`]
    
    @scala.inline
    def `top-start`: typings.fundamentalReact.fundamentalReactStrings.`top-start` = "top-start".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`top-start`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.none
    - typings.fundamentalReact.fundamentalReactStrings.matchTarget
    - typings.fundamentalReact.fundamentalReactStrings.minTarget
    - typings.fundamentalReact.fundamentalReactStrings.maxTarget
  */
  trait PopperSizingTypes extends StObject
  object PopperSizingTypes {
    
    @scala.inline
    def matchTarget: typings.fundamentalReact.fundamentalReactStrings.matchTarget = "matchTarget".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.matchTarget]
    
    @scala.inline
    def maxTarget: typings.fundamentalReact.fundamentalReactStrings.maxTarget = "maxTarget".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.maxTarget]
    
    @scala.inline
    def minTarget: typings.fundamentalReact.fundamentalReactStrings.minTarget = "minTarget".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.minTarget]
    
    @scala.inline
    def none: typings.fundamentalReact.fundamentalReactStrings.none = "none".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.none]
  }
}
