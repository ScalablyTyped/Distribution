package typings.googleVisualization.google.visualization

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartWrapper extends js.Object {
  def draw(): Unit = js.native
  def draw(container_ref: HTMLElement): Unit = js.native
  def getChart(): ChartBase | Null = js.native
  def getChartName(): String = js.native
  def getChartType(): String = js.native
  def getContainerId(): String = js.native
  def getDataSourceUrl(): String = js.native
  def getDataTable(): DataTable = js.native
  def getOption(key: String): js.Any = js.native
  def getOption(key: String, default_val: String): js.Any = js.native
  def getOptions(): js.Object = js.native
  def getQuery(): String = js.native
  def getRefreshInterval(): Double = js.native
  def getView(): js.Any = js.native
  def setChartName(name: String): Unit = js.native
  def setChartType(`type`: String): Unit = js.native
  def setContainerId(id: String): Unit = js.native
  def setDataSourceUrl(url: String): Unit = js.native
  def setDataTable(table: DataTable): Unit = js.native
  def setOption(key: String, value: js.Any): Unit = js.native
  def setOptions(options: js.Object): Unit = js.native
  def setQuery(query: String): Unit = js.native
  def setRefreshInterval(interval: Double): Unit = js.native
  def setView(view_spec: String): Unit = js.native
  def toJSON(): String = js.native
}

