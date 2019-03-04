package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartStroke extends js.Object {
  var fill: java.lang.String
  var stroke: java.lang.String
  var strokeWidth: scala.Double
}

object ChartStroke {
  @scala.inline
  def apply(fill: java.lang.String, stroke: java.lang.String, strokeWidth: scala.Double): ChartStroke = {
    val __obj = js.Dynamic.literal(fill = fill, stroke = stroke, strokeWidth = strokeWidth)
  
    __obj.asInstanceOf[ChartStroke]
  }
}

