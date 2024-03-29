package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StringDictionary
import typings.devextreme.mod.DevExpress.DOMComponent.OptionChangedEventInfo
import typings.devextreme.mod.DevExpress.common.ApplyValueMode
import typings.devextreme.mod.DevExpress.common.EditorStyle
import typings.devextreme.mod.DevExpress.common.LabelMode
import typings.devextreme.mod.DevExpress.common.MaskMode
import typings.devextreme.mod.DevExpress.common.Mode
import typings.devextreme.mod.DevExpress.common.Position
import typings.devextreme.mod.DevExpress.common.ValidationMessageMode
import typings.devextreme.mod.DevExpress.common.ValidationStatus
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownButtonTemplateDataModel
import typings.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownPredefinedButton
import typings.devextreme.mod.DevExpress.ui.dxPopup.Properties
import typings.devextreme.mod.DevExpress.ui.dxTextBox.TextBoxType
import typings.std.ClipboardEvent
import typings.std.Element
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent devextreme.devextreme.DevExpress.ui.dxDropDownEditorOptions<devextreme.devextreme.DevExpress.ui.dxColorBox> */
trait dxColorBoxOptions extends StObject {
  
  /**
    * Specifies whether or not the UI component allows an end-user to enter a custom value.
    */
  var acceptCustomValue: js.UndefOr[Boolean] = js.undefined
  
  var accessKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not the UI component changes its state when interacting with a user.
    */
  var activeStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the text displayed on the button that applies changes and closes the drop-down editor.
    */
  var applyButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the way an end-user applies the selected value.
    */
  var applyValueMode: js.UndefOr[ApplyValueMode] = js.undefined
  
  var bindingOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Allows you to add custom buttons to the input text field.
    */
  var buttons: js.UndefOr[js.Array[DropDownPredefinedButton | dxTextEditorButton]] = js.undefined
  
  /**
    * Specifies the text displayed on the button that cancels changes and closes the drop-down editor.
    */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to render the drop-down field&apos;s content when it is displayed. If false, the content is rendered immediately.
    */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a custom template for the drop-down button.
    */
  var dropDownButtonTemplate: js.UndefOr[
    template | (js.Function2[
      /* buttonData */ DropDownButtonTemplateDataModel, 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Configures the drop-down field which holds the content.
    */
  var dropDownOptions: js.UndefOr[Properties] = js.undefined
  
  /**
    * Specifies whether or not the UI component value includes the alpha channel component.
    */
  var editAlphaChannel: js.UndefOr[Boolean] = js.undefined
  
  var elementAttr: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Specifies a custom template for the input field. Must contain the TextBox UI component.
    */
  var fieldTemplate: js.UndefOr[
    template | (js.Function2[
      /* value */ String, 
      /* fieldElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  var focusStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  var hoverStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  var inputAttr: js.UndefOr[Any] = js.undefined
  
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the size of a step by which a handle is moved using a keyboard shortcut.
    */
  var keyStep: js.UndefOr[Double] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelMode: js.UndefOr[LabelMode] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
  var maskChar: js.UndefOr[String] = js.undefined
  
  var maskInvalidMessage: js.UndefOr[String] = js.undefined
  
  var maskRules: js.UndefOr[Any] = js.undefined
  
  var maxLength: js.UndefOr[String | Double] = js.undefined
  
  var mode: js.UndefOr[TextBoxType] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxColorBox, Event], Unit]] = js.undefined
  
  /**
    * A function that is executed once the drop-down editor is closed.
    */
  var onClosed: js.UndefOr[js.Function1[/* e */ EventInfo[dxColorBox], Unit]] = js.undefined
  
  var onContentReady: js.UndefOr[js.Function1[/* e */ EventInfo[dxColorBox], Unit]] = js.undefined
  
  var onCopy: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxColorBox, ClipboardEvent], Unit]] = js.undefined
  
