package typings.ejWebAll.ej.ComboBox

import typings.ejWebAll.ej.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Triggers before fetching data from the remote server.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  
  /** Triggers after data is fetched successfully from the remote server.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  
  /** Triggers when the data fetch request from the remote server fails.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  
  /** Accepts the template and assigns it to the popup list content of the component when the data fetch request from the remote server fails.
    * @Default {The Request Failed}
    */
  var actionFailureTemplate: js.UndefOr[String] = js.native
  
  /** Specifies whether the component allows user defined value which does not exist in data source.
    * @Default {true}
    */
  var allowCustom: js.UndefOr[Boolean] = js.native
  
  /** When allowFiltering is set to true, show the filter bar (search box) of the component. The filter action retrieves matched items through the filtering event based on the
    * characters typed in the search TextBox. If no match is found, the value of the noRecordsTemplate property will be displayed.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether suggest a first matched item in input when searching. No action happens when no matches found.
    * @Default {false}
    */
  var autofill: js.UndefOr[Boolean] = js.native
  
  /** Triggers when an item in a popup is selected or when the model value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Triggers when the popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  
  /** Triggers when ComboBox widget is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Sets CSS classes to the root element of the component that helps customize the UI styles.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Triggers on set a custom value to this component.
    */
  var customValueSpecifier: js.UndefOr[js.Function1[/* e */ CustomValueSpecifierEventArgs, Unit]] = js.native
  
  /** Accepts the list items either through local or remote service and binds it to the component. It can be an array of JSON objects or an instance of DataManager.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
  
  /** When set to true, enables RTL mode of the component that displays the content in the right-to-left direction.
    * @Default {false}
    */
  var enableRtl: js.UndefOr[Boolean] = js.native
  
  /** Specifies a value that indicates whether the component is enabled or not.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** The fields property maps the columns of the data table and binds the data to the component.
    */
  var fields: js.UndefOr[Fields] = js.native
  
  /** Triggers on typing a character in the component.
    */
  var filtering: js.UndefOr[js.Function1[/* e */ FilteringEventArgs, Unit]] = js.native
  
  /** Triggers when the component is focused.
    */
  var focus: js.UndefOr[js.Function1[/* e */ FocusEventArgs, Unit]] = js.native
  
  /** Accepts the template design and assigns it to the footer container of the popup list.
    * @Default {null}
    */
  var footerTemplate: js.UndefOr[String] = js.native
  
  /** Accepts the template design and assigns it to the group headers present in the popup list.
    * @Default {null}
    */
  var groupTemplate: js.UndefOr[String] = js.native
  
  /** Accepts the template design and assigns it to the header container of the popup list.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[String] = js.native
  
  /** Allows additional HTML attributes such as title, name, etc., and accepts n number of attributes in a key-value pair format.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Gets or sets the index of the selected item in the component.
    * @Default {null}
    */
  var index: js.UndefOr[Double] = js.native
  
  /** Accepts the template design and assigns it to each list item present in the popup.
    * @Default {null}
    */
  var itemTemplate: js.UndefOr[String] = js.native
  
  /** Overrides the global culture and localization value for this component. Default global culture is 'en-US'.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Accepts the template design and assigns it to popup list of component when no data is available on the component.
    * @Default {No Records Found}
    */
  var noRecordsTemplate: js.UndefOr[String] = js.native
  
  /** Triggers after the suggestion list is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  
  /** Accepts the value to be displayed as a watermark text on the component input.
    * @Default {null}
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /** Specifies the height of the popup list.
    * @Default {300px}
    */
  var popupHeight: js.UndefOr[String | Double] = js.native
  
  /** Specifies the width of the popup list. By default, the popup width sets based on the width of the component.
    * @Default {100%}
    */
  var popupWidth: js.UndefOr[String | Double] = js.native
  
  /** The query to retrieve the data from the data source.
    * @Default {null}
    */
  var query: js.UndefOr[Query] = js.native
  
  /** When set to true, the user interactions on the component are disabled.
    * @Default {false}
    */
  var readonly: js.UndefOr[Boolean] = js.native
  
  /** Triggers when an item in the popup is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  
  /** Specifies whether to show or hide the clear button. When the clear button is clicked, value, text, and index properties are reset to null.
    * @Default {true}
    */
  var showClearButton: js.UndefOr[Boolean] = js.native
  
  /** Specifies the sortOrder to sort the data source. The available type of sort orders are
    * @Default {ej.SortOrder.None}
    */
  var sortOrder: js.UndefOr[SortOrder | String] = js.native
  
  /** Gets or sets the display text of the selected item in the component.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  
  /** Gets or sets the value of the selected item in the component.
    * @Default {null}
    */
  var value: js.UndefOr[Double | String] = js.native
  
  /** Specifies the width of the component. By default, the component width sets based on the width of its parent container. You can also set the width in pixel values.
    * @Default {100%}
    */
  var width: js.UndefOr[Double | String] = js.native
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
    def setActionFailureTemplate(value: String): Self = this.set("actionFailureTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionFailureTemplate: Self = this.set("actionFailureTemplate", js.undefined)
    
    @scala.inline
    def setAllowCustom(value: Boolean): Self = this.set("allowCustom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCustom: Self = this.set("allowCustom", js.undefined)
    
    @scala.inline
    def setAllowFiltering(value: Boolean): Self = this.set("allowFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFiltering: Self = this.set("allowFiltering", js.undefined)
    
    @scala.inline
    def setAutofill(value: Boolean): Self = this.set("autofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutofill: Self = this.set("autofill", js.undefined)
    
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
    def setCustomValueSpecifier(value: /* e */ CustomValueSpecifierEventArgs => Unit): Self = this.set("customValueSpecifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomValueSpecifier: Self = this.set("customValueSpecifier", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Any | js.Array[_]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setEnableRtl(value: Boolean): Self = this.set("enableRtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRtl: Self = this.set("enableRtl", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFiltering(value: /* e */ FilteringEventArgs => Unit): Self = this.set("filtering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFiltering: Self = this.set("filtering", js.undefined)
    
    @scala.inline
    def setFocus(value: /* e */ FocusEventArgs => Unit): Self = this.set("focus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setFooterTemplate(value: String): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    
    @scala.inline
    def setGroupTemplate(value: String): Self = this.set("groupTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupTemplate: Self = this.set("groupTemplate", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: String): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setItemTemplate(value: String): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setNoRecordsTemplate(value: String): Self = this.set("noRecordsTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRecordsTemplate: Self = this.set("noRecordsTemplate", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPopupHeight(value: String | Double): Self = this.set("popupHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupHeight: Self = this.set("popupHeight", js.undefined)
    
    @scala.inline
    def setPopupWidth(value: String | Double): Self = this.set("popupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupWidth: Self = this.set("popupWidth", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ SelectEventArgs => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setShowClearButton(value: Boolean): Self = this.set("showClearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClearButton: Self = this.set("showClearButton", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder | String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
