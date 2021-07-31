package typings.focusTrap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("focus-trap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(element: String): FocusTrap = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[FocusTrap]
  @scala.inline
  def default(element: String, userOptions: Options): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  @scala.inline
  def default(element: HTMLElement): FocusTrap = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[FocusTrap]
  @scala.inline
  def default(element: HTMLElement, userOptions: Options): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  
  /* Inlined std.Pick<focus-trap.focus-trap.Options, 'onActivate'> */
  trait ActivateOptions extends StObject {
    
    var onActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ActivateOptions {
    
    @scala.inline
    def apply(): ActivateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivateOptions]
    }
    
    @scala.inline
    implicit class ActivateOptionsMutableBuilder[Self <: ActivateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnActivate(value: () => Unit): Self = StObject.set(x, "onActivate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<focus-trap.focus-trap.Options, 'onDeactivate'> */
  trait DeactivateOptions extends StObject {
    
    var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var returnFocus: js.UndefOr[Boolean] = js.undefined
  }
  object DeactivateOptions {
    
    @scala.inline
    def apply(): DeactivateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeactivateOptions]
    }
    
    @scala.inline
    implicit class DeactivateOptionsMutableBuilder[Self <: DeactivateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnDeactivate(value: () => Unit): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
      
      @scala.inline
      def setReturnFocus(value: Boolean): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
    }
  }
  
  type FocusTarget = HTMLElement | String | js.Function0[HTMLElement]
  
  @js.native
  trait FocusTrap extends StObject {
    
    def activate(): Unit = js.native
    def activate(activateOptions: ActivateOptions): Unit = js.native
    
    def deactivate(): Unit = js.native
    def deactivate(deactivateOptions: DeactivateOptions): Unit = js.native
    
    def pause(): Unit = js.native
    
    def unpause(): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Default: `false`. If `true`, a click outside the focus trap will
      * deactivate the focus trap and allow the click event to do its thing.
      */
    var clickOutsideDeactivates: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: `true`. If `false`, the `Escape` key will not trigger
      * deactivation of the focus trap. This can be useful if you want
      * to force the user to make a decision instead of allowing an easy
      * way out.
      */
    var escapeDeactivates: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, an error will be thrown if the focus trap contains no
      * elements in its tab order. With this option you can specify a
      * fallback element to programmatically receive focus if no other
      * tabbable elements are found. For example, you may want a popover's
      * `<div>` to receive focus if the popover's content includes no
      * tabbable elements. *Make sure the fallback element has a negative
      * `tabindex` so it can be programmatically focused.*
      */
    var fallbackFocus: js.UndefOr[FocusTarget] = js.undefined
    
    /**
      * By default, when a focus trap is activated the first element in the
      * focus trap's tab order will receive focus. With this option you can
      * specify a different element to receive that initial focus.
      */
    var initialFocus: js.UndefOr[FocusTarget] = js.undefined
    
    /**
      * A function that will be called when the focus trap activates.
      */
    var onActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function that will be called when the focus trap deactivates.
      */
    var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Default: `true`. If `false`, when the trap is deactivated,
      * focus will *not* return to the element that had focus before activation.
      */
    var returnFocusOnDeactivate: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickOutsideDeactivates(value: Boolean): Self = StObject.set(x, "clickOutsideDeactivates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickOutsideDeactivatesUndefined: Self = StObject.set(x, "clickOutsideDeactivates", js.undefined)
      
      @scala.inline
      def setEscapeDeactivates(value: Boolean): Self = StObject.set(x, "escapeDeactivates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeDeactivatesUndefined: Self = StObject.set(x, "escapeDeactivates", js.undefined)
      
      @scala.inline
      def setFallbackFocus(value: FocusTarget): Self = StObject.set(x, "fallbackFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackFocusFunction0(value: () => HTMLElement): Self = StObject.set(x, "fallbackFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFallbackFocusUndefined: Self = StObject.set(x, "fallbackFocus", js.undefined)
      
      @scala.inline
      def setInitialFocus(value: FocusTarget): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialFocusFunction0(value: () => HTMLElement): Self = StObject.set(x, "initialFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
      @scala.inline
      def setOnActivate(value: () => Unit): Self = StObject.set(x, "onActivate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
      
      @scala.inline
      def setOnDeactivate(value: () => Unit): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
      
      @scala.inline
      def setReturnFocusOnDeactivate(value: Boolean): Self = StObject.set(x, "returnFocusOnDeactivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnFocusOnDeactivateUndefined: Self = StObject.set(x, "returnFocusOnDeactivate", js.undefined)
    }
  }
}