  var onCut: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxColorBox, ClipboardEvent], Unit]] = js.undefined
  
  var onDisposing: js.UndefOr[js.Function1[/* e */ EventInfo[dxColorBox], Unit]] = js.undefined
  
  var onEnterKey: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxColorBox, KeyboardEvent], Unit]] = js.undefined
  
  var onFocusIn: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxColorBox, FocusEvent], Unit]] = js.undefined
  
  var onFocusOut: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxColorBox, FocusEvent], Unit]] = js.undefined
  
  var onInitialized: js.UndefOr[js.Function1[/* e */ InitializedEventInfo[dxColorBox], Unit]] = js.undefined
  
  var onInput: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxColorBox, UIEvent], Unit]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxColorBox, KeyboardEvent], Unit]] = js.undefined
  
  var onKeyUp: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxColorBox, KeyboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed once the drop-down editor is opened.
    */
  var onOpened: js.UndefOr[js.Function1[/* e */ EventInfo[dxColorBox], Unit]] = js.undefined
  
  var onOptionChanged: js.UndefOr[js.Function1[/* e */ OptionChangedEventInfo[dxColorBox], Unit]] = js.undefined
  
  var onPaste: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxColorBox, ClipboardEvent], Unit]] = js.undefined
  
  var onValueChanged: js.UndefOr[
    js.Function1[/* e */ (NativeEventInfo[dxColorBox, Event]) & ValueChangedInfo, Unit]
  ] = js.undefined
  
  /**
    * Specifies whether a user can open the drop-down list by clicking a text field.
    */
  var openOnFieldClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the drop-down editor is displayed.
    */
  var opened: js.UndefOr[Boolean] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the drop-down button is visible.
    */
  var showDropDownButton: js.UndefOr[Boolean] = js.undefined
  
  var showMaskMode: js.UndefOr[MaskMode] = js.undefined
  
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  
  var stylingMode: js.UndefOr[EditorStyle] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var useMaskedValue: js.UndefOr[Boolean] = js.undefined
  
  var validationError: js.UndefOr[Any] = js.undefined
  
  var validationErrors: js.UndefOr[js.Array[Any]] = js.undefined
  
  var validationMessageMode: js.UndefOr[ValidationMessageMode] = js.undefined
  
  /**
    * 
    */
  var validationMessagePosition: js.UndefOr[Position | Mode] = js.undefined
  
  var validationStatus: js.UndefOr[ValidationStatus] = js.undefined
  
  /**
    * Specifies the currently selected value.
    */
  var value: js.UndefOr[String] = js.undefined
  
  var valueChangeEvent: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
}
object dxColorBoxOptions {
  
