package typings.fluentuiReactFocus.focusZoneTypesMod

import typings.fluentuiReactFocus.focusZoneFocusZoneMod.FocusZone
import typings.react.mod.ElementType
import typings.react.mod.FocusEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFocusZoneProps extends HTMLAttributes[HTMLElement | FocusZone] {
  
  /** Allows focus to park on root when focus is in the `FocusZone` at render time. */
  var allowFocusRoot: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows tab key to be handled to tab through a list of items in the focus zone,
    * an unfortunate side effect is that users will not be able to tab out of the focus zone
    * and have to hit escape or some other key.
    * @deprecated Use `handleTabKey` instead.
    *
    */
  var allowTabKey: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the aria-describedby attribute.
    * @deprecated Directly use the `aria-describedby` attribute instead
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  
  /**
    * Sets the aria-labelledby attribute.
    * @deprecated Directly use the `aria-labelledby` attribute instead
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  
  /**
    * A component that should be used as the root element of the FocusZone component.
    */
  var as: js.UndefOr[ElementType[_]] = js.native
  
  /**
    * Determines whether to check for data-no-horizontal-wrap or data-no-vertical-wrap attributes
    * when determining how to move focus
    * @defaultvalue false
    */
  var checkForNoWrap: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional callback to access the IFocusZone interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IFocusZone]] = js.native
  
  /**
    * Optionally provide a selector for identifying the initial active element.
    * @deprecated Use `defaultTabbableElement` instead.
    */
  var defaultActiveElement: js.UndefOr[String] = js.native
  
  /**
    * Optionally defines the initial tabbable element inside the FocusZone.
    * If a string is passed then it is treated as a selector for identifying the initial tabbable element.
    * If a function is passed then it uses the root element as a parameter to return the initial tabbable element.
    */
  var defaultTabbableElement: js.UndefOr[String | (js.Function1[/* root */ HTMLElement, HTMLElement])] = js.native
  
  /**
    * Defines which arrows to react to.
    * @defaultvalue FocusZoneDirection.bidirectional
    */
  var direction: js.UndefOr[FocusZoneDirection] = js.native
  
  /**
    * If set, the FocusZone will not be tabbable and keyboard navigation will be disabled.
    * This does not affect disabled attribute of any child.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the FocusZone should allow focus events to propagate past the FocusZone.
    * @deprecated Use `stopFocusPropagation` instead.
    */
  var doNotAllowFocusEventToPropagate: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional callback to access the root DOM element.
    * @deprecated Temporary solution which will be replaced with ref in the V8 release.
    */
  var elementRef: js.UndefOr[Ref[HTMLElement]] = js.native
  
  /**
    * Element type the root element will use. Default is "div".
    * @deprecated Use 'as' instead.
    */
  var elementType: js.UndefOr[js.Any] = js.native
  
  /**
    * Allows tab key to be handled to tab through a list of items in the focus zone,
    * an unfortunate side effect is that users will not be able to tab out of the focus zone
    * and have to hit escape or some other key.
    */
  var handleTabKey: js.UndefOr[FocusZoneTabbableElements] = js.native
  
  /**
    * If set, will cycle to the beginning of the targets once the user navigates to the
    * next target while at the end, and to the end when navigate to the previous at the beginning.
    */
  var isCircularNavigation: js.UndefOr[Boolean] = js.native
  
  /**
    * If provided, this callback will be executed on keypresses to determine if the user
    * intends to navigate into the inner zone. Returning true will ask the first inner zone to
    * set focus.
    * @deprecated Use `shouldEnterInnerZone` instead.
    */
  var isInnerZoneKeystroke: js.UndefOr[js.Function1[/* ev */ KeyboardEvent[HTMLElement], Boolean]] = js.native
  
  /**
    * Callback for when one of immediate children elements gets active by getting focused
    * or by having one of its respective children elements focused.
    */
  var onActiveElementChanged: js.UndefOr[
    js.Function2[
      /* element */ js.UndefOr[HTMLElement], 
      /* ev */ js.UndefOr[FocusEvent[HTMLElement]], 
      Unit
    ]
  ] = js.native
  
  /**
    * Callback method for determining if focus should indeed be set on the given element.
    * @param element - The child element within the zone to focus.
    * @returns True if focus should be set to the given element, false to avoid setting focus.
    * @deprecated Use `shouldReceiveFocus` instead.
    */
  var onBeforeFocus: js.UndefOr[js.Function1[/* childElement */ js.UndefOr[HTMLElement], Boolean]] = js.native
  
  /**
    * Callback to notify creators that focus has been set on the FocusZone
    * @deprecated Use `onFocus` instead.
    */
  var onFocusNotification: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback called when "focus" event triggered in FocusZone.
    * @param event - React's original FocusEvent.
    */
  @JSName("onFocus")
  var onFocus_IFocusZoneProps: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLElement | FocusZone], Unit]] = js.native
  
  /**
    * Determines whether to disable the paging support for Page Up and Page Down keyboard scenarios.
    * @defaultvalue false
    */
  var pagingSupportDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, FocusZone prevents the default behavior of Keyboard events when changing focus between elements.
    * @defaultvalue false
    */
  var preventDefaultWhenHandled: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, prevents the FocusZone from attempting to restore the focus to the inner element when the focus is on the
    * root element after componentDidUpdate.
    * @defaultvalue false
    */
  var preventFocusRestoration: js.UndefOr[Boolean] = js.native
  
  /**
    * Deprecated at v1.12.1. DIV props provided to the FocusZone will be mixed into the root element.
    * @deprecated DIV props provided to the FocusZone will be mixed into the root element.
    */
  var rootProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  
  /**
    * Callback function that will be executed on keypresses to determine if the user intends to navigate into
    * the inner (nested) zone. Returning true will ask the first inner zone to set focus.
    */
  var shouldEnterInnerZone: js.UndefOr[js.Function1[/* ev */ KeyboardEvent[HTMLElement], Boolean]] = js.native
  
  /**
    * If true and FocusZone's root element (container) receives focus, the focus will land either on the
    * defaultTabbableElement (if set) or on the first tabbable element of this FocusZone.
    * Usually a case for nested focus zones, when the nested focus zone's container is a focusable element.
    */
  var shouldFocusInnerElementWhenReceivedFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines if a default tabbable element should be force focused on FocusZone mount.
    * @default false
    */
  var shouldFocusOnMount: js.UndefOr[Boolean] = js.native
  
  /**
    * A callback method to determine if the input element should lose focus on arrow keys
    *  @param inputElement - The input element which is to loose focus.
    *  @returns True if input element should loose focus or false otherwise.
    */
  var shouldInputLoseFocusOnArrowKey: js.UndefOr[js.Function1[/* inputElement */ HTMLInputElement, Boolean]] = js.native
  
  /**
    * Determines whether the FocusZone will walk up the DOM trying to invoke click callbacks on focusable elements on
    * Enter and Space keydowns to ensure accessibility for tags that don't guarantee this behavior.
    * @defaultvalue true
    */
  var shouldRaiseClicks: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback method for determining if focus should indeed be set on the given element.
    * @param element - The child element within the zone to focus.
    * @returns True if focus should be set to the given element, false to avoid setting focus.
    */
  var shouldReceiveFocus: js.UndefOr[js.Function1[/* childElement */ js.UndefOr[HTMLElement], Boolean]] = js.native
  
  /**
    * If true and TAB key is not handled by FocusZone, resets current active element to null value.
    * For example, when roving index is not desirable and focus should always reset to the default tabbable element.
    */
  var shouldResetActiveElementWhenTabFromZone: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the FocusZone should allow focus events to propagate past the FocusZone.
    */
  var stopFocusPropagation: js.UndefOr[Boolean] = js.native
}
object IFocusZoneProps {
  
