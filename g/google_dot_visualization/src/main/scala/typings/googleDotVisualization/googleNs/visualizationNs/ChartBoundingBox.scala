package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartBoundingBox extends js.Object {
  var height: Double
  var left: Double
  var top: Double
  var width: Double
}

object ChartBoundingBox {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): ChartBoundingBox = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[ChartBoundingBox]
  }
}

