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
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Colors]
  }
}

