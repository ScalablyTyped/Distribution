package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ComponentNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftEditorProps extends js.Object {
  var ariaActiveDescendantID: js.UndefOr[java.lang.String] = js.undefined
  var ariaAutoComplete: js.UndefOr[java.lang.String] = js.undefined
  var ariaControls: js.UndefOr[java.lang.String] = js.undefined
  var ariaDescribedBy: js.UndefOr[java.lang.String] = js.undefined
  var ariaExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  var ariaMultiline: js.UndefOr[scala.Boolean] = js.undefined
  // exposed especially to help improve mobile web behaviors
  var autoCapitalize: js.UndefOr[java.lang.String] = js.undefined
  var autoComplete: js.UndefOr[java.lang.String] = js.undefined
  var autoCorrect: js.UndefOr[java.lang.String] = js.undefined
  // Provide a map of block rendering configurations. Each block type maps to
  // an element tag and an optional react element wrapper. This configuration
  // is used for both rendering and paste processing.
  var blockRenderMap: js.UndefOr[DraftBlockRenderMap] = js.undefined
  // For a given `ContentBlock` object, return an object that specifies
  // a custom block component and/or props. If no object is returned,
  // the default `TextEditorBlock` is used.
  var blockRendererFn: js.UndefOr[
    js.Function1[
      /* block */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock, 
      _
    ]
  ] = js.undefined
  // Function that allows to define class names to apply to the given block when it is rendered.
  var blockStyleFn: js.UndefOr[
    js.Function1[
      /* block */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock, 
      java.lang.String
    ]
  ] = js.undefined
  // Provide a function that will construct CSS style objects given inline
  // style names.
  var customStyleFn: js.UndefOr[
    js.Function1[
      /* style */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftInlineStyle, 
      js.Object
    ]
  ] = js.undefined
  // Provide a map of inline style names corresponding to CSS style objects
  // that will be rendered for matching ranges.
  var customStyleMap: js.UndefOr[js.Any] = js.undefined
  var editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState
  // Handle intended text insertion before the insertion occurs. This may be
  // useful in cases where the user has entered characters that you would like
  // to trigger some special behavior. E.g. immediately converting `:)` to an
  // emoji Unicode character, or replacing ASCII quote characters with smart
  // quotes.
  var handleBeforeInput: js.UndefOr[
    js.Function2[
      /* chars */ java.lang.String, 
      /* editorState */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState, 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue
    ]
  ] = js.undefined
  // Handle other drops to prevent default text movement/insertion behaviour
  var handleDrop: js.UndefOr[
    js.Function3[
      /* selection */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState, 
      /* dataTransfer */ js.Object, 
      /* isInternal */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftDragType, 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue
    ]
  ] = js.undefined
  // Handle dropped files
  var handleDroppedFiles: js.UndefOr[
    js.Function2[
      /* selection */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState, 
      /* files */ js.Array[stdLib.Blob], 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue
    ]
  ] = js.undefined
  // Map a key command string provided by your key binding function to a
  // specified behavior.
  var handleKeyCommand: js.UndefOr[
    js.Function2[
      /* command */ EditorCommand, 
      /* editorState */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState, 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue
    ]
  ] = js.undefined
  var handlePastedFiles: js.UndefOr[
    js.Function1[
      /* files */ js.Array[stdLib.Blob], 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue
    ]
  ] = js.undefined
  var handlePastedText: js.UndefOr[
    js.Function3[
      /* text */ java.lang.String, 
      /* html */ js.UndefOr[java.lang.String], 
      /* editorState */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState, 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue
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
      /* e */ draftDashJsLib.SyntheticKeyboardEvent, 
      /* editorState */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState, 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue
    ]
  ] = js.undefined
  // A function that accepts a synthetic key event and returns
  // the matching DraftEditorCommand constant, or null if no command should
  // be invoked.
  var keyBindingFn: js.UndefOr[
    js.Function1[/* e */ draftDashJsLib.SyntheticKeyboardEvent, EditorCommand | scala.Null]
  ] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ draftDashJsLib.SyntheticEvent, scala.Unit]] = js.undefined
  var onDownArrow: js.UndefOr[js.Function1[/* e */ draftDashJsLib.SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  /**
    * Non-cancelable event triggers.
    */
  var onEscape: js.UndefOr[js.Function1[/* e */ draftDashJsLib.SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ draftDashJsLib.SyntheticEvent, scala.Unit]] = js.undefined
  var onLeftArrow: js.UndefOr[js.Function1[/* e */ draftDashJsLib.SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onRightArrow: js.UndefOr[js.Function1[/* e */ draftDashJsLib.SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onTab: js.UndefOr[js.Function1[/* e */ draftDashJsLib.SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onUpArrow: js.UndefOr[js.Function1[/* e */ draftDashJsLib.SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  // Set whether the `DraftEditor` component should be editable. Useful for
  // temporarily disabling edit behavior or allowing `DraftEditor` rendering
  // to be used for consumption purposes.
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  // Note: spellcheck is always disabled for IE. If enabled in Safari, OSX
  // autocorrect is enabled as well.
  var spellCheck: js.UndefOr[scala.Boolean] = js.undefined
  // Set whether to remove all style information from pasted content. If your
  // use case should not have any block or inline styles, it is recommended
  // that you set this to `true`.
  var stripPastedStyles: js.UndefOr[scala.Boolean] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  // Specify whether text alignment should be forced in a direction
  // regardless of input characters.
  var textAlignment: js.UndefOr[DraftTextAlignment] = js.undefined
  var webDriverTestID: js.UndefOr[java.lang.String] = js.undefined
  def onChange(editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState): scala.Unit
}

object DraftEditorProps {
  @scala.inline
  def apply(
    editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState,
    onChange: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState => scala.Unit,
    ariaActiveDescendantID: java.lang.String = null,
    ariaAutoComplete: java.lang.String = null,
    ariaControls: java.lang.String = null,
    ariaDescribedBy: java.lang.String = null,
    ariaExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    ariaLabel: java.lang.String = null,
    ariaMultiline: js.UndefOr[scala.Boolean] = js.undefined,
    autoCapitalize: java.lang.String = null,
    autoComplete: java.lang.String = null,
    autoCorrect: java.lang.String = null,
    blockRenderMap: DraftBlockRenderMap = null,
    blockRendererFn: /* block */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock => _ = null,
    blockStyleFn: /* block */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock => java.lang.String = null,
    customStyleFn: /* style */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftInlineStyle => js.Object = null,
    customStyleMap: js.Any = null,
    handleBeforeInput: (/* chars */ java.lang.String, /* editorState */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState) => draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue = null,
    handleDrop: (/* selection */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState, /* dataTransfer */ js.Object, /* isInternal */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftDragType) => draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue = null,
    handleDroppedFiles: (/* selection */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState, /* files */ js.Array[stdLib.Blob]) => draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue = null,
    handleKeyCommand: (/* command */ EditorCommand, /* editorState */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState) => draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue = null,
    handlePastedFiles: /* files */ js.Array[stdLib.Blob] => draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue = null,
    handlePastedText: (/* text */ java.lang.String, /* html */ js.UndefOr[java.lang.String], /* editorState */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState) => draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue = null,
    handleReturn: (/* e */ draftDashJsLib.SyntheticKeyboardEvent, /* editorState */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState) => draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue = null,
    keyBindingFn: /* e */ draftDashJsLib.SyntheticKeyboardEvent => EditorCommand | scala.Null = null,
    onBlur: /* e */ draftDashJsLib.SyntheticEvent => scala.Unit = null,
    onDownArrow: /* e */ draftDashJsLib.SyntheticKeyboardEvent => scala.Unit = null,
    onEscape: /* e */ draftDashJsLib.SyntheticKeyboardEvent => scala.Unit = null,
    onFocus: /* e */ draftDashJsLib.SyntheticEvent => scala.Unit = null,
    onLeftArrow: /* e */ draftDashJsLib.SyntheticKeyboardEvent => scala.Unit = null,
    onRightArrow: /* e */ draftDashJsLib.SyntheticKeyboardEvent => scala.Unit = null,
    onTab: /* e */ draftDashJsLib.SyntheticKeyboardEvent => scala.Unit = null,
    onUpArrow: /* e */ draftDashJsLib.SyntheticKeyboardEvent => scala.Unit = null,
    placeholder: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    spellCheck: js.UndefOr[scala.Boolean] = js.undefined,
    stripPastedStyles: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Int | scala.Double = null,
    textAlignment: DraftTextAlignment = null,
    webDriverTestID: java.lang.String = null
  ): DraftEditorProps = {
    val __obj = js.Dynamic.literal(editorState = editorState, onChange = js.Any.fromFunction1(onChange))
    if (ariaActiveDescendantID != null) __obj.updateDynamic("ariaActiveDescendantID")(ariaActiveDescendantID)
    if (ariaAutoComplete != null) __obj.updateDynamic("ariaAutoComplete")(ariaAutoComplete)
    if (ariaControls != null) __obj.updateDynamic("ariaControls")(ariaControls)
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy)
    if (!js.isUndefined(ariaExpanded)) __obj.updateDynamic("ariaExpanded")(ariaExpanded)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (!js.isUndefined(ariaMultiline)) __obj.updateDynamic("ariaMultiline")(ariaMultiline)
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (blockRenderMap != null) __obj.updateDynamic("blockRenderMap")(blockRenderMap)
    if (blockRendererFn != null) __obj.updateDynamic("blockRendererFn")(js.Any.fromFunction1(blockRendererFn))
    if (blockStyleFn != null) __obj.updateDynamic("blockStyleFn")(js.Any.fromFunction1(blockStyleFn))
    if (customStyleFn != null) __obj.updateDynamic("customStyleFn")(js.Any.fromFunction1(customStyleFn))
    if (customStyleMap != null) __obj.updateDynamic("customStyleMap")(customStyleMap)
    if (handleBeforeInput != null) __obj.updateDynamic("handleBeforeInput")(js.Any.fromFunction2(handleBeforeInput))
    if (handleDrop != null) __obj.updateDynamic("handleDrop")(js.Any.fromFunction3(handleDrop))
    if (handleDroppedFiles != null) __obj.updateDynamic("handleDroppedFiles")(js.Any.fromFunction2(handleDroppedFiles))
    if (handleKeyCommand != null) __obj.updateDynamic("handleKeyCommand")(js.Any.fromFunction2(handleKeyCommand))
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
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck)
    if (!js.isUndefined(stripPastedStyles)) __obj.updateDynamic("stripPastedStyles")(stripPastedStyles)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment)
    if (webDriverTestID != null) __obj.updateDynamic("webDriverTestID")(webDriverTestID)
    __obj.asInstanceOf[DraftEditorProps]
  }
}

