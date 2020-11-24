package typings.ejWebAll.ej.DropDownList

import typings.ejWebAll.ej.FilterType_
import typings.ejWebAll.ej.MultiSelectMode
import typings.ejWebAll.ej.SortOrder_
import typings.ejWebAll.ej.VirtualScrollMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Fires the action before the XHR request.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  
  /** Fires the action when the list of items is bound to the DropDownList by xhr post calling
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  
  /** Fires the action when the xhr post calling failed on remote data binding with the DropDownList control.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  
  /** Fires the action when the xhr post calling succeed on remote data binding with the DropDownList control
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.native
  
  /** The Virtual Scrolling(lazy loading) feature is used to display a large amount of data that you require without buffering the entire load of a huge database records in the
    * DropDownList, that is, when scrolling, an AJAX request is sent to fetch some amount of data from the server dynamically. To achieve this scenario with DropDownList, set the
    * allowVirtualScrolling to true.
    * @Default {false}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.native
  
  /** Fires the action before the popup is ready to hide.
    */
  var beforePopupHide: js.UndefOr[js.Function1[/* e */ BeforePopupHideEventArgs, Unit]] = js.native
  
  /** Fires the action before the popup is ready to be displayed.
    */
  var beforePopupShown: js.UndefOr[js.Function1[/* e */ BeforePopupShownEventArgs, Unit]] = js.native
  
  /** Fires when the cascading happens between two DropDownList exactly after the value changes in the first dropdown and before filtering in the second Dropdown.
    */
  var cascade: js.UndefOr[js.Function1[/* e */ CascadeEventArgs, Unit]] = js.native
  
  /** The cascading DropDownLists is a series of two or more DropDownLists in which each DropDownList is filtered according to the previous DropDownListâ€™s value.
    * @Default {null}
    */
  var cascadeTo: js.UndefOr[String] = js.native
  
  /** Sets the case sensitivity of the search operation. It supports both enableFilterSearch and enableIncrementalSearch property.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[Boolean] = js.native
  
  /** Fires the action when the DropDownList controlâ€™s value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Fires the action when the list item checkbox value is changed.
    */
  var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, Unit]] = js.native
  
  /** Fires the action once the DropDownList is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Dropdown widget's style and appearance can be controlled based on 13 different default built-in themes.You can customize the appearance of the dropdown by using the cssClass
    * property. You need to specify a class name in the cssClass property and the same class name is used before the class definitions wherever the custom styles are applied.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Fires the action when the list items is bound to the DropDownList.
    */
  var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, Unit]] = js.native
  
  /** This property is used to serve data from the data services based on the query provided. To bind the data to the dropdown widget, the dataSource property is assigned with the
    * instance of the ej.DataManager.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled with the dropdown. When you enter the delimiter value, the texts after the delimiter are
    * considered as a separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,) or semi-colon (;) or
    * any other special character.
    * @Default {','}
    */
  var delimiterChar: js.UndefOr[String] = js.native
  
  /** Fires the action when the DropDownList is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** The enabled Animation property uses the easeOutQuad animation to SlideDown and SlideUp the Popup list in 200 and 100 milliseconds, respectively.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** This property selects the item in the DropDownList when the item is entered in the Search textbox.
    * @Default {false}
    */
  var enableFilterSearch: js.UndefOr[Boolean] = js.native
  
  /** Specifies to perform incremental search for the selection of items from the DropDownList with the help of this property. This helps in selecting the item by using the typed
    * character.
    * @Default {true}
    */
  var enableIncrementalSearch: js.UndefOr[Boolean] = js.native
  
  /** Saves the current model value to the browser cookies for state maintenance. While refreshing the DropDownList control page, it retains the model value and it is applied from the
    * browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** This enables the resize handler to resize the popup to any size.
    * @Default {false}
    */
  var enablePopupResize: js.UndefOr[Boolean] = js.native
  
  /** Sets the DropDownList textbox direction from right to left align.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** The serverfiltering is to perform filter action when text is typed in the search box and filtering will be done based on the collection which contains the matched item from entire
    * datasource. Serverfiltering will be done based on the entire items in DataSource.
    * @Default {false}
    */
  var enableServerFiltering: js.UndefOr[Boolean] = js.native
  
  /** This property is used to sort the Items in the DropDownList. By default, it sorts the items in an ascending order.
    * @Default {false}
    */
  var enableSorting: js.UndefOr[Boolean] = js.native
  
  /** This property is used to indicate whether the DropDownList control responds to the user interaction or not. By default, the control is in the enabled mode and you can disable it
    * by setting it to false.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Specifies the mapping fields for the data items of the DropDownList.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  
  /** When the enableFilterSearch property value is set to true, the values in the DropDownList shows the items starting with or containing the key word/letter typed in the Search
    * textbox.
    * @Default {ej.FilterType.Contains}
    */
  var filterType: js.UndefOr[FilterType_ | String] = js.native
  
  /** Fires the action when the DropDownList is focused.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  
  /** Fires the action when the DropDownList is about to lose focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  
  /** Used to create visualized header for dropdown items
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[String] = js.native
  
  /** Defines the height of the DropDownList textbox.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /** It sets the given HTML attributes for the DropDownList control such as ID, name, disabled, etc.
    * @Default {null}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Data can be fetched in the DropDownList control by using the DataSource, specifying the number of items.
    * @Default {5}
    */
  var itemsCount: js.UndefOr[Double] = js.native
  
  /** The property is used to determine whether the popup list is generated dynamically.
    * @Default {false}
    */
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  
  /** Allows the user to set the particular country or region language for the DropDownList.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Defines the maximum height of the suggestion box. This property restricts the maximum height of the popup when resize is enabled.
    * @Default {null}
    */
  var maxPopupHeight: js.UndefOr[String | Double] = js.native
  
  /** Defines the maximum width of the suggestion box. This property restricts the maximum width of the popup when resize is enabled.
    * @Default {null}
    */
  var maxPopupWidth: js.UndefOr[String | Double] = js.native
  
  /** Defines the minimum height of the suggestion box. This property restricts the minimum height of the popup when resize is enabled.
    * @Default {null}
    */
  var minPopupHeight: js.UndefOr[String | Double] = js.native
  
  /** Defines the minimum height of the suggestion box. This property restricts the minimum height of the popup when resize is enabled.
    * @Default {0}
    */
  var minPopupWidth: js.UndefOr[String | Double] = js.native
  
  /** With the help of this property, you can make a single or multi selection with the DropDownList and display the text in two modes, delimiter and visual mode. In delimiter mode, you
    * can separate the items by using the delimiter character such as comma (,) or semi-colon (;) or any other special character. In the visual mode, the items are showcased like boxes
    * with close icon in the textbox.
    * @Default {ej.MultiSelectMode.None}
    */
  var multiSelectMode: js.UndefOr[MultiSelectMode | String] = js.native
  
  /** Defines the height of the suggestion popup box in the DropDownList control.
    * @Default {152px}
    */
  var popupHeight: js.UndefOr[String | Double] = js.native
  
  /** Fires the action, once the popup is closed
    */
  var popupHide: js.UndefOr[js.Function1[/* e */ PopupHideEventArgs, Unit]] = js.native
  
  /** Fires the action, when the popup is resized.
    */
  var popupResize: js.UndefOr[js.Function1[/* e */ PopupResizeEventArgs, Unit]] = js.native
  
  /** Fires the action, when resizing a popup starts.
    */
  var popupResizeStart: js.UndefOr[js.Function1[/* e */ PopupResizeStartEventArgs, Unit]] = js.native
  
  /** Fires the action, when the popup resizing is stopped.
    */
  var popupResizeStop: js.UndefOr[js.Function1[/* e */ PopupResizeStopEventArgs, Unit]] = js.native
  
  /** Fires the action, once the popup is opened.
    */
  var popupShown: js.UndefOr[js.Function1[/* e */ PopupShownEventArgs, Unit]] = js.native
  
  /** Defines the width of the suggestion popup box in the DropDownList control.
    * @Default {auto}
    */
  var popupWidth: js.UndefOr[String | Double] = js.native
  
  /** Specifies the query to retrieve the data from the DataSource.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  
  /** Specifies that the DropDownList textbox values should be read-only.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** Fires the action before filtering the list items that starts in the DropDownList when the enableFilterSearch is enabled.
    */
  var search: js.UndefOr[js.Function1[/* e */ SearchEventArgs, Unit]] = js.native
  
  /** Fires the action, when the list of item is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  
  /** Specifies an item to be selected in the DropDownList.
    * @Default {null}
    */
  var selectedIndex: js.UndefOr[Double] = js.native
  
  /** Specifies the selectedItems for the DropDownList.
    * @Default {[]}
    */
  var selectedIndices: js.UndefOr[js.Array[_]] = js.native
  
  /** Selects multiple items in the DropDownList with the help of the checkbox control. To achieve this, enable the showCheckbox option to true.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  
  /** DropDownList control is displayed with the popup seen.
    * @Default {false}
    */
  var showPopupOnLoad: js.UndefOr[Boolean] = js.native
  
  /** DropDownList textbox displayed with the rounded corner style.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** When the enableSorting property value is set to true, this property helps to sort the items either in ascending or descending order
    * @Default {ej.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[SortOrder_ | String] = js.native
  
  /** Specifies the targetID for the DropDownListâ€™s items.
    * @Default {null}
    */
  var targetID: js.UndefOr[String] = js.native
  
  /** By default, you can add any text or image to the DropDownList item. To customize the item layout or to create your own visualized elements, you can use this template support.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  
  /** Defines the text value that is displayed in the DropDownList textbox.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  
  /** Sets the jQuery validation error message in the DropDownList
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  
  /** Sets the jQuery validation rules in the Dropdownlist.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  
  /** Specifies the value (text content) for the DropDownList control.
    * @Default {null}
    */
  var value: js.UndefOr[String | Double] = js.native
  
  /** The Virtual Scrolling feature is used to display a large amount of records in the DropDownList, that is, when scrolling, an AJAX request is sent to fetch some amount of data from
    * the server dynamically. To achieve this scenario with DropDownList, set the allowVirtualScrolling to true. You can set the itemsCount property that represents the number of items
    * to be fetched from the server on every AJAX request.
    * @Default {normal}
    */
  var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.native
  
  /** Specifies a short hint that describes the expected value of the DropDownList control.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[String] = js.native
  
  /** Defines the width of the DropDownList textbox.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = this.set("actionBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionBegin: Self = this.set("actionBegin", js.undefined)
    
    @scala.inline
    def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = this.set("actionComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionComplete: Self = this.set("actionComplete", js.undefined)
    
    @scala.inline
    def setActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = this.set("actionFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionFailure: Self = this.set("actionFailure", js.undefined)
    
    @scala.inline
    def setActionSuccess(value: /* e */ ActionSuccessEventArgs => Unit): Self = this.set("actionSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionSuccess: Self = this.set("actionSuccess", js.undefined)
    
    @scala.inline
    def setAllowVirtualScrolling(value: Boolean): Self = this.set("allowVirtualScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowVirtualScrolling: Self = this.set("allowVirtualScrolling", js.undefined)
    
    @scala.inline
    def setBeforePopupHide(value: /* e */ BeforePopupHideEventArgs => Unit): Self = this.set("beforePopupHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforePopupHide: Self = this.set("beforePopupHide", js.undefined)
    
    @scala.inline
    def setBeforePopupShown(value: /* e */ BeforePopupShownEventArgs => Unit): Self = this.set("beforePopupShown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforePopupShown: Self = this.set("beforePopupShown", js.undefined)
    
    @scala.inline
    def setCascade(value: /* e */ CascadeEventArgs => Unit): Self = this.set("cascade", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    
    @scala.inline
    def setCascadeTo(value: String): Self = this.set("cascadeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCascadeTo: Self = this.set("cascadeTo", js.undefined)
    
    @scala.inline
    def setCaseSensitiveSearch(value: Boolean): Self = this.set("caseSensitiveSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitiveSearch: Self = this.set("caseSensitiveSearch", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setCheckChange(value: /* e */ CheckChangeEventArgs => Unit): Self = this.set("checkChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCheckChange: Self = this.set("checkChange", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ DataBoundEventArgs => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDelimiterChar(value: String): Self = this.set("delimiterChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiterChar: Self = this.set("delimiterChar", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    
    @scala.inline
    def setEnableFilterSearch(value: Boolean): Self = this.set("enableFilterSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFilterSearch: Self = this.set("enableFilterSearch", js.undefined)
    
    @scala.inline
    def setEnableIncrementalSearch(value: Boolean): Self = this.set("enableIncrementalSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableIncrementalSearch: Self = this.set("enableIncrementalSearch", js.undefined)
    
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    
    @scala.inline
    def setEnablePopupResize(value: Boolean): Self = this.set("enablePopupResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePopupResize: Self = this.set("enablePopupResize", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnableServerFiltering(value: Boolean): Self = this.set("enableServerFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableServerFiltering: Self = this.set("enableServerFiltering", js.undefined)
    
    @scala.inline
    def setEnableSorting(value: Boolean): Self = this.set("enableSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSorting: Self = this.set("enableSorting", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFilterType(value: FilterType_ | String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    
    @scala.inline
    def setFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = this.set("focusIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusIn: Self = this.set("focusIn", js.undefined)
    
    @scala.inline
    def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = this.set("focusOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusOut: Self = this.set("focusOut", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: String): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setItemsCount(value: Double): Self = this.set("itemsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsCount: Self = this.set("itemsCount", js.undefined)
    
    @scala.inline
    def setLoadOnDemand(value: Boolean): Self = this.set("loadOnDemand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadOnDemand: Self = this.set("loadOnDemand", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxPopupHeight(value: String | Double): Self = this.set("maxPopupHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPopupHeight: Self = this.set("maxPopupHeight", js.undefined)
    
    @scala.inline
    def setMaxPopupWidth(value: String | Double): Self = this.set("maxPopupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPopupWidth: Self = this.set("maxPopupWidth", js.undefined)
    
    @scala.inline
    def setMinPopupHeight(value: String | Double): Self = this.set("minPopupHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPopupHeight: Self = this.set("minPopupHeight", js.undefined)
    
    @scala.inline
    def setMinPopupWidth(value: String | Double): Self = this.set("minPopupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPopupWidth: Self = this.set("minPopupWidth", js.undefined)
    
    @scala.inline
    def setMultiSelectMode(value: MultiSelectMode | String): Self = this.set("multiSelectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelectMode: Self = this.set("multiSelectMode", js.undefined)
    
    @scala.inline
    def setPopupHeight(value: String | Double): Self = this.set("popupHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupHeight: Self = this.set("popupHeight", js.undefined)
    
    @scala.inline
    def setPopupHide(value: /* e */ PopupHideEventArgs => Unit): Self = this.set("popupHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePopupHide: Self = this.set("popupHide", js.undefined)
    
    @scala.inline
    def setPopupResize(value: /* e */ PopupResizeEventArgs => Unit): Self = this.set("popupResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePopupResize: Self = this.set("popupResize", js.undefined)
    
    @scala.inline
    def setPopupResizeStart(value: /* e */ PopupResizeStartEventArgs => Unit): Self = this.set("popupResizeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePopupResizeStart: Self = this.set("popupResizeStart", js.undefined)
    
    @scala.inline
    def setPopupResizeStop(value: /* e */ PopupResizeStopEventArgs => Unit): Self = this.set("popupResizeStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePopupResizeStop: Self = this.set("popupResizeStop", js.undefined)
    
    @scala.inline
    def setPopupShown(value: /* e */ PopupShownEventArgs => Unit): Self = this.set("popupShown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePopupShown: Self = this.set("popupShown", js.undefined)
    
    @scala.inline
    def setPopupWidth(value: String | Double): Self = this.set("popupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupWidth: Self = this.set("popupWidth", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSearch(value: /* e */ SearchEventArgs => Unit): Self = this.set("search", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ SelectEventArgs => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    
    @scala.inline
    def setSelectedIndicesVarargs(value: js.Any*): Self = this.set("selectedIndices", js.Array(value :_*))
    
    @scala.inline
    def setSelectedIndices(value: js.Array[_]): Self = this.set("selectedIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIndices: Self = this.set("selectedIndices", js.undefined)
    
    @scala.inline
    def setShowCheckbox(value: Boolean): Self = this.set("showCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCheckbox: Self = this.set("showCheckbox", js.undefined)
    
    @scala.inline
    def setShowPopupOnLoad(value: Boolean): Self = this.set("showPopupOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPopupOnLoad: Self = this.set("showPopupOnLoad", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder_ | String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setTargetID(value: String): Self = this.set("targetID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetID: Self = this.set("targetID", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setValidationMessage(value: js.Any): Self = this.set("validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMessage: Self = this.set("validationMessage", js.undefined)
    
    @scala.inline
    def setValidationRules(value: js.Any): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVirtualScrollMode(value: VirtualScrollMode | String): Self = this.set("virtualScrollMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualScrollMode: Self = this.set("virtualScrollMode", js.undefined)
    
    @scala.inline
    def setWatermarkText(value: String): Self = this.set("watermarkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatermarkText: Self = this.set("watermarkText", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
