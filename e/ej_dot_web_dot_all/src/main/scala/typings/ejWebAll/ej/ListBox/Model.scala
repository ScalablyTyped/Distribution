package typings.ejWebAll.ej.ListBox

import typings.ejWebAll.ej.Query
import typings.ejWebAll.ej.VirtualScrollMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Event will be triggered before the requested data via AJAX once loaded in successfully.
    */
  var actionBeforeSuccess: js.UndefOr[js.Function1[/* e */ ActionBeforeSuccessEventArgs, Unit]] = js.native
  /** Triggers before the AJAX request begins to load data in the ListBox widget.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggers when the AJAX requests complete. The request may get failed or succeed.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Triggers when the data requested from AJAX get failed.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  /** Triggers after the data requested via AJAX is successfully loaded in the ListBox widget.
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.native
  /** Enables/disables the dragging behavior of the items in ListBox widget.
    * @Default {false}
    */
  var allowDrag: js.UndefOr[Boolean] = js.native
  /** Accepts the items which are dropped in to it, when it is set to true.
    * @Default {false}
    */
  var allowDrop: js.UndefOr[Boolean] = js.native
  /** Enables or disables multiple selection.
    * @Default {false}
    */
  var allowMultiSelection: js.UndefOr[Boolean] = js.native
  /** Loads the list data on demand via scrolling behavior to improve the applicationâ€™s performance. There are two ways to load data which can be defined using â€œvirtualScrollModeâ€
    * property.
    * @Default {false}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.native
  /** Dynamically populate data of a list box while selecting an item in another list box i.e. rendering child list box based on the item selection in parent list box. This property
    * accepts the id of the child ListBox widget to populate the data.
    * @Default {null}
    */
  var cascadeTo: js.UndefOr[String] = js.native
  /** Enables or disables the case sensitive search for list item by typing the text (search) value.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[Boolean] = js.native
  /** Triggers when the item selection is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Triggers when the list item is checked or unchecked.
    */
  var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, Unit]] = js.native
  /** Set of list items to be checked by default using its index. It works only when the showCheckbox property is set to true.
    * @Default {null}
    */
  var checkedIndices: js.UndefOr[js.Array[_]] = js.native
  /** Triggers when the ListBox widget is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** The root class for the ListBox widget to customize the existing theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Contains the list of data for generating the list items.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Triggers when the ListBox widget is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Enables or disables the search behavior to find the specific list item by typing the text value.
    * @Default {false}
    */
  var enableIncrementalSearch: js.UndefOr[Boolean] = js.native
  /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Displays the ListBox widgetâ€™s content from right to left when enabled.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Specifies ellipsis (&quot;...&quot;) representation in an overflowed list item content when it is set to false.
    * @Default {true}
    */
  var enableWordWrap: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ListBox widget.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Mapping fields for the data items of the ListBox widget.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  /** Triggers when focus the listbox items.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  /** Triggers when focus out from listbox items.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  /** Defines the height of the ListBox widget.
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.native
  /** Triggers when the list item is being dragged.
    */
  var itemDrag: js.UndefOr[js.Function1[/* e */ ItemDragEventArgs, Unit]] = js.native
  /** Triggers when the list item is ready to be dragged.
    */
  var itemDragStart: js.UndefOr[js.Function1[/* e */ ItemDragStartEventArgs, Unit]] = js.native
  /** Triggers when the list item stops dragging.
    */
  var itemDragStop: js.UndefOr[js.Function1[/* e */ ItemDragStopEventArgs, Unit]] = js.native
  /** Triggers when the list item is dropped.
    */
  var itemDrop: js.UndefOr[js.Function1[/* e */ ItemDropEventArgs, Unit]] = js.native
  /** Defines the height for individual ListBox item.
    * @Default {null}
    */
  var itemHeight: js.UndefOr[String] = js.native
  /** The number of list items to be loaded in the list box while enabling virtual scrolling and when virtualScrollMode is set to continuous.
    * @Default {5}
    */
  var itemRequestCount: js.UndefOr[Double] = js.native
  /** The number of list items to be shown in the ListBox widget. The remaining list items will be scrollable.
    * @Default {null}
    */
  var itemsCount: js.UndefOr[Double] = js.native
  /** Loads data for the listbox by default (i.e. on initialization) when it is set to true. It creates empty ListBox if it is set to false.
    * @Default {true}
    */
  var loadDataOnInit: js.UndefOr[Boolean] = js.native
  /** The query to retrieve required data from the data source.
    * @Default {ej.Query()}
    */
  var query: js.UndefOr[Query] = js.native
  /** Triggers when a list item gets selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  /** The list item to be selected by default using its index.
    * @Default {null}
    */
  var selectedIndex: js.UndefOr[Double] = js.native
  /** The list items to be selected by default using its indices. To use this property allowMultiSelection should be enabled.
    * @Default {[]}
    */
  var selectedIndices: js.UndefOr[js.Array[_]] = js.native
  /** Enables/Disables the multi selection option with the help of checkbox control.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  /** To display the ListBox container with rounded corners.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Set to sort ListBox items either by Ascending or Descending order. By default sortOrder is set as enum type of &quot;None&quot;.You can use only below mentioned type for sorting
    * purpose.
    * @Default {ej.SortOrder.None}
    */
  var sortOrder: js.UndefOr[SortOrder | String] = js.native
  /** Specifies the targetID for the listbox items.
    * @Default {null}
    */
  var targetID: js.UndefOr[String] = js.native
  /** The template to display the ListBox widget with customized appearance.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** The total number of list items to be rendered in the ListBox widget.
    * @Default {null}
    */
  var totalItemsCount: js.UndefOr[Double] = js.native
  /** Triggers when a list item gets unselected.
    */
  var unselect: js.UndefOr[js.Function1[/* e */ UnselectEventArgs, Unit]] = js.native
  /** Holds the selected items values and used to bind value to the list item using AngularJS and KnockoutJS.
    * @Default {â€œâ€}
    */
  var value: js.UndefOr[Double] = js.native
  /** Specifies the virtual scroll mode to load the list data on demand via scrolling behavior. There are two types of mode.
    * @Default {ej.VirtualScrollMode.Normal}
    */
  var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.native
  /** Defines the width of the ListBox widget.
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.native
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
    def setActionBeforeSuccess(value: /* e */ ActionBeforeSuccessEventArgs => Unit): Self = this.set("actionBeforeSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionBeforeSuccess: Self = this.set("actionBeforeSuccess", js.undefined)
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
    def setAllowDrag(value: Boolean): Self = this.set("allowDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDrag: Self = this.set("allowDrag", js.undefined)
    @scala.inline
    def setAllowDrop(value: Boolean): Self = this.set("allowDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDrop: Self = this.set("allowDrop", js.undefined)
    @scala.inline
    def setAllowMultiSelection(value: Boolean): Self = this.set("allowMultiSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultiSelection: Self = this.set("allowMultiSelection", js.undefined)
    @scala.inline
    def setAllowVirtualScrolling(value: Boolean): Self = this.set("allowVirtualScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowVirtualScrolling: Self = this.set("allowVirtualScrolling", js.undefined)
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
    def setCheckedIndicesVarargs(value: js.Any*): Self = this.set("checkedIndices", js.Array(value :_*))
    @scala.inline
    def setCheckedIndices(value: js.Array[_]): Self = this.set("checkedIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedIndices: Self = this.set("checkedIndices", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEnableIncrementalSearch(value: Boolean): Self = this.set("enableIncrementalSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableIncrementalSearch: Self = this.set("enableIncrementalSearch", js.undefined)
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnableWordWrap(value: Boolean): Self = this.set("enableWordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableWordWrap: Self = this.set("enableWordWrap", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = this.set("focusIn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFocusIn: Self = this.set("focusIn", js.undefined)
    @scala.inline
    def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = this.set("focusOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFocusOut: Self = this.set("focusOut", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setItemDrag(value: /* e */ ItemDragEventArgs => Unit): Self = this.set("itemDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemDrag: Self = this.set("itemDrag", js.undefined)
    @scala.inline
    def setItemDragStart(value: /* e */ ItemDragStartEventArgs => Unit): Self = this.set("itemDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemDragStart: Self = this.set("itemDragStart", js.undefined)
    @scala.inline
    def setItemDragStop(value: /* e */ ItemDragStopEventArgs => Unit): Self = this.set("itemDragStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemDragStop: Self = this.set("itemDragStop", js.undefined)
    @scala.inline
    def setItemDrop(value: /* e */ ItemDropEventArgs => Unit): Self = this.set("itemDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemDrop: Self = this.set("itemDrop", js.undefined)
    @scala.inline
    def setItemHeight(value: String): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    @scala.inline
    def setItemRequestCount(value: Double): Self = this.set("itemRequestCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemRequestCount: Self = this.set("itemRequestCount", js.undefined)
    @scala.inline
    def setItemsCount(value: Double): Self = this.set("itemsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsCount: Self = this.set("itemsCount", js.undefined)
    @scala.inline
    def setLoadDataOnInit(value: Boolean): Self = this.set("loadDataOnInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadDataOnInit: Self = this.set("loadDataOnInit", js.undefined)
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
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
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder | String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
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
    def setTotalItemsCount(value: Double): Self = this.set("totalItemsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalItemsCount: Self = this.set("totalItemsCount", js.undefined)
    @scala.inline
    def setUnselect(value: /* e */ UnselectEventArgs => Unit): Self = this.set("unselect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnselect: Self = this.set("unselect", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVirtualScrollMode(value: VirtualScrollMode | String): Self = this.set("virtualScrollMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualScrollMode: Self = this.set("virtualScrollMode", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

