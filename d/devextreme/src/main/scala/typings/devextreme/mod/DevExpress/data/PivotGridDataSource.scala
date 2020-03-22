package typings.devextreme.mod.DevExpress.data

import typings.devextreme.AnonColumnPath
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGridDataSource extends js.Object {
  def collapseAll(id: String): Unit = js.native
  /** Collapses all header items of a field with the specified identifier. */
  def collapseAll(id: Double): Unit = js.native
  /** Collapses a specific header item. */
  def collapseHeaderItem(area: String, path: js.Array[String | Double | Date]): Unit = js.native
  /** Provides access to the facts that were used to calculate a specific summary value. */
  def createDrillDownDataSource(options: AnonColumnPath): DataSource = js.native
  /** Disposes of all the resources allocated to the PivotGridDataSource instance. */
  def dispose(): Unit = js.native
  def expandAll(id: String): Unit = js.native
  /** Expands all the header items of a field with the specified identifier. */
  def expandAll(id: Double): Unit = js.native
  /** Expands a specific header item. */
  def expandHeaderItem(area: String, path: js.Array[_]): Unit = js.native
  def field(id: String): js.Any = js.native
  def field(id: String, options: js.Any): Unit = js.native
  /** Gets all the options of a field with the specified identifier. */
  def field(id: Double): js.Any = js.native
  /** Updates field options' values. */
  def field(id: Double, options: js.Any): Unit = js.native
  /** Gets all the fields including those generated automatically. */
  def fields(): js.Array[PivotGridDataSourceField] = js.native
  /** Specifies a new fields collection. */
  def fields(fields: js.Array[PivotGridDataSourceField]): Unit = js.native
  /** Gets the filter option's value. Does not affect an XmlaStore. */
  def filter(): js.Any = js.native
  /** Sets the filter option's value. Does not affect an XmlaStore. */
  def filter(filterExpr: js.Any): Unit = js.native
  /** Gets all the fields within an area. */
  def getAreaFields(area: String, collectGroups: Boolean): js.Array[PivotGridDataSourceField] = js.native
  /** Gets the loaded data. Another data portion is loaded every time a header item is expanded. */
  def getData(): js.Any = js.native
  /** Checks whether the PivotGridDataSource is loading data. */
  def isLoading(): Boolean = js.native
  /** Starts loading data. */
  def load(): Promise[_] with JQueryPromise[_] = js.native
  /** Detaches all event handlers from a single event. */
  def off(eventName: String): this.type = js.native
  /** Detaches a particular event handler from a single event. */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  /** Subscribes to an event. */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /** Subscribes to events. */
  def on(events: js.Any): this.type = js.native
  /** Clears the loaded PivotGridDataSource data and calls the load() method. */
  def reload(): Promise[_] with JQueryPromise[_] = js.native
  /** Gets the current PivotGridDataSource state. Part of the PivotGrid widget's state storing feature. */
  def state(): js.Any = js.native
  /** Sets the PivotGridDataSource state. Part of the PivotGrid widget's state storing feature. */
  def state(state: js.Any): Unit = js.native
}

