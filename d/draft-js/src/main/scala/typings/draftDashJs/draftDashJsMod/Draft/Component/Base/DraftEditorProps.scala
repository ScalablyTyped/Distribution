package typings.draftDashJs.draftDashJsMod.Draft.Component.Base

import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftDragType
import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftHandleValue
import typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.DraftInlineStyle
import typings.draftDashJs.draftDashJsMod.SyntheticEvent
import typings.draftDashJs.draftDashJsMod.SyntheticKeyboardEvent
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftEditorProps extends js.Object {
  var ariaActiveDescendantID: js.UndefOr[String] = js.undefined
  var ariaAutoComplete: js.UndefOr[String] = js.undefined
  var ariaControls: js.UndefOr[String] = js.undefined
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  var ariaExpanded: js.UndefOr[Boolean] = js.undefined
  var ariaLabel: js.UndefOr[String] = js.undefined
  var ariaMultiline: js.UndefOr[Boolean] = js.undefined
  // exposed especially to help improve mobile web behaviors
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  // Provide a map of block rendering configurations. Each block type maps to
  // an element tag and an optional react element wrapper. This configuration
  // is used for both rendering and paste processing.
  var blockRenderMap: js.UndefOr[DraftBlockRenderMap] = js.undefined
  // For a given `ContentBlock` object, return an object that specifies
  // a custom block component and/or props. If no object is returned,
  // the default `TextEditorBlock` is used.
  var blockRendererFn: js.UndefOr[
    js.Function1[
      /* block */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock, 
      _
    ]
  ] = js.undefined
  // Function that allows to define class names to apply to the given block when it is rendered.
  var blockStyleFn: js.UndefOr[
    js.Function1[
      /* block */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock, 
      String
    ]
  ] = js.undefined
  // Provide a function that will construct CSS style objects given inline
  // style names.
  var customStyleFn: js.UndefOr[
    js.Function2[
      /* style */ DraftInlineStyle, 
      /* block */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock, 
      DraftStyleMap
    ]
  ] = js.undefined
  // Provide a map of inline style names corresponding to CSS style objects
  // that will be rendered for matching ranges.
  var customStyleMap: js.UndefOr[DraftStyleMap] = js.undefined
  // If using server-side rendering, this prop is required to be set to
  // avoid client/server mismatches.
  var editorKey: js.UndefOr[String] = js.undefined
  var editorState: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState
  // Handle intended text insertion before the insertion occurs. This may be
  // useful in cases where the user has entered characters that you would like
  // to trigger some special behavior. E.g. immediately converting `:)` to an
  // emoji Unicode character, or replacing ASCII quote characters with smart
  // quotes.
  var handleBeforeInput: js.UndefOr[
    js.Function3[
      /* chars */ String, 
      /* editorState */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState, 
      /* eventTimeStamp */ Double, 
      DraftHandleValue
    ]
  ] = js.undefined
  // Handle other drops to prevent default text movement/insertion behaviour
  var handleDrop: js.UndefOr[
    js.Function3[
      /* selection */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState, 
      /* dataTransfer */ js.Object, 
      /* isInternal */ DraftDragType, 
      DraftHandleValue
    ]
  ] = js.undefined
  // Handle dropped files
  var handleDroppedFiles: js.UndefOr[
    js.Function2[
      /* selection */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState, 
      /* files */ js.Array[Blob], 
      DraftHandleValue
    ]
  ] = js.undefined
  // Map a key command string provided by your key binding function to a
  // specified behavior.
  var handleKeyCommand: js.UndefOr[
    js.Function3[
      /* command */ EditorCommand, 
      /* editorState */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState, 
      /* eventTimeStamp */ Double, 
      DraftHandleValue
    ]
  ] = js.undefined
  var handlePastedFiles: js.UndefOr[js.Function1[/* files */ js.Array[Blob], DraftHandleValue]] = js.undefined
  var handlePastedText: js.UndefOr[
    js.Function3[
      /* text */ String, 
      /* html */ js.UndefOr[String], 
      /* editorState */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState, 
      DraftHandleValue
    ]
  ] = js.undefined
  /**
    * Cancelable event handlers, handled from the top level down. A handler
    * that returns `handled` will be the last handler to execute for that event.
    */
  // Useful for managing special behavior for pressing the `Return` key. E.g.
  // removing the style from an empty list item.
  var handleReturn: js.UndefOr[
    js.Function2[
      /* e */ SyntheticKeyboardEvent, 
      /* editorState */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState, 
      DraftHandleValue
    ]
  ] = js.undefined
  // A function that accepts a synthetic key event and returns
  // the matching DraftEditorCommand constant, or null if no command should
  // be invoked.
  var keyBindingFn: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, EditorCommand | Null]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ SyntheticEvent, Unit]] = js.undefined
  var onDownArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
  /**
    * Non-cancelable event triggers.
    */
  var onEscape: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticEvent, Unit]] = js.undefined
  var onLeftArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
  var onRightArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
  var onTab: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
  var onUpArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  // Set whether the `DraftEditor` component should be editable. Useful for
  // temporarily disabling edit behavior or allowing `DraftEditor` rendering
  // to be used for consumption purposes.
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  // Note: spellcheck is always disabled for IE. If enabled in Safari, OSX
  // autocorrect is enabled as well.
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  // Set whether to remove all style information from pasted content. If your
  // use case should not have any block or inline styles, it is recommended
  // that you set this to `true`.
  var stripPastedStyles: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  // Specify whether text alignment should be forced in a direction
  // regardless of input characters.
  var textAlignment: js.UndefOr[DraftTextAlignment] = js.undefined
  // Specify whether text directionality should be forced in a direction
  // regardless of input characters.
  var textDirectionality: js.UndefOr[DraftTextDirectionality] = js.undefined
  var webDriverTestID: js.UndefOr[String] = js.undefined
  def onChange(editorState: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState): Unit
}

