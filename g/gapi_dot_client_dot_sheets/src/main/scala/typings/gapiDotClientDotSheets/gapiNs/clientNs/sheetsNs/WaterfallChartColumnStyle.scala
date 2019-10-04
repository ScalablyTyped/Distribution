package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartColumnStyle extends js.Object {
  /** The color of the column. */
  var color: js.UndefOr[Color] = js.undefined
  /** The label of the column's legend. */
  var label: js.UndefOr[String] = js.undefined
}

object WaterfallChartColumnStyle {
  @scala.inline
  def apply(color: Color = null, label: String = null): WaterfallChartColumnStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[WaterfallChartColumnStyle]
  }
}

