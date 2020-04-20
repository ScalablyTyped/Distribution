package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramSeries extends js.Object {
  /**
    * The color of the column representing this series in each bucket.
    * This field is optional.
    */
  var barColor: js.UndefOr[Color] = js.undefined
  /**
    * The color of the column representing this series in each bucket.
    * This field is optional.
    * If bar_color is also set, this field takes precedence.
    */
  var barColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /** The data for this histogram series. */
  var data: js.UndefOr[ChartData] = js.undefined
}

object HistogramSeries {
  @scala.inline
  def apply(barColor: Color = null, barColorStyle: ColorStyle = null, data: ChartData = null): HistogramSeries = {
    val __obj = js.Dynamic.literal()
    if (barColor != null) __obj.updateDynamic("barColor")(barColor.asInstanceOf[js.Any])
    if (barColorStyle != null) __obj.updateDynamic("barColorStyle")(barColorStyle.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramSeries]
  }
}

