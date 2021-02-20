package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLayoutInterface extends StObject {
  
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
