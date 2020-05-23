package typings.gaugejs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var font: String
  var fractionDigits: js.UndefOr[Double] = js.undefined
  var labels: js.Array[Double]
}

object Color {
  @scala.inline
  def apply(
    font: String,
    labels: js.Array[Double],
    color: String = null,
    fractionDigits: js.UndefOr[Double] = js.undefined
  ): Color = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fractionDigits)) __obj.updateDynamic("fractionDigits")(fractionDigits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

