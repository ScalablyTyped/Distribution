package typings.googleVisualization.google.visualization

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.Dashboard")
@js.native
class Dashboard protected () extends js.Object {
  def this(containerRef: HTMLElement) = this()
  def bind(controls: js.Array[ControlWrapper], charts: js.Array[ChartWrapper]): Dashboard = js.native
  def bind(controls: js.Array[ControlWrapper], charts: ChartWrapper): Dashboard = js.native
  def bind(controls: ControlWrapper, charts: js.Array[ChartWrapper]): Dashboard = js.native
  def bind(controls: ControlWrapper, charts: ChartWrapper): Dashboard = js.native
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def getSelection(): js.Array[js.Object] = js.native
}

