package typings.devextreme.mod.DevExpress.data

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /** @name DataSource.cancel(operationId) */
  def cancel(): Boolean = js.native
  /** @name DataSource.dispose() */
  def dispose(): Unit = js.native
  /** @name DataSource.filter() */
  def filter(): js.Any = js.native
  /** @name DataSource.filter(filterExpr) */
  def filter(filterExpr: js.Any): Unit = js.native
  /** @name DataSource.group() */
  def group(): js.Any = js.native
  /** @name DataSource.group(groupExpr) */
  def group(groupExpr: js.Any): Unit = js.native
  /** @name DataSource.isLastPage() */
  def isLastPage(): Boolean = js.native
  /** @name DataSource.isLoaded() */
  def isLoaded(): Boolean = js.native
  /** @name DataSource.isLoading() */
  def isLoading(): Boolean = js.native
  /** @name DataSource.items() */
  def items(): js.Array[_] = js.native
  /** @name DataSource.key() */
  def key(): js.Any with String with Double = js.native
  /** @name DataSource.load() */
  def load(): Promise[_] with JQueryPromise[_] = js.native
  /** @name DataSource.loadOptions() */
  def loadOptions(): js.Any = js.native
  /** @name EventsMixin.off(eventName) */
  def off(eventName: String): this.type = js.native
  /** @name EventsMixin.off(eventName, eventHandler) */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  /** @name EventsMixin.on(eventName, eventHandler) */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /** @name EventsMixin.on(events) */
  def on(events: js.Any): this.type = js.native
  /** @name DataSource.pageIndex() */
  def pageIndex(): Double = js.native
  /** @name DataSource.pageIndex(newIndex) */
  def pageIndex(newIndex: Double): Unit = js.native
  /** @name DataSource.pageSize() */
  def pageSize(): Double = js.native
  /** @name DataSource.pageSize(value) */
  def pageSize(value: Double): Unit = js.native
  /** @name DataSource.paginate() */
  def paginate(): Boolean = js.native
  /** @name DataSource.paginate(value) */
  def paginate(value: Boolean): Unit = js.native
  /** @name DataSource.reload() */
  def reload(): Promise[_] with JQueryPromise[_] = js.native
  /** @name DataSource.requireTotalCount() */
  def requireTotalCount(): Boolean = js.native
  /** @name DataSource.requireTotalCount(value) */
  def requireTotalCount(value: Boolean): Unit = js.native
  /** @name DataSource.searchExpr() */
  def searchExpr(): String with js.Function with (js.Array[String | js.Function]) = js.native
  /** @name DataSource.searchExpr(expr) */
  def searchExpr(expr: String): Unit = js.native
  def searchExpr(expr: js.Array[String | js.Function]): Unit = js.native
  def searchExpr(expr: js.Function): Unit = js.native
  /** @name DataSource.searchOperation() */
  def searchOperation(): String = js.native
  /** @name DataSource.searchOperation(op) */
  def searchOperation(op: String): Unit = js.native
  /** @name DataSource.searchValue() */
  def searchValue(): js.Any = js.native
  /** @name DataSource.searchValue(value) */
  def searchValue(value: js.Any): Unit = js.native
  /** @name DataSource.select() */
  def select(): js.Any = js.native
  /** @name DataSource.select(expr) */
  def select(expr: js.Any): Unit = js.native
  /** @name DataSource.sort() */
  def sort(): js.Any = js.native
  /** @name DataSource.sort(sortExpr) */
  def sort(sortExpr: js.Any): Unit = js.native
  /** @name DataSource.store() */
  def store(): js.Any = js.native
  /** @name DataSource.totalCount() */
  def totalCount(): Double = js.native
}

