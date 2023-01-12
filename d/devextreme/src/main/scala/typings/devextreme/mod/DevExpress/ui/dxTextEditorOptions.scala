package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.LabelMode
import typings.devextreme.mod.DevExpress.common.MaskMode
import typings.devextreme.mod.DevExpress.common.TextBoxPredefinedButton
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.std.ClipboardEvent
import typings.std.Event
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTextEditorOptions[TComponent]
  extends StObject
     with EditorOptions[TComponent] {
  
  /**
    * Allows you to add custom buttons to the input text field.
    */
  var buttons: js.UndefOr[js.Array[String | TextBoxPredefinedButton | dxTextEditorButton]] = js.undefined
  
  /**
    * Specifies the attributes to be passed on to the underlying HTML element.
    */
  var inputAttr: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies a text string used to annotate the editor&apos;s value.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the label&apos;s display mode.
    */
  var labelMode: js.UndefOr[LabelMode] = js.undefined
  
  /**
    * The editor mask that specifies the custom format of the entered string.
    */
  var mask: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a mask placeholder. A single character is recommended.
    */
  var maskChar: js.UndefOr[String] = js.undefined
  
  /**
    * A message displayed when the entered text does not match the specified pattern.
    */
  var maskInvalidMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies custom mask rules.
    */
  var maskRules: js.UndefOr[Any] = js.undefined
  
  /**
    * The value to be assigned to the `name` attribute of the underlying HTML element.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed when the UI component loses focus after the text field&apos;s content was changed using the keyboard.
    */
  var onChange: js.UndefOr[js.Function1[/* e */ NativeEventInfo[TComponent, Event], Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component&apos;s input has been copied.
    */
  var onCopy: js.UndefOr[js.Function1[/* e */ NativeEventInfo[TComponent, ClipboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component&apos;s input has been cut.
    */
  var onCut: js.UndefOr[js.Function1[/* e */ NativeEventInfo[TComponent, ClipboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when the Enter key has been pressed while the UI component is focused.
    */
  var onEnterKey: js.UndefOr[js.Function1[/* e */ NativeEventInfo[TComponent, KeyboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component gets focus.
    */
  var onFocusIn: js.UndefOr[js.Function1[/* e */ NativeEventInfo[TComponent, FocusEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component loses focus.
    */
  var onFocusOut: js.UndefOr[js.Function1[/* e */ NativeEventInfo[TComponent, FocusEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed each time the UI component&apos;s input is changed while the UI component is focused.
    */
  var onInput: js.UndefOr[js.Function1[/* e */ NativeEventInfo[TComponent, UIEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when a user is pressing a key on the keyboard.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ NativeEventInfo[TComponent, KeyboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when a user releases a key on the keyboard.
    */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ NativeEventInfo[TComponent, KeyboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component&apos;s input has been pasted.
    */
  var onPaste: js.UndefOr[js.Function1[/* e */ NativeEventInfo[TComponent, ClipboardEvent], Unit]] = js.undefined
  
  /**
    * Specifies a text string displayed when the editor&apos;s value is empty.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to display the Clear button in the UI component.
    */
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies when the UI component shows the mask. Applies only if useMaskedValue is true.
    */
  var showMaskMode: js.UndefOr[MaskMode] = js.undefined
  
  /**
    * Specifies whether or not the UI component checks the inner text for spelling mistakes.
    */
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The read-only property that holds the text displayed by the UI component input element.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the value should contain mask characters or not.
    */
  var useMaskedValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the DOM events after which the UI component&apos;s value should be updated.
    */
  var valueChangeEvent: js.UndefOr[String] = js.undefined
}
object dxTextEditorOptions {
  
  inline def apply[TComponent](): dxTextEditorOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTextEditorOptions[TComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxTextEditorOptions[?], TComponent] (val x: Self & dxTextEditorOptions[TComponent]) extends AnyVal {
    
    inline def setButtons(value: js.Array[String | TextBoxPredefinedButton | dxTextEditorButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (String | TextBoxPredefinedButton | dxTextEditorButton)*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setInputAttr(value: Any): Self = StObject.set(x, "inputAttr", value.asInstanceOf[js.Any])
    
    inline def setInputAttrUndefined: Self = StObject.set(x, "inputAttr", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelMode(value: LabelMode): Self = StObject.set(x, "labelMode", value.asInstanceOf[js.Any])
    
    inline def setLabelModeUndefined: Self = StObject.set(x, "labelMode", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskChar(value: String): Self = StObject.set(x, "maskChar", value.asInstanceOf[js.Any])
    
    inline def setMaskCharUndefined: Self = StObject.set(x, "maskChar", js.undefined)
    
    inline def setMaskInvalidMessage(value: String): Self = StObject.set(x, "maskInvalidMessage", value.asInstanceOf[js.Any])
    
    inline def setMaskInvalidMessageUndefined: Self = StObject.set(x, "maskInvalidMessage", js.undefined)
    
    inline def setMaskRules(value: Any): Self = StObject.set(x, "maskRules", value.asInstanceOf[js.Any])
    
    inline def setMaskRulesUndefined: Self = StObject.set(x, "maskRules", js.undefined)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: /* e */ NativeEventInfo[TComponent, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnCopy(value: /* e */ NativeEventInfo[TComponent, ClipboardEvent] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: /* e */ NativeEventInfo[TComponent, ClipboardEvent] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnEnterKey(value: /* e */ NativeEventInfo[TComponent, KeyboardEvent] => Unit): Self = StObject.set(x, "onEnterKey", js.Any.fromFunction1(value))
    
    inline def setOnEnterKeyUndefined: Self = StObject.set(x, "onEnterKey", js.undefined)
    
    inline def setOnFocusIn(value: /* e */ NativeEventInfo[TComponent, FocusEvent] => Unit): Self = StObject.set(x, "onFocusIn", js.Any.fromFunction1(value))
    
    inline def setOnFocusInUndefined: Self = StObject.set(x, "onFocusIn", js.undefined)
    
    inline def setOnFocusOut(value: /* e */ NativeEventInfo[TComponent, FocusEvent] => Unit): Self = StObject.set(x, "onFocusOut", js.Any.fromFunction1(value))
    
    inline def setOnFocusOutUndefined: Self = StObject.set(x, "onFocusOut", js.undefined)
    
    inline def setOnInput(value: /* e */ NativeEventInfo[TComponent, UIEvent] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnKeyDown(value: /* e */ NativeEventInfo[TComponent, KeyboardEvent] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(value: /* e */ NativeEventInfo[TComponent, KeyboardEvent] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnPaste(value: /* e */ NativeEventInfo[TComponent, ClipboardEvent] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
    
    inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
    
    inline def setShowMaskMode(value: MaskMode): Self = StObject.set(x, "showMaskMode", value.asInstanceOf[js.Any])
    
    inline def setShowMaskModeUndefined: Self = StObject.set(x, "showMaskMode", js.undefined)
    
    inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUseMaskedValue(value: Boolean): Self = StObject.set(x, "useMaskedValue", value.asInstanceOf[js.Any])
    
    inline def setUseMaskedValueUndefined: Self = StObject.set(x, "useMaskedValue", js.undefined)
    
    inline def setValueChangeEvent(value: String): Self = StObject.set(x, "valueChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setValueChangeEventUndefined: Self = StObject.set(x, "valueChangeEvent", js.undefined)
  }
}
