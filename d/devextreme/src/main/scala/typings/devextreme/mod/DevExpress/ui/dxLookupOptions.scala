package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StringDictionary
import typings.devextreme.mod.DevExpress.DOMComponent.OptionChangedEventInfo
import typings.devextreme.mod.DevExpress.common.ApplyValueMode
import typings.devextreme.mod.DevExpress.common.EditorStyle
import typings.devextreme.mod.DevExpress.common.LabelMode
import typings.devextreme.mod.DevExpress.common.MaskMode
import typings.devextreme.mod.DevExpress.common.Mode
import typings.devextreme.mod.DevExpress.common.PageLoadMode
import typings.devextreme.mod.DevExpress.common.Position
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
import typings.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownButtonTemplateDataModel
import typings.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownPredefinedButton
import typings.devextreme.mod.DevExpress.ui.dxDropDownList.SelectionChangedInfo
import typings.devextreme.mod.DevExpress.ui.dxLookup.PageLoadingEvent
import typings.devextreme.mod.DevExpress.ui.dxLookup.PullRefreshEvent
import typings.devextreme.mod.DevExpress.ui.dxLookup.ScrollEvent
import typings.devextreme.mod.DevExpress.ui.dxLookup.ValueChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxPopover.Properties
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

/* Inlined parent devextreme.devextreme.DevExpress.ui.dxDropDownListOptions<devextreme.devextreme.DevExpress.ui.dxLookup> */
trait dxLookupOptions extends StObject {
  
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
    * The text displayed on the Apply button.
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
    * The text displayed on the Cancel button.
    */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not the UI component cleans the search box when the popup window is displayed.
    */
  var cleanSearchOnOpening: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text displayed on the Clear button.
    */
  var clearButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[(DataSourceLike[CollectionWidgetItem | Any, Any]) | Null] = js.undefined
  
