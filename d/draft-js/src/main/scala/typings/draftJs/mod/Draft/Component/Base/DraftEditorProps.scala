package typings.draftJs.mod.Draft.Component.Base

import typings.draftJs.mod.Draft.Model.Constants.DraftDragType
import typings.draftJs.mod.Draft.Model.Constants.DraftHandleValue
import typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock
import typings.draftJs.mod.Draft.Model.ImmutableData.DraftInlineStyle
import typings.draftJs.mod.Draft.Model.ImmutableData.EditorState
import typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState
import typings.draftJs.mod.SyntheticEvent
import typings.draftJs.mod.SyntheticKeyboardEvent
import typings.react.mod.CSSProperties
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraftEditorProps extends js.Object {
  var ariaActiveDescendantID: js.UndefOr[String] = js.native
  var ariaAutoComplete: js.UndefOr[String] = js.native
  var ariaControls: js.UndefOr[String] = js.native
  var ariaDescribedBy: js.UndefOr[String] = js.native
  var ariaExpanded: js.UndefOr[Boolean] = js.native
  var ariaLabel: js.UndefOr[String] = js.native
  var ariaLabelledBy: js.UndefOr[String] = js.native
  var ariaMultiline: js.UndefOr[Boolean] = js.native
  var ariaOwneeID: js.UndefOr[String] = js.native
  // exposed especially to help improve mobile web behaviors
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  /**
    * Provide a map of block rendering configurations. Each block type maps to
    * an element tag and an optional react element wrapper. This configuration
    * is used for both rendering and paste processing.
    */
  var blockRenderMap: js.UndefOr[DraftBlockRenderMap] = js.native
  /**
    * For a given `ContentBlock` object, return an object that specifies
    * a custom block component and/or props. If no object is returned,
    * the default `TextEditorBlock` is used.
    */
  var blockRendererFn: js.UndefOr[js.Function1[/* block */ ContentBlock, _]] = js.native
  /**
    * Function that allows to define class names to apply to the given block when it is rendered.
    */
  var blockStyleFn: js.UndefOr[js.Function1[/* block */ ContentBlock, String]] = js.native
  /**
    * Define a function to transform inline styles to CSS objects
    * that are applied to spans of text.
    */
  var customStyleFn: js.UndefOr[
    js.Function2[/* style */ DraftInlineStyle, /* block */ ContentBlock, CSSProperties]
  ] = js.native
  /**
    * Provide a map of inline style names corresponding to CSS style objects
    * that will be rendered for matching ranges.
    */
  var customStyleMap: js.UndefOr[DraftStyleMap] = js.native
  /**
    * If using server-side rendering, this prop is required to be set to
    * avoid client/server mismatches.
    */
  var editorKey: js.UndefOr[String] = js.native
  var editorState: EditorState = js.native
  /**
    * Handle intended text insertion before the insertion occurs. This may be
    * useful in cases where the user has entered characters that you would like
    * to trigger some special behavior. E.g. immediately converting `:)` to an
    * emoji Unicode character, or replacing ASCII quote characters with smart
    * quotes.
    */
  var handleBeforeInput: js.UndefOr[
    js.Function3[
      /* chars */ String, 
      /* editorState */ EditorState, 
      /* eventTimeStamp */ Double, 
      DraftHandleValue
    ]
  ] = js.native
  /** Handle other drops to prevent default text movement/insertion behaviour */
  var handleDrop: js.UndefOr[
    js.Function3[
      /* selection */ SelectionState, 
      /* dataTransfer */ js.Object, 
      /* isInternal */ DraftDragType, 
      DraftHandleValue
    ]
  ] = js.native
  /** Handle dropped files */
  var handleDroppedFiles: js.UndefOr[
    js.Function2[/* selection */ SelectionState, /* files */ js.Array[Blob], DraftHandleValue]
  ] = js.native
  /**
    * Map a key command string provided by your key binding function to a
    * specified behavior.
    */
  var handleKeyCommand: js.UndefOr[
    js.Function3[
      /* command */ EditorCommand, 
      /* editorState */ EditorState, 
      /* eventTimeStamp */ Double, 
      DraftHandleValue
    ]
  ] = js.native
  var handlePastedFiles: js.UndefOr[js.Function1[/* files */ js.Array[Blob], DraftHandleValue]] = js.native
  var handlePastedText: js.UndefOr[
    js.Function3[
      /* text */ String, 
      /* html */ js.UndefOr[String], 
      /* editorState */ EditorState, 
      DraftHandleValue
    ]
  ] = js.native
  // Cancelable event handlers, handled from the top level down. A handler
  // that returns `handled` will be the last handler to execute for that event.
  /**
    * Useful for managing special behavior for pressing the `Return` key. E.g.
    * removing the style from an empty list item.
    */
  var handleReturn: js.UndefOr[
    js.Function2[/* e */ SyntheticKeyboardEvent, /* editorState */ EditorState, DraftHandleValue]
  ] = js.native
  /**
    * A function that accepts a synthetic key event and returns
    * the matching DraftEditorCommand constant, or null if no command should
    * be invoked.
    */
  var keyBindingFn: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, EditorCommand | Null]] = js.native
  var onBlur: js.UndefOr[js.Function1[/* e */ SyntheticEvent, Unit]] = js.native
  var onDownArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.native
  // Non-cancelable event triggers.
  var onEscape: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticEvent, Unit]] = js.native
  var onLeftArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.native
  var onRightArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.native
  var onTab: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.native
  var onUpArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Set whether the `DraftEditor` component should be editable. Useful for
    * temporarily disabling edit behavior or allowing `DraftEditor` rendering
    * to be used for consumption purposes.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String] = js.native
  /**
    * Note: spellcheck is always disabled for IE. If enabled in Safari, OSX
    * autocorrect is enabled as well.
    */
  var spellCheck: js.UndefOr[Boolean] = js.native
  /**
    * Set whether to remove all style information from pasted content. If your
    * use case should not have any block or inline styles, it is recommended
    * that you set this to `true`.
    */
  var stripPastedStyles: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * Specify whether text alignment should be forced in a direction
    * regardless of input characters.
    */
  var textAlignment: js.UndefOr[DraftTextAlignment] = js.native
  /**
    * Specify whether text directionality should be forced in a direction
    * regardless of input characters.
    */
  var textDirectionality: js.UndefOr[DraftTextDirectionality] = js.native
  var webDriverTestID: js.UndefOr[String] = js.native
  def onChange(editorState: EditorState): Unit = js.native
}

