package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StringDictionary
import typings.devextreme.mod.DevExpress.DOMComponent.OptionChangedEventInfo
import typings.devextreme.mod.DevExpress.common.ApplyValueMode
import typings.devextreme.mod.DevExpress.common.EditorStyle
import typings.devextreme.mod.DevExpress.common.LabelMode
import typings.devextreme.mod.DevExpress.common.MaskMode
import typings.devextreme.mod.DevExpress.common.SelectAllMode
import typings.devextreme.mod.DevExpress.common.SimplifiedSearchMode
import typings.devextreme.mod.DevExpress.common.ValidationMessageMode
import typings.devextreme.mod.DevExpress.common.ValidationStatus
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.ItemInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownButtonTemplateDataModel
import typings.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownPredefinedButton
import typings.devextreme.mod.DevExpress.ui.dxPopup.Properties
import typings.devextreme.mod.DevExpress.ui.dxSelectBox.CustomItemCreatingInfo
import typings.devextreme.mod.DevExpress.ui.dxTagBox.MultiTagPreparingEvent
import typings.devextreme.mod.DevExpress.ui.dxTagBox.SelectAllValueChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxTagBox.SelectionChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxTextBox.TextBoxType
import typings.std.ClipboardEvent
import typings.std.Element
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<devextreme.devextreme.DevExpress.ui.dxSelectBoxOptions<devextreme.devextreme.DevExpress.ui.dxTagBox>, std.Exclude<keyof devextreme.devextreme.DevExpress.ui.dxSelectBoxOptions<devextreme.devextreme.DevExpress.ui.dxTagBox>, 'onSelectionChanged'>> */
trait dxTagBoxOptions extends StObject {
  
  var acceptCustomValue: js.UndefOr[Boolean] = js.undefined
  
  var accessKey: js.UndefOr[String] = js.undefined
  
  var activeStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how the UI component applies values.
    */
  var applyValueMode: js.UndefOr[ApplyValueMode] = js.undefined
  
  var bindingOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var buttons: js.UndefOr[js.Array[DropDownPredefinedButton | dxTextEditorButton]] = js.undefined
  
