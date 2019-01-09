package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.AnnotationChart")
@js.native
class AnnotationChart () extends CoreChartBase {
  def draw(data: DataTable, options: AnnotationChartOptions): scala.Unit = js.native
  def draw(data: DataView, options: AnnotationChartOptions): scala.Unit = js.native
  def getVisibleChartRange(): googleDotVisualizationLib.Anon_End = js.native
  def hideDataColumns(columnIndexes: js.Array[scala.Double]): scala.Unit = js.native
  def hideDataColumns(columnIndexes: scala.Double): scala.Unit = js.native
  def setVisibleChartRange(start: stdLib.Date, end: stdLib.Date): scala.Unit = js.native
  def showDataColumns(columnIndexes: js.Array[scala.Double]): scala.Unit = js.native
  def showDataColumns(columnIndexes: scala.Double): scala.Unit = js.native
}

