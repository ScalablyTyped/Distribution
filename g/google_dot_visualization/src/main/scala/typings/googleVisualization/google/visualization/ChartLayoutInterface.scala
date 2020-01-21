package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartLayoutInterface extends js.Object {
  def getBoundingBox(id: String): ChartBoundingBox = js.native
  def getChartAreaBoundingBox(): ChartBoundingBox = js.native
  def getHAxisValue(position: Double): Double = js.native
  def getHAxisValue(position: Double, axisIndex: Double): Double = js.native
  def getVAxisValue(position: Double): Double = js.native
  def getVAxisValue(position: Double, axisIndex: Double): Double = js.native
  def getXLocation(position: Double): Double = js.native
  def getXLocation(position: Double, axisIndex: Double): Double = js.native
  def getYLocation(position: Double): Double = js.native
  def getYLocation(position: Double, axisIndex: Double): Double = js.native
}

