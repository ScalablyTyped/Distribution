package typings
package ejDotWebDotAllLib.ejNs.ListBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Event will be triggered before the requested data via AJAX once loaded in successfully.
    */
  var actionBeforeSuccess: js.UndefOr[js.Function1[/* e */ ActionBeforeSuccessEventArgs, scala.Unit]] = js.undefined
  /** Triggers before the AJAX request begins to load data in the ListBox widget.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the AJAX requests complete. The request may get failed or succeed.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the data requested from AJAX get failed.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, scala.Unit]] = js.undefined
  /** Triggers after the data requested via AJAX is successfully loaded in the ListBox widget.
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, scala.Unit]] = js.undefined
  /** Enables/disables the dragging behavior of the items in ListBox widget.
    * @Default {false}
    */
  var allowDrag: js.UndefOr[scala.Boolean] = js.undefined
  /** Accepts the items which are dropped in to it, when it is set to true.
    * @Default {false}
    */
  var allowDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables multiple selection.
    * @Default {false}
    */
  var allowMultiSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Loads the list data on demand via scrolling behavior to improve the applicationâ€™s performance. There are two ways to load data which can be defined using â€œvirtualScrollModeâ€
    * property.
    * @Default {false}
    */
  var allowVirtualScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /** Dynamically populate data of a list box while selecting an item in another list box i.e. rendering child list box based on the item selection in parent list box. This property
    * accepts the id of the child ListBox widget to populate the data.
    * @Default {null}
    */
  var cascadeTo: js.UndefOr[java.lang.String] = js.undefined
  /** Enables or disables the case sensitive search for list item by typing the text (search) value.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when the item selection is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the list item is checked or unchecked.
    */
  var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, scala.Unit]] = js.undefined
  /** Set of list items to be checked by default using its index. It works only when the showCheckbox property is set to true.
    * @Default {null}
    */
  var checkedIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** Triggers when the ListBox widget is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** The root class for the ListBox widget to customize the existing theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Contains the list of data for generating the list items.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Triggers when the ListBox widget is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Enables or disables the search behavior to find the specific list item by typing the text value.
    * @Default {false}
    */
  var enableIncrementalSearch: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Displays the ListBox widgetâ€™s content from right to left when enabled.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies ellipsis (&quot;...&quot;) representation in an overflowed list item content when it is set to false.
    * @Default {true}
    */
  var enableWordWrap: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ListBox widget.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Mapping fields for the data items of the ListBox widget.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Triggers when focus the listbox items.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, scala.Unit]] = js.undefined
  /** Triggers when focus out from listbox items.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, scala.Unit]] = js.undefined
  /** Defines the height of the ListBox widget.
    * @Default {null}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when the list item is being dragged.
    */
  var itemDrag: js.UndefOr[js.Function1[/* e */ ItemDragEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the list item is ready to be dragged.
    */
  var itemDragStart: js.UndefOr[js.Function1[/* e */ ItemDragStartEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the list item stops dragging.
    */
  var itemDragStop: js.UndefOr[js.Function1[/* e */ ItemDragStopEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the list item is dropped.
    */
  var itemDrop: js.UndefOr[js.Function1[/* e */ ItemDropEventArgs, scala.Unit]] = js.undefined
  /** Defines the height for individual ListBox item.
    * @Default {null}
    */
  var itemHeight: js.UndefOr[java.lang.String] = js.undefined
  /** The number of list items to be loaded in the list box while enabling virtual scrolling and when virtualScrollMode is set to continuous.
    * @Default {5}
    */
  var itemRequestCount: js.UndefOr[scala.Double] = js.undefined
  /** The number of list items to be shown in the ListBox widget. The remaining list items will be scrollable.
    * @Default {null}
    */
  var itemsCount: js.UndefOr[scala.Double] = js.undefined
  /** Loads data for the listbox by default (i.e. on initialization) when it is set to true. It creates empty ListBox if it is set to false.
    * @Default {true}
    */
  var loadDataOnInit: js.UndefOr[scala.Boolean] = js.undefined
  /** The query to retrieve required data from the data source.
    * @Default {ej.Query()}
    */
  var query: js.UndefOr[ejDotWebDotAllLib.ejNs.Query] = js.undefined
  /** Triggers when a list item gets selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, scala.Unit]] = js.undefined
  /** The list item to be selected by default using its index.
    * @Default {null}
    */
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
  /** The list items to be selected by default using its indices. To use this property allowMultiSelection should be enabled.
    * @Default {[]}
    */
  var selectedIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** Enables/Disables the multi selection option with the help of checkbox control.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /** To display the ListBox container with rounded corners.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Set to sort ListBox items either by Ascending or Descending order. By default sortOrder is set as enum type of &quot;None&quot;.You can use only below mentioned type for sorting
    * purpose.
    * @Default {ej.SortOrder.None}
    */
  var sortOrder: js.UndefOr[SortOrder | java.lang.String] = js.undefined
  /** Specifies the targetID for the listbox items.
    * @Default {null}
    */
  var targetID: js.UndefOr[java.lang.String] = js.undefined
  /** The template to display the ListBox widget with customized appearance.
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of list items to be rendered in the ListBox widget.
    * @Default {null}
    */
  var totalItemsCount: js.UndefOr[scala.Double] = js.undefined
  /** Triggers when a list item gets unselected.
    */
  var unselect: js.UndefOr[js.Function1[/* e */ UnselectEventArgs, scala.Unit]] = js.undefined
  /** Holds the selected items values and used to bind value to the list item using AngularJS and KnockoutJS.
    * @Default {â€œâ€}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the virtual scroll mode to load the list data on demand via scrolling behavior. There are two types of mode.
    * @Default {ej.VirtualScrollMode.Normal}
    */
  var virtualScrollMode: js.UndefOr[ejDotWebDotAllLib.ejNs.VirtualScrollMode | java.lang.String] = js.undefined
  /** Defines the width of the ListBox widget.
    * @Default {null}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBeforeSuccess: js.Function1[/* e */ ActionBeforeSuccessEventArgs, scala.Unit] = null,
    actionBegin: js.Function1[/* e */ ActionBeginEventArgs, scala.Unit] = null,
    actionComplete: js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit] = null,
    actionFailure: js.Function1[/* e */ ActionFailureEventArgs, scala.Unit] = null,
    actionSuccess: js.Function1[/* e */ ActionSuccessEventArgs, scala.Unit] = null,
    allowDrag: js.UndefOr[scala.Boolean] = js.undefined,
    allowDrop: js.UndefOr[scala.Boolean] = js.undefined,
    allowMultiSelection: js.UndefOr[scala.Boolean] = js.undefined,
    allowVirtualScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    cascadeTo: java.lang.String = null,
    caseSensitiveSearch: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function1[/* e */ ChangeEventArgs, scala.Unit] = null,
    checkChange: js.Function1[/* e */ CheckChangeEventArgs, scala.Unit] = null,
    checkedIndices: js.Array[_] = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    dataSource: js.Any = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    enableIncrementalSearch: js.UndefOr[scala.Boolean] = js.undefined,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableWordWrap: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    fields: Fields = null,
    focusIn: js.Function1[/* e */ FocusInEventArgs, scala.Unit] = null,
    focusOut: js.Function1[/* e */ FocusOutEventArgs, scala.Unit] = null,
    height: java.lang.String = null,
    itemDrag: js.Function1[/* e */ ItemDragEventArgs, scala.Unit] = null,
    itemDragStart: js.Function1[/* e */ ItemDragStartEventArgs, scala.Unit] = null,
    itemDragStop: js.Function1[/* e */ ItemDragStopEventArgs, scala.Unit] = null,
    itemDrop: js.Function1[/* e */ ItemDropEventArgs, scala.Unit] = null,
    itemHeight: java.lang.String = null,
    itemRequestCount: scala.Int | scala.Double = null,
    itemsCount: scala.Int | scala.Double = null,
    loadDataOnInit: js.UndefOr[scala.Boolean] = js.undefined,
    query: ejDotWebDotAllLib.ejNs.Query = null,
    select: js.Function1[/* e */ SelectEventArgs, scala.Unit] = null,
    selectedIndex: scala.Int | scala.Double = null,
    selectedIndices: js.Array[_] = null,
    showCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    sortOrder: SortOrder | java.lang.String = null,
    targetID: java.lang.String = null,
    template: java.lang.String = null,
    totalItemsCount: scala.Int | scala.Double = null,
    unselect: js.Function1[/* e */ UnselectEventArgs, scala.Unit] = null,
    value: scala.Int | scala.Double = null,
    virtualScrollMode: ejDotWebDotAllLib.ejNs.VirtualScrollMode | java.lang.String = null,
    width: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBeforeSuccess != null) __obj.updateDynamic("actionBeforeSuccess")(actionBeforeSuccess)
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(actionBegin)
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(actionComplete)
    if (actionFailure != null) __obj.updateDynamic("actionFailure")(actionFailure)
    if (actionSuccess != null) __obj.updateDynamic("actionSuccess")(actionSuccess)
    if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag)
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop)
    if (!js.isUndefined(allowMultiSelection)) __obj.updateDynamic("allowMultiSelection")(allowMultiSelection)
    if (!js.isUndefined(allowVirtualScrolling)) __obj.updateDynamic("allowVirtualScrolling")(allowVirtualScrolling)
    if (cascadeTo != null) __obj.updateDynamic("cascadeTo")(cascadeTo)
    if (!js.isUndefined(caseSensitiveSearch)) __obj.updateDynamic("caseSensitiveSearch")(caseSensitiveSearch)
    if (change != null) __obj.updateDynamic("change")(change)
    if (checkChange != null) __obj.updateDynamic("checkChange")(checkChange)
    if (checkedIndices != null) __obj.updateDynamic("checkedIndices")(checkedIndices)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enableIncrementalSearch)) __obj.updateDynamic("enableIncrementalSearch")(enableIncrementalSearch)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableWordWrap)) __obj.updateDynamic("enableWordWrap")(enableWordWrap)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (focusIn != null) __obj.updateDynamic("focusIn")(focusIn)
    if (focusOut != null) __obj.updateDynamic("focusOut")(focusOut)
    if (height != null) __obj.updateDynamic("height")(height)
    if (itemDrag != null) __obj.updateDynamic("itemDrag")(itemDrag)
    if (itemDragStart != null) __obj.updateDynamic("itemDragStart")(itemDragStart)
    if (itemDragStop != null) __obj.updateDynamic("itemDragStop")(itemDragStop)
    if (itemDrop != null) __obj.updateDynamic("itemDrop")(itemDrop)
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight)
    if (itemRequestCount != null) __obj.updateDynamic("itemRequestCount")(itemRequestCount.asInstanceOf[js.Any])
    if (itemsCount != null) __obj.updateDynamic("itemsCount")(itemsCount.asInstanceOf[js.Any])
    if (!js.isUndefined(loadDataOnInit)) __obj.updateDynamic("loadDataOnInit")(loadDataOnInit)
    if (query != null) __obj.updateDynamic("query")(query)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedIndices != null) __obj.updateDynamic("selectedIndices")(selectedIndices)
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (targetID != null) __obj.updateDynamic("targetID")(targetID)
    if (template != null) __obj.updateDynamic("template")(template)
    if (totalItemsCount != null) __obj.updateDynamic("totalItemsCount")(totalItemsCount.asInstanceOf[js.Any])
    if (unselect != null) __obj.updateDynamic("unselect")(unselect)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (virtualScrollMode != null) __obj.updateDynamic("virtualScrollMode")(virtualScrollMode.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Model]
  }
}

