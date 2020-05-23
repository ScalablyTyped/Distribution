package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartBubble extends js.Object {
  var opacity: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
}

object ChartBubble {
  @scala.inline
  def apply(
    opacity: js.UndefOr[Double] = js.undefined,
    stroke: String = null,
    textStyle: ChartTextStyle = null
  ): ChartBubble = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBubble]
  }
}

