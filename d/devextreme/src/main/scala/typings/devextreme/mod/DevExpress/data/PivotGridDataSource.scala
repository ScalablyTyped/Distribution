package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.ColumnPath
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridDataSource extends js.Object {
  
  def collapseAll(id: String): Unit = js.native
  /**
    * [descr:PivotGridDataSource.collapseAll(id)]
    */
  def collapseAll(id: Double): Unit = js.native
  
  /**
    * [descr:PivotGridDataSource.collapseHeaderItem(area, path)]
    */
  def collapseHeaderItem(area: String, path: js.Array[String | Double | Date]): Unit = js.native
  
  /**
    * [descr:PivotGridDataSource.createDrillDownDataSource(options)]
    */
  def createDrillDownDataSource(options: ColumnPath): DataSource = js.native
  
  /**
    * [descr:PivotGridDataSource.dispose()]
    */
  def dispose(): Unit = js.native
  
  def expandAll(id: String): Unit = js.native
  /**
    * [descr:PivotGridDataSource.expandAll(id)]
    */
  def expandAll(id: Double): Unit = js.native
  
  /**
    * [descr:PivotGridDataSource.expandHeaderItem(area, path)]
    */
  def expandHeaderItem(area: String, path: js.Array[_]): Unit = js.native
  
  def field(id: String): js.Any = js.native
  def field(id: String, options: js.Any): Unit = js.native
  /**
    * [descr:PivotGridDataSource.field(id)]
    */
  def field(id: Double): js.Any = js.native
  /**
    * [descr:PivotGridDataSource.field(id, options)]
    */
  def field(id: Double, options: js.Any): Unit = js.native
  
  /**
    * [descr:PivotGridDataSource.fields()]
    */
  def fields(): js.Array[PivotGridDataSourceField] = js.native
  /**
    * [descr:PivotGridDataSource.fields(fields)]
    */
  def fields(fields: js.Array[PivotGridDataSourceField]): Unit = js.native
  
  /**
    * [descr:PivotGridDataSource.filter()]
    */
  def filter(): js.Any = js.native
  /**
    * [descr:PivotGridDataSource.filter(filterExpr)]
    */
  def filter(filterExpr: js.Any): Unit = js.native
  
  /**
    * [descr:PivotGridDataSource.getAreaFields(area, collectGroups)]
    */
  def getAreaFields(area: String, collectGroups: Boolean): js.Array[PivotGridDataSourceField] = js.native
  
  /**
    * [descr:PivotGridDataSource.getData()]
    */
  def getData(): js.Any = js.native
  
  /**
    * [descr:PivotGridDataSource.isLoading()]
    */
  def isLoading(): Boolean = js.native
  
  /**
    * [descr:PivotGridDataSource.load()]
    */
  def load(): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:PivotGridDataSource.off(eventName)]
    */
  def off(eventName: String): this.type = js.native
  /**
    * [descr:PivotGridDataSource.off(eventName, eventHandler)]
    */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  
  /**
    * [descr:PivotGridDataSource.on(eventName, eventHandler)]
    */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /**
    * [descr:PivotGridDataSource.on(events)]
    */
  def on(events: js.Any): this.type = js.native
  
  /**
    * [descr:PivotGridDataSource.reload()]
    */
  def reload(): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:PivotGridDataSource.state()]
    */
  def state(): js.Any = js.native
  /**
    * [descr:PivotGridDataSource.state(state)]
    */
  def state(state: js.Any): Unit = js.native
}
