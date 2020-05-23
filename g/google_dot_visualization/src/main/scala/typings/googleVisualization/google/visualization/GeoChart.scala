package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoChart extends ChartBaseRenderable {
  def draw(data: DataTable, options: GeoChartOptions): Unit = js.native
  def draw(data: DataView, options: GeoChartOptions): Unit = js.native
}

