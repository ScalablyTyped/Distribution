package typings.googleVisualization.google.visualization

import typings.googleVisualization.AnonEnd
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.AnnotationChart")
@js.native
class AnnotationChart () extends ChartBaseClearable {
  def draw(data: DataTable, options: AnnotationChartOptions): Unit = js.native
  def draw(data: DataTable, options: AnnotationChartOptions, state: js.Any): Unit = js.native
  def draw(data: DataView, options: AnnotationChartOptions): Unit = js.native
  def draw(data: DataView, options: AnnotationChartOptions, state: js.Any): Unit = js.native
  def getVisibleChartRange(): AnonEnd = js.native
  def hideDataColumns(columnIndexes: js.Array[Double]): Unit = js.native
  def hideDataColumns(columnIndexes: Double): Unit = js.native
  def setVisibleChartRange(start: Date, end: Date): Unit = js.native
  def showDataColumns(columnIndexes: js.Array[Double]): Unit = js.native
  def showDataColumns(columnIndexes: Double): Unit = js.native
}