  inline def apply(): dxColorBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxColorBoxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxColorBoxOptions] (val x: Self) extends AnyVal {
    
    inline def setAcceptCustomValue(value: Boolean): Self = StObject.set(x, "acceptCustomValue", value.asInstanceOf[js.Any])
    
    inline def setAcceptCustomValueUndefined: Self = StObject.set(x, "acceptCustomValue", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setActiveStateEnabled(value: Boolean): Self = StObject.set(x, "activeStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setActiveStateEnabledUndefined: Self = StObject.set(x, "activeStateEnabled", js.undefined)
    
    inline def setApplyButtonText(value: String): Self = StObject.set(x, "applyButtonText", value.asInstanceOf[js.Any])
    
    inline def setApplyButtonTextUndefined: Self = StObject.set(x, "applyButtonText", js.undefined)
    
    inline def setApplyValueMode(value: ApplyValueMode): Self = StObject.set(x, "applyValueMode", value.asInstanceOf[js.Any])
    
    inline def setApplyValueModeUndefined: Self = StObject.set(x, "applyValueMode", js.undefined)
    
    inline def setBindingOptions(value: StringDictionary[Any]): Self = StObject.set(x, "bindingOptions", value.asInstanceOf[js.Any])
    
    inline def setBindingOptionsUndefined: Self = StObject.set(x, "bindingOptions", js.undefined)
    
    inline def setButtons(value: js.Array[DropDownPredefinedButton | dxTextEditorButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (DropDownPredefinedButton | dxTextEditorButton)*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    inline def setDeferRendering(value: Boolean): Self = StObject.set(x, "deferRendering", value.asInstanceOf[js.Any])
    
    inline def setDeferRenderingUndefined: Self = StObject.set(x, "deferRendering", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDropDownButtonTemplate(
      value: template | (js.Function2[
          /* buttonData */ DropDownButtonTemplateDataModel, 
          /* contentElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "dropDownButtonTemplate", value.asInstanceOf[js.Any])
    
    inline def setDropDownButtonTemplateFunction2(
      value: (/* buttonData */ DropDownButtonTemplateDataModel, /* contentElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "dropDownButtonTemplate", js.Any.fromFunction2(value))
    
    inline def setDropDownButtonTemplateUndefined: Self = StObject.set(x, "dropDownButtonTemplate", js.undefined)
    
    inline def setDropDownOptions(value: Properties): Self = StObject.set(x, "dropDownOptions", value.asInstanceOf[js.Any])
    
    inline def setDropDownOptionsUndefined: Self = StObject.set(x, "dropDownOptions", js.undefined)
    
    inline def setEditAlphaChannel(value: Boolean): Self = StObject.set(x, "editAlphaChannel", value.asInstanceOf[js.Any])
    
    inline def setEditAlphaChannelUndefined: Self = StObject.set(x, "editAlphaChannel", js.undefined)
    
    inline def setElementAttr(value: StringDictionary[Any]): Self = StObject.set(x, "elementAttr", value.asInstanceOf[js.Any])
    
    inline def setElementAttrUndefined: Self = StObject.set(x, "elementAttr", js.undefined)
    
    inline def setFieldTemplate(
      value: template | (js.Function2[
          /* value */ String, 
          /* fieldElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "fieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldTemplateFunction2(
      value: (/* value */ String, /* fieldElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "fieldTemplate", js.Any.fromFunction2(value))
    
    inline def setFieldTemplateUndefined: Self = StObject.set(x, "fieldTemplate", js.undefined)
    
    inline def setFocusStateEnabled(value: Boolean): Self = StObject.set(x, "focusStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setFocusStateEnabledUndefined: Self = StObject.set(x, "focusStateEnabled", js.undefined)
    
    inline def setHeight(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightFunction0(value: () => Double | String): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setHoverStateEnabled(value: Boolean): Self = StObject.set(x, "hoverStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverStateEnabledUndefined: Self = StObject.set(x, "hoverStateEnabled", js.undefined)
    
    inline def setInputAttr(value: Any): Self = StObject.set(x, "inputAttr", value.asInstanceOf[js.Any])
    
    inline def setInputAttrUndefined: Self = StObject.set(x, "inputAttr", js.undefined)
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setKeyStep(value: Double): Self = StObject.set(x, "keyStep", value.asInstanceOf[js.Any])
    
    inline def setKeyStepUndefined: Self = StObject.set(x, "keyStep", js.undefined)
    
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
    
    inline def setMaxLength(value: String | Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMode(value: TextBoxType): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: /* e */ NativeEventInfo[dxColorBox, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClosed(value: /* e */ EventInfo[dxColorBox] => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
    
    inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
    
    inline def setOnContentReady(value: /* e */ EventInfo[dxColorBox] => Unit): Self = StObject.set(x, "onContentReady", js.Any.fromFunction1(value))
    
    inline def setOnContentReadyUndefined: Self = StObject.set(x, "onContentReady", js.undefined)
    
    inline def setOnCopy(value: /* e */ NativeEventInfo[dxColorBox, ClipboardEvent] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: /* e */ NativeEventInfo[dxColorBox, ClipboardEvent] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDisposing(value: /* e */ EventInfo[dxColorBox] => Unit): Self = StObject.set(x, "onDisposing", js.Any.fromFunction1(value))
    
    inline def setOnDisposingUndefined: Self = StObject.set(x, "onDisposing", js.undefined)
    
    inline def setOnEnterKey(value: /* e */ NativeEventInfo[dxColorBox, KeyboardEvent] => Unit): Self = StObject.set(x, "onEnterKey", js.Any.fromFunction1(value))
    
    inline def setOnEnterKeyUndefined: Self = StObject.set(x, "onEnterKey", js.undefined)
    
    inline def setOnFocusIn(value: /* e */ NativeEventInfo[dxColorBox, FocusEvent] => Unit): Self = StObject.set(x, "onFocusIn", js.Any.fromFunction1(value))
    
    inline def setOnFocusInUndefined: Self = StObject.set(x, "onFocusIn", js.undefined)
    
    inline def setOnFocusOut(value: /* e */ NativeEventInfo[dxColorBox, FocusEvent] => Unit): Self = StObject.set(x, "onFocusOut", js.Any.fromFunction1(value))
    
    inline def setOnFocusOutUndefined: Self = StObject.set(x, "onFocusOut", js.undefined)
    
    inline def setOnInitialized(value: /* e */ InitializedEventInfo[dxColorBox] => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
    
    inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    inline def setOnInput(value: /* e */ NativeEventInfo[dxColorBox, UIEvent] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnKeyDown(value: /* e */ NativeEventInfo[dxColorBox, KeyboardEvent] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(value: /* e */ NativeEventInfo[dxColorBox, KeyboardEvent] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnOpened(value: /* e */ EventInfo[dxColorBox] => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
    
    inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
    
    inline def setOnOptionChanged(value: /* e */ OptionChangedEventInfo[dxColorBox] => Unit): Self = StObject.set(x, "onOptionChanged", js.Any.fromFunction1(value))
    
    inline def setOnOptionChangedUndefined: Self = StObject.set(x, "onOptionChanged", js.undefined)
    
    inline def setOnPaste(value: /* e */ NativeEventInfo[dxColorBox, ClipboardEvent] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnValueChanged(value: /* e */ (NativeEventInfo[dxColorBox, Event]) & ValueChangedInfo => Unit): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnValueChangedUndefined: Self = StObject.set(x, "onValueChanged", js.undefined)
    
    inline def setOpenOnFieldClick(value: Boolean): Self = StObject.set(x, "openOnFieldClick", value.asInstanceOf[js.Any])
    
    inline def setOpenOnFieldClickUndefined: Self = StObject.set(x, "openOnFieldClick", js.undefined)
    
    inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
    
    inline def setRtlEnabledUndefined: Self = StObject.set(x, "rtlEnabled", js.undefined)
    
    inline def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
    
    inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
    
    inline def setShowDropDownButton(value: Boolean): Self = StObject.set(x, "showDropDownButton", value.asInstanceOf[js.Any])
    
    inline def setShowDropDownButtonUndefined: Self = StObject.set(x, "showDropDownButton", js.undefined)
    
    inline def setShowMaskMode(value: MaskMode): Self = StObject.set(x, "showMaskMode", value.asInstanceOf[js.Any])
    
    inline def setShowMaskModeUndefined: Self = StObject.set(x, "showMaskMode", js.undefined)
    
    inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    
    inline def setStylingMode(value: EditorStyle): Self = StObject.set(x, "stylingMode", value.asInstanceOf[js.Any])
    
    inline def setStylingModeUndefined: Self = StObject.set(x, "stylingMode", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUseMaskedValue(value: Boolean): Self = StObject.set(x, "useMaskedValue", value.asInstanceOf[js.Any])
    
    inline def setUseMaskedValueUndefined: Self = StObject.set(x, "useMaskedValue", js.undefined)
    
    inline def setValidationError(value: Any): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
    
    inline def setValidationErrors(value: js.Array[Any]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: Any*): Self = StObject.set(x, "validationErrors", js.Array(value*))
    
    inline def setValidationMessageMode(value: ValidationMessageMode): Self = StObject.set(x, "validationMessageMode", value.asInstanceOf[js.Any])
    
    inline def setValidationMessageModeUndefined: Self = StObject.set(x, "validationMessageMode", js.undefined)
    
    inline def setValidationMessagePosition(value: Position | Mode): Self = StObject.set(x, "validationMessagePosition", value.asInstanceOf[js.Any])
    
    inline def setValidationMessagePositionUndefined: Self = StObject.set(x, "validationMessagePosition", js.undefined)
    
    inline def setValidationStatus(value: ValidationStatus): Self = StObject.set(x, "validationStatus", value.asInstanceOf[js.Any])
    
    inline def setValidationStatusUndefined: Self = StObject.set(x, "validationStatus", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueChangeEvent(value: String): Self = StObject.set(x, "valueChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setValueChangeEventUndefined: Self = StObject.set(x, "valueChangeEvent", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthFunction0(value: () => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
