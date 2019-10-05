package typings.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/FilteredListMixin.html
  *
  * Mixin for filtered lists.
  * This mixin adds filtering capabilities to all dojox/mobile list widgets:
  * dojox/mobile/RoundRectList and any of its subclasses (RoundRectStoreList,
  * RoundRectDataList, EdgeToEdgeList, EdgeToEdgeStoreList, EdgeToEdgeDataList).
  * When mixing this class into a list widget, the list items are dynamically
  * filtered depending on the filtering string that the user enters in a
  * dojox/mobile/SearchBox.
  *
  * This mixin supports the following use-cases:
  * 1. For user's convenience, by simply mixing this class into a list widget
  * the mixin creates a dojox/mobile/SearchBox and a dojox/mobile/ScrollableView.
  * The list is placed inside the ScrollableView and the SearchBox, which allows
  * filtering the list, is placed on top of the ScrollableView.
  * 2. Alternatively, the user can create (and style) the instance of dojox/mobile/SearchBox,
  * and specify its id using the property filterBoxRef of this mixin. This allows
  * placing the SearchBox anywhere in the DOM, while the mixin takes care of
  * the necessary glue to ensure the list is filtered according to the filter criteria
  * entered in the SearchBox.
  *
  * The filtering works for lists backed by a store (dojo/store or dojo/data), as well
  * as for lists not backed by a store. When filtering a list backed by a store
  * containing hierarchical data (data items that are children of a parent data item),
  * the store must support recursive search queries such that the filtering can match
  * child items.
  *
  * For configuration purposes, the instance of dojox/mobile/SearchBox can be retrieved
  * using the method getFilterBox(). If a dojox/mobile/ScrollableView is created by
  * this mixin, it can be retrieved using getScrollableView().
  *
  */
@JSGlobal("dojox.mobile.FilteredListMixin")
@js.native
class FilteredListMixin () extends js.Object {
  /**
    * The reference for the search box allowing to enter the filtering criteria.
    * Only used at construction time:
    * - If unspecified, the mixin creates a dojox/mobile/SearchBox and
    * a dojox/mobile/ScrollableView. The list is placed inside the ScrollableView and the
    * SearchBox, wrapped in a DIV, is placed on top of the ScrollableView.
    * - If the string is the id of a widget which is an instance of dojox/mobile/SearchBox
    * or a subclass, the mixin uses this SearchBox for filtering the list.
    * - If the id is specified but does not reference a dojox/mobile/SearchBox or
    * subclass, an error is thrown.
    *
    */
  var filterBoxRef: String = js.native
  /**
    * A flag which allows to show or hide the dojox/mobile/SearchBox associated with
    * the list.
    *
    */
  var filterBoxVisible: Boolean = js.native
  /**
    * Defines a hint to help users fill out the input field (as defined in HTML 5) of the
    * dojox/mobile/SearchBox. This should only contain plain text (no HTML markup).
    * When the SearchBox is provided by the user (not created by this mixin), its placeHolder
    * property takes precedence.
    *
    */
  var placeHolder: String = js.native
  /**
    * Destroys the widget. If the list has created dojox/mobile/SearchBox
    * or dojox/mobile/ScrollableView widgets, these widgets are also destroyed.
    *
    * @param preserveDom               OptionalIf true, this method will leave the original DOM structure alone.
    */
  def destroy(): Unit = js.native
  def destroy(preserveDom: Boolean): Unit = js.native
  /**
    * Returns the dojox/mobile/SearchBox widget used for entering the filtering criteria.
    * If an instance has been referenced at construction time using the property filterBoxRef,
    * this instance is returned. Otherwise, returns the instance created by the mixin.
    * This function allows the user to get the instance of SearchBox in order to customize
    * its parameters.
    *
    */
  def getFilterBox(): js.Any = js.native
  /**
    * Returns the instance of dojox/mobile/ScrollableView created by this mixin,
    * or null if none has been created. The mixin creates a ScrollableView if and
    * only if the property filterBoxRef is unspecified.
    * This function allows the user to get the instance of ScrollableView in order to
    * customize its parameters.
    *
    */
  def getScrollableView(): js.Any = js.native
  /**
    * User-defined function to handle filter actions. If the function returns false,
    * the filtering is cancelled.
    *
    * @param results
    * @param query
    * @param options
    */
  def onFilter(results: js.Any, query: js.Any, options: js.Any): Unit = js.native
  /**
    *
    */
  def startup(): Unit = js.native
}

