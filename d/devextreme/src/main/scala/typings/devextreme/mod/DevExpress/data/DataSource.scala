package typings.devextreme.mod.DevExpress.data

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /** Cancels the load operation with a specific identifier. */
  def cancel(): Boolean = js.native
  /** Disposes of all the resources allocated to the DataSource instance. */
  def dispose(): Unit = js.native
  /** Gets the filter option's value. */
  def filter(): js.Any = js.native
  /** Sets the filter option's value. */
  def filter(filterExpr: js.Any): Unit = js.native
  /** Gets the group option's value. */
  def group(): js.Any = js.native
  /** Sets the group option's value. */
  def group(groupExpr: js.Any): Unit = js.native
  /** Checks whether the count of items on the current page is less than the pageSize. Takes effect only with enabled paging. */
  def isLastPage(): Boolean = js.native
  /** Checks whether data is loaded in the DataSource. */
  def isLoaded(): Boolean = js.native
  /** Checks whether data is being loaded in the DataSource. */
  def isLoading(): Boolean = js.native
  /** Gets data items the DataSource performs operations on. */
  def items(): js.Array[_] = js.native
  /** Gets the value of the underlying store's key option. */
  def key(): js.Any with String with Double = js.native
  /** Starts loading data. */
  def load(): Promise[_] with JQueryPromise[_] = js.native
  /** Gets an object with current data processing settings. */
  def loadOptions(): js.Any = js.native
  /** Detaches all event handlers from a single event. */
  def off(eventName: String): this.type = js.native
  /** Detaches a particular event handler from a single event. */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  /** Subscribes to an event. */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /** Subscribes to events. */
  def on(events: js.Any): this.type = js.native
  /** Gets the current page index. */
  def pageIndex(): Double = js.native
  /** Sets the index of the page that should be loaded on the next load() method call. */
  def pageIndex(newIndex: Double): Unit = js.native
  /** Gets the page size. */
  def pageSize(): Double = js.native
  /** Sets the page size. */
  def pageSize(value: Double): Unit = js.native
  /** Gets the paginate option's value. */
  def paginate(): Boolean = js.native
  /** Sets the paginate option's value. */
  def paginate(value: Boolean): Unit = js.native
  /** Clears currently loaded DataSource items and calls the load() method. */
  def reload(): Promise[_] with JQueryPromise[_] = js.native
  /** Gets the requireTotalCount option's value. */
  def requireTotalCount(): Boolean = js.native
  /** Sets the requireTotalCount option's value. */
  def requireTotalCount(value: Boolean): Unit = js.native
  /** Gets the searchExpr option's value. */
  def searchExpr(): String with js.Function with (js.Array[String | js.Function]) = js.native
  /** Sets the searchExpr option's value. */
  def searchExpr(expr: String): Unit = js.native
  def searchExpr(expr: js.Array[String | js.Function]): Unit = js.native
  def searchExpr(expr: js.Function): Unit = js.native
  /** Gets the searchOperation option's value. */
  def searchOperation(): String = js.native
  /** Sets the searchOperation option's value. */
  def searchOperation(op: String): Unit = js.native
  /** Gets the searchValue option's value. */
  def searchValue(): js.Any = js.native
  /** Sets the searchValue option's value. */
  def searchValue(value: js.Any): Unit = js.native
  /** Gets the select option's value. */
  def select(): js.Any = js.native
  /** Sets the select option's value. */
  def select(expr: js.Any): Unit = js.native
  /** Gets the sort option's value. */
  def sort(): js.Any = js.native
  /** Sets the sort option's value. */
  def sort(sortExpr: js.Any): Unit = js.native
  /** Gets the instance of the store underlying the DataSource. */
  def store(): js.Any = js.native
  /** Gets the number of data items in the store after the last load() operation without paging. Takes effect only if requireTotalCount is true */
  def totalCount(): Double = js.native
}

