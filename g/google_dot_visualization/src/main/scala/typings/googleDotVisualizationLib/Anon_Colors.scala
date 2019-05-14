package typings
package googleDotVisualizationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: js.Array[java.lang.String]
  var maxValue: scala.Double
  var minValue: scala.Double
  var values: js.Array[scala.Double]
}

object Anon_Colors {
  @scala.inline
  def apply(
    colors: js.Array[java.lang.String],
    maxValue: scala.Double,
    minValue: scala.Double,
    values: js.Array[scala.Double]
  ): Anon_Colors = {
    val __obj = js.Dynamic.literal(colors = colors, maxValue = maxValue, minValue = minValue, values = values)
  
    __obj.asInstanceOf[Anon_Colors]
  }
}

