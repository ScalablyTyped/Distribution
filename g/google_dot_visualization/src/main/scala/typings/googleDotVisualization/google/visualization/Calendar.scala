package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.Calendar")
@js.native
class Calendar () extends ChartBaseClearable {
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: CalendarOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: CalendarOptions): Unit = js.native
  def getBoundingBox(id: String): js.Object = js.native
}

