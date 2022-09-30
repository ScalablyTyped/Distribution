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
import typings.draftJs.mod.SyntheticClipboardEvent
import typings.draftJs.mod.SyntheticEvent
import typings.draftJs.mod.SyntheticKeyboardEvent
import typings.immutable.mod.Map
import typings.react.mod.CSSProperties
import typings.std.Blob
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
      extends typings.react.mod.Component[DraftEditorProps, js.Object, Any] {
      
      /** Remove focus from the editor node. */
      def blur(): Unit = js.native
      
      var editor: js.UndefOr[HTMLElement | Null] = js.native
      
      var editorContainer: js.UndefOr[HTMLElement | Null] = js.native
      
      /** Force focus back onto the editor node. */
      def focus(): Unit = js.native
      
      def getEditorKey(): String = js.native
    }
    
    trait DraftEditorProps extends StObject {
      
      var ariaActiveDescendantID: js.UndefOr[String] = js.undefined
      
      var ariaAutoComplete: js.UndefOr[String] = js.undefined
      
      var ariaControls: js.UndefOr[String] = js.undefined
      
      var ariaDescribedBy: js.UndefOr[String] = js.undefined
      
      var ariaExpanded: js.UndefOr[Boolean] = js.undefined
      
      var ariaLabel: js.UndefOr[String] = js.undefined
      
      var ariaLabelledBy: js.UndefOr[String] = js.undefined
      
      var ariaMultiline: js.UndefOr[Boolean] = js.undefined
      
      var ariaOwneeID: js.UndefOr[String] = js.undefined
      
      // exposed especially to help improve mobile web behaviors
      var autoCapitalize: js.UndefOr[String] = js.undefined
      
      var autoComplete: js.UndefOr[String] = js.undefined
      
      var autoCorrect: js.UndefOr[String] = js.undefined
      
      /**
        * Provide a map of block rendering configurations. Each block type maps to
        * an element tag and an optional react element wrapper. This configuration
        * is used for both rendering and paste processing.
        */
      var blockRenderMap: js.UndefOr[DraftBlockRenderMap] = js.undefined
      
      /**
        * For a given `ContentBlock` object, return an object that specifies
        * a custom block component and/or props. If no object is returned,
        * the default `TextEditorBlock` is used.
        */
      var blockRendererFn: js.UndefOr[js.Function1[/* block */ ContentBlock, Any]] = js.undefined
      
      /**
        * Function that allows to define class names to apply to the given block when it is rendered.
        */
      var blockStyleFn: js.UndefOr[js.Function1[/* block */ ContentBlock, String]] = js.undefined
      
      /**
        * Define a function to transform inline styles to CSS objects
        * that are applied to spans of text.
        */
      var customStyleFn: js.UndefOr[
            js.Function2[/* style */ DraftInlineStyle, /* block */ ContentBlock, CSSProperties]
          ] = js.undefined
      
      /**
        * Provide a map of inline style names corresponding to CSS style objects
        * that will be rendered for matching ranges.
        */
      var customStyleMap: js.UndefOr[DraftStyleMap] = js.undefined
      
      /**
        * If using server-side rendering, this prop is required to be set to
        * avoid client/server mismatches.
        */
      var editorKey: js.UndefOr[String] = js.undefined
      
      var editorState: EditorState
      
      var formatPastedText: js.UndefOr[js.Function2[/* text */ String, /* html */ js.UndefOr[String], Html]] = js.undefined
      
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
          ] = js.undefined
      
      /** Handle other drops to prevent default text movement/insertion behaviour */
      var handleDrop: js.UndefOr[
            js.Function3[
              /* selection */ SelectionState, 
              /* dataTransfer */ js.Object, 
              /* isInternal */ DraftDragType, 
              DraftHandleValue
            ]
          ] = js.undefined
      
      /** Handle dropped files */
      var handleDroppedFiles: js.UndefOr[
            js.Function2[/* selection */ SelectionState, /* files */ js.Array[Blob], DraftHandleValue]
          ] = js.undefined
      
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
          ] = js.undefined
      
      var handlePastedFiles: js.UndefOr[js.Function1[/* files */ js.Array[Blob], DraftHandleValue]] = js.undefined
      
      var handlePastedText: js.UndefOr[
            js.Function3[
              /* text */ String, 
              /* html */ js.UndefOr[String], 
              /* editorState */ EditorState, 
              DraftHandleValue
            ]
          ] = js.undefined
      
      // Cancelable event handlers, handled from the top level down. A handler
      // that returns `handled` will be the last handler to execute for that event.
      /**
        * Useful for managing special behavior for pressing the `Return` key. E.g.
        * removing the style from an empty list item.
        */
      var handleReturn: js.UndefOr[
            js.Function2[/* e */ SyntheticKeyboardEvent, /* editorState */ EditorState, DraftHandleValue]
          ] = js.undefined
      
      /**
        * A function that accepts a synthetic key event and returns
        * the matching DraftEditorCommand constant, or null if no command should
        * be invoked.
        */
      var keyBindingFn: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, EditorCommand | Null]] = js.undefined
      
      var onBlur: js.UndefOr[js.Function1[/* e */ SyntheticEvent, Unit]] = js.undefined
      
      def onChange(editorState: EditorState): Unit
      
      var onCopy: js.UndefOr[
            js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ /* editor */ Any, 
              /* e */ SyntheticClipboardEvent, 
              Unit
            ]
          ] = js.undefined
      
      var onCut: js.UndefOr[
            js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ /* editor */ Any, 
              /* e */ SyntheticClipboardEvent, 
              Unit
            ]
          ] = js.undefined
      
      var onDownArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
      
      // Non-cancelable event triggers.
      var onEscape: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
      
      var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticEvent, Unit]] = js.undefined
      
      var onLeftArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
      
      var onRightArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
      
      var onTab: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
      
      var onUpArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
      
      var placeholder: js.UndefOr[String] = js.undefined
      
      /**
        * When the Editor loses focus (blurs) text selections are cleared
        * by default to mimic <textarea> behaviour, however in some situations
        * users may wish to preserve native behaviour.
        */
      var preserveSelectionOnBlur: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Set whether the `DraftEditor` component should be editable. Useful for
        * temporarily disabling edit behavior or allowing `DraftEditor` rendering
        * to be used for consumption purposes.
        */
      var readOnly: js.UndefOr[Boolean] = js.undefined
      
      var role: js.UndefOr[String] = js.undefined
      
      /**
        * Note: spellcheck is always disabled for IE. If enabled in Safari, OSX
        * autocorrect is enabled as well.
        */
      var spellCheck: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Set whether to remove all style information from pasted content. If your
        * use case should not have any block or inline styles, it is recommended
        * that you set this to `true`.
        */
      var stripPastedStyles: js.UndefOr[Boolean] = js.undefined
      
      var tabIndex: js.UndefOr[Double] = js.undefined
      
      /**
        * Specify whether text alignment should be forced in a direction
        * regardless of input characters.
        */
      var textAlignment: js.UndefOr[DraftTextAlignment] = js.undefined
      
      /**
        * Specify whether text directionality should be forced in a direction
        * regardless of input characters.
        */
      var textDirectionality: js.UndefOr[DraftTextDirectionality] = js.undefined
      
      var webDriverTestID: js.UndefOr[String] = js.undefined
    }
    object DraftEditorProps {
      
      inline def apply(editorState: EditorState, onChange: EditorState => Unit): DraftEditorProps = {
        val __obj = js.Dynamic.literal(editorState = editorState.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
        __obj.asInstanceOf[DraftEditorProps]
      }
      
      extension [Self <: DraftEditorProps](x: Self) {
        
        inline def setAriaActiveDescendantID(value: String): Self = StObject.set(x, "ariaActiveDescendantID", value.asInstanceOf[js.Any])
        
        inline def setAriaActiveDescendantIDUndefined: Self = StObject.set(x, "ariaActiveDescendantID", js.undefined)
        
        inline def setAriaAutoComplete(value: String): Self = StObject.set(x, "ariaAutoComplete", value.asInstanceOf[js.Any])
        
        inline def setAriaAutoCompleteUndefined: Self = StObject.set(x, "ariaAutoComplete", js.undefined)
        
        inline def setAriaControls(value: String): Self = StObject.set(x, "ariaControls", value.asInstanceOf[js.Any])
        
        inline def setAriaControlsUndefined: Self = StObject.set(x, "ariaControls", js.undefined)
        
        inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
        
        inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
        
        inline def setAriaExpanded(value: Boolean): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
        
        inline def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
        
        inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
        
        inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
        
        inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
        
        inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
        
        inline def setAriaMultiline(value: Boolean): Self = StObject.set(x, "ariaMultiline", value.asInstanceOf[js.Any])
        
        inline def setAriaMultilineUndefined: Self = StObject.set(x, "ariaMultiline", js.undefined)
        
        inline def setAriaOwneeID(value: String): Self = StObject.set(x, "ariaOwneeID", value.asInstanceOf[js.Any])
        
        inline def setAriaOwneeIDUndefined: Self = StObject.set(x, "ariaOwneeID", js.undefined)
        
        inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
        
        inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
        
        inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
        
        inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
        
        inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
        
        inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
        
        inline def setBlockRenderMap(value: DraftBlockRenderMap): Self = StObject.set(x, "blockRenderMap", value.asInstanceOf[js.Any])
        
        inline def setBlockRenderMapUndefined: Self = StObject.set(x, "blockRenderMap", js.undefined)
        
        inline def setBlockRendererFn(value: /* block */ ContentBlock => Any): Self = StObject.set(x, "blockRendererFn", js.Any.fromFunction1(value))
        
        inline def setBlockRendererFnUndefined: Self = StObject.set(x, "blockRendererFn", js.undefined)
        
        inline def setBlockStyleFn(value: /* block */ ContentBlock => String): Self = StObject.set(x, "blockStyleFn", js.Any.fromFunction1(value))
        
        inline def setBlockStyleFnUndefined: Self = StObject.set(x, "blockStyleFn", js.undefined)
        
        inline def setCustomStyleFn(value: (/* style */ DraftInlineStyle, /* block */ ContentBlock) => CSSProperties): Self = StObject.set(x, "customStyleFn", js.Any.fromFunction2(value))
        
        inline def setCustomStyleFnUndefined: Self = StObject.set(x, "customStyleFn", js.undefined)
        
        inline def setCustomStyleMap(value: DraftStyleMap): Self = StObject.set(x, "customStyleMap", value.asInstanceOf[js.Any])
        
        inline def setCustomStyleMapUndefined: Self = StObject.set(x, "customStyleMap", js.undefined)
        
        inline def setEditorKey(value: String): Self = StObject.set(x, "editorKey", value.asInstanceOf[js.Any])
        
        inline def setEditorKeyUndefined: Self = StObject.set(x, "editorKey", js.undefined)
        
        inline def setEditorState(value: EditorState): Self = StObject.set(x, "editorState", value.asInstanceOf[js.Any])
        
        inline def setFormatPastedText(value: (/* text */ String, /* html */ js.UndefOr[String]) => Html): Self = StObject.set(x, "formatPastedText", js.Any.fromFunction2(value))
        
        inline def setFormatPastedTextUndefined: Self = StObject.set(x, "formatPastedText", js.undefined)
        
        inline def setHandleBeforeInput(
          value: (/* chars */ String, /* editorState */ EditorState, /* eventTimeStamp */ Double) => DraftHandleValue
        ): Self = StObject.set(x, "handleBeforeInput", js.Any.fromFunction3(value))
        
        inline def setHandleBeforeInputUndefined: Self = StObject.set(x, "handleBeforeInput", js.undefined)
        
        inline def setHandleDrop(
          value: (/* selection */ SelectionState, /* dataTransfer */ js.Object, /* isInternal */ DraftDragType) => DraftHandleValue
        ): Self = StObject.set(x, "handleDrop", js.Any.fromFunction3(value))
        
        inline def setHandleDropUndefined: Self = StObject.set(x, "handleDrop", js.undefined)
        
        inline def setHandleDroppedFiles(value: (/* selection */ SelectionState, /* files */ js.Array[Blob]) => DraftHandleValue): Self = StObject.set(x, "handleDroppedFiles", js.Any.fromFunction2(value))
        
        inline def setHandleDroppedFilesUndefined: Self = StObject.set(x, "handleDroppedFiles", js.undefined)
        
        inline def setHandleKeyCommand(
          value: (/* command */ EditorCommand, /* editorState */ EditorState, /* eventTimeStamp */ Double) => DraftHandleValue
        ): Self = StObject.set(x, "handleKeyCommand", js.Any.fromFunction3(value))
        
        inline def setHandleKeyCommandUndefined: Self = StObject.set(x, "handleKeyCommand", js.undefined)
        
        inline def setHandlePastedFiles(value: /* files */ js.Array[Blob] => DraftHandleValue): Self = StObject.set(x, "handlePastedFiles", js.Any.fromFunction1(value))
        
        inline def setHandlePastedFilesUndefined: Self = StObject.set(x, "handlePastedFiles", js.undefined)
        
        inline def setHandlePastedText(
          value: (/* text */ String, /* html */ js.UndefOr[String], /* editorState */ EditorState) => DraftHandleValue
        ): Self = StObject.set(x, "handlePastedText", js.Any.fromFunction3(value))
        
        inline def setHandlePastedTextUndefined: Self = StObject.set(x, "handlePastedText", js.undefined)
        
        inline def setHandleReturn(value: (/* e */ SyntheticKeyboardEvent, /* editorState */ EditorState) => DraftHandleValue): Self = StObject.set(x, "handleReturn", js.Any.fromFunction2(value))
        
        inline def setHandleReturnUndefined: Self = StObject.set(x, "handleReturn", js.undefined)
        
        inline def setKeyBindingFn(value: /* e */ SyntheticKeyboardEvent => EditorCommand | Null): Self = StObject.set(x, "keyBindingFn", js.Any.fromFunction1(value))
        
        inline def setKeyBindingFnUndefined: Self = StObject.set(x, "keyBindingFn", js.undefined)
        
        inline def setOnBlur(value: /* e */ SyntheticEvent => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
        
        inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
        
        inline def setOnChange(value: EditorState => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        inline def setOnCopy(
          value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ /* editor */ Any, /* e */ SyntheticClipboardEvent) => Unit
        ): Self = StObject.set(x, "onCopy", js.Any.fromFunction2(value))
        
        inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
        
        inline def setOnCut(
          value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ /* editor */ Any, /* e */ SyntheticClipboardEvent) => Unit
        ): Self = StObject.set(x, "onCut", js.Any.fromFunction2(value))
        
        inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
        
        inline def setOnDownArrow(value: /* e */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onDownArrow", js.Any.fromFunction1(value))
        
        inline def setOnDownArrowUndefined: Self = StObject.set(x, "onDownArrow", js.undefined)
        
        inline def setOnEscape(value: /* e */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onEscape", js.Any.fromFunction1(value))
        
        inline def setOnEscapeUndefined: Self = StObject.set(x, "onEscape", js.undefined)
        
        inline def setOnFocus(value: /* e */ SyntheticEvent => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
        
        inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
        
        inline def setOnLeftArrow(value: /* e */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onLeftArrow", js.Any.fromFunction1(value))
        
        inline def setOnLeftArrowUndefined: Self = StObject.set(x, "onLeftArrow", js.undefined)
        
        inline def setOnRightArrow(value: /* e */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onRightArrow", js.Any.fromFunction1(value))
        
        inline def setOnRightArrowUndefined: Self = StObject.set(x, "onRightArrow", js.undefined)
        
        inline def setOnTab(value: /* e */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onTab", js.Any.fromFunction1(value))
        
        inline def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
        
        inline def setOnUpArrow(value: /* e */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onUpArrow", js.Any.fromFunction1(value))
        
        inline def setOnUpArrowUndefined: Self = StObject.set(x, "onUpArrow", js.undefined)
        
        inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        inline def setPreserveSelectionOnBlur(value: Boolean): Self = StObject.set(x, "preserveSelectionOnBlur", value.asInstanceOf[js.Any])
        
        inline def setPreserveSelectionOnBlurUndefined: Self = StObject.set(x, "preserveSelectionOnBlur", js.undefined)
        
        inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        
        inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
        
        inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
        
        inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
        
        inline def setStripPastedStyles(value: Boolean): Self = StObject.set(x, "stripPastedStyles", value.asInstanceOf[js.Any])
        
        inline def setStripPastedStylesUndefined: Self = StObject.set(x, "stripPastedStyles", js.undefined)
        
        inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
        
        inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
        
        inline def setTextAlignment(value: DraftTextAlignment): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
        
        inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
        
        inline def setTextDirectionality(value: DraftTextDirectionality): Self = StObject.set(x, "textDirectionality", value.asInstanceOf[js.Any])
        
        inline def setTextDirectionalityUndefined: Self = StObject.set(x, "textDirectionality", js.undefined)
        
        inline def setWebDriverTestID(value: String): Self = StObject.set(x, "webDriverTestID", value.asInstanceOf[js.Any])
        
        inline def setWebDriverTestIDUndefined: Self = StObject.set(x, "webDriverTestID", js.undefined)
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
      
      inline def center: typings.draftJs.draftJsStrings.center = "center".asInstanceOf[typings.draftJs.draftJsStrings.center]
      
      inline def left: typings.draftJs.draftJsStrings.left = "left".asInstanceOf[typings.draftJs.draftJsStrings.left]
      
      inline def right: typings.draftJs.draftJsStrings.right = "right".asInstanceOf[typings.draftJs.draftJsStrings.right]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.draftJs.draftJsStrings.LTR
      - typings.draftJs.draftJsStrings.RTL
      - typings.draftJs.draftJsStrings.NEUTRAL
    */
    trait DraftTextDirectionality extends StObject
    object DraftTextDirectionality {
      
      inline def LTR: typings.draftJs.draftJsStrings.LTR = "LTR".asInstanceOf[typings.draftJs.draftJsStrings.LTR]
      
      inline def NEUTRAL: typings.draftJs.draftJsStrings.NEUTRAL = "NEUTRAL".asInstanceOf[typings.draftJs.draftJsStrings.NEUTRAL]
      
      inline def RTL: typings.draftJs.draftJsStrings.RTL = "RTL".asInstanceOf[typings.draftJs.draftJsStrings.RTL]
    }
    
    type EditorCommand = DraftEditorCommand | String
  }
  
  object Components {
    
    type DraftEditorBlock = typings.react.mod.Component[Any, js.Object, Any]
  }
  
  object Selection {
    
    trait FakeClientRect extends StObject {
      
      var bottom: Double
      
      var height: Double
      
      var left: Double
      
      var right: Double
      
      var top: Double
      
      var width: Double
    }
    object FakeClientRect {
      
      inline def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): FakeClientRect = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[FakeClientRect]
      }
      
      extension [Self <: FakeClientRect](x: Self) {
        
        inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object Utils {
    
    trait KeyBindingUtil extends StObject
  }
}
