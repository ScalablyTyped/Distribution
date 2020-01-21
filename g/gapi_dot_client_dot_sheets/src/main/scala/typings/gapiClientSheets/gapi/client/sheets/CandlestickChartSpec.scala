package typings.gapiClientSheets.gapi.client.sheets

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

object CandlestickChartSpec {
  @scala.inline
  def apply(data: js.Array[CandlestickData] = null, domain: CandlestickDomain = null): CandlestickChartSpec = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandlestickChartSpec]
  }
}