  @scala.inline
  def apply(): IFocusZoneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFocusZoneProps]
  }
  
  @scala.inline
  implicit class IFocusZonePropsOps[Self <: IFocusZoneProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowFocusRoot(value: Boolean): Self = this.set("allowFocusRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFocusRoot: Self = this.set("allowFocusRoot", js.undefined)
    
    @scala.inline
    def setAllowTabKey(value: Boolean): Self = this.set("allowTabKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTabKey: Self = this.set("allowTabKey", js.undefined)
    
    @scala.inline
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    
    @scala.inline
    def setAs(value: ElementType[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setCheckForNoWrap(value: Boolean): Self = this.set("checkForNoWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckForNoWrap: Self = this.set("checkForNoWrap", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IFocusZone | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IFocusZone]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDefaultActiveElement(value: String): Self = this.set("defaultActiveElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveElement: Self = this.set("defaultActiveElement", js.undefined)
    
    @scala.inline
    def setDefaultTabbableElementFunction1(value: /* root */ HTMLElement => HTMLElement): Self = this.set("defaultTabbableElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultTabbableElement(value: String | (js.Function1[/* root */ HTMLElement, HTMLElement])): Self = this.set("defaultTabbableElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTabbableElement: Self = this.set("defaultTabbableElement", js.undefined)
    
    @scala.inline
    def setDirection(value: FocusZoneDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDoNotAllowFocusEventToPropagate(value: Boolean): Self = this.set("doNotAllowFocusEventToPropagate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotAllowFocusEventToPropagate: Self = this.set("doNotAllowFocusEventToPropagate", js.undefined)
    
    @scala.inline
    def setElementRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("elementRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementRef(value: Ref[HTMLElement]): Self = this.set("elementRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementRef: Self = this.set("elementRef", js.undefined)
    
    @scala.inline
    def setElementRefNull: Self = this.set("elementRef", null)
    
    @scala.inline
    def setElementType(value: js.Any): Self = this.set("elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementType: Self = this.set("elementType", js.undefined)
    
    @scala.inline
    def setHandleTabKey(value: FocusZoneTabbableElements): Self = this.set("handleTabKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleTabKey: Self = this.set("handleTabKey", js.undefined)
    
    @scala.inline
    def setIsCircularNavigation(value: Boolean): Self = this.set("isCircularNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCircularNavigation: Self = this.set("isCircularNavigation", js.undefined)
    
    @scala.inline
    def setIsInnerZoneKeystroke(value: /* ev */ KeyboardEvent[HTMLElement] => Boolean): Self = this.set("isInnerZoneKeystroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsInnerZoneKeystroke: Self = this.set("isInnerZoneKeystroke", js.undefined)
    
    @scala.inline
    def setOnActiveElementChanged(
      value: (/* element */ js.UndefOr[HTMLElement], /* ev */ js.UndefOr[FocusEvent[HTMLElement]]) => Unit
    ): Self = this.set("onActiveElementChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnActiveElementChanged: Self = this.set("onActiveElementChanged", js.undefined)
    
    @scala.inline
    def setOnBeforeFocus(value: /* childElement */ js.UndefOr[HTMLElement] => Boolean): Self = this.set("onBeforeFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeFocus: Self = this.set("onBeforeFocus", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* event */ FocusEvent[HTMLElement | FocusZone] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnFocusNotification(value: () => Unit): Self = this.set("onFocusNotification", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFocusNotification: Self = this.set("onFocusNotification", js.undefined)
    
    @scala.inline
    def setPagingSupportDisabled(value: Boolean): Self = this.set("pagingSupportDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagingSupportDisabled: Self = this.set("pagingSupportDisabled", js.undefined)
    
    @scala.inline
    def setPreventDefaultWhenHandled(value: Boolean): Self = this.set("preventDefaultWhenHandled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefaultWhenHandled: Self = this.set("preventDefaultWhenHandled", js.undefined)
    
    @scala.inline
    def setPreventFocusRestoration(value: Boolean): Self = this.set("preventFocusRestoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventFocusRestoration: Self = this.set("preventFocusRestoration", js.undefined)
    
    @scala.inline
    def setRootProps(value: HTMLAttributes[HTMLDivElement]): Self = this.set("rootProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootProps: Self = this.set("rootProps", js.undefined)
    
    @scala.inline
    def setShouldEnterInnerZone(value: /* ev */ KeyboardEvent[HTMLElement] => Boolean): Self = this.set("shouldEnterInnerZone", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldEnterInnerZone: Self = this.set("shouldEnterInnerZone", js.undefined)
    
    @scala.inline
    def setShouldFocusInnerElementWhenReceivedFocus(value: Boolean): Self = this.set("shouldFocusInnerElementWhenReceivedFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldFocusInnerElementWhenReceivedFocus: Self = this.set("shouldFocusInnerElementWhenReceivedFocus", js.undefined)
    
    @scala.inline
    def setShouldFocusOnMount(value: Boolean): Self = this.set("shouldFocusOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldFocusOnMount: Self = this.set("shouldFocusOnMount", js.undefined)
    
    @scala.inline
    def setShouldInputLoseFocusOnArrowKey(value: /* inputElement */ HTMLInputElement => Boolean): Self = this.set("shouldInputLoseFocusOnArrowKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldInputLoseFocusOnArrowKey: Self = this.set("shouldInputLoseFocusOnArrowKey", js.undefined)
    
    @scala.inline
    def setShouldRaiseClicks(value: Boolean): Self = this.set("shouldRaiseClicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRaiseClicks: Self = this.set("shouldRaiseClicks", js.undefined)
    
    @scala.inline
    def setShouldReceiveFocus(value: /* childElement */ js.UndefOr[HTMLElement] => Boolean): Self = this.set("shouldReceiveFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldReceiveFocus: Self = this.set("shouldReceiveFocus", js.undefined)
    
    @scala.inline
    def setShouldResetActiveElementWhenTabFromZone(value: Boolean): Self = this.set("shouldResetActiveElementWhenTabFromZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldResetActiveElementWhenTabFromZone: Self = this.set("shouldResetActiveElementWhenTabFromZone", js.undefined)
    
    @scala.inline
    def setStopFocusPropagation(value: Boolean): Self = this.set("stopFocusPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopFocusPropagation: Self = this.set("stopFocusPropagation", js.undefined)
  }
}
