package typings.ejWebAll.ej.Autocomplete

import typings.ejWebAll.ej.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Triggers when the AJAX requests Begins.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  
  /** Triggers when the AJAX requests complete. The request may get failed or succeed.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  
  /** Triggers when the data requested from AJAX get failed.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  
  /** Triggers when the data requested from AJAX will get successfully loaded in the Autocomplete widget.
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.native
  
  /** Customize &quot;Add New&quot; text (label) to be added in the autocomplete popup list for the entered text when there are no suggestions for it.
    * @Default {Add New}
    */
  var addNewText: js.UndefOr[String] = js.native
  
  /** Allows new values to be added to the autocomplete input other than the values in the suggestion list. Normally, when there are no suggestions it will display â€œNo suggestionsâ€
    * label in the popup.
    * @Default {false}
    */
  var allowAddNew: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the sorting of suggestion list item. The default sort order is ascending order. You customize sort order.
    * @Default {true}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables selecting the animation style for the popup list. Animation types can be selected through either of the following options,
    * @Default {slide}
    */
  var animateType: js.UndefOr[Animation | String] = js.native
  
  /** To focus the items in the suggestion list when the popup is shown. By default first item will be focused.
    * @Default {false}
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the case sensitive search.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[Boolean] = js.native
  
  /** Triggers when the text box value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Triggers after the suggestion popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  
  /** Triggers when Autocomplete widget is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** The root class for the Autocomplete textbox widget which helps in customizing its theme.
    * @Default {â€â€}
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** The data source contains the list of data for the suggestions list. It can be a string array or JSON array or service URL that returns JSON.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
  
  /** The time delay (in milliseconds) after which the suggestion popup will be shown.
    * @Default {200}
    */
  var delaySuggestionTimeout: js.UndefOr[Double] = js.native
  
  /** The special character which acts as a separator for the given words for multi-mode search i.e. the text after the delimiter are considered as a separate word or query for search
    * operation.
    * @Default {â€™,â€™}
    */
  var delimiterChar: js.UndefOr[String] = js.native
  
  /** Triggers after the Autocomplete widget is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** The text to be displayed in the popup when there are no suggestions available for the entered text.
    * @Default {â€œNo suggestionsâ€}
    */
  var emptyResultText: js.UndefOr[String] = js.native
  
  /** Fills the autocomplete textbox with the first matched item from the suggestion list automatically based on the entered text when enabled.
    * @Default {false}
    */
  var enableAutoFill: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables displaying the duplicate names present in the search result.
    * @Default {false}
    */
  var enableDistinct: js.UndefOr[Boolean] = js.native
  
  /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true. While refreshing the page, it retains the model value
    * from browser cookies or local storage.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** Displays the Autocomplete widgetâ€™s content from right to left when enabled.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the Autocomplete textbox widget.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Mapping fields for the suggestion items of the Autocomplete textbox widget.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  
  /** Specifies the search filter type. There are several types of search filter available such as â€˜startswithâ€™, â€˜containsâ€™, â€˜endswithâ€™, â€˜lessthanâ€™,
    * â€˜lessthanorequalâ€™, â€˜greaterthanâ€™, â€˜greaterthanorequalâ€™, â€˜equalâ€™, â€˜notequalâ€™.
    * @Default {ej.filterType.StartsWith}
    */
  var filterType: js.UndefOr[String] = js.native
  
  /** Triggers after the autocomplete textbox is focused.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  
  /** Triggers after the Autocomplete textbox gets out of the focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  
  /** The height of the Autocomplete textbox.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /** The search text can be highlighted in the AutoComplete suggestion list when enabled.
    * @Default {false}
    */
  var highlightSearch: js.UndefOr[Boolean] = js.native
  
  /** To enable or disable the diacritic characters of the Autocomplete suggestion list when filtering.
    * @Default {false}
    */
  var ignoreAccent: js.UndefOr[Boolean] = js.native
  
  /** Number of items to be displayed in the suggestion list.
    * @Default {0}
    */
  var itemsCount: js.UndefOr[Double] = js.native
  
  /** Set the localization culture for Autocomplete Widget.
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Minimum number of character to be entered in the Autocomplete textbox to show the suggestion list.
    * @Default {1}
    */
  var minCharacter: js.UndefOr[Double] = js.native
  
  /** An Autocomplete column collection can be defined and customized through the multiColumnSettings property.Column's header, field, and stringFormat can be define via
    * multiColumnSettings properties.
    */
  var multiColumnSettings: js.UndefOr[MultiColumnSettings] = js.native
  
  /** Enables or disables selecting multiple values from the suggestion list. Multiple values can be selected through either of the following options,
    * @Default {ej.MultiSelectMode.None}
    */
  var multiSelectMode: js.UndefOr[MultiSelectMode | String] = js.native
  
  /** Triggers after the suggestion list is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  
  /** The height of the suggestion list.
    * @Default {â€œ152pxâ€}
    */
  var popupHeight: js.UndefOr[String] = js.native
  
  /** The width of the suggestion list.
    * @Default {â€œautoâ€}
    */
  var popupWidth: js.UndefOr[String] = js.native
  
  /** The query to retrieve the data from the data source.
    * @Default {null}
    */
  var query: js.UndefOr[Query] = js.native
  
  /** Indicates that the autocomplete textbox values can only be readable.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** Triggers when an item has been selected from the suggestion list.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  
  /** Sets the value for the Autocomplete textbox based on the given input key value.
    */
  var selectValueByKey: js.UndefOr[Double] = js.native
  
  /** Enables or disables showing the message when there are no suggestions for the entered text.
    * @Default {true}
    */
  var showEmptyResultText: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the loading icon to intimate the searching operation. The loading icon is visible when there is a time delay to perform the search.
    * @Default {true}
    */
  var showLoadingIcon: js.UndefOr[Boolean] = js.native
  
  /** Enables the showPopup button in autocomplete textbox. When the showPopup button is clicked, it displays all the available data from the data source.
    * @Default {false}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables reset icon to clear the textbox values.
    * @Default {false}
    */
  var showResetIcon: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables rounded corner.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Sort order specifies whether the suggestion list values has to be displayed in ascending or descending order.
    * @Default {ej.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[SortOrder | String] = js.native
  
  /** The template to display the suggestion list items with customized appearance.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  
  /** The jQuery validation error message to be displayed on form validation.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  
  /** The jQuery validation rules for form validation.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  
  /** The value to be displayed in the autocomplete textbox.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
  
  /** Enables or disables the visibility of the autocomplete textbox.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** The text to be displayed when the value of the autocomplete textbox is empty.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[String] = js.native
  
  /** The width of the Autocomplete textbox.
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
    def setAddNewText(value: String): Self = this.set("addNewText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddNewText: Self = this.set("addNewText", js.undefined)
    
    @scala.inline
    def setAllowAddNew(value: Boolean): Self = this.set("allowAddNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAddNew: Self = this.set("allowAddNew", js.undefined)
    
    @scala.inline
    def setAllowSorting(value: Boolean): Self = this.set("allowSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSorting: Self = this.set("allowSorting", js.undefined)
    
    @scala.inline
    def setAnimateType(value: Animation | String): Self = this.set("animateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateType: Self = this.set("animateType", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setCaseSensitiveSearch(value: Boolean): Self = this.set("caseSensitiveSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitiveSearch: Self = this.set("caseSensitiveSearch", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ CloseEventArgs => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Any | js.Array[_]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDelaySuggestionTimeout(value: Double): Self = this.set("delaySuggestionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelaySuggestionTimeout: Self = this.set("delaySuggestionTimeout", js.undefined)
    
    @scala.inline
    def setDelimiterChar(value: String): Self = this.set("delimiterChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiterChar: Self = this.set("delimiterChar", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEmptyResultText(value: String): Self = this.set("emptyResultText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyResultText: Self = this.set("emptyResultText", js.undefined)
    
    @scala.inline
    def setEnableAutoFill(value: Boolean): Self = this.set("enableAutoFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoFill: Self = this.set("enableAutoFill", js.undefined)
    
    @scala.inline
    def setEnableDistinct(value: Boolean): Self = this.set("enableDistinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDistinct: Self = this.set("enableDistinct", js.undefined)
    
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFilterType(value: String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
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
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHighlightSearch(value: Boolean): Self = this.set("highlightSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightSearch: Self = this.set("highlightSearch", js.undefined)
    
    @scala.inline
    def setIgnoreAccent(value: Boolean): Self = this.set("ignoreAccent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreAccent: Self = this.set("ignoreAccent", js.undefined)
    
    @scala.inline
    def setItemsCount(value: Double): Self = this.set("itemsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsCount: Self = this.set("itemsCount", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMinCharacter(value: Double): Self = this.set("minCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCharacter: Self = this.set("minCharacter", js.undefined)
    
    @scala.inline
    def setMultiColumnSettings(value: MultiColumnSettings): Self = this.set("multiColumnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiColumnSettings: Self = this.set("multiColumnSettings", js.undefined)
    
    @scala.inline
    def setMultiSelectMode(value: MultiSelectMode | String): Self = this.set("multiSelectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelectMode: Self = this.set("multiSelectMode", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPopupHeight(value: String): Self = this.set("popupHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupHeight: Self = this.set("popupHeight", js.undefined)
    
    @scala.inline
    def setPopupWidth(value: String): Self = this.set("popupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupWidth: Self = this.set("popupWidth", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ SelectEventArgs => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectValueByKey(value: Double): Self = this.set("selectValueByKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectValueByKey: Self = this.set("selectValueByKey", js.undefined)
    
    @scala.inline
    def setShowEmptyResultText(value: Boolean): Self = this.set("showEmptyResultText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowEmptyResultText: Self = this.set("showEmptyResultText", js.undefined)
    
    @scala.inline
    def setShowLoadingIcon(value: Boolean): Self = this.set("showLoadingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLoadingIcon: Self = this.set("showLoadingIcon", js.undefined)
    
    @scala.inline
    def setShowPopupButton(value: Boolean): Self = this.set("showPopupButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPopupButton: Self = this.set("showPopupButton", js.undefined)
    
    @scala.inline
    def setShowResetIcon(value: Boolean): Self = this.set("showResetIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowResetIcon: Self = this.set("showResetIcon", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder | String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setValidationMessage(value: js.Any): Self = this.set("validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMessage: Self = this.set("validationMessage", js.undefined)
    
    @scala.inline
    def setValidationRules(value: js.Any): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
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