object DraftEditorProps {
  @scala.inline
  def apply(
    editorState: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState,
    onChange: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState => Unit,
    ariaActiveDescendantID: String = null,
    ariaAutoComplete: String = null,
    ariaControls: String = null,
    ariaDescribedBy: String = null,
    ariaExpanded: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    ariaMultiline: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    blockRenderMap: DraftBlockRenderMap = null,
    blockRendererFn: /* block */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock => _ = null,
    blockStyleFn: /* block */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock => String = null,
    customStyleFn: (/* style */ DraftInlineStyle, /* block */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock) => DraftStyleMap = null,
    customStyleMap: DraftStyleMap = null,
    editorKey: String = null,
    handleBeforeInput: (/* chars */ String, /* editorState */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState, /* eventTimeStamp */ Double) => DraftHandleValue = null,
    handleDrop: (/* selection */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState, /* dataTransfer */ js.Object, /* isInternal */ DraftDragType) => DraftHandleValue = null,
    handleDroppedFiles: (/* selection */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState, /* files */ js.Array[Blob]) => DraftHandleValue = null,
    handleKeyCommand: (/* command */ EditorCommand, /* editorState */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState, /* eventTimeStamp */ Double) => DraftHandleValue = null,
    handlePastedFiles: /* files */ js.Array[Blob] => DraftHandleValue = null,
    handlePastedText: (/* text */ String, /* html */ js.UndefOr[String], /* editorState */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState) => DraftHandleValue = null,
    handleReturn: (/* e */ SyntheticKeyboardEvent, /* editorState */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState) => DraftHandleValue = null,
    keyBindingFn: /* e */ SyntheticKeyboardEvent => EditorCommand | Null = null,
    onBlur: /* e */ SyntheticEvent => Unit = null,
    onDownArrow: /* e */ SyntheticKeyboardEvent => Unit = null,
    onEscape: /* e */ SyntheticKeyboardEvent => Unit = null,
    onFocus: /* e */ SyntheticEvent => Unit = null,
    onLeftArrow: /* e */ SyntheticKeyboardEvent => Unit = null,
    onRightArrow: /* e */ SyntheticKeyboardEvent => Unit = null,
    onTab: /* e */ SyntheticKeyboardEvent => Unit = null,
    onUpArrow: /* e */ SyntheticKeyboardEvent => Unit = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    stripPastedStyles: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    textAlignment: DraftTextAlignment = null,
    textDirectionality: DraftTextDirectionality = null,
    webDriverTestID: String = null
  ): DraftEditorProps = {
    val __obj = js.Dynamic.literal(editorState = editorState.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (ariaActiveDescendantID != null) __obj.updateDynamic("ariaActiveDescendantID")(ariaActiveDescendantID.asInstanceOf[js.Any])
    if (ariaAutoComplete != null) __obj.updateDynamic("ariaAutoComplete")(ariaAutoComplete.asInstanceOf[js.Any])
    if (ariaControls != null) __obj.updateDynamic("ariaControls")(ariaControls.asInstanceOf[js.Any])
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaExpanded)) __obj.updateDynamic("ariaExpanded")(ariaExpanded.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaMultiline)) __obj.updateDynamic("ariaMultiline")(ariaMultiline.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (blockRenderMap != null) __obj.updateDynamic("blockRenderMap")(blockRenderMap.asInstanceOf[js.Any])
    if (blockRendererFn != null) __obj.updateDynamic("blockRendererFn")(js.Any.fromFunction1(blockRendererFn))
    if (blockStyleFn != null) __obj.updateDynamic("blockStyleFn")(js.Any.fromFunction1(blockStyleFn))
    if (customStyleFn != null) __obj.updateDynamic("customStyleFn")(js.Any.fromFunction2(customStyleFn))
    if (customStyleMap != null) __obj.updateDynamic("customStyleMap")(customStyleMap.asInstanceOf[js.Any])
    if (editorKey != null) __obj.updateDynamic("editorKey")(editorKey.asInstanceOf[js.Any])
    if (handleBeforeInput != null) __obj.updateDynamic("handleBeforeInput")(js.Any.fromFunction3(handleBeforeInput))
    if (handleDrop != null) __obj.updateDynamic("handleDrop")(js.Any.fromFunction3(handleDrop))
    if (handleDroppedFiles != null) __obj.updateDynamic("handleDroppedFiles")(js.Any.fromFunction2(handleDroppedFiles))
    if (handleKeyCommand != null) __obj.updateDynamic("handleKeyCommand")(js.Any.fromFunction3(handleKeyCommand))
    if (handlePastedFiles != null) __obj.updateDynamic("handlePastedFiles")(js.Any.fromFunction1(handlePastedFiles))
    if (handlePastedText != null) __obj.updateDynamic("handlePastedText")(js.Any.fromFunction3(handlePastedText))
    if (handleReturn != null) __obj.updateDynamic("handleReturn")(js.Any.fromFunction2(handleReturn))
    if (keyBindingFn != null) __obj.updateDynamic("keyBindingFn")(js.Any.fromFunction1(keyBindingFn))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onDownArrow != null) __obj.updateDynamic("onDownArrow")(js.Any.fromFunction1(onDownArrow))
    if (onEscape != null) __obj.updateDynamic("onEscape")(js.Any.fromFunction1(onEscape))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onLeftArrow != null) __obj.updateDynamic("onLeftArrow")(js.Any.fromFunction1(onLeftArrow))
    if (onRightArrow != null) __obj.updateDynamic("onRightArrow")(js.Any.fromFunction1(onRightArrow))
    if (onTab != null) __obj.updateDynamic("onTab")(js.Any.fromFunction1(onTab))
    if (onUpArrow != null) __obj.updateDynamic("onUpArrow")(js.Any.fromFunction1(onUpArrow))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(stripPastedStyles)) __obj.updateDynamic("stripPastedStyles")(stripPastedStyles.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textDirectionality != null) __obj.updateDynamic("textDirectionality")(textDirectionality.asInstanceOf[js.Any])
    if (webDriverTestID != null) __obj.updateDynamic("webDriverTestID")(webDriverTestID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftEditorProps]
  }
}

