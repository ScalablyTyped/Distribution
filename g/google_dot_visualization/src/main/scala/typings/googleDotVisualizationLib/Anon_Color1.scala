package typings
package googleDotVisualizationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color1 extends js.Object {
  var color1: java.lang.String
  var color2: java.lang.String
  var useObjectBoundingBoxUnits: js.UndefOr[scala.Boolean] = js.undefined
  var x1: java.lang.String
  var x2: java.lang.String
  var y1: java.lang.String
  var y2: java.lang.String
}

object Anon_Color1 {
  @scala.inline
  def apply(
    color1: java.lang.String,
    color2: java.lang.String,
    x1: java.lang.String,
    x2: java.lang.String,
    y1: java.lang.String,
    y2: java.lang.String,
    useObjectBoundingBoxUnits: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Color1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color1")(color1)
    __obj.updateDynamic("color2")(color2)
    __obj.updateDynamic("x1")(x1)
    __obj.updateDynamic("x2")(x2)
    __obj.updateDynamic("y1")(y1)
    __obj.updateDynamic("y2")(y2)
    if (!js.isUndefined(useObjectBoundingBoxUnits)) __obj.updateDynamic("useObjectBoundingBoxUnits")(useObjectBoundingBoxUnits)
    __obj.asInstanceOf[Anon_Color1]
  }
}

