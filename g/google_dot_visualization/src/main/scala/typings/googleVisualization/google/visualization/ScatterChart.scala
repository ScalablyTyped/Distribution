package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterChart extends CoreChartBase {
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: ScatterChartOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: ScatterChartOptions): Unit = js.native
}

