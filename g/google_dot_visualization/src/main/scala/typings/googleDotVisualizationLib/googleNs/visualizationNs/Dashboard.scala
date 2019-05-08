package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.Dashboard")
@js.native
class Dashboard protected () extends js.Object {
  def this(containerRef: stdLib.HTMLElement) = this()
  def bind(controls: ControlWrapper, charts: ChartWrapper): Dashboard = js.native
  def bind(controls: ControlWrapper, charts: js.Array[ChartWrapper]): Dashboard = js.native
  def bind(controls: js.Array[ControlWrapper], charts: ChartWrapper): Dashboard = js.native
  def bind(controls: js.Array[ControlWrapper], charts: js.Array[ChartWrapper]): Dashboard = js.native
  def draw(dataTable: DataTable): scala.Unit = js.native
  def getSelection(): js.Array[js.Object] = js.native
}

