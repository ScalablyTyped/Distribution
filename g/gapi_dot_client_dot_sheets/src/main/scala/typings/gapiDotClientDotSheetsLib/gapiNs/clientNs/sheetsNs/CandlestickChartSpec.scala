package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandlestickChartSpec extends js.Object {
  /**
    * The Candlestick chart data.
    * Only one CandlestickData is supported.
    */
  var data: js.UndefOr[js.Array[CandlestickData]] = js.undefined
  /**
    * The domain data (horizontal axis) for the candlestick chart.  String data
    * will be treated as discrete labels, other data will be treated as
    * continuous values.
    */
  var domain: js.UndefOr[CandlestickDomain] = js.undefined
}

