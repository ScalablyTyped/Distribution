package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegend extends js.Object {
  var alignment: js.UndefOr[ChartLegendAlignment] = js.undefined
  var maxLines: js.UndefOr[Double] = js.undefined
  var numberFormat: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[ChartLegendPosition] = js.undefined
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
}

object ChartLegend {
  @scala.inline
  def apply(
    alignment: ChartLegendAlignment = null,
    maxLines: Int | Double = null,
    numberFormat: String = null,
    position: ChartLegendPosition = null,
    textStyle: ChartTextStyle = null
  ): ChartLegend = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (position != null) __obj.updateDynamic("position")(position)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[ChartLegend]
  }
}

