package typings.googleDotVisualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color1 extends js.Object {
  var color1: String
  var color2: String
  var useObjectBoundingBoxUnits: js.UndefOr[Boolean] = js.undefined
  var x1: String
  var x2: String
  var y1: String
  var y2: String
}

object Anon_Color1 {
  @scala.inline
  def apply(
    color1: String,
    color2: String,
    x1: String,
    x2: String,
    y1: String,
    y2: String,
    useObjectBoundingBoxUnits: js.UndefOr[Boolean] = js.undefined
  ): Anon_Color1 = {
    val __obj = js.Dynamic.literal(color1 = color1, color2 = color2, x1 = x1, x2 = x2, y1 = y1, y2 = y2)
    if (!js.isUndefined(useObjectBoundingBoxUnits)) __obj.updateDynamic("useObjectBoundingBoxUnits")(useObjectBoundingBoxUnits)
    __obj.asInstanceOf[Anon_Color1]
  }
}

