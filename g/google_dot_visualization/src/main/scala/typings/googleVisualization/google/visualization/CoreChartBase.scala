package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreChartBase extends ChartBaseRenderable {
  def getAction(id: String): ChartAction = js.native
  def getAction(id: Double): ChartAction = js.native
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
  def removeAction(id: String): Unit = js.native
  def removeAction(id: Double): Unit = js.native
  def setAction(action: ChartAction): Unit = js.native
}

