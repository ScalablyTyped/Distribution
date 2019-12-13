package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.Table")
@js.native
class Table () extends ChartBaseClearable {
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: TableOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: TableOptions): Unit = js.native
  def getSortInfo(): TableSortInfo = js.native
}

