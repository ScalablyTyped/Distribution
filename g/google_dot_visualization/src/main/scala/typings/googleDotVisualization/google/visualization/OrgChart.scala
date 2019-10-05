package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.OrgChart")
@js.native
class OrgChart () extends CoreChartBase {
  def collapse(row: Double, collapsed: Boolean): Unit = js.native
  def draw(data: DataTable, options: OrgChartOptions): Unit = js.native
  def draw(data: DataView, options: OrgChartOptions): Unit = js.native
  def getChildrenIndexes(row: Double): js.Array[Double] = js.native
  def getCollapsedNodes(): js.Array[Double] = js.native
}

