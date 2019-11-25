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
    val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], color2 = color2.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    if (!js.isUndefined(useObjectBoundingBoxUnits)) __obj.updateDynamic("useObjectBoundingBoxUnits")(useObjectBoundingBoxUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color1]
  }
}

