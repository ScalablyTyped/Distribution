package typings.devextreme.mod.DevExpress.data

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends StObject {
  
  /**
    * [descr:DataSource.cancel(operationId)]
    */
  def cancel(): Boolean = js.native
  
  /**
    * [descr:DataSource.dispose()]
    */
  def dispose(): Unit = js.native
  
  /**
    * [descr:DataSource.filter()]
    */
  def filter(): js.Any = js.native
  /**
    * [descr:DataSource.filter(filterExpr)]
    */
  def filter(filterExpr: js.Any): Unit = js.native
  
  /**
    * [descr:DataSource.group()]
    */
  def group(): js.Any = js.native
  /**
    * [descr:DataSource.group(groupExpr)]
    */
  def group(groupExpr: js.Any): Unit = js.native
  
  /**
    * [descr:DataSource.isLastPage()]
    */
  def isLastPage(): Boolean = js.native
  
  /**
    * [descr:DataSource.isLoaded()]
    */
  def isLoaded(): Boolean = js.native
  
  /**
    * [descr:DataSource.isLoading()]
    */
  def isLoading(): Boolean = js.native
  
  /**
    * [descr:DataSource.items()]
    */
  def items(): js.Array[_] = js.native
  
  /**
    * [descr:DataSource.key()]
    */
  def key(): js.Any with String with Double = js.native
  
  /**
    * [descr:DataSource.load()]
    */
  def load(): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:DataSource.loadOptions()]
    */
  def loadOptions(): js.Any = js.native
  
  /**
    * [descr:DataSource.off(eventName)]
    */
  def off(eventName: String): this.type = js.native
  /**
    * [descr:DataSource.off(eventName, eventHandler)]
    */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  
  /**
    * [descr:DataSource.on(eventName, eventHandler)]
    */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /**
    * [descr:DataSource.on(events)]
    */
  def on(events: js.Any): this.type = js.native
  
  /**
    * [descr:DataSource.pageIndex()]
    */
  def pageIndex(): Double = js.native
  /**
    * [descr:DataSource.pageIndex(newIndex)]
    */
  def pageIndex(newIndex: Double): Unit = js.native
  
  /**
    * [descr:DataSource.pageSize()]
    */
  def pageSize(): Double = js.native
  /**
    * [descr:DataSource.pageSize(value)]
    */
  def pageSize(value: Double): Unit = js.native
  
  /**
    * [descr:DataSource.paginate()]
    */
  def paginate(): Boolean = js.native
  /**
    * [descr:DataSource.paginate(value)]
    */
  def paginate(value: Boolean): Unit = js.native
  
  /**
    * [descr:DataSource.reload()]
    */
  def reload(): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:DataSource.requireTotalCount()]
    */
  def requireTotalCount(): Boolean = js.native
  /**
    * [descr:DataSource.requireTotalCount(value)]
    */
  def requireTotalCount(value: Boolean): Unit = js.native
  
  /**
    * [descr:DataSource.searchExpr()]
    */
  def searchExpr(): String with js.Function with (js.Array[String | js.Function]) = js.native
  /**
    * [descr:DataSource.searchExpr(expr)]
    */
  def searchExpr(expr: String): Unit = js.native
  def searchExpr(expr: js.Array[String | js.Function]): Unit = js.native
  def searchExpr(expr: js.Function): Unit = js.native
  
  /**
    * [descr:DataSource.searchOperation()]
    */
  def searchOperation(): String = js.native
  /**
    * [descr:DataSource.searchOperation(op)]
    */
  def searchOperation(op: String): Unit = js.native
  
  /**
    * [descr:DataSource.searchValue()]
    */
  def searchValue(): js.Any = js.native
  /**
    * [descr:DataSource.searchValue(value)]
    */
  def searchValue(value: js.Any): Unit = js.native
  
  /**
    * [descr:DataSource.select()]
    */
  def select(): js.Any = js.native
  /**
    * [descr:DataSource.select(expr)]
    */
  def select(expr: js.Any): Unit = js.native
  
  /**
    * [descr:DataSource.sort()]
    */
  def sort(): js.Any = js.native
  /**
    * [descr:DataSource.sort(sortExpr)]
    */
  def sort(sortExpr: js.Any): Unit = js.native
  
  /**
    * [descr:DataSource.store()]
    */
  def store(): js.Any = js.native
  
  /**
    * [descr:DataSource.totalCount()]
    */
  def totalCount(): Double = js.native
}
