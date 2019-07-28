package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartStroke extends js.Object {
  var fill: String
  var stroke: String
  var strokeWidth: Double
}

object ChartStroke {
  @scala.inline
  def apply(fill: String, stroke: String, strokeWidth: Double): ChartStroke = {
    val __obj = js.Dynamic.literal(fill = fill, stroke = stroke, strokeWidth = strokeWidth)
  
    __obj.asInstanceOf[ChartStroke]
  }
}