  var dataSource: js.UndefOr[(DataSourceLike[CollectionWidgetItem | Any, Any]) | Null] = js.undefined
  
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ Any, String])] = js.undefined
  
  var displayValue: js.UndefOr[String] = js.undefined
  
  var dropDownButtonTemplate: js.UndefOr[
    template | (js.Function2[
      /* buttonData */ DropDownButtonTemplateDataModel, 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  var dropDownOptions: js.UndefOr[Properties] = js.undefined
  
  var elementAttr: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var fieldTemplate: js.UndefOr[
    template | (js.Function2[
      /* selectedItem */ Any, 
      /* fieldElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  var focusStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  var groupTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  var grouped: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to hide selected items.
    */
  var hideSelectedItems: js.UndefOr[Boolean] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  var hoverStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  var inputAttr: js.UndefOr[Any] = js.undefined
  
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  var itemTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  var items: js.UndefOr[js.Array[CollectionWidgetItem | Any]] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelMode: js.UndefOr[LabelMode] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
  var maskChar: js.UndefOr[String] = js.undefined
  
  var maskInvalidMessage: js.UndefOr[String] = js.undefined
  
  var maskRules: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the limit on displayed tags. On exceeding it, the UI component replaces all tags with a single multi-tag that displays the number of selected items.
    */
  var maxDisplayedTags: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the maximum filter query length in characters.
    */
  var maxFilterQueryLength: js.UndefOr[Double] = js.undefined
  
  var maxLength: js.UndefOr[String | Double] = js.undefined
  
  var minSearchLength: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[TextBoxType] = js.undefined
  
  /**
    * A Boolean value specifying whether or not the UI component is multiline.
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var noDataText: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxTagBox, Event], Unit]] = js.undefined
  
  var onClosed: js.UndefOr[js.Function1[/* e */ EventInfo[dxTagBox], Unit]] = js.undefined
  
  var onContentReady: js.UndefOr[js.Function1[/* e */ EventInfo[dxTagBox], Unit]] = js.undefined
  
  var onCopy: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxTagBox, ClipboardEvent], Unit]] = js.undefined
  
  var onCustomItemCreating: js.UndefOr[js.Function1[/* e */ EventInfo[dxTagBox] & CustomItemCreatingInfo, Unit]] = js.undefined
  
  var onCut: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxTagBox, ClipboardEvent], Unit]] = js.undefined
  
  var onDisposing: js.UndefOr[js.Function1[/* e */ EventInfo[dxTagBox], Unit]] = js.undefined
  
  var onEnterKey: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxTagBox, KeyboardEvent], Unit]] = js.undefined
  
  var onFocusIn: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxTagBox, FocusEvent], Unit]] = js.undefined
  
  var onFocusOut: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxTagBox, FocusEvent], Unit]] = js.undefined
  
  var onInitialized: js.UndefOr[js.Function1[/* e */ InitializedEventInfo[dxTagBox], Unit]] = js.undefined
  
  var onInput: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxTagBox, UIEvent], Unit]] = js.undefined
  
  var onItemClick: js.UndefOr[
    js.Function1[
      /* e */ (NativeEventInfo[dxTagBox, KeyboardEvent | MouseEvent | PointerEvent]) & ItemInfo[Any], 
      Unit
    ]
  ] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxTagBox, KeyboardEvent], Unit]] = js.undefined
  
  var onKeyUp: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxTagBox, KeyboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed before the multi-tag is rendered.
    */
  var onMultiTagPreparing: js.UndefOr[js.Function1[/* e */ MultiTagPreparingEvent, Unit]] = js.undefined
  
  var onOpened: js.UndefOr[js.Function1[/* e */ EventInfo[dxTagBox], Unit]] = js.undefined
  
  var onOptionChanged: js.UndefOr[js.Function1[/* e */ OptionChangedEventInfo[dxTagBox], Unit]] = js.undefined
  
  var onPaste: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxTagBox, ClipboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when the &apos;Select All&apos; check box value is changed. Applies only if showSelectionControls is true.
    */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ SelectAllValueChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a list item is selected or selection is canceled.
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ SelectionChangedEvent, Unit]] = js.undefined
  
  var onValueChanged: js.UndefOr[
    js.Function1[
      /* e */ (NativeEventInfo[dxTagBox, KeyboardEvent | MouseEvent | PointerEvent | Event]) & ValueChangedInfo, 
      Unit
    ]
  ] = js.undefined
  
  var openOnFieldClick: js.UndefOr[Boolean] = js.undefined
  
  var opened: js.UndefOr[Boolean] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  
  var searchEnabled: js.UndefOr[Boolean] = js.undefined
  
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  
  var searchMode: js.UndefOr[SimplifiedSearchMode] = js.undefined
  
  var searchTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the mode in which all items are selected.
    */
  var selectAllMode: js.UndefOr[SelectAllMode] = js.undefined
  
  /**
    * Specifies the text displayed at the &apos;Select All&apos; check box.
    */
  var selectAllText: js.UndefOr[String] = js.undefined
  
  var selectedItem: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the currently selected items.
    */
  var selectedItems: js.UndefOr[js.Array[String | Double | Any]] = js.undefined
  
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  
  var showDataBeforeSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the drop-down button is visible.
    */
  var showDropDownButton: js.UndefOr[Boolean] = js.undefined
  
  var showMaskMode: js.UndefOr[MaskMode] = js.undefined
  
  /**
    * Specifies whether the multi-tag is shown without ordinary tags.
    */
  var showMultiTagOnly: js.UndefOr[Boolean] = js.undefined
  
  var showSelectionControls: js.UndefOr[Boolean] = js.undefined
  
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  
  var stylingMode: js.UndefOr[EditorStyle] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a custom template for tags.
    */
  var tagTemplate: js.UndefOr[
    template | (js.Function2[
      /* itemData */ Any, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var useItemTextAsTitle: js.UndefOr[Boolean] = js.undefined
  
  var useMaskedValue: js.UndefOr[Boolean] = js.undefined
  
  var validationError: js.UndefOr[Any] = js.undefined
  
  var validationErrors: js.UndefOr[js.Array[Any]] = js.undefined
  
  var validationMessageMode: js.UndefOr[ValidationMessageMode] = js.undefined
  
  var validationStatus: js.UndefOr[ValidationStatus] = js.undefined
  
  /**
    * Specifies the selected items.
    */
  var value: js.UndefOr[js.Array[String | Double | Any]] = js.undefined
  
  var valueChangeEvent: js.UndefOr[String] = js.undefined
  
  var valueExpr: js.UndefOr[String | (js.Function1[/* item */ Any, String | Double | Boolean])] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  
  var wrapItemText: js.UndefOr[Boolean] = js.undefined
}
object dxTagBoxOptions {
  
  inline def apply(): dxTagBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTagBoxOptions]
  }
  
  extension [Self <: dxTagBoxOptions](x: Self) {
    
    inline def setAcceptCustomValue(value: Boolean): Self = StObject.set(x, "acceptCustomValue", value.asInstanceOf[js.Any])
    
    inline def setAcceptCustomValueUndefined: Self = StObject.set(x, "acceptCustomValue", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setActiveStateEnabled(value: Boolean): Self = StObject.set(x, "activeStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setActiveStateEnabledUndefined: Self = StObject.set(x, "activeStateEnabled", js.undefined)
    
    inline def setApplyValueMode(value: ApplyValueMode): Self = StObject.set(x, "applyValueMode", value.asInstanceOf[js.Any])
    
    inline def setApplyValueModeUndefined: Self = StObject.set(x, "applyValueMode", js.undefined)
    
    inline def setBindingOptions(value: StringDictionary[Any]): Self = StObject.set(x, "bindingOptions", value.asInstanceOf[js.Any])
    
    inline def setBindingOptionsUndefined: Self = StObject.set(x, "bindingOptions", js.undefined)
    
    inline def setButtons(value: js.Array[DropDownPredefinedButton | dxTextEditorButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (DropDownPredefinedButton | dxTextEditorButton)*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDataSource(value: DataSourceLike[CollectionWidgetItem | Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: (CollectionWidgetItem | Any)*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDeferRendering(value: Boolean): Self = StObject.set(x, "deferRendering", value.asInstanceOf[js.Any])
    
    inline def setDeferRenderingUndefined: Self = StObject.set(x, "deferRendering", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayExpr(value: String | (js.Function1[/* item */ Any, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* item */ Any => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    inline def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
    
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
    
    inline def setElementAttr(value: StringDictionary[Any]): Self = StObject.set(x, "elementAttr", value.asInstanceOf[js.Any])
    
    inline def setElementAttrUndefined: Self = StObject.set(x, "elementAttr", js.undefined)
    
    inline def setFieldTemplate(
      value: template | (js.Function2[
          /* selectedItem */ Any, 
          /* fieldElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "fieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldTemplateFunction2(
      value: (/* selectedItem */ Any, /* fieldElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "fieldTemplate", js.Any.fromFunction2(value))
    
    inline def setFieldTemplateUndefined: Self = StObject.set(x, "fieldTemplate", js.undefined)
    
    inline def setFocusStateEnabled(value: Boolean): Self = StObject.set(x, "focusStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setFocusStateEnabledUndefined: Self = StObject.set(x, "focusStateEnabled", js.undefined)
    
    inline def setGroupTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "groupTemplate", value.asInstanceOf[js.Any])
    
    inline def setGroupTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "groupTemplate", js.Any.fromFunction3(value))
    
    inline def setGroupTemplateUndefined: Self = StObject.set(x, "groupTemplate", js.undefined)
    
    inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
    
    inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
    
    inline def setHeight(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightFunction0(value: () => Double | String): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHideSelectedItems(value: Boolean): Self = StObject.set(x, "hideSelectedItems", value.asInstanceOf[js.Any])
    
    inline def setHideSelectedItemsUndefined: Self = StObject.set(x, "hideSelectedItems", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setHoverStateEnabled(value: Boolean): Self = StObject.set(x, "hoverStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverStateEnabledUndefined: Self = StObject.set(x, "hoverStateEnabled", js.undefined)
    
    inline def setInputAttr(value: Any): Self = StObject.set(x, "inputAttr", value.asInstanceOf[js.Any])
    
    inline def setInputAttrUndefined: Self = StObject.set(x, "inputAttr", js.undefined)
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setItemTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
    
    inline def setItemTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction3(value))
    
    inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
    
    inline def setItems(value: js.Array[CollectionWidgetItem | Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: (CollectionWidgetItem | Any)*): Self = StObject.set(x, "items", js.Array(value*))
    
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
    
    inline def setMaxDisplayedTags(value: Double): Self = StObject.set(x, "maxDisplayedTags", value.asInstanceOf[js.Any])
    
    inline def setMaxDisplayedTagsUndefined: Self = StObject.set(x, "maxDisplayedTags", js.undefined)
    
    inline def setMaxFilterQueryLength(value: Double): Self = StObject.set(x, "maxFilterQueryLength", value.asInstanceOf[js.Any])
    
    inline def setMaxFilterQueryLengthUndefined: Self = StObject.set(x, "maxFilterQueryLength", js.undefined)
    
    inline def setMaxLength(value: String | Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinSearchLength(value: Double): Self = StObject.set(x, "minSearchLength", value.asInstanceOf[js.Any])
    
    inline def setMinSearchLengthUndefined: Self = StObject.set(x, "minSearchLength", js.undefined)
    
    inline def setMode(value: TextBoxType): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoDataText(value: String): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
    
    inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
    
    inline def setOnChange(value: /* e */ NativeEventInfo[dxTagBox, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClosed(value: /* e */ EventInfo[dxTagBox] => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
    
    inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
    
    inline def setOnContentReady(value: /* e */ EventInfo[dxTagBox] => Unit): Self = StObject.set(x, "onContentReady", js.Any.fromFunction1(value))
    
    inline def setOnContentReadyUndefined: Self = StObject.set(x, "onContentReady", js.undefined)
    
    inline def setOnCopy(value: /* e */ NativeEventInfo[dxTagBox, ClipboardEvent] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCustomItemCreating(value: /* e */ EventInfo[dxTagBox] & CustomItemCreatingInfo => Unit): Self = StObject.set(x, "onCustomItemCreating", js.Any.fromFunction1(value))
    
    inline def setOnCustomItemCreatingUndefined: Self = StObject.set(x, "onCustomItemCreating", js.undefined)
    
    inline def setOnCut(value: /* e */ NativeEventInfo[dxTagBox, ClipboardEvent] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDisposing(value: /* e */ EventInfo[dxTagBox] => Unit): Self = StObject.set(x, "onDisposing", js.Any.fromFunction1(value))
    
    inline def setOnDisposingUndefined: Self = StObject.set(x, "onDisposing", js.undefined)
    
    inline def setOnEnterKey(value: /* e */ NativeEventInfo[dxTagBox, KeyboardEvent] => Unit): Self = StObject.set(x, "onEnterKey", js.Any.fromFunction1(value))
    
    inline def setOnEnterKeyUndefined: Self = StObject.set(x, "onEnterKey", js.undefined)
    
    inline def setOnFocusIn(value: /* e */ NativeEventInfo[dxTagBox, FocusEvent] => Unit): Self = StObject.set(x, "onFocusIn", js.Any.fromFunction1(value))
    
    inline def setOnFocusInUndefined: Self = StObject.set(x, "onFocusIn", js.undefined)
    
    inline def setOnFocusOut(value: /* e */ NativeEventInfo[dxTagBox, FocusEvent] => Unit): Self = StObject.set(x, "onFocusOut", js.Any.fromFunction1(value))
    
    inline def setOnFocusOutUndefined: Self = StObject.set(x, "onFocusOut", js.undefined)
    
    inline def setOnInitialized(value: /* e */ InitializedEventInfo[dxTagBox] => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
    
    inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    inline def setOnInput(value: /* e */ NativeEventInfo[dxTagBox, UIEvent] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnItemClick(
      value: /* e */ (NativeEventInfo[dxTagBox, KeyboardEvent | MouseEvent | PointerEvent]) & ItemInfo[Any] => Unit
    ): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnKeyDown(value: /* e */ NativeEventInfo[dxTagBox, KeyboardEvent] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(value: /* e */ NativeEventInfo[dxTagBox, KeyboardEvent] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnMultiTagPreparing(value: /* e */ MultiTagPreparingEvent => Unit): Self = StObject.set(x, "onMultiTagPreparing", js.Any.fromFunction1(value))
    
    inline def setOnMultiTagPreparingUndefined: Self = StObject.set(x, "onMultiTagPreparing", js.undefined)
    
    inline def setOnOpened(value: /* e */ EventInfo[dxTagBox] => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
    
    inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
    
    inline def setOnOptionChanged(value: /* e */ OptionChangedEventInfo[dxTagBox] => Unit): Self = StObject.set(x, "onOptionChanged", js.Any.fromFunction1(value))
    
    inline def setOnOptionChangedUndefined: Self = StObject.set(x, "onOptionChanged", js.undefined)
    
    inline def setOnPaste(value: /* e */ NativeEventInfo[dxTagBox, ClipboardEvent] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnSelectAllValueChanged(value: /* e */ SelectAllValueChangedEvent => Unit): Self = StObject.set(x, "onSelectAllValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectAllValueChangedUndefined: Self = StObject.set(x, "onSelectAllValueChanged", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ SelectionChangedEvent => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setOnValueChanged(
      value: /* e */ (NativeEventInfo[dxTagBox, KeyboardEvent | MouseEvent | PointerEvent | Event]) & ValueChangedInfo => Unit
    ): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
    
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
    
    inline def setSearchEnabled(value: Boolean): Self = StObject.set(x, "searchEnabled", value.asInstanceOf[js.Any])
    
    inline def setSearchEnabledUndefined: Self = StObject.set(x, "searchEnabled", js.undefined)
    
    inline def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = StObject.set(x, "searchExpr", value.asInstanceOf[js.Any])
    
    inline def setSearchExprUndefined: Self = StObject.set(x, "searchExpr", js.undefined)
    
    inline def setSearchExprVarargs(value: (String | js.Function)*): Self = StObject.set(x, "searchExpr", js.Array(value*))
    
    inline def setSearchMode(value: SimplifiedSearchMode): Self = StObject.set(x, "searchMode", value.asInstanceOf[js.Any])
    
    inline def setSearchModeUndefined: Self = StObject.set(x, "searchMode", js.undefined)
    
    inline def setSearchTimeout(value: Double): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    inline def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    inline def setSelectAllMode(value: SelectAllMode): Self = StObject.set(x, "selectAllMode", value.asInstanceOf[js.Any])
    
    inline def setSelectAllModeUndefined: Self = StObject.set(x, "selectAllMode", js.undefined)
    
    inline def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    inline def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
    
    inline def setSelectedItem(value: Any): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setSelectedItems(value: js.Array[String | Double | Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: (String | Double | Any)*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    
    inline def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
    
    inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
    
    inline def setShowDataBeforeSearch(value: Boolean): Self = StObject.set(x, "showDataBeforeSearch", value.asInstanceOf[js.Any])
    
    inline def setShowDataBeforeSearchUndefined: Self = StObject.set(x, "showDataBeforeSearch", js.undefined)
    
    inline def setShowDropDownButton(value: Boolean): Self = StObject.set(x, "showDropDownButton", value.asInstanceOf[js.Any])
    
    inline def setShowDropDownButtonUndefined: Self = StObject.set(x, "showDropDownButton", js.undefined)
    
    inline def setShowMaskMode(value: MaskMode): Self = StObject.set(x, "showMaskMode", value.asInstanceOf[js.Any])
    
    inline def setShowMaskModeUndefined: Self = StObject.set(x, "showMaskMode", js.undefined)
    
    inline def setShowMultiTagOnly(value: Boolean): Self = StObject.set(x, "showMultiTagOnly", value.asInstanceOf[js.Any])
    
    inline def setShowMultiTagOnlyUndefined: Self = StObject.set(x, "showMultiTagOnly", js.undefined)
    
    inline def setShowSelectionControls(value: Boolean): Self = StObject.set(x, "showSelectionControls", value.asInstanceOf[js.Any])
    
    inline def setShowSelectionControlsUndefined: Self = StObject.set(x, "showSelectionControls", js.undefined)
    
    inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    
    inline def setStylingMode(value: EditorStyle): Self = StObject.set(x, "stylingMode", value.asInstanceOf[js.Any])
    
    inline def setStylingModeUndefined: Self = StObject.set(x, "stylingMode", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTagTemplate(
      value: template | (js.Function2[
          /* itemData */ Any, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "tagTemplate", value.asInstanceOf[js.Any])
    
    inline def setTagTemplateFunction2(
      value: (/* itemData */ Any, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "tagTemplate", js.Any.fromFunction2(value))
    
    inline def setTagTemplateUndefined: Self = StObject.set(x, "tagTemplate", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUseItemTextAsTitle(value: Boolean): Self = StObject.set(x, "useItemTextAsTitle", value.asInstanceOf[js.Any])
    
    inline def setUseItemTextAsTitleUndefined: Self = StObject.set(x, "useItemTextAsTitle", js.undefined)
    
    inline def setUseMaskedValue(value: Boolean): Self = StObject.set(x, "useMaskedValue", value.asInstanceOf[js.Any])
    
    inline def setUseMaskedValueUndefined: Self = StObject.set(x, "useMaskedValue", js.undefined)
    
    inline def setValidationError(value: Any): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
    
    inline def setValidationErrors(value: js.Array[Any]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: Any*): Self = StObject.set(x, "validationErrors", js.Array(value*))
    
    inline def setValidationMessageMode(value: ValidationMessageMode): Self = StObject.set(x, "validationMessageMode", value.asInstanceOf[js.Any])
    
    inline def setValidationMessageModeUndefined: Self = StObject.set(x, "validationMessageMode", js.undefined)
    
    inline def setValidationStatus(value: ValidationStatus): Self = StObject.set(x, "validationStatus", value.asInstanceOf[js.Any])
    
    inline def setValidationStatusUndefined: Self = StObject.set(x, "validationStatus", js.undefined)
    
    inline def setValue(value: js.Array[String | Double | Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueChangeEvent(value: String): Self = StObject.set(x, "valueChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setValueChangeEventUndefined: Self = StObject.set(x, "valueChangeEvent", js.undefined)
    
    inline def setValueExpr(value: String | (js.Function1[/* item */ Any, String | Double | Boolean])): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    inline def setValueExprFunction1(value: /* item */ Any => String | Double | Boolean): Self = StObject.set(x, "valueExpr", js.Any.fromFunction1(value))
    
    inline def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (String | Double | Any)*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthFunction0(value: () => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWrapItemText(value: Boolean): Self = StObject.set(x, "wrapItemText", value.asInstanceOf[js.Any])
    
    inline def setWrapItemTextUndefined: Self = StObject.set(x, "wrapItemText", js.undefined)
  }
}
