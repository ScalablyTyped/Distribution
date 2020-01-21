package typings.googleVisualization.google.visualization

import typings.googleVisualization.AnonColor1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartBoxStyle extends js.Object {
  var gradient: js.UndefOr[AnonColor1] = js.undefined
  var rx: js.UndefOr[Double] = js.undefined
  var ry: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object ChartBoxStyle {
  @scala.inline
  def apply(
    gradient: AnonColor1 = null,
    rx: Int | Double = null,
    ry: Int | Double = null,
    stroke: String = null,
    strokeWidth: Int | Double = null
  ): ChartBoxStyle = {
    val __obj = js.Dynamic.literal()
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBoxStyle]
  }
}

