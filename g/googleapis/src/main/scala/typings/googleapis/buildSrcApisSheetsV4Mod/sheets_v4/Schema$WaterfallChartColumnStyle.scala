package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Styles for a waterfall chart column.
  */
@js.native
trait Schema$WaterfallChartColumnStyle extends js.Object {
  /**
    * The color of the column.
    */
  var color: js.UndefOr[Schema$Color] = js.native
  /**
    * The label of the column&#39;s legend.
    */
  var label: js.UndefOr[String] = js.native
}

object Schema$WaterfallChartColumnStyle {
  @scala.inline
  def apply(color: Schema$Color = null, label: String = null): Schema$WaterfallChartColumnStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WaterfallChartColumnStyle]
  }
}

