package typings.draftJs.mod.Draft

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.anon.Html
import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typings.draftJs.mod.Draft.Model.Constants.DraftDragType
import typings.draftJs.mod.Draft.Model.Constants.DraftEditorCommand
import typings.draftJs.mod.Draft.Model.Constants.DraftHandleValue
import typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock
import typings.draftJs.mod.Draft.Model.ImmutableData.DraftBlockRenderConfig
import typings.draftJs.mod.Draft.Model.ImmutableData.DraftInlineStyle
import typings.draftJs.mod.Draft.Model.ImmutableData.EditorState
import typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState
import typings.draftJs.mod.SyntheticEvent
import typings.draftJs.mod.SyntheticKeyboardEvent
import typings.immutable.Immutable.Map
import typings.react.mod.CSSProperties
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  object Base {
    
    type DraftBlockRenderMap = Map[DraftBlockType, DraftBlockRenderConfig]
    
    /**
      * `DraftEditor` is the root editor component. It composes a `contentEditable`
      * div, and provides a wide variety of useful function props for managing the
      * state of the editor. See `DraftEditorProps` for details.
      */
    @js.native
    trait DraftEditor
      extends typings.react.mod.Component[DraftEditorProps, js.Object, js.Any] {
      
      /** Remove focus from the editor node. */
      def blur(): Unit = js.native
      
      /** Force focus back onto the editor node. */
      def focus(): Unit = js.native
    }
    
    @js.native
    trait DraftEditorProps extends StObject {
      
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
      
      var formatPastedText: js.UndefOr[js.Function2[/* text */ String, /* html */ js.UndefOr[String], Html]] = js.native
      
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
      
      def onChange(editorState: EditorState): Unit = js.native
      
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
    }
    object DraftEditorProps {
      
      @scala.inline
      def apply(editorState: EditorState, onChange: EditorState => Unit): DraftEditorProps = {
        val __obj = js.Dynamic.literal(editorState = editorState.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
        __obj.asInstanceOf[DraftEditorProps]
      }
      
      @scala.inline
      implicit class DraftEditorPropsMutableBuilder[Self <: DraftEditorProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAriaActiveDescendantID(value: String): Self = StObject.set(x, "ariaActiveDescendantID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaActiveDescendantIDUndefined: Self = StObject.set(x, "ariaActiveDescendantID", js.undefined)
        
        @scala.inline
        def setAriaAutoComplete(value: String): Self = StObject.set(x, "ariaAutoComplete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaAutoCompleteUndefined: Self = StObject.set(x, "ariaAutoComplete", js.undefined)
        
        @scala.inline
        def setAriaControls(value: String): Self = StObject.set(x, "ariaControls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaControlsUndefined: Self = StObject.set(x, "ariaControls", js.undefined)
        
        @scala.inline
        def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
        
        @scala.inline
        def setAriaExpanded(value: Boolean): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
        
        @scala.inline
        def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
        
        @scala.inline
        def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
        
        @scala.inline
        def setAriaMultiline(value: Boolean): Self = StObject.set(x, "ariaMultiline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaMultilineUndefined: Self = StObject.set(x, "ariaMultiline", js.undefined)
        
        @scala.inline
        def setAriaOwneeID(value: String): Self = StObject.set(x, "ariaOwneeID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaOwneeIDUndefined: Self = StObject.set(x, "ariaOwneeID", js.undefined)
        
        @scala.inline
        def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
        
        @scala.inline
        def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
        
        @scala.inline
        def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
        
        @scala.inline
        def setBlockRenderMap(value: DraftBlockRenderMap): Self = StObject.set(x, "blockRenderMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockRenderMapUndefined: Self = StObject.set(x, "blockRenderMap", js.undefined)
        
        @scala.inline
        def setBlockRendererFn(value: /* block */ ContentBlock => _): Self = StObject.set(x, "blockRendererFn", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBlockRendererFnUndefined: Self = StObject.set(x, "blockRendererFn", js.undefined)
        
        @scala.inline
        def setBlockStyleFn(value: /* block */ ContentBlock => String): Self = StObject.set(x, "blockStyleFn", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBlockStyleFnUndefined: Self = StObject.set(x, "blockStyleFn", js.undefined)
        
        @scala.inline
        def setCustomStyleFn(value: (/* style */ DraftInlineStyle, /* block */ ContentBlock) => CSSProperties): Self = StObject.set(x, "customStyleFn", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCustomStyleFnUndefined: Self = StObject.set(x, "customStyleFn", js.undefined)
        
        @scala.inline
        def setCustomStyleMap(value: DraftStyleMap): Self = StObject.set(x, "customStyleMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomStyleMapUndefined: Self = StObject.set(x, "customStyleMap", js.undefined)
        
        @scala.inline
        def setEditorKey(value: String): Self = StObject.set(x, "editorKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorKeyUndefined: Self = StObject.set(x, "editorKey", js.undefined)
        
        @scala.inline
        def setEditorState(value: EditorState): Self = StObject.set(x, "editorState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatPastedText(value: (/* text */ String, /* html */ js.UndefOr[String]) => Html): Self = StObject.set(x, "formatPastedText", js.Any.fromFunction2(value))
        
        @scala.inline
        def setFormatPastedTextUndefined: Self = StObject.set(x, "formatPastedText", js.undefined)
        
        @scala.inline
        def setHandleBeforeInput(
          value: (/* chars */ String, /* editorState */ EditorState, /* eventTimeStamp */ Double) => DraftHandleValue
        ): Self = StObject.set(x, "handleBeforeInput", js.Any.fromFunction3(value))
        
        @scala.inline
        def setHandleBeforeInputUndefined: Self = StObject.set(x, "handleBeforeInput", js.undefined)
        
        @scala.inline
        def setHandleDrop(
          value: (/* selection */ SelectionState, /* dataTransfer */ js.Object, /* isInternal */ DraftDragType) => DraftHandleValue
        ): Self = StObject.set(x, "handleDrop", js.Any.fromFunction3(value))
        
        @scala.inline
        def setHandleDropUndefined: Self = StObject.set(x, "handleDrop", js.undefined)
        
        @scala.inline
        def setHandleDroppedFiles(value: (/* selection */ SelectionState, /* files */ js.Array[Blob]) => DraftHandleValue): Self = StObject.set(x, "handleDroppedFiles", js.Any.fromFunction2(value))
        
        @scala.inline
        def setHandleDroppedFilesUndefined: Self = StObject.set(x, "handleDroppedFiles", js.undefined)
        
        @scala.inline
        def setHandleKeyCommand(
          value: (/* command */ EditorCommand, /* editorState */ EditorState, /* eventTimeStamp */ Double) => DraftHandleValue
        ): Self = StObject.set(x, "handleKeyCommand", js.Any.fromFunction3(value))
        
        @scala.inline
        def setHandleKeyCommandUndefined: Self = StObject.set(x, "handleKeyCommand", js.undefined)
        
        @scala.inline
        def setHandlePastedFiles(value: /* files */ js.Array[Blob] => DraftHandleValue): Self = StObject.set(x, "handlePastedFiles", js.Any.fromFunction1(value))
        
        @scala.inline
        def setHandlePastedFilesUndefined: Self = StObject.set(x, "handlePastedFiles", js.undefined)
        
        @scala.inline
        def setHandlePastedText(
          value: (/* text */ String, /* html */ js.UndefOr[String], /* editorState */ EditorState) => DraftHandleValue
        ): Self = StObject.set(x, "handlePastedText", js.Any.fromFunction3(value))
        
        @scala.inline
        def setHandlePastedTextUndefined: Self = StObject.set(x, "handlePastedText", js.undefined)
        
        @scala.inline
        def setHandleReturn(value: (/* e */ SyntheticKeyboardEvent, /* editorState */ EditorState) => DraftHandleValue): Self = StObject.set(x, "handleReturn", js.Any.fromFunction2(value))
        
        @scala.inline
        def setHandleReturnUndefined: Self = StObject.set(x, "handleReturn", js.undefined)
        
        @scala.inline
        def setKeyBindingFn(value: /* e */ SyntheticKeyboardEvent => EditorCommand | Null): Self = StObject.set(x, "keyBindingFn", js.Any.fromFunction1(value))
        
        @scala.inline
        def setKeyBindingFnUndefined: Self = StObject.set(x, "keyBindingFn", js.undefined)
        
        @scala.inline
        def setOnBlur(value: /* e */ SyntheticEvent => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
        
        @scala.inline
        def setOnChange(value: EditorState => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDownArrow(value: /* e */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onDownArrow", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDownArrowUndefined: Self = StObject.set(x, "onDownArrow", js.undefined)
        
        @scala.inline
        def setOnEscape(value: /* e */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onEscape", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnEscapeUndefined: Self = StObject.set(x, "onEscape", js.undefined)
        
        @scala.inline
        def setOnFocus(value: /* e */ SyntheticEvent => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
        
        @scala.inline
        def setOnLeftArrow(value: /* e */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onLeftArrow", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnLeftArrowUndefined: Self = StObject.set(x, "onLeftArrow", js.undefined)
        
        @scala.inline
        def setOnRightArrow(value: /* e */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onRightArrow", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnRightArrowUndefined: Self = StObject.set(x, "onRightArrow", js.undefined)
        
        @scala.inline
        def setOnTab(value: /* e */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onTab", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
        
        @scala.inline
        def setOnUpArrow(value: /* e */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onUpArrow", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnUpArrowUndefined: Self = StObject.set(x, "onUpArrow", js.undefined)
        
        @scala.inline
        def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        @scala.inline
        def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
        
        @scala.inline
        def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        @scala.inline
        def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
        
        @scala.inline
        def setStripPastedStyles(value: Boolean): Self = StObject.set(x, "stripPastedStyles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStripPastedStylesUndefined: Self = StObject.set(x, "stripPastedStyles", js.undefined)
        
        @scala.inline
        def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
        
        @scala.inline
        def setTextAlignment(value: DraftTextAlignment): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
        
        @scala.inline
        def setTextDirectionality(value: DraftTextDirectionality): Self = StObject.set(x, "textDirectionality", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextDirectionalityUndefined: Self = StObject.set(x, "textDirectionality", js.undefined)
        
        @scala.inline
        def setWebDriverTestID(value: String): Self = StObject.set(x, "webDriverTestID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebDriverTestIDUndefined: Self = StObject.set(x, "webDriverTestID", js.undefined)
      }
    }
    
    type DraftStyleMap = StringDictionary[CSSProperties]
    
    /* Rewritten from type alias, can be one of: 
      - typings.draftJs.draftJsStrings.left
      - typings.draftJs.draftJsStrings.center
      - typings.draftJs.draftJsStrings.right
    */
    trait DraftTextAlignment extends StObject
    object DraftTextAlignment {
      
      @scala.inline
      def center: typings.draftJs.draftJsStrings.center = "center".asInstanceOf[typings.draftJs.draftJsStrings.center]
      
      @scala.inline
      def left: typings.draftJs.draftJsStrings.left = "left".asInstanceOf[typings.draftJs.draftJsStrings.left]
      
      @scala.inline
      def right: typings.draftJs.draftJsStrings.right = "right".asInstanceOf[typings.draftJs.draftJsStrings.right]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.draftJs.draftJsStrings.LTR
      - typings.draftJs.draftJsStrings.RTL
      - typings.draftJs.draftJsStrings.NEUTRAL
    */
    trait DraftTextDirectionality extends StObject
    object DraftTextDirectionality {
      
      @scala.inline
      def LTR: typings.draftJs.draftJsStrings.LTR = "LTR".asInstanceOf[typings.draftJs.draftJsStrings.LTR]
      
      @scala.inline
      def NEUTRAL: typings.draftJs.draftJsStrings.NEUTRAL = "NEUTRAL".asInstanceOf[typings.draftJs.draftJsStrings.NEUTRAL]
      
      @scala.inline
      def RTL: typings.draftJs.draftJsStrings.RTL = "RTL".asInstanceOf[typings.draftJs.draftJsStrings.RTL]
    }
    
    type EditorCommand = DraftEditorCommand | String
  }
  
  object Components {
    
    type DraftEditorBlock = typings.react.mod.Component[js.Any, js.Object, js.Any]
  }
  
  object Selection {
    
    @js.native
    trait FakeClientRect extends StObject {
      
      var bottom: Double = js.native
      
      var height: Double = js.native
      
      var left: Double = js.native
      
      var right: Double = js.native
      
      var top: Double = js.native
      
      var width: Double = js.native
    }
    object FakeClientRect {
      
      @scala.inline
      def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): FakeClientRect = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[FakeClientRect]
      }
      
      @scala.inline
      implicit class FakeClientRectMutableBuilder[Self <: FakeClientRect] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object Utils {
    
    @js.native
    trait KeyBindingUtil extends StObject
  }
}
