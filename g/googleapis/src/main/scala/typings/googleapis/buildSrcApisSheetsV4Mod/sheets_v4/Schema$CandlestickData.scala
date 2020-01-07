package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Candlestick chart data, each containing the low, open, close, and high
  * values for a series.
  */
@js.native
trait Schema$CandlestickData extends js.Object {
  /**
    * The range data (vertical axis) for the close/final value for each candle.
    * This is the top of the candle body.  If greater than the open value the
    * candle will be filled.  Otherwise the candle will be hollow.
    */
  var closeSeries: js.UndefOr[Schema$CandlestickSeries] = js.native
  /**
    * The range data (vertical axis) for the high/maximum value for each
    * candle. This is the top of the candle&#39;s center line.
    */
  var highSeries: js.UndefOr[Schema$CandlestickSeries] = js.native
  /**
    * The range data (vertical axis) for the low/minimum value for each candle.
    * This is the bottom of the candle&#39;s center line.
    */
  var lowSeries: js.UndefOr[Schema$CandlestickSeries] = js.native
  /**
    * The range data (vertical axis) for the open/initial value for each
    * candle. This is the bottom of the candle body.  If less than the close
    * value the candle will be filled.  Otherwise the candle will be hollow.
    */
  var openSeries: js.UndefOr[Schema$CandlestickSeries] = js.native
}

object Schema$CandlestickData {
  @scala.inline
  def apply(
    closeSeries: Schema$CandlestickSeries = null,
    highSeries: Schema$CandlestickSeries = null,
    lowSeries: Schema$CandlestickSeries = null,
    openSeries: Schema$CandlestickSeries = null
  ): Schema$CandlestickData = {
    val __obj = js.Dynamic.literal()
    if (closeSeries != null) __obj.updateDynamic("closeSeries")(closeSeries.asInstanceOf[js.Any])
    if (highSeries != null) __obj.updateDynamic("highSeries")(highSeries.asInstanceOf[js.Any])
    if (lowSeries != null) __obj.updateDynamic("lowSeries")(lowSeries.asInstanceOf[js.Any])
    if (openSeries != null) __obj.updateDynamic("openSeries")(openSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CandlestickData]
  }
}

