package typings.googleDotVisualization.googleNs.visualizationNs

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
  def apply(opacity: Int | Double = null, stroke: String = null, textStyle: ChartTextStyle = null): ChartBubble = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[ChartBubble]
  }
}

