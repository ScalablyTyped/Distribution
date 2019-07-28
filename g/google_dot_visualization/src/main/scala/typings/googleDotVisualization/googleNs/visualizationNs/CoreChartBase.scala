package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.CoreChartBase")
@js.native
class CoreChartBase () extends ChartBase {
  def getBoundingBox(id: String): ChartBoundingBox = js.native
  def getChartAreaBoundingBox(): ChartBoundingBox = js.native
  def getChartLayoutInterface(): ChartLayoutInterface = js.native
  def getHAxisValue(position: Double): Double = js.native
  def getHAxisValue(position: Double, axisIndex: Double): Double = js.native
  def getVAxisValue(position: Double): Double = js.native
  def getVAxisValue(position: Double, axisIndex: Double): Double = js.native
  def getXLocation(position: Double): Double = js.native
  def getXLocation(position: Double, axisIndex: Double): Double = js.native
  def getYLocation(position: Double): Double = js.native
  def getYLocation(position: Double, axisIndex: Double): Double = js.native
}

