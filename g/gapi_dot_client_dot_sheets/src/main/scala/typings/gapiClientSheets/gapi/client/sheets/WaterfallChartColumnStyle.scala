package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartColumnStyle extends js.Object {
  /** The color of the column. */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * The color of the column.
    * If color is also set, this field takes precedence.
    */
  var colorStyle: js.UndefOr[ColorStyle] = js.undefined
  /** The label of the column's legend. */
  var label: js.UndefOr[String] = js.undefined
}

object WaterfallChartColumnStyle {
  @scala.inline
  def apply(color: Color = null, colorStyle: ColorStyle = null, label: String = null): WaterfallChartColumnStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorStyle != null) __obj.updateDynamic("colorStyle")(colorStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterfallChartColumnStyle]
  }
}