  /**
    * Specifies whether to render the drop-down field&apos;s content when it is displayed. If false, the content is rendered immediately.
    */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the data field whose values should be displayed.
    */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ Any, String])] = js.undefined
  
  /**
    * Returns the value currently displayed by the UI component.
    */
  var displayValue: js.UndefOr[String] = js.undefined
  
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
    * Specifies whether to vertically align the drop-down menu so that the selected item is in its center. Applies only in Material Design themes.
    */
  var dropDownCentered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the drop-down field.
    */
  var dropDownOptions: js.UndefOr[Properties] = js.undefined
  
  var elementAttr: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Specifies a custom template for the input field.
    */
  var fieldTemplate: js.UndefOr[
    template | (js.Function2[
      /* selectedItem */ Any, 
      /* fieldElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies whether the UI component can be focused using keyboard navigation.
    */
  var focusStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to display the lookup in full-screen mode.
    * @deprecated Use the dropDownOptions option instead.
    */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a custom template for group captions.
    */
  var groupTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to group UI component items.
    */
  var grouped: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  var hoverStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  var inputAttr: js.UndefOr[Any] = js.undefined
  
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a custom template for items.
    */
  var itemTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * An array of items displayed by the UI component.
    */
  var items: js.UndefOr[js.Array[CollectionWidgetItem | Any]] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelMode: js.UndefOr[LabelMode] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
  var maskChar: js.UndefOr[String] = js.undefined
  
  var maskInvalidMessage: js.UndefOr[String] = js.undefined
  
  var maskRules: js.UndefOr[Any] = js.undefined
  
  var maxLength: js.UndefOr[String | Double] = js.undefined
  
  /**
    * The minimum number of characters that must be entered into the text box to begin a search. Applies only if searchEnabled is true.
    */
  var minSearchLength: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[TextBoxType] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The text displayed on the button used to load the next page from the data source.
    */
  var nextButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text or HTML markup displayed by the UI component if the item collection is empty.
    */
  var noDataText: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxLookup, Event], Unit]] = js.undefined
  
  /**
    * A function that is executed once the drop-down editor is closed.
    */
  var onClosed: js.UndefOr[js.Function1[/* e */ EventInfo[dxLookup], Unit]] = js.undefined
  
  var onContentReady: js.UndefOr[js.Function1[/* e */ EventInfo[dxLookup], Unit]] = js.undefined
  
  var onCopy: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxLookup, ClipboardEvent], Unit]] = js.undefined
  
  var onCut: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxLookup, ClipboardEvent], Unit]] = js.undefined
  
  var onDisposing: js.UndefOr[js.Function1[/* e */ EventInfo[dxLookup], Unit]] = js.undefined
  
  var onEnterKey: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxLookup, KeyboardEvent], Unit]] = js.undefined
  
  var onFocusIn: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxLookup, FocusEvent], Unit]] = js.undefined
  
  var onFocusOut: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxLookup, FocusEvent], Unit]] = js.undefined
  
  var onInitialized: js.UndefOr[js.Function1[/* e */ InitializedEventInfo[dxLookup], Unit]] = js.undefined
  
  var onInput: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxLookup, UIEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when a list item is clicked or tapped.
    */
  var onItemClick: js.UndefOr[
    js.Function1[
      /* e */ (NativeEventInfo[dxLookup, KeyboardEvent | MouseEvent | PointerEvent]) & ItemInfo[Any], 
      Unit
    ]
  ] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxLookup, KeyboardEvent], Unit]] = js.undefined
  
  var onKeyUp: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxLookup, KeyboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed once the drop-down editor is opened.
    */
  var onOpened: js.UndefOr[js.Function1[/* e */ EventInfo[dxLookup], Unit]] = js.undefined
  
  var onOptionChanged: js.UndefOr[js.Function1[/* e */ OptionChangedEventInfo[dxLookup], Unit]] = js.undefined
  
  /**
    * A function that is executed before the next page is loaded.
    */
  var onPageLoading: js.UndefOr[js.Function1[/* e */ PageLoadingEvent, Unit]] = js.undefined
  
  var onPaste: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxLookup, ClipboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when the &apos;pull to refresh&apos; gesture is performed on the drop-down item list. Supported on mobile devices only.
    */
  var onPullRefresh: js.UndefOr[js.Function1[/* e */ PullRefreshEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed on each scroll gesture performed on the drop-down item list.
    */
  var onScroll: js.UndefOr[js.Function1[/* e */ ScrollEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a list item is selected or selection is canceled.
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ EventInfo[dxLookup] & SelectionChangedInfo[Any], Unit]] = js.undefined
  
  /**
    * A function that is executed after the UI component&apos;s value is changed.
    */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ ValueChangedEvent, Unit]] = js.undefined
  
  /**
    * Specifies whether a user can open the drop-down list by clicking a text field.
    */
  var openOnFieldClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the drop-down editor is displayed.
    */
  var opened: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the next page is loaded when a user scrolls the UI component to the bottom or when the &apos;next&apos; button is clicked.
    */
  var pageLoadMode: js.UndefOr[PageLoadMode] = js.undefined
  
  /**
    * Specifies the text shown in the pullDown panel, which is displayed when the UI component is scrolled to the bottom.
    */
  var pageLoadingText: js.UndefOr[String] = js.undefined
  
  /**
    * The text displayed by the UI component when nothing is selected.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean value specifying whether or not the UI component supports the &apos;pull down to refresh&apos; gesture.
    */
  var pullRefreshEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the text displayed in the pullDown panel when the UI component is pulled below the refresh threshold.
    */
  var pulledDownText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text shown in the pullDown panel while the list is being pulled down to the refresh threshold.
    */
  var pullingDownText: js.UndefOr[String] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the text displayed in the pullDown panel while the UI component is being refreshed.
    */
  var refreshingText: js.UndefOr[String] = js.undefined
  
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the search box is visible.
    */
  var searchEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of a data source item field or an expression whose value is compared to the search criterion.
    */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  
  /**
    * Specifies a comparison operation used to search UI component items.
    */
  var searchMode: js.UndefOr[SimplifiedSearchMode] = js.undefined
  
  /**
    * The text that is provided as a hint in the lookup&apos;s search bar.
    */
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var searchStartEvent: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the time delay, in milliseconds, after the last character has been typed in, before a search is executed.
    */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the currently selected item.
    */
  var selectedItem: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies whether to display the Cancel button in the lookup window.
    */
  var showCancelButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the Clear button in the lookup window.
    */
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the UI component displays unfiltered values until a user types a number of characters exceeding the minSearchLength property value.
    */
  var showDataBeforeSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the drop-down button is visible.
    */
  var showDropDownButton: js.UndefOr[Boolean] = js.undefined
  
  var showMaskMode: js.UndefOr[MaskMode] = js.undefined
  
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  
  var stylingMode: js.UndefOr[EditorStyle] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the widget uses item&apos;s text a title attribute.
    */
  var useItemTextAsTitle: js.UndefOr[Boolean] = js.undefined
  
  var useMaskedValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the UI component uses native scrolling.
    */
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to show lookup contents in the Popover UI component.
    */
  var usePopover: js.UndefOr[Boolean] = js.undefined
  
  var validationError: js.UndefOr[Any] = js.undefined
  
  var validationErrors: js.UndefOr[js.Array[Any]] = js.undefined
  
  var validationMessageMode: js.UndefOr[ValidationMessageMode] = js.undefined
  
  /**
    * 
    */
  var validationMessagePosition: js.UndefOr[Position | Mode] = js.undefined
  
  var validationStatus: js.UndefOr[ValidationStatus] = js.undefined
  
  /**
    * Specifies the currently selected value. May be an object if dataSource contains objects and valueExpr is not set.
    */
  var value: js.UndefOr[Any] = js.undefined
  
  /**
    * 
    * @deprecated 
    */
  var valueChangeEvent: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which data field provides unique values to the UI component&apos;s value.
    */
  var valueExpr: js.UndefOr[String | (js.Function1[/* item */ Any, String | Double | Boolean])] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  
  /**
    * Specifies whether text that exceeds the drop-down list width should be wrapped.
    */
  var wrapItemText: js.UndefOr[Boolean] = js.undefined
}
object dxLookupOptions {
  
