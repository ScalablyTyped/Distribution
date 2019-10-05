package typings.dojo.dojox.calendar

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyFunction
import typings.dojo.dojo.Stateful
import typings.dojo.dojo.store.api.Store
import typings.dojo.dojoStrings.allDayAttr
import typings.dojo.dojoStrings.cssClassFunc
import typings.dojo.dojoStrings.decodeDate
import typings.dojo.dojoStrings.displayedItemsInvalidated
import typings.dojo.dojoStrings.encodeDate
import typings.dojo.dojoStrings.endTimeAttr
import typings.dojo.dojoStrings.query
import typings.dojo.dojoStrings.queryOptions
import typings.dojo.dojoStrings.startTimeAttr
import typings.dojo.dojoStrings.store
import typings.dojo.dojoStrings.subColumnAttr
import typings.dojo.dojoStrings.summaryAttr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/StoreMixin.html
  *
  * This mixin contains the store management.
  *
  */
@JSGlobal("dojox.calendar.StoreMixin")
@js.native
class StoreMixin () extends Stateful {
  /**
    * The attribute of the store item that contains the all day state of
    * the events represented by this item.    Default is "allDay".
    *
    */
  var allDayAttr: String = js.native
  /**
    * Optional function that returns a css class name to apply to item renderers that are displaying the specified item in parameter.
    *
    */
  var cssClassFunc: js.Function = js.native
  /**
    * An optional function to transform store date into Date objects. Default is null.
    *
    */
  var decodeDate: js.Object = js.native
  /**
    * Whether the data items displayed must be recomputed, usually after the displayed
    * time range has changed.
    *
    */
  var displayedItemsInvalidated: Boolean = js.native
  /**
    * An optional function to transform Date objects into store date. Default is null.
    *
    */
  var encodeDate: js.Object = js.native
  /**
    * The attribute of the store item that contains the end time of
    * the events represented by this item.    Default is "endTime".
    *
    */
  var endTimeAttr: String = js.native
  /**
    * A query that can be passed to when querying the store.
    *
    */
  var query: js.Object = js.native
  /**
    * Options to be applied when querying the store.
    *
    */
  var queryOptions: js.Object = js.native
  /**
    * The attribute of the store item that contains the start time of
    * the events represented by this item.    Default is "startTime".
    *
    */
  var startTimeAttr: String = js.native
  /**
    * The store that contains the events to display.
    *
    */
  var store: js.Object = js.native
  /**
    * The attribute of the store item that contains the sub column name of
    * the events represented by this item.    Default is "calendar".
    *
    */
  var subColumnAttr: String = js.native
  /**
    * The attribute of the store item that contains the summary of
    * the events represented by this item.    Default is "summary".
    *
    */
  var summaryAttr: String = js.native
  /**
    * Returns the creation state of an item.
    * This state is changing during the interactive creation of an item.
    * Valid values are:
    * - "unstored": The event is being interactively created. It is not in the store yet.
    * - "storing": The creation gesture has ended, the event is being added to the store.
    * - "stored": The event is not in the two previous states, and is assumed to be in the store
    * (not checking because of performance reasons, use store API for testing existence in store).
    * item: Object
    * The item.
    * returns: String
    *
    * @param item
    */
  def getItemStoreState(item: js.Any): js.Any = js.native
  @JSName("get")
  def get_allDayAttr(property: allDayAttr): String = js.native
  @JSName("get")
  def get_cssClassFunc(property: cssClassFunc): js.Function = js.native
  @JSName("get")
  def get_decodeDate(property: decodeDate): js.Object = js.native
  @JSName("get")
  def get_displayedItemsInvalidated(property: displayedItemsInvalidated): Boolean = js.native
  @JSName("get")
  def get_encodeDate(property: encodeDate): js.Object = js.native
  @JSName("get")
  def get_endTimeAttr(property: endTimeAttr): String = js.native
  @JSName("get")
  def get_query(property: query): js.Object = js.native
  @JSName("get")
  def get_queryOptions(property: queryOptions): js.Object = js.native
  @JSName("get")
  def get_startTimeAttr(property: startTimeAttr): String = js.native
  @JSName("get")
  def get_store(property: store): js.Object = js.native
  @JSName("get")
  def get_subColumnAttr(property: subColumnAttr): String = js.native
  @JSName("get")
  def get_summaryAttr(property: summaryAttr): String = js.native
  /**
    * Creates the render item based on the dojo.store item. It must be of the form:
    *
    * {
    *     id: Object,
    *     startTime: Date,
    *     endTime: Date,
    *     summary: String
    * }
    * By default it is building an object using the store id, the summaryAttr,
    *
    * startTimeAttr and endTimeAttr properties as well as decodeDate property if not null.
    * Other fields or way to query fields can be used if needed.
    *
    * @param item The store item.
    * @param store The store.
    */
  def itemToRenderItem(item: js.Object, store: Store): js.Any = js.native
  /**
    * Create a store item based on the render item. It must be of the form:
    *
    * {
    *     id: Object
    *     startTime: Date,
    *     endTime: Date,
    *     summary: String
    * }
    * By default it is building an object using the summaryAttr, startTimeAttr and endTimeAttr properties
    *
    * and encodeDate property if not null. If the encodeDate property is null a Date object will be set in the start and end time.
    * When using a JsonRest store, for example, it is recommended to transfer dates using the ISO format (see dojo.date.stamp).
    * In that case, provide a custom function to the encodeDate property that is using the date ISO encoding provided by Dojo.
    *
    * @param renderItem The render item.
    * @param store The store.
    */
  def renderItemToItem(renderItem: js.Object, store: Store): js.Any = js.native
  @JSName("set")
  def set_allDayAttr(property: allDayAttr, value: String): Unit = js.native
  @JSName("set")
  def set_cssClassFunc(property: cssClassFunc, value: js.Function): Unit = js.native
  @JSName("set")
  def set_decodeDate(property: decodeDate, value: js.Object): Unit = js.native
  @JSName("set")
  def set_displayedItemsInvalidated(property: displayedItemsInvalidated, value: Boolean): Unit = js.native
  @JSName("set")
  def set_encodeDate(property: encodeDate, value: js.Object): Unit = js.native
  @JSName("set")
  def set_endTimeAttr(property: endTimeAttr, value: String): Unit = js.native
  @JSName("set")
  def set_query(property: query, value: js.Object): Unit = js.native
  @JSName("set")
  def set_queryOptions(property: queryOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_startTimeAttr(property: startTimeAttr, value: String): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("set")
  def set_subColumnAttr(property: subColumnAttr, value: String): Unit = js.native
  @JSName("set")
  def set_summaryAttr(property: summaryAttr, value: String): Unit = js.native
  @JSName("watch")
  def watch_allDayAttr(property: allDayAttr, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cssClassFunc(property: cssClassFunc, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_decodeDate(property: decodeDate, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_displayedItemsInvalidated(property: displayedItemsInvalidated, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_encodeDate(property: encodeDate, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_endTimeAttr(property: endTimeAttr, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_query(property: query, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_queryOptions(property: queryOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_startTimeAttr(property: startTimeAttr, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_store(property: store, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_subColumnAttr(property: subColumnAttr, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_summaryAttr(property: summaryAttr, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