object DraftEditorProps {
  @scala.inline
  def apply(editorState: EditorState, onChange: EditorState => Unit): DraftEditorProps = {
    val __obj = js.Dynamic.literal(editorState = editorState.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[DraftEditorProps]
  }
  @scala.inline
  implicit class DraftEditorPropsOps[Self <: DraftEditorProps] (val x: Self) extends AnyVal {
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
    def setEditorState(value: EditorState): Self = this.set("editorState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: EditorState => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setAriaActiveDescendantID(value: String): Self = this.set("ariaActiveDescendantID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaActiveDescendantID: Self = this.set("ariaActiveDescendantID", js.undefined)
    @scala.inline
    def setAriaAutoComplete(value: String): Self = this.set("ariaAutoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaAutoComplete: Self = this.set("ariaAutoComplete", js.undefined)
    @scala.inline
    def setAriaControls(value: String): Self = this.set("ariaControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaControls: Self = this.set("ariaControls", js.undefined)
    @scala.inline
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    @scala.inline
    def setAriaExpanded(value: Boolean): Self = this.set("ariaExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaExpanded: Self = this.set("ariaExpanded", js.undefined)
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    @scala.inline
    def setAriaMultiline(value: Boolean): Self = this.set("ariaMultiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaMultiline: Self = this.set("ariaMultiline", js.undefined)
    @scala.inline
    def setAriaOwneeID(value: String): Self = this.set("ariaOwneeID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaOwneeID: Self = this.set("ariaOwneeID", js.undefined)
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setBlockRenderMap(value: DraftBlockRenderMap): Self = this.set("blockRenderMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockRenderMap: Self = this.set("blockRenderMap", js.undefined)
    @scala.inline
    def setBlockRendererFn(value: /* block */ ContentBlock => _): Self = this.set("blockRendererFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBlockRendererFn: Self = this.set("blockRendererFn", js.undefined)
    @scala.inline
    def setBlockStyleFn(value: /* block */ ContentBlock => String): Self = this.set("blockStyleFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBlockStyleFn: Self = this.set("blockStyleFn", js.undefined)
    @scala.inline
    def setCustomStyleFn(value: (/* style */ DraftInlineStyle, /* block */ ContentBlock) => CSSProperties): Self = this.set("customStyleFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomStyleFn: Self = this.set("customStyleFn", js.undefined)
    @scala.inline
    def setCustomStyleMap(value: DraftStyleMap): Self = this.set("customStyleMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomStyleMap: Self = this.set("customStyleMap", js.undefined)
    @scala.inline
    def setEditorKey(value: String): Self = this.set("editorKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorKey: Self = this.set("editorKey", js.undefined)
    @scala.inline
    def setHandleBeforeInput(
      value: (/* chars */ String, /* editorState */ EditorState, /* eventTimeStamp */ Double) => DraftHandleValue
    ): Self = this.set("handleBeforeInput", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHandleBeforeInput: Self = this.set("handleBeforeInput", js.undefined)
    @scala.inline
    def setHandleDrop(
      value: (/* selection */ SelectionState, /* dataTransfer */ js.Object, /* isInternal */ DraftDragType) => DraftHandleValue
    ): Self = this.set("handleDrop", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHandleDrop: Self = this.set("handleDrop", js.undefined)
    @scala.inline
    def setHandleDroppedFiles(value: (/* selection */ SelectionState, /* files */ js.Array[Blob]) => DraftHandleValue): Self = this.set("handleDroppedFiles", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHandleDroppedFiles: Self = this.set("handleDroppedFiles", js.undefined)
    @scala.inline
    def setHandleKeyCommand(
      value: (/* command */ EditorCommand, /* editorState */ EditorState, /* eventTimeStamp */ Double) => DraftHandleValue
    ): Self = this.set("handleKeyCommand", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHandleKeyCommand: Self = this.set("handleKeyCommand", js.undefined)
    @scala.inline
    def setHandlePastedFiles(value: /* files */ js.Array[Blob] => DraftHandleValue): Self = this.set("handlePastedFiles", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandlePastedFiles: Self = this.set("handlePastedFiles", js.undefined)
    @scala.inline
    def setHandlePastedText(
      value: (/* text */ String, /* html */ js.UndefOr[String], /* editorState */ EditorState) => DraftHandleValue
    ): Self = this.set("handlePastedText", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHandlePastedText: Self = this.set("handlePastedText", js.undefined)
    @scala.inline
    def setHandleReturn(value: (/* e */ SyntheticKeyboardEvent, /* editorState */ EditorState) => DraftHandleValue): Self = this.set("handleReturn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHandleReturn: Self = this.set("handleReturn", js.undefined)
    @scala.inline
    def setKeyBindingFn(value: /* e */ SyntheticKeyboardEvent => EditorCommand | Null): Self = this.set("keyBindingFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyBindingFn: Self = this.set("keyBindingFn", js.undefined)
    @scala.inline
    def setOnBlur(value: /* e */ SyntheticEvent => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnDownArrow(value: /* e */ SyntheticKeyboardEvent => Unit): Self = this.set("onDownArrow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDownArrow: Self = this.set("onDownArrow", js.undefined)
    @scala.inline
    def setOnEscape(value: /* e */ SyntheticKeyboardEvent => Unit): Self = this.set("onEscape", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEscape: Self = this.set("onEscape", js.undefined)
    @scala.inline
    def setOnFocus(value: /* e */ SyntheticEvent => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnLeftArrow(value: /* e */ SyntheticKeyboardEvent => Unit): Self = this.set("onLeftArrow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLeftArrow: Self = this.set("onLeftArrow", js.undefined)
    @scala.inline
    def setOnRightArrow(value: /* e */ SyntheticKeyboardEvent => Unit): Self = this.set("onRightArrow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRightArrow: Self = this.set("onRightArrow", js.undefined)
    @scala.inline
    def setOnTab(value: /* e */ SyntheticKeyboardEvent => Unit): Self = this.set("onTab", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTab: Self = this.set("onTab", js.undefined)
    @scala.inline
    def setOnUpArrow(value: /* e */ SyntheticKeyboardEvent => Unit): Self = this.set("onUpArrow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUpArrow: Self = this.set("onUpArrow", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSpellCheck(value: Boolean): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    @scala.inline
    def setStripPastedStyles(value: Boolean): Self = this.set("stripPastedStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripPastedStyles: Self = this.set("stripPastedStyles", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTextAlignment(value: DraftTextAlignment): Self = this.set("textAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlignment: Self = this.set("textAlignment", js.undefined)
    @scala.inline
    def setTextDirectionality(value: DraftTextDirectionality): Self = this.set("textDirectionality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDirectionality: Self = this.set("textDirectionality", js.undefined)
    @scala.inline
    def setWebDriverTestID(value: String): Self = this.set("webDriverTestID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebDriverTestID: Self = this.set("webDriverTestID", js.undefined)
  }
  
}

