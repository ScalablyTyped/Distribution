package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartBoxStyle extends js.Object {
  var gradient: js.UndefOr[googleDotVisualizationLib.Anon_Color1] = js.undefined
  var rx: js.UndefOr[scala.Double] = js.undefined
  var ry: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
}

object ChartBoxStyle {
  @scala.inline
  def apply(
    gradient: googleDotVisualizationLib.Anon_Color1 = null,
    rx: scala.Int | scala.Double = null,
    ry: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null
  ): ChartBoxStyle = {
    val __obj = js.Dynamic.literal()
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBoxStyle]
  }
}

