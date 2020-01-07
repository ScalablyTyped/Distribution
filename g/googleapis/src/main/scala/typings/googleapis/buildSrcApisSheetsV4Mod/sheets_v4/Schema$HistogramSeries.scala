package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A histogram series containing the series color and data.
  */
@js.native
trait Schema$HistogramSeries extends js.Object {
  /**
    * The color of the column representing this series in each bucket. This
    * field is optional.
    */
  var barColor: js.UndefOr[Schema$Color] = js.native
  /**
    * The data for this histogram series.
    */
  var data: js.UndefOr[Schema$ChartData] = js.native
}

object Schema$HistogramSeries {
  @scala.inline
  def apply(barColor: Schema$Color = null, data: Schema$ChartData = null): Schema$HistogramSeries = {
    val __obj = js.Dynamic.literal()
    if (barColor != null) __obj.updateDynamic("barColor")(barColor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HistogramSeries]
  }
}

