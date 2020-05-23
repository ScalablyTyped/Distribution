package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dashboard extends js.Object {
  def bind(controls: js.Array[ControlWrapper], charts: js.Array[ChartWrapper]): Dashboard = js.native
  def bind(controls: js.Array[ControlWrapper], charts: ChartWrapper): Dashboard = js.native
  def bind(controls: ControlWrapper, charts: js.Array[ChartWrapper]): Dashboard = js.native
  def bind(controls: ControlWrapper, charts: ChartWrapper): Dashboard = js.native
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def getSelection(): js.Array[js.Object] = js.native
}