  inline def apply(): dxLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLookupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxLookupOptions] (val x: Self) extends AnyVal {
    
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
    
    inline def setCleanSearchOnOpening(value: Boolean): Self = StObject.set(x, "cleanSearchOnOpening", value.asInstanceOf[js.Any])
    
    inline def setCleanSearchOnOpeningUndefined: Self = StObject.set(x, "cleanSearchOnOpening", js.undefined)
    
    inline def setClearButtonText(value: String): Self = StObject.set(x, "clearButtonText", value.asInstanceOf[js.Any])
    
    inline def setClearButtonTextUndefined: Self = StObject.set(x, "clearButtonText", js.undefined)
    
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
    
    inline def setDropDownCentered(value: Boolean): Self = StObject.set(x, "dropDownCentered", value.asInstanceOf[js.Any])
    
    inline def setDropDownCenteredUndefined: Self = StObject.set(x, "dropDownCentered", js.undefined)
    
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
    
    inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
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
    
    inline def setMaxLength(value: String | Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinSearchLength(value: Double): Self = StObject.set(x, "minSearchLength", value.asInstanceOf[js.Any])
    
    inline def setMinSearchLengthUndefined: Self = StObject.set(x, "minSearchLength", js.undefined)
    
    inline def setMode(value: TextBoxType): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextButtonText(value: String): Self = StObject.set(x, "nextButtonText", value.asInstanceOf[js.Any])
    
    inline def setNextButtonTextUndefined: Self = StObject.set(x, "nextButtonText", js.undefined)
    
    inline def setNoDataText(value: String): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
    
    inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
    
    inline def setOnChange(value: /* e */ NativeEventInfo[dxLookup, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClosed(value: /* e */ EventInfo[dxLookup] => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
    
    inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
    
    inline def setOnContentReady(value: /* e */ EventInfo[dxLookup] => Unit): Self = StObject.set(x, "onContentReady", js.Any.fromFunction1(value))
    
    inline def setOnContentReadyUndefined: Self = StObject.set(x, "onContentReady", js.undefined)
    
    inline def setOnCopy(value: /* e */ NativeEventInfo[dxLookup, ClipboardEvent] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: /* e */ NativeEventInfo[dxLookup, ClipboardEvent] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDisposing(value: /* e */ EventInfo[dxLookup] => Unit): Self = StObject.set(x, "onDisposing", js.Any.fromFunction1(value))
    
    inline def setOnDisposingUndefined: Self = StObject.set(x, "onDisposing", js.undefined)
    
    inline def setOnEnterKey(value: /* e */ NativeEventInfo[dxLookup, KeyboardEvent] => Unit): Self = StObject.set(x, "onEnterKey", js.Any.fromFunction1(value))
    
    inline def setOnEnterKeyUndefined: Self = StObject.set(x, "onEnterKey", js.undefined)
    
    inline def setOnFocusIn(value: /* e */ NativeEventInfo[dxLookup, FocusEvent] => Unit): Self = StObject.set(x, "onFocusIn", js.Any.fromFunction1(value))
    
    inline def setOnFocusInUndefined: Self = StObject.set(x, "onFocusIn", js.undefined)
    
    inline def setOnFocusOut(value: /* e */ NativeEventInfo[dxLookup, FocusEvent] => Unit): Self = StObject.set(x, "onFocusOut", js.Any.fromFunction1(value))
    
    inline def setOnFocusOutUndefined: Self = StObject.set(x, "onFocusOut", js.undefined)
    
    inline def setOnInitialized(value: /* e */ InitializedEventInfo[dxLookup] => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
    
    inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    inline def setOnInput(value: /* e */ NativeEventInfo[dxLookup, UIEvent] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnItemClick(
      value: /* e */ (NativeEventInfo[dxLookup, KeyboardEvent | MouseEvent | PointerEvent]) & ItemInfo[Any] => Unit
    ): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnKeyDown(value: /* e */ NativeEventInfo[dxLookup, KeyboardEvent] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(value: /* e */ NativeEventInfo[dxLookup, KeyboardEvent] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnOpened(value: /* e */ EventInfo[dxLookup] => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
    
    inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
    
    inline def setOnOptionChanged(value: /* e */ OptionChangedEventInfo[dxLookup] => Unit): Self = StObject.set(x, "onOptionChanged", js.Any.fromFunction1(value))
    
    inline def setOnOptionChangedUndefined: Self = StObject.set(x, "onOptionChanged", js.undefined)
    
    inline def setOnPageLoading(value: /* e */ PageLoadingEvent => Unit): Self = StObject.set(x, "onPageLoading", js.Any.fromFunction1(value))
    
    inline def setOnPageLoadingUndefined: Self = StObject.set(x, "onPageLoading", js.undefined)
    
    inline def setOnPaste(value: /* e */ NativeEventInfo[dxLookup, ClipboardEvent] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPullRefresh(value: /* e */ PullRefreshEvent => Unit): Self = StObject.set(x, "onPullRefresh", js.Any.fromFunction1(value))
    
    inline def setOnPullRefreshUndefined: Self = StObject.set(x, "onPullRefresh", js.undefined)
    
    inline def setOnScroll(value: /* e */ ScrollEvent => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ EventInfo[dxLookup] & SelectionChangedInfo[Any] => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setOnValueChanged(value: /* e */ ValueChangedEvent => Unit): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnValueChangedUndefined: Self = StObject.set(x, "onValueChanged", js.undefined)
    
    inline def setOpenOnFieldClick(value: Boolean): Self = StObject.set(x, "openOnFieldClick", value.asInstanceOf[js.Any])
    
    inline def setOpenOnFieldClickUndefined: Self = StObject.set(x, "openOnFieldClick", js.undefined)
    
    inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    inline def setPageLoadMode(value: PageLoadMode): Self = StObject.set(x, "pageLoadMode", value.asInstanceOf[js.Any])
    
    inline def setPageLoadModeUndefined: Self = StObject.set(x, "pageLoadMode", js.undefined)
    
    inline def setPageLoadingText(value: String): Self = StObject.set(x, "pageLoadingText", value.asInstanceOf[js.Any])
    
    inline def setPageLoadingTextUndefined: Self = StObject.set(x, "pageLoadingText", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPullRefreshEnabled(value: Boolean): Self = StObject.set(x, "pullRefreshEnabled", value.asInstanceOf[js.Any])
    
    inline def setPullRefreshEnabledUndefined: Self = StObject.set(x, "pullRefreshEnabled", js.undefined)
    
    inline def setPulledDownText(value: String): Self = StObject.set(x, "pulledDownText", value.asInstanceOf[js.Any])
    
    inline def setPulledDownTextUndefined: Self = StObject.set(x, "pulledDownText", js.undefined)
    
    inline def setPullingDownText(value: String): Self = StObject.set(x, "pullingDownText", value.asInstanceOf[js.Any])
    
    inline def setPullingDownTextUndefined: Self = StObject.set(x, "pullingDownText", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRefreshingText(value: String): Self = StObject.set(x, "refreshingText", value.asInstanceOf[js.Any])
    
    inline def setRefreshingTextUndefined: Self = StObject.set(x, "refreshingText", js.undefined)
    
    inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
    
    inline def setRtlEnabledUndefined: Self = StObject.set(x, "rtlEnabled", js.undefined)
    
    inline def setSearchEnabled(value: Boolean): Self = StObject.set(x, "searchEnabled", value.asInstanceOf[js.Any])
    
    inline def setSearchEnabledUndefined: Self = StObject.set(x, "searchEnabled", js.undefined)
    
    inline def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = StObject.set(x, "searchExpr", value.asInstanceOf[js.Any])
    
    inline def setSearchExprUndefined: Self = StObject.set(x, "searchExpr", js.undefined)
    
    inline def setSearchExprVarargs(value: (String | js.Function)*): Self = StObject.set(x, "searchExpr", js.Array(value*))
    
    inline def setSearchMode(value: SimplifiedSearchMode): Self = StObject.set(x, "searchMode", value.asInstanceOf[js.Any])
    
    inline def setSearchModeUndefined: Self = StObject.set(x, "searchMode", js.undefined)
    
    inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
    
    inline def setSearchStartEvent(value: String): Self = StObject.set(x, "searchStartEvent", value.asInstanceOf[js.Any])
    
    inline def setSearchStartEventUndefined: Self = StObject.set(x, "searchStartEvent", js.undefined)
    
    inline def setSearchTimeout(value: Double): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    inline def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    inline def setSelectedItem(value: Any): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setShowCancelButton(value: Boolean): Self = StObject.set(x, "showCancelButton", value.asInstanceOf[js.Any])
    
    inline def setShowCancelButtonUndefined: Self = StObject.set(x, "showCancelButton", js.undefined)
    
    inline def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
    
    inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
    
    inline def setShowDataBeforeSearch(value: Boolean): Self = StObject.set(x, "showDataBeforeSearch", value.asInstanceOf[js.Any])
    
    inline def setShowDataBeforeSearchUndefined: Self = StObject.set(x, "showDataBeforeSearch", js.undefined)
    
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
    
    inline def setUseItemTextAsTitle(value: Boolean): Self = StObject.set(x, "useItemTextAsTitle", value.asInstanceOf[js.Any])
    
    inline def setUseItemTextAsTitleUndefined: Self = StObject.set(x, "useItemTextAsTitle", js.undefined)
    
    inline def setUseMaskedValue(value: Boolean): Self = StObject.set(x, "useMaskedValue", value.asInstanceOf[js.Any])
    
    inline def setUseMaskedValueUndefined: Self = StObject.set(x, "useMaskedValue", js.undefined)
    
    inline def setUseNativeScrolling(value: Boolean): Self = StObject.set(x, "useNativeScrolling", value.asInstanceOf[js.Any])
    
    inline def setUseNativeScrollingUndefined: Self = StObject.set(x, "useNativeScrolling", js.undefined)
    
    inline def setUsePopover(value: Boolean): Self = StObject.set(x, "usePopover", value.asInstanceOf[js.Any])
    
    inline def setUsePopoverUndefined: Self = StObject.set(x, "usePopover", js.undefined)
    
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
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueChangeEvent(value: String): Self = StObject.set(x, "valueChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setValueChangeEventUndefined: Self = StObject.set(x, "valueChangeEvent", js.undefined)
    
    inline def setValueExpr(value: String | (js.Function1[/* item */ Any, String | Double | Boolean])): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    inline def setValueExprFunction1(value: /* item */ Any => String | Double | Boolean): Self = StObject.set(x, "valueExpr", js.Any.fromFunction1(value))
    
    inline def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthFunction0(value: () => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWrapItemText(value: Boolean): Self = StObject.set(x, "wrapItemText", value.asInstanceOf[js.Any])
    
    inline def setWrapItemTextUndefined: Self = StObject.set(x, "wrapItemText", js.undefined)
  }
}
