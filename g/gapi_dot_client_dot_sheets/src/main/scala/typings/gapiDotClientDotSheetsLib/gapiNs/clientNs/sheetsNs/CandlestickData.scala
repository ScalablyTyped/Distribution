package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CandlestickData extends js.Object {
  /**
               * The range data (vertical axis) for the close/final value for each candle.
               * This is the top of the candle body.  If greater than the open value the
               * candle will be filled.  Otherwise the candle will be hollow.
               */
  var closeSeries: js.UndefOr[CandlestickSeries] = js.undefined
  /**
               * The range data (vertical axis) for the high/maximum value for each
               * candle. This is the top of the candle's center line.
               */
  var highSeries: js.UndefOr[CandlestickSeries] = js.undefined
  /**
               * The range data (vertical axis) for the low/minimum value for each candle.
               * This is the bottom of the candle's center line.
               */
  var lowSeries: js.UndefOr[CandlestickSeries] = js.undefined
  /**
               * The range data (vertical axis) for the open/initial value for each
               * candle. This is the bottom of the candle body.  If less than the close
               * value the candle will be filled.  Otherwise the candle will be hollow.
               */
  var openSeries: js.UndefOr[CandlestickSeries] = js.undefined
}

