package typings.focusTrap

import typings.focusTrap.focusTrapBooleans.`false`
import typings.std.Document
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.SVGElement
import typings.std.TouchEvent
import typings.tabbable.mod.CheckOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("focus-trap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFocusTrap(element: String): FocusTrap = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any]).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: String, userOptions: Options): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: js.Array[HTMLElement | SVGElement | String]): FocusTrap = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any]).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: js.Array[HTMLElement | SVGElement | String], userOptions: Options): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: HTMLElement): FocusTrap = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any]).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: HTMLElement, userOptions: Options): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: SVGElement): FocusTrap = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any]).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: SVGElement, userOptions: Options): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  
  /* Inlined std.Pick<focus-trap.focus-trap.Options, 'onActivate' | 'onPostActivate' | 'checkCanFocusTrap'> */
  trait ActivateOptions extends StObject {
    
    var checkCanFocusTrap: js.UndefOr[
        js.Function1[/* containers */ js.Array[HTMLElement | SVGElement], js.Promise[Unit]]
      ] = js.undefined
    
    var onActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPostActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ActivateOptions {
    
    inline def apply(): ActivateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActivateOptions] (val x: Self) extends AnyVal {
      
      inline def setCheckCanFocusTrap(value: /* containers */ js.Array[HTMLElement | SVGElement] => js.Promise[Unit]): Self = StObject.set(x, "checkCanFocusTrap", js.Any.fromFunction1(value))
      
      inline def setCheckCanFocusTrapUndefined: Self = StObject.set(x, "checkCanFocusTrap", js.undefined)
      
      inline def setOnActivate(value: () => Unit): Self = StObject.set(x, "onActivate", js.Any.fromFunction0(value))
      
      inline def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
      
      inline def setOnPostActivate(value: () => Unit): Self = StObject.set(x, "onPostActivate", js.Any.fromFunction0(value))
      
      inline def setOnPostActivateUndefined: Self = StObject.set(x, "onPostActivate", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<focus-trap.focus-trap.Options, 'onDeactivate' | 'onPostDeactivate' | 'checkCanReturnFocus'> */
  trait DeactivateOptions extends StObject {
    
    var checkCanReturnFocus: js.UndefOr[js.Function1[/* trigger */ HTMLElement | SVGElement, js.Promise[Unit]]] = js.undefined
    
    var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPostDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var returnFocus: js.UndefOr[Boolean] = js.undefined
  }
  object DeactivateOptions {
    
    inline def apply(): DeactivateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeactivateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeactivateOptions] (val x: Self) extends AnyVal {
      
      inline def setCheckCanReturnFocus(value: /* trigger */ HTMLElement | SVGElement => js.Promise[Unit]): Self = StObject.set(x, "checkCanReturnFocus", js.Any.fromFunction1(value))
      
      inline def setCheckCanReturnFocusUndefined: Self = StObject.set(x, "checkCanReturnFocus", js.undefined)
      
      inline def setOnDeactivate(value: () => Unit): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction0(value))
      
      inline def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
      
      inline def setOnPostDeactivate(value: () => Unit): Self = StObject.set(x, "onPostDeactivate", js.Any.fromFunction0(value))
      
      inline def setOnPostDeactivateUndefined: Self = StObject.set(x, "onPostDeactivate", js.undefined)
      
      inline def setReturnFocus(value: Boolean): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
    }
  }
  
  type FocusTarget = FocusTargetValue | js.Function0[FocusTargetValue]
  
  type FocusTargetOrFalse = FocusTargetValueOrFalse | js.Function0[FocusTargetValueOrFalse]
  
  type FocusTargetValue = HTMLElement | SVGElement | String
  
  type FocusTargetValueOrFalse = FocusTargetValue | `false`
  
  @js.native
  trait FocusTrap extends StObject {
    
    def activate(): FocusTrap = js.native
    def activate(activateOptions: ActivateOptions): FocusTrap = js.native
    
    var active: Boolean = js.native
    
    def deactivate(): FocusTrap = js.native
    def deactivate(deactivateOptions: DeactivateOptions): FocusTrap = js.native
    
    def pause(): FocusTrap = js.native
    def pause(pauseOptions: PauseOptions): FocusTrap = js.native
    
    var paused: Boolean = js.native
    
    def unpause(): FocusTrap = js.native
    def unpause(unpauseOptions: UnpauseOptions): FocusTrap = js.native
    
    def updateContainerElements(containerElements: String): FocusTrap = js.native
    def updateContainerElements(containerElements: js.Array[HTMLElement | SVGElement | String]): FocusTrap = js.native
    def updateContainerElements(containerElements: HTMLElement): FocusTrap = js.native
    def updateContainerElements(containerElements: SVGElement): FocusTrap = js.native
  }
  
  type FocusTrapTabbableOptions = CheckOptions
  
  type KeyboardEventToBoolean = js.Function1[/* event */ KeyboardEvent, Boolean]
  
  type MouseEventToBoolean = js.Function1[/* event */ MouseEvent | TouchEvent, Boolean]
  
  trait Options extends StObject {
    
    /**
      * If set and is or returns `true`, a click outside the focus trap will not
      * be prevented, even when `clickOutsideDeactivates` is `false`. When
      * `clickOutsideDeactivates` is `true`, this option is **ignored** (i.e.
      * if it's a function, it will not be called). Use this option to control
      * if (and even which) clicks are allowed outside the trap in conjunction
      * with `clickOutsideDeactivates: false`. Default: `false`.
      */
    var allowOutsideClick: js.UndefOr[Boolean | MouseEventToBoolean] = js.undefined
    
    /**
      * A function for determining if it is safe to send focus to the focus trap
      * or not.
      *
      * It should return a promise that only resolves once all the listed `containers`
      * are able to receive focus.
      *
      * The purpose of this is to prevent early focus-trap activation on animated
      * dialogs that fade in and out. When a dialog fades in, there is a brief delay
      * between the activation of the trap and the trap element being focusable.
      */
    var checkCanFocusTrap: js.UndefOr[
        js.Function1[/* containers */ js.Array[HTMLElement | SVGElement], js.Promise[Unit]]
      ] = js.undefined
    
    /**
      * A function for determining if it is safe to send focus back to the `trigger` element.
      *
      * It should return a promise that only resolves once `trigger` is focusable.
      *
      * The purpose of this is to prevent the focus being sent to an animated trigger element too early.
      * If a trigger element fades in upon trap deactivation, there is a brief delay between the deactivation
      * of the trap and when the trigger element is focusable.
      *
      * `trigger` will be either the node that had focus prior to the trap being activated,
      * or the result of the `setReturnFocus` option, if configured.
      *
      * This handler is **not** called if the `returnFocusOnDeactivate` configuration option
      * (or the `returnFocus` deactivation option) is falsy.
      */
    var checkCanReturnFocus: js.UndefOr[js.Function1[/* trigger */ HTMLElement | SVGElement, js.Promise[Unit]]] = js.undefined
    
    /**
      * If `true` or returns `true`, a click outside the focus trap will
      * deactivate the focus trap and allow the click event to do its thing (i.e.
      * to pass-through to the element that was clicked). This option **takes
      * precedence** over `allowOutsideClick` when it's set to `true`, causing
      * that option to be ignored. Default: `false`.
      */
    var clickOutsideDeactivates: js.UndefOr[Boolean | MouseEventToBoolean] = js.undefined
    
    /**
      * Default: `true`. Delays the autofocus when the focus trap is activated.
      * This prevents elements within the focusable element from capturing
      * the event that triggered the focus trap activation.
      */
    var delayInitialFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: `window.document`. Document where the focus trap will be active.
      * This allows to use FocusTrap in an iFrame context.
      */
    var document: js.UndefOr[Document] = js.undefined
    
    /**
      * Default: `true`. If `false` or returns `false`, the `Escape` key will not trigger
      * deactivation of the focus trap. This can be useful if you want
      * to force the user to make a decision instead of allowing an easy
      * way out. Note that if a function is given, it's only called if the ESC key
      * was pressed.
      */
    var escapeDeactivates: js.UndefOr[Boolean | KeyboardEventToBoolean] = js.undefined
    
    /**
      * By default, an error will be thrown if the focus trap contains no
      * elements in its tab order. With this option you can specify a
      * fallback element to programmatically receive focus if no other
      * tabbable elements are found. For example, you may want a popover's
      * `<div>` to receive focus if the popover's content includes no
      * tabbable elements. *Make sure the fallback element has a negative
      * `tabindex` so it can be programmatically focused.
      *
      * NOTE: If `initialFocus` is `false` (or a function that returns `false`),
      * this function will not be called when the trap is activated, and no element
      * will be initially focused. This function may still be called while the trap
      * is active if things change such that there are no longer any tabbable nodes
      * in the trap.
      */
    var fallbackFocus: js.UndefOr[FocusTarget] = js.undefined
    
    /**
      * By default, when a focus trap is activated the first element in the
      * focus trap's tab order will receive focus. With this option you can
      * specify a different element to receive that initial focus, or use `false`
      * for no initially focused element at all.
      *
      * NOTE: Setting this option to `false` (or a function that returns `false`)
      * will prevent the `fallbackFocus` option from being used.
      */
    var initialFocus: js.UndefOr[FocusTargetOrFalse] = js.undefined
    
    /**
      * Determines if the given keyboard event is a "tab backward" event that will move
      * the focus to the previous trapped element in tab order. Defaults to the `SHIFT+TAB` key.
      * Use this to override the trap's behavior if you want to use arrow keys to control
      * keyboard navigation within the trap, for example. Also see `isKeyForward()` option.
      */
    var isKeyBackward: js.UndefOr[KeyboardEventToBoolean] = js.undefined
    
    /**
      * Determines if the given keyboard event is a "tab forward" event that will move
      * the focus to the next trapped element in tab order. Defaults to the `TAB` key.
      * Use this to override the trap's behavior if you want to use arrow keys to control
      * keyboard navigation within the trap, for example. Also see `isKeyBackward()` option.
      */
    var isKeyForward: js.UndefOr[KeyboardEventToBoolean] = js.undefined
    
    /**
      * A function that will be called **before** sending focus to the
      * target element upon activation.
      */
    var onActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function that will be called **before** sending focus to the
      * trigger element upon deactivation.
      */
    var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function that will be called immediately after the trap's state is updated to be paused.
      */
    var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function that will be called **after** focus has been sent to the
      * target element upon activation.
      */
    var onPostActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function that will be called after the trap is deactivated, after `onDeactivate`.
      * If `returnFocus` was set, it will be called **after** focus has been sent to the trigger
      * element upon deactivation; otherwise, it will be called after deactivation completes.
      */
    var onPostDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function that will be called after the trap has been completely paused and is no longer
      *  managing/trapping focus.
      */
    var onPostPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function that will be called after the trap has been completely unpaused and is once
      *  again managing/trapping focus.
      */
    var onPostUnpause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function that will be called immediately after the trap's state is updated to be active
      *  again, but prior to updating its knowledge of what nodes are tabbable within its containers,
      *  and prior to actively managing/trapping focus.
      */
    var onUnpause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * By default, focus() will scroll to the element if not in viewport.
      * It can produce unintended effects like scrolling back to the top of a modal.
      * If set to `true`, no scroll will happen.
      */
    var preventScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: `true`. If `false`, when the trap is deactivated,
      * focus will *not* return to the element that had focus before activation.
      */
    var returnFocusOnDeactivate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, focus trap on deactivation will return to the element
      * that was focused before activation.
      */
    var setReturnFocus: js.UndefOr[
        FocusTargetValueOrFalse | (js.Function1[
          /* nodeFocusedBeforeActivation */ HTMLElement | SVGElement, 
          FocusTargetValueOrFalse
        ])
      ] = js.undefined
    
    /**
      * Specific tabbable options configurable on focus-trap.
      */
    var tabbableOptions: js.UndefOr[FocusTrapTabbableOptions] = js.undefined
    
    /**
      * Define the global trap stack. This makes it possible to share the same stack
      * in multiple instances of `focus-trap` in the same page such that
      * auto-activation/pausing of traps is properly coordinated among all instances
      * as activating a trap when another is already active should result in the other
      * being auto-paused. By default, each instance will have its own internal stack,
      * leading to conflicts if they each try to trap the focus at the same time.
      */
    var trapStack: js.UndefOr[js.Array[FocusTrap]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowOutsideClick(value: Boolean | MouseEventToBoolean): Self = StObject.set(x, "allowOutsideClick", value.asInstanceOf[js.Any])
      
      inline def setAllowOutsideClickFunction1(value: /* event */ MouseEvent | TouchEvent => Boolean): Self = StObject.set(x, "allowOutsideClick", js.Any.fromFunction1(value))
      
      inline def setAllowOutsideClickUndefined: Self = StObject.set(x, "allowOutsideClick", js.undefined)
      
      inline def setCheckCanFocusTrap(value: /* containers */ js.Array[HTMLElement | SVGElement] => js.Promise[Unit]): Self = StObject.set(x, "checkCanFocusTrap", js.Any.fromFunction1(value))
      
      inline def setCheckCanFocusTrapUndefined: Self = StObject.set(x, "checkCanFocusTrap", js.undefined)
      
      inline def setCheckCanReturnFocus(value: /* trigger */ HTMLElement | SVGElement => js.Promise[Unit]): Self = StObject.set(x, "checkCanReturnFocus", js.Any.fromFunction1(value))
      
      inline def setCheckCanReturnFocusUndefined: Self = StObject.set(x, "checkCanReturnFocus", js.undefined)
      
      inline def setClickOutsideDeactivates(value: Boolean | MouseEventToBoolean): Self = StObject.set(x, "clickOutsideDeactivates", value.asInstanceOf[js.Any])
      
      inline def setClickOutsideDeactivatesFunction1(value: /* event */ MouseEvent | TouchEvent => Boolean): Self = StObject.set(x, "clickOutsideDeactivates", js.Any.fromFunction1(value))
      
      inline def setClickOutsideDeactivatesUndefined: Self = StObject.set(x, "clickOutsideDeactivates", js.undefined)
      
      inline def setDelayInitialFocus(value: Boolean): Self = StObject.set(x, "delayInitialFocus", value.asInstanceOf[js.Any])
      
      inline def setDelayInitialFocusUndefined: Self = StObject.set(x, "delayInitialFocus", js.undefined)
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setEscapeDeactivates(value: Boolean | KeyboardEventToBoolean): Self = StObject.set(x, "escapeDeactivates", value.asInstanceOf[js.Any])
      
      inline def setEscapeDeactivatesFunction1(value: /* event */ KeyboardEvent => Boolean): Self = StObject.set(x, "escapeDeactivates", js.Any.fromFunction1(value))
      
      inline def setEscapeDeactivatesUndefined: Self = StObject.set(x, "escapeDeactivates", js.undefined)
      
      inline def setFallbackFocus(value: FocusTarget): Self = StObject.set(x, "fallbackFocus", value.asInstanceOf[js.Any])
      
      inline def setFallbackFocusFunction0(value: () => FocusTargetValue): Self = StObject.set(x, "fallbackFocus", js.Any.fromFunction0(value))
      
      inline def setFallbackFocusUndefined: Self = StObject.set(x, "fallbackFocus", js.undefined)
      
      inline def setInitialFocus(value: FocusTargetOrFalse): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusFunction0(value: () => FocusTargetValueOrFalse): Self = StObject.set(x, "initialFocus", js.Any.fromFunction0(value))
      
      inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
      inline def setIsKeyBackward(value: /* event */ KeyboardEvent => Boolean): Self = StObject.set(x, "isKeyBackward", js.Any.fromFunction1(value))
      
      inline def setIsKeyBackwardUndefined: Self = StObject.set(x, "isKeyBackward", js.undefined)
      
      inline def setIsKeyForward(value: /* event */ KeyboardEvent => Boolean): Self = StObject.set(x, "isKeyForward", js.Any.fromFunction1(value))
      
      inline def setIsKeyForwardUndefined: Self = StObject.set(x, "isKeyForward", js.undefined)
      
      inline def setOnActivate(value: () => Unit): Self = StObject.set(x, "onActivate", js.Any.fromFunction0(value))
      
      inline def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
      
      inline def setOnDeactivate(value: () => Unit): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction0(value))
      
      inline def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
      
      inline def setOnPause(value: () => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPostActivate(value: () => Unit): Self = StObject.set(x, "onPostActivate", js.Any.fromFunction0(value))
      
      inline def setOnPostActivateUndefined: Self = StObject.set(x, "onPostActivate", js.undefined)
      
      inline def setOnPostDeactivate(value: () => Unit): Self = StObject.set(x, "onPostDeactivate", js.Any.fromFunction0(value))
      
      inline def setOnPostDeactivateUndefined: Self = StObject.set(x, "onPostDeactivate", js.undefined)
      
      inline def setOnPostPause(value: () => Unit): Self = StObject.set(x, "onPostPause", js.Any.fromFunction0(value))
      
      inline def setOnPostPauseUndefined: Self = StObject.set(x, "onPostPause", js.undefined)
      
      inline def setOnPostUnpause(value: () => Unit): Self = StObject.set(x, "onPostUnpause", js.Any.fromFunction0(value))
      
      inline def setOnPostUnpauseUndefined: Self = StObject.set(x, "onPostUnpause", js.undefined)
      
      inline def setOnUnpause(value: () => Unit): Self = StObject.set(x, "onUnpause", js.Any.fromFunction0(value))
      
      inline def setOnUnpauseUndefined: Self = StObject.set(x, "onUnpause", js.undefined)
      
      inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
      
      inline def setReturnFocusOnDeactivate(value: Boolean): Self = StObject.set(x, "returnFocusOnDeactivate", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusOnDeactivateUndefined: Self = StObject.set(x, "returnFocusOnDeactivate", js.undefined)
      
      inline def setSetReturnFocus(
        value: FocusTargetValueOrFalse | (js.Function1[
              /* nodeFocusedBeforeActivation */ HTMLElement | SVGElement, 
              FocusTargetValueOrFalse
            ])
      ): Self = StObject.set(x, "setReturnFocus", value.asInstanceOf[js.Any])
      
      inline def setSetReturnFocusFunction1(value: /* nodeFocusedBeforeActivation */ HTMLElement | SVGElement => FocusTargetValueOrFalse): Self = StObject.set(x, "setReturnFocus", js.Any.fromFunction1(value))
      
      inline def setSetReturnFocusUndefined: Self = StObject.set(x, "setReturnFocus", js.undefined)
      
      inline def setTabbableOptions(value: FocusTrapTabbableOptions): Self = StObject.set(x, "tabbableOptions", value.asInstanceOf[js.Any])
      
      inline def setTabbableOptionsUndefined: Self = StObject.set(x, "tabbableOptions", js.undefined)
      
      inline def setTrapStack(value: js.Array[FocusTrap]): Self = StObject.set(x, "trapStack", value.asInstanceOf[js.Any])
      
      inline def setTrapStackUndefined: Self = StObject.set(x, "trapStack", js.undefined)
      
      inline def setTrapStackVarargs(value: FocusTrap*): Self = StObject.set(x, "trapStack", js.Array(value*))
    }
  }
  
  /* Inlined std.Pick<focus-trap.focus-trap.Options, 'onPause' | 'onPostPause'> */
  trait PauseOptions extends StObject {
    
    var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPostPause: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object PauseOptions {
    
    inline def apply(): PauseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PauseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PauseOptions] (val x: Self) extends AnyVal {
      
      inline def setOnPause(value: () => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPostPause(value: () => Unit): Self = StObject.set(x, "onPostPause", js.Any.fromFunction0(value))
      
      inline def setOnPostPauseUndefined: Self = StObject.set(x, "onPostPause", js.undefined)
    }
  }
  
  /* Inlined std.Pick<focus-trap.focus-trap.Options, 'onUnpause' | 'onPostUnpause'> */
  trait UnpauseOptions extends StObject {
    
    var onPostUnpause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onUnpause: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object UnpauseOptions {
    
    inline def apply(): UnpauseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnpauseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnpauseOptions] (val x: Self) extends AnyVal {
      
      inline def setOnPostUnpause(value: () => Unit): Self = StObject.set(x, "onPostUnpause", js.Any.fromFunction0(value))
      
      inline def setOnPostUnpauseUndefined: Self = StObject.set(x, "onPostUnpause", js.undefined)
      
      inline def setOnUnpause(value: () => Unit): Self = StObject.set(x, "onUnpause", js.Any.fromFunction0(value))
      
      inline def setOnUnpauseUndefined: Self = StObject.set(x, "onUnpause", js.undefined)
    }
  }
}
