package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartStem extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
}

object ChartStem {
  @scala.inline
  def apply(color: String = null, length: js.UndefOr[Double] = js.undefined): ChartStem = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartStem]
  }
}

