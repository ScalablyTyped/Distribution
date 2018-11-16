package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.OrgChart")
@js.native
class OrgChart () extends CoreChartBase {
  def collapse(row: scala.Double, collapsed: scala.Boolean): scala.Unit = js.native
  def draw(data: DataTable, options: OrgChartOptions): scala.Unit = js.native
  def draw(data: DataView, options: OrgChartOptions): scala.Unit = js.native
  def getChildrenIndexes(row: scala.Double): js.Array[scala.Double] = js.native
  def getCollapsedNodes(): js.Array[scala.Double] = js.native
}

