package typings.googleDotVisualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stroke extends js.Object {
  var stroke: String
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object Anon_Stroke {
  @scala.inline
  def apply(stroke: String, strokeWidth: Int | Double = null): Anon_Stroke = {
    val __obj = js.Dynamic.literal(stroke = stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Stroke]
  }
}

