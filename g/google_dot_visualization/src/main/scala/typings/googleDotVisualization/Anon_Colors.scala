package typings.googleDotVisualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: js.Array[String]
  var maxValue: Double
  var minValue: Double
  var values: js.Array[Double]
}

object Anon_Colors {
  @scala.inline
  def apply(colors: js.Array[String], maxValue: Double, minValue: Double, values: js.Array[Double]): Anon_Colors = {
    val __obj = js.Dynamic.literal(colors = colors, maxValue = maxValue, minValue = minValue, values = values)
  
    __obj.asInstanceOf[Anon_Colors]
  }
}

