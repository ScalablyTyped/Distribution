package typings.fluentuiReactFocus.focusZoneTypesMod

import typings.fluentuiReactFocus.focusZoneFocusZoneMod.FocusZone
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.DragEvent
import typings.react.mod.ElementType
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TransitionEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.react.reactStrings.`additions text`
import typings.react.reactStrings.`inline`
import typings.react.reactStrings.additions
import typings.react.reactStrings.all
import typings.react.reactStrings.ascending
import typings.react.reactStrings.assertive
import typings.react.reactStrings.both
import typings.react.reactStrings.copy
import typings.react.reactStrings.date
import typings.react.reactStrings.decimal
import typings.react.reactStrings.descending
import typings.react.reactStrings.dialog
import typings.react.reactStrings.email
import typings.react.reactStrings.execute
import typings.react.reactStrings.grammar
import typings.react.reactStrings.grid
import typings.react.reactStrings.horizontal
import typings.react.reactStrings.inherit
import typings.react.reactStrings.link
import typings.react.reactStrings.list
import typings.react.reactStrings.listbox
import typings.react.reactStrings.location
import typings.react.reactStrings.menu
import typings.react.reactStrings.mixed
import typings.react.reactStrings.move
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.numeric
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.react.reactStrings.other
import typings.react.reactStrings.page
import typings.react.reactStrings.polite
import typings.react.reactStrings.popup
import typings.react.reactStrings.removals
import typings.react.reactStrings.search
import typings.react.reactStrings.spelling
import typings.react.reactStrings.step
import typings.react.reactStrings.tel
import typings.react.reactStrings.text
import typings.react.reactStrings.time
import typings.react.reactStrings.tree
import typings.react.reactStrings.url
import typings.react.reactStrings.vertical
import typings.react.reactStrings.yes
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFocusZoneProps extends HTMLAttributes[HTMLElement | FocusZone] {
  /** Allows focus to park on root when focus is in the `FocusZone` at render time. */
  var allowFocusRoot: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows tab key to be handled to tab through a list of items in the focus zone,
    * an unfortunate side effect is that users will not be able to tab out of the focus zone
    * and have to hit escape or some other key.
    * @deprecated Use `handleTabKey` instead.
    *
    */
  var allowTabKey: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the aria-describedby attribute.
    * @deprecated Directly use the `aria-describedby` attribute instead
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * Sets the aria-labelledby attribute.
    * @deprecated Directly use the `aria-labelledby` attribute instead
    */
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  /**
    * A component that should be used as the root element of the FocusZone component.
    */
  var as: js.UndefOr[ElementType[_]] = js.undefined
  /**
    * Determines whether to check for data-no-horizontal-wrap or data-no-vertical-wrap attributes
    * when determining how to move focus
    * @defaultvalue false
    */
  var checkForNoWrap: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional callback to access the IFocusZone interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IFocusZone]] = js.undefined
  /**
    * Optionally provide a selector for identifying the initial active element.
    * @deprecated Use `defaultTabbableElement` instead.
    */
  var defaultActiveElement: js.UndefOr[String] = js.undefined
  /**
    * Optionally defines the initial tabbable element inside the FocusZone.
    * If a string is passed then it is treated as a selector for identifying the initial tabbable element.
    * If a function is passed then it uses the root element as a parameter to return the initial tabbable element.
    */
  var defaultTabbableElement: js.UndefOr[String | (js.Function1[/* root */ HTMLElement, HTMLElement])] = js.undefined
  /**
    * Defines which arrows to react to.
    * @defaultvalue FocusZoneDirection.bidirectional
    */
  var direction: js.UndefOr[FocusZoneDirection] = js.undefined
  /**
    * If set, the FocusZone will not be tabbable and keyboard navigation will be disabled.
    * This does not affect disabled attribute of any child.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the FocusZone should allow focus events to propagate past the FocusZone.
    * @deprecated Use `stopFocusPropagation` instead.
    */
  var doNotAllowFocusEventToPropagate: js.UndefOr[Boolean] = js.undefined
  /**
    * Element type the root element will use. Default is "div".
    * @deprecated Use 'as' instead.
    */
  var elementType: js.UndefOr[js.Any] = js.undefined
  /**
    * Allows tab key to be handled to tab through a list of items in the focus zone,
    * an unfortunate side effect is that users will not be able to tab out of the focus zone
    * and have to hit escape or some other key.
    */
  var handleTabKey: js.UndefOr[FocusZoneTabbableElements] = js.undefined
  /**
    * If set, will cycle to the beginning of the targets once the user navigates to the
    * next target while at the end, and to the end when navigate to the previous at the beginning.
    */
  var isCircularNavigation: js.UndefOr[Boolean] = js.undefined
  /**
    * If provided, this callback will be executed on keypresses to determine if the user
    * intends to navigate into the inner zone. Returning true will ask the first inner zone to
    * set focus.
    * @deprecated Use `shouldEnterInnerZone` instead.
    */
  var isInnerZoneKeystroke: js.UndefOr[js.Function1[/* ev */ KeyboardEvent[HTMLElement], Boolean]] = js.undefined
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
  ] = js.undefined
  /**
    * Callback method for determining if focus should indeed be set on the given element.
    * @param element - The child element within the zone to focus.
    * @returns True if focus should be set to the given element, false to avoid setting focus.
    * @deprecated Use `shouldReceiveFocus` instead.
    */
  var onBeforeFocus: js.UndefOr[js.Function1[/* childElement */ js.UndefOr[HTMLElement], Boolean]] = js.undefined
  /**
    * Callback to notify creators that focus has been set on the FocusZone
    * @deprecated Use `onFocus` instead.
    */
  var onFocusNotification: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback called when "focus" event triggered in FocusZone.
    * @param event - React's original FocusEvent.
    */
  @JSName("onFocus")
  var onFocus_IFocusZoneProps: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLElement | FocusZone], Unit]] = js.undefined
  /**
    * Determines whether to disable the paging support for Page Up and Page Down keyboard scenarios.
    * @defaultvalue false
    */
  var pagingSupportDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, FocusZone prevents the default behavior of Keyboard events when changing focus between elements.
    * @defaultvalue false
    */
  var preventDefaultWhenHandled: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, prevents the FocusZone from attempting to restore the focus to the inner element when the focus is on the
    * root element after componentDidUpdate.
    * @defaultvalue false
    */
  var preventFocusRestoration: js.UndefOr[Boolean] = js.undefined
  /**
    * Deprecated at v1.12.1. DIV props provided to the FocusZone will be mixed into the root element.
    * @deprecated DIV props provided to the FocusZone will be mixed into the root element.
    */
  var rootProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  /**
    * Callback function that will be executed on keypresses to determine if the user intends to navigate into
    * the inner (nested) zone. Returning true will ask the first inner zone to set focus.
    */
  var shouldEnterInnerZone: js.UndefOr[js.Function1[/* ev */ KeyboardEvent[HTMLElement], Boolean]] = js.undefined
  /**
    * If true and FocusZone's root element (container) receives focus, the focus will land either on the
    * defaultTabbableElement (if set) or on the first tabbable element of this FocusZone.
    * Usually a case for nested focus zones, when the nested focus zone's container is a focusable element.
    */
  var shouldFocusInnerElementWhenReceivedFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if a default tabbable element should be force focused on FocusZone mount.
    * @default false
    */
  var shouldFocusOnMount: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback method to determine if the input element should lose focus on arrow keys
    *  @param inputElement - The input element which is to loose focus.
    *  @returns True if input element should loose focus or false otherwise.
    */
  var shouldInputLoseFocusOnArrowKey: js.UndefOr[js.Function1[/* inputElement */ HTMLInputElement, Boolean]] = js.undefined
  /**
    * Determines whether the FocusZone will walk up the DOM trying to invoke click callbacks on focusable elements on
    * Enter and Space keydowns to ensure accessibility for tags that don't guarantee this behavior.
    * @defaultvalue true
    */
  var shouldRaiseClicks: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback method for determining if focus should indeed be set on the given element.
    * @param element - The child element within the zone to focus.
    * @returns True if focus should be set to the given element, false to avoid setting focus.
    */
  var shouldReceiveFocus: js.UndefOr[js.Function1[/* childElement */ js.UndefOr[HTMLElement], Boolean]] = js.undefined
  /**
    * If true and TAB key is not handled by FocusZone, resets current active element to null value.
    * For example, when roving index is not desirable and focus should always reset to the default tabbable element.
    */
  var shouldResetActiveElementWhenTabFromZone: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the FocusZone should allow focus events to propagate past the FocusZone.
    */
  var stopFocusPropagation: js.UndefOr[Boolean] = js.undefined
}

object IFocusZoneProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    allowFocusRoot: js.UndefOr[Boolean] = js.undefined,
    allowTabKey: js.UndefOr[Boolean] = js.undefined,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: js.UndefOr[Double] = js.undefined,
    `aria-colindex`: js.UndefOr[Double] = js.undefined,
    `aria-colspan`: js.UndefOr[Double] = js.undefined,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: js.UndefOr[Double] = js.undefined,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: js.UndefOr[Double] = js.undefined,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: js.UndefOr[Double] = js.undefined,
    `aria-rowindex`: js.UndefOr[Double] = js.undefined,
    `aria-rowspan`: js.UndefOr[Double] = js.undefined,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: js.UndefOr[Double] = js.undefined,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: js.UndefOr[Double] = js.undefined,
    `aria-valuemin`: js.UndefOr[Double] = js.undefined,
    `aria-valuenow`: js.UndefOr[Double] = js.undefined,
    `aria-valuetext`: String = null,
    ariaDescribedBy: String = null,
    ariaLabelledBy: String = null,
    as: ElementType[_] = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    checkForNoWrap: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    componentRef: IRefObject[IFocusZone] = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Html = null,
    datatype: String = null,
    defaultActiveElement: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultTabbableElement: String | (js.Function1[/* root */ HTMLElement, HTMLElement]) = null,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    direction: FocusZoneDirection = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    doNotAllowFocusEventToPropagate: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Booleanish] = js.undefined,
    elementType: js.Any = null,
    handleTabKey: FocusZoneTabbableElements = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    isCircularNavigation: js.UndefOr[Boolean] = js.undefined,
    isInnerZoneKeystroke: /* ev */ KeyboardEvent[HTMLElement] => Boolean = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    onAbort: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onActiveElementChanged: (/* element */ js.UndefOr[HTMLElement], /* ev */ js.UndefOr[FocusEvent[HTMLElement]]) => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLElement | FocusZone] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLElement | FocusZone] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLElement | FocusZone] => Unit = null,
    onAuxClick: MouseEvent[HTMLElement | FocusZone, NativeMouseEvent] => Unit = null,
    onBeforeFocus: /* childElement */ js.UndefOr[HTMLElement] => Boolean = null,
    onBeforeInput: FormEvent[HTMLElement | FocusZone] => Unit = null,
    onBlur: FocusEvent[HTMLElement | FocusZone] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onChange: FormEvent[HTMLElement | FocusZone] => Unit = null,
    onClick: MouseEvent[HTMLElement | FocusZone, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLElement | FocusZone] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLElement | FocusZone] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLElement | FocusZone] => Unit = null,
    onContextMenu: MouseEvent[HTMLElement | FocusZone, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLElement | FocusZone] => Unit = null,
    onCut: ClipboardEvent[HTMLElement | FocusZone] => Unit = null,
    onDoubleClick: MouseEvent[HTMLElement | FocusZone, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLElement | FocusZone] => Unit = null,
    onDragEnd: DragEvent[HTMLElement | FocusZone] => Unit = null,
    onDragEnter: DragEvent[HTMLElement | FocusZone] => Unit = null,
    onDragExit: DragEvent[HTMLElement | FocusZone] => Unit = null,
    onDragLeave: DragEvent[HTMLElement | FocusZone] => Unit = null,
    onDragOver: DragEvent[HTMLElement | FocusZone] => Unit = null,
    onDragStart: DragEvent[HTMLElement | FocusZone] => Unit = null,
    onDrop: DragEvent[HTMLElement | FocusZone] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onEmptied: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onEnded: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onError: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onFocus: /* event */ FocusEvent[HTMLElement | FocusZone] => Unit = null,
    onFocusNotification: () => Unit = null,
    onInput: FormEvent[HTMLElement | FocusZone] => Unit = null,
    onInvalid: FormEvent[HTMLElement | FocusZone] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLElement | FocusZone] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLElement | FocusZone] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLElement | FocusZone] => Unit = null,
    onLoad: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onMouseDown: MouseEvent[HTMLElement | FocusZone, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLElement | FocusZone, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLElement | FocusZone, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLElement | FocusZone, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLElement | FocusZone, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLElement | FocusZone, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLElement | FocusZone, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLElement | FocusZone] => Unit = null,
    onPause: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onPlay: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onPlaying: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onPointerCancel: PointerEvent[HTMLElement | FocusZone] => Unit = null,
    onPointerDown: PointerEvent[HTMLElement | FocusZone] => Unit = null,
    onPointerEnter: PointerEvent[HTMLElement | FocusZone] => Unit = null,
    onPointerLeave: PointerEvent[HTMLElement | FocusZone] => Unit = null,
    onPointerMove: PointerEvent[HTMLElement | FocusZone] => Unit = null,
    onPointerOut: PointerEvent[HTMLElement | FocusZone] => Unit = null,
    onPointerOver: PointerEvent[HTMLElement | FocusZone] => Unit = null,
    onPointerUp: PointerEvent[HTMLElement | FocusZone] => Unit = null,
    onProgress: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onRateChange: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onReset: FormEvent[HTMLElement | FocusZone] => Unit = null,
    onScroll: UIEvent[HTMLElement | FocusZone, NativeUIEvent] => Unit = null,
    onSeeked: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onSeeking: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onSelect: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onStalled: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onSubmit: FormEvent[HTMLElement | FocusZone] => Unit = null,
    onSuspend: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onTouchCancel: TouchEvent[HTMLElement | FocusZone] => Unit = null,
    onTouchEnd: TouchEvent[HTMLElement | FocusZone] => Unit = null,
    onTouchMove: TouchEvent[HTMLElement | FocusZone] => Unit = null,
    onTouchStart: TouchEvent[HTMLElement | FocusZone] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLElement | FocusZone] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onWaiting: SyntheticEvent[HTMLElement | FocusZone, Event] => Unit = null,
    onWheel: WheelEvent[HTMLElement | FocusZone] => Unit = null,
    pagingSupportDisabled: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    prefix: String = null,
    preventDefaultWhenHandled: js.UndefOr[Boolean] = js.undefined,
    preventFocusRestoration: js.UndefOr[Boolean] = js.undefined,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: js.UndefOr[Double] = js.undefined,
    role: String = null,
    rootProps: HTMLAttributes[HTMLDivElement] = null,
    security: String = null,
    shouldEnterInnerZone: /* ev */ KeyboardEvent[HTMLElement] => Boolean = null,
    shouldFocusInnerElementWhenReceivedFocus: js.UndefOr[Boolean] = js.undefined,
    shouldFocusOnMount: js.UndefOr[Boolean] = js.undefined,
    shouldInputLoseFocusOnArrowKey: /* inputElement */ HTMLInputElement => Boolean = null,
    shouldRaiseClicks: js.UndefOr[Boolean] = js.undefined,
    shouldReceiveFocus: /* childElement */ js.UndefOr[HTMLElement] => Boolean = null,
    shouldResetActiveElementWhenTabFromZone: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    spellCheck: js.UndefOr[Booleanish] = js.undefined,
    stopFocusPropagation: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null
  ): IFocusZoneProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFocusRoot)) __obj.updateDynamic("allowFocusRoot")(allowFocusRoot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTabKey)) __obj.updateDynamic("allowTabKey")(allowTabKey.get.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.get.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.get.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colcount`)) __obj.updateDynamic("aria-colcount")(`aria-colcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colindex`)) __obj.updateDynamic("aria-colindex")(`aria-colindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colspan`)) __obj.updateDynamic("aria-colspan")(`aria-colspan`.get.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.get.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.get.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.get.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.get.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-level`)) __obj.updateDynamic("aria-level")(`aria-level`.get.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.get.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-posinset`)) __obj.updateDynamic("aria-posinset")(`aria-posinset`.get.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.get.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.get.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowcount`)) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowindex`)) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowspan`)) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-setsize`)) __obj.updateDynamic("aria-setsize")(`aria-setsize`.get.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemax`)) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemin`)) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuenow`)) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.get.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (!js.isUndefined(checkForNoWrap)) __obj.updateDynamic("checkForNoWrap")(checkForNoWrap.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (defaultActiveElement != null) __obj.updateDynamic("defaultActiveElement")(defaultActiveElement.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (defaultTabbableElement != null) __obj.updateDynamic("defaultTabbableElement")(defaultTabbableElement.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotAllowFocusEventToPropagate)) __obj.updateDynamic("doNotAllowFocusEventToPropagate")(doNotAllowFocusEventToPropagate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (handleTabKey != null) __obj.updateDynamic("handleTabKey")(handleTabKey.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (!js.isUndefined(isCircularNavigation)) __obj.updateDynamic("isCircularNavigation")(isCircularNavigation.get.asInstanceOf[js.Any])
    if (isInnerZoneKeystroke != null) __obj.updateDynamic("isInnerZoneKeystroke")(js.Any.fromFunction1(isInnerZoneKeystroke))
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onActiveElementChanged != null) __obj.updateDynamic("onActiveElementChanged")(js.Any.fromFunction2(onActiveElementChanged))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeFocus != null) __obj.updateDynamic("onBeforeFocus")(js.Any.fromFunction1(onBeforeFocus))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onFocusNotification != null) __obj.updateDynamic("onFocusNotification")(js.Any.fromFunction0(onFocusNotification))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (!js.isUndefined(pagingSupportDisabled)) __obj.updateDynamic("pagingSupportDisabled")(pagingSupportDisabled.get.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDefaultWhenHandled)) __obj.updateDynamic("preventDefaultWhenHandled")(preventDefaultWhenHandled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventFocusRestoration)) __obj.updateDynamic("preventFocusRestoration")(preventFocusRestoration.get.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rootProps != null) __obj.updateDynamic("rootProps")(rootProps.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (shouldEnterInnerZone != null) __obj.updateDynamic("shouldEnterInnerZone")(js.Any.fromFunction1(shouldEnterInnerZone))
    if (!js.isUndefined(shouldFocusInnerElementWhenReceivedFocus)) __obj.updateDynamic("shouldFocusInnerElementWhenReceivedFocus")(shouldFocusInnerElementWhenReceivedFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusOnMount)) __obj.updateDynamic("shouldFocusOnMount")(shouldFocusOnMount.get.asInstanceOf[js.Any])
    if (shouldInputLoseFocusOnArrowKey != null) __obj.updateDynamic("shouldInputLoseFocusOnArrowKey")(js.Any.fromFunction1(shouldInputLoseFocusOnArrowKey))
    if (!js.isUndefined(shouldRaiseClicks)) __obj.updateDynamic("shouldRaiseClicks")(shouldRaiseClicks.get.asInstanceOf[js.Any])
    if (shouldReceiveFocus != null) __obj.updateDynamic("shouldReceiveFocus")(js.Any.fromFunction1(shouldReceiveFocus))
    if (!js.isUndefined(shouldResetActiveElementWhenTabFromZone)) __obj.updateDynamic("shouldResetActiveElementWhenTabFromZone")(shouldResetActiveElementWhenTabFromZone.get.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopFocusPropagation)) __obj.updateDynamic("stopFocusPropagation")(stopFocusPropagation.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFocusZoneProps]
  }
}

