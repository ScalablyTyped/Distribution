package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.ChartWrapper")
@js.native
class ChartWrapper () extends js.Object {
  def this(spec: ChartSpecs) = this()
  def draw(): scala.Unit = js.native
  def draw(container_ref: stdLib.HTMLElement): scala.Unit = js.native
  def getChart(): js.Any = js.native
  def getChartName(): java.lang.String = js.native
  def getChartType(): java.lang.String = js.native
  def getContainerId(): java.lang.String = js.native
  def getDataSourceUrl(): java.lang.String = js.native
  def getDataTable(): DataTable = js.native
  def getOption(key: java.lang.String): js.Any = js.native
  def getOption(key: java.lang.String, default_val: java.lang.String): js.Any = js.native
  def getOptions(): js.Object = js.native
  def getQuery(): java.lang.String = js.native
  def getRefreshInterval(): scala.Double = js.native
  def getView(): js.Any = js.native
  def setChartName(name: java.lang.String): scala.Unit = js.native
  def setChartType(`type`: java.lang.String): scala.Unit = js.native
  def setContainerId(id: java.lang.String): scala.Unit = js.native
  def setDataSourceUrl(url: java.lang.String): scala.Unit = js.native
  def setDataTable(table: DataTable): scala.Unit = js.native
  def setOption(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOptions(options: js.Object): scala.Unit = js.native
  def setQuery(query: java.lang.String): scala.Unit = js.native
  def setRefreshInterval(interval: scala.Double): scala.Unit = js.native
  def setView(view_spec: java.lang.String): scala.Unit = js.native
  def toJSON(): java.lang.String = js.native
}

