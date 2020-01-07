package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A &lt;a
  * href=&quot;/chart/interactive/docs/gallery/candlestickchart&quot;&gt;candlestick
  * chart&lt;/a&gt;.
  */
@js.native
trait Schema$CandlestickChartSpec extends js.Object {
  /**
    * The Candlestick chart data. Only one CandlestickData is supported.
    */
  var data: js.UndefOr[js.Array[Schema$CandlestickData]] = js.native
  /**
    * The domain data (horizontal axis) for the candlestick chart.  String data
    * will be treated as discrete labels, other data will be treated as
    * continuous values.
    */
  var domain: js.UndefOr[Schema$CandlestickDomain] = js.native
}

object Schema$CandlestickChartSpec {
  @scala.inline
  def apply(data: js.Array[Schema$CandlestickData] = null, domain: Schema$CandlestickDomain = null): Schema$CandlestickChartSpec = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CandlestickChartSpec]
  }
}

