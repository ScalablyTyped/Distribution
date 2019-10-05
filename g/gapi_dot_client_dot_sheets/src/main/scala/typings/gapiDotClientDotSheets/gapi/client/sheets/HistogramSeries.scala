package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramSeries extends js.Object {
  /**
    * The color of the column representing this series in each bucket.
    * This field is optional.
    */
  var barColor: js.UndefOr[Color] = js.undefined
  /** The data for this histogram series. */
  var data: js.UndefOr[ChartData] = js.undefined
}

object HistogramSeries {
  @scala.inline
  def apply(barColor: Color = null, data: ChartData = null): HistogramSeries = {
    val __obj = js.Dynamic.literal()
    if (barColor != null) __obj.updateDynamic("barColor")(barColor)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[HistogramSeries]
  }
}

