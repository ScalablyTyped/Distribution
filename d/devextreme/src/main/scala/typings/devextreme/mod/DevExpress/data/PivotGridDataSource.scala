package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.ColumnPath
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGridDataSource extends js.Object {
  def collapseAll(id: String): Unit = js.native
  /** @name PivotGridDataSource.collapseAll(id) */
  def collapseAll(id: Double): Unit = js.native
  /** @name PivotGridDataSource.collapseHeaderItem(area, path) */
  def collapseHeaderItem(area: String, path: js.Array[String | Double | Date]): Unit = js.native
  /** @name PivotGridDataSource.createDrillDownDataSource(options) */
  def createDrillDownDataSource(options: ColumnPath): DataSource = js.native
  /** @name PivotGridDataSource.dispose() */
  def dispose(): Unit = js.native
  def expandAll(id: String): Unit = js.native
  /** @name PivotGridDataSource.expandAll(id) */
  def expandAll(id: Double): Unit = js.native
  /** @name PivotGridDataSource.expandHeaderItem(area, path) */
  def expandHeaderItem(area: String, path: js.Array[_]): Unit = js.native
  def field(id: String): js.Any = js.native
  def field(id: String, options: js.Any): Unit = js.native
  /** @name PivotGridDataSource.field(id) */
  def field(id: Double): js.Any = js.native
  /** @name PivotGridDataSource.field(id, options) */
  def field(id: Double, options: js.Any): Unit = js.native
  /** @name PivotGridDataSource.fields() */
  def fields(): js.Array[PivotGridDataSourceField] = js.native
  /** @name PivotGridDataSource.fields(fields) */
  def fields(fields: js.Array[PivotGridDataSourceField]): Unit = js.native
  /** @name PivotGridDataSource.filter() */
  def filter(): js.Any = js.native
  /** @name PivotGridDataSource.filter(filterExpr) */
  def filter(filterExpr: js.Any): Unit = js.native
  /** @name PivotGridDataSource.getAreaFields(area, collectGroups) */
  def getAreaFields(area: String, collectGroups: Boolean): js.Array[PivotGridDataSourceField] = js.native
  /** @name PivotGridDataSource.getData() */
  def getData(): js.Any = js.native
  /** @name PivotGridDataSource.isLoading() */
  def isLoading(): Boolean = js.native
  /** @name PivotGridDataSource.load() */
  def load(): Promise[_] with JQueryPromise[_] = js.native
  /** @name EventsMixin.off(eventName) */
  def off(eventName: String): this.type = js.native
  /** @name EventsMixin.off(eventName, eventHandler) */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  /** @name EventsMixin.on(eventName, eventHandler) */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /** @name EventsMixin.on(events) */
  def on(events: js.Any): this.type = js.native
  /** @name PivotGridDataSource.reload() */
  def reload(): Promise[_] with JQueryPromise[_] = js.native
  /** @name PivotGridDataSource.state() */
  def state(): js.Any = js.native
  /** @name PivotGridDataSource.state(state) */
  def state(state: js.Any): Unit = js.native
}

