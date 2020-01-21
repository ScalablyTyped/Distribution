package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandlestickData extends js.Object {
  var closeSeries: js.UndefOr[CandlestickSeries] = js.undefined
  var highSeries: js.UndefOr[CandlestickSeries] = js.undefined
  var lowSeries: js.UndefOr[CandlestickSeries] = js.undefined
  var openSeries: js.UndefOr[CandlestickSeries] = js.undefined
}

object CandlestickData {
  @scala.inline
  def apply(
    closeSeries: CandlestickSeries = null,
    highSeries: CandlestickSeries = null,
    lowSeries: CandlestickSeries = null,
    openSeries: CandlestickSeries = null
  ): CandlestickData = {
    val __obj = js.Dynamic.literal()
    if (closeSeries != null) __obj.updateDynamic("closeSeries")(closeSeries.asInstanceOf[js.Any])
    if (highSeries != null) __obj.updateDynamic("highSeries")(highSeries.asInstanceOf[js.Any])
    if (lowSeries != null) __obj.updateDynamic("lowSeries")(lowSeries.asInstanceOf[js.Any])
    if (openSeries != null) __obj.updateDynamic("openSeries")(openSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandlestickData]
  }
}

