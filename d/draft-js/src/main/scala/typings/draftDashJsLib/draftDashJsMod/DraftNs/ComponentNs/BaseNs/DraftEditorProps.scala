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

