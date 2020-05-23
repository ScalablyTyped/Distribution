package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BubbleChart extends CoreChartBase {
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: BubbleChartOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: BubbleChartOptions): Unit = js.native
}

