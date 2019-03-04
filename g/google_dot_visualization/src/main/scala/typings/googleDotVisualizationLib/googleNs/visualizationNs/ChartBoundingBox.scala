package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartBoundingBox extends js.Object {
  var height: scala.Double
  var left: scala.Double
  var top: scala.Double
  var width: scala.Double
}

object ChartBoundingBox {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): ChartBoundingBox = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[ChartBoundingBox]
  }
}

