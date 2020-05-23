package typings.fundamentalReact.listMod

import typings.fundamentalReact.fundamentalReactStrings.`additions text`
import typings.fundamentalReact.fundamentalReactStrings.`inline`
import typings.fundamentalReact.fundamentalReactStrings.additions
import typings.fundamentalReact.fundamentalReactStrings.all
import typings.fundamentalReact.fundamentalReactStrings.ascending
import typings.fundamentalReact.fundamentalReactStrings.assertive
import typings.fundamentalReact.fundamentalReactStrings.both
import typings.fundamentalReact.fundamentalReactStrings.copy
import typings.fundamentalReact.fundamentalReactStrings.date
import typings.fundamentalReact.fundamentalReactStrings.decimal
import typings.fundamentalReact.fundamentalReactStrings.descending
import typings.fundamentalReact.fundamentalReactStrings.dialog
import typings.fundamentalReact.fundamentalReactStrings.email
import typings.fundamentalReact.fundamentalReactStrings.execute
import typings.fundamentalReact.fundamentalReactStrings.grammar
import typings.fundamentalReact.fundamentalReactStrings.grid
import typings.fundamentalReact.fundamentalReactStrings.horizontal
import typings.fundamentalReact.fundamentalReactStrings.inherit
import typings.fundamentalReact.fundamentalReactStrings.link_
import typings.fundamentalReact.fundamentalReactStrings.list_
import typings.fundamentalReact.fundamentalReactStrings.listbox
import typings.fundamentalReact.fundamentalReactStrings.location
import typings.fundamentalReact.fundamentalReactStrings.menu_
import typings.fundamentalReact.fundamentalReactStrings.mixed
import typings.fundamentalReact.fundamentalReactStrings.move
import typings.fundamentalReact.fundamentalReactStrings.no
import typings.fundamentalReact.fundamentalReactStrings.none
import typings.fundamentalReact.fundamentalReactStrings.numeric
import typings.fundamentalReact.fundamentalReactStrings.off
import typings.fundamentalReact.fundamentalReactStrings.on
import typings.fundamentalReact.fundamentalReactStrings.other
import typings.fundamentalReact.fundamentalReactStrings.page
import typings.fundamentalReact.fundamentalReactStrings.polite
import typings.fundamentalReact.fundamentalReactStrings.popup
import typings.fundamentalReact.fundamentalReactStrings.removals
import typings.fundamentalReact.fundamentalReactStrings.search
import typings.fundamentalReact.fundamentalReactStrings.spelling
import typings.fundamentalReact.fundamentalReactStrings.step
import typings.fundamentalReact.fundamentalReactStrings.tel
import typings.fundamentalReact.fundamentalReactStrings.text
import typings.fundamentalReact.fundamentalReactStrings.time_
import typings.fundamentalReact.fundamentalReactStrings.tree
import typings.fundamentalReact.fundamentalReactStrings.url
import typings.fundamentalReact.fundamentalReactStrings.vertical
import typings.fundamentalReact.fundamentalReactStrings.yes
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.std.Event
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  className ? :string,   compact ? :boolean,   disableStyles ? :boolean,   noBorder ? :boolean,   ref ? :react.react.Ref<std.HTMLAnchorElement>} & react.react.HTMLAttributes<std.HTMLAnchorElement> */
trait ListProps extends js.Object {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.undefined
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.undefined
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list_ | both] = js.undefined
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.undefined
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time_] = js.undefined
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.undefined
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link_ | move | popup] = js.undefined
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu_ | listbox | tree | grid | dialog] = js.undefined
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.undefined
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Double] = js.undefined
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.undefined
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  // Living Standard
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var noBorder: js.UndefOr[Boolean] = js.undefined
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLAnchorElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLAnchorElement]] = js.undefined
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLAnchorElement]] = js.undefined
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLAnchorElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLAnchorElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLAnchorElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLAnchorElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLAnchorElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLAnchorElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[HTMLAnchorElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLAnchorElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLAnchorElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLAnchorElement]] = js.undefined
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLAnchorElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[HTMLAnchorElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLAnchorElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLAnchorElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLAnchorElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLAnchorElement]] = js.undefined
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLAnchorElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[HTMLAnchorElement]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  // Unknown
  var radioGroup: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list_ | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: js.UndefOr[Double] = js.undefined,
    `aria-colindex`: js.UndefOr[Double] = js.undefined,
    `aria-colspan`: js.UndefOr[Double] = js.undefined,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time_ = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link_ | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu_ | listbox | tree | grid | dialog = null,
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
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Booleanish] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    noBorder: js.UndefOr[Boolean] = js.undefined,
    onAbort: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLAnchorElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLAnchorElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLAnchorElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLAnchorElement] => Unit = null,
    onBlur: FocusEvent[HTMLAnchorElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onChange: FormEvent[HTMLAnchorElement] => Unit = null,
    onClick: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLAnchorElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLAnchorElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLAnchorElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLAnchorElement] => Unit = null,
    onCut: ClipboardEvent[HTMLAnchorElement] => Unit = null,
    onDoubleClick: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLAnchorElement] => Unit = null,
    onDragEnd: DragEvent[HTMLAnchorElement] => Unit = null,
    onDragEnter: DragEvent[HTMLAnchorElement] => Unit = null,
    onDragExit: DragEvent[HTMLAnchorElement] => Unit = null,
    onDragLeave: DragEvent[HTMLAnchorElement] => Unit = null,
    onDragOver: DragEvent[HTMLAnchorElement] => Unit = null,
    onDragStart: DragEvent[HTMLAnchorElement] => Unit = null,
    onDrop: DragEvent[HTMLAnchorElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onEmptied: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onEnded: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onError: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onFocus: FocusEvent[HTMLAnchorElement] => Unit = null,
    onInput: FormEvent[HTMLAnchorElement] => Unit = null,
    onInvalid: FormEvent[HTMLAnchorElement] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLAnchorElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLAnchorElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLAnchorElement] => Unit = null,
    onLoad: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onMouseDown: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLAnchorElement] => Unit = null,
    onPause: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onPlay: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onPlaying: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onPointerCancel: PointerEvent[HTMLAnchorElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLAnchorElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLAnchorElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLAnchorElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLAnchorElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLAnchorElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLAnchorElement] => Unit = null,
    onPointerUp: PointerEvent[HTMLAnchorElement] => Unit = null,
    onProgress: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onRateChange: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onReset: FormEvent[HTMLAnchorElement] => Unit = null,
    onScroll: UIEvent[HTMLAnchorElement, NativeUIEvent] => Unit = null,
    onSeeked: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onSeeking: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onSelect: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onStalled: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onSubmit: FormEvent[HTMLAnchorElement] => Unit = null,
    onSuspend: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onTouchCancel: TouchEvent[HTMLAnchorElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLAnchorElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLAnchorElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLAnchorElement] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLAnchorElement] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onWaiting: SyntheticEvent[HTMLAnchorElement, Event] => Unit = null,
    onWheel: WheelEvent[HTMLAnchorElement] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    ref: js.UndefOr[Null | Ref[HTMLAnchorElement]] = js.undefined,
    resource: String = null,
    results: js.UndefOr[Double] = js.undefined,
    role: String = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Booleanish] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
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
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorder)) __obj.updateDynamic("noBorder")(noBorder.get.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
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
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
}

