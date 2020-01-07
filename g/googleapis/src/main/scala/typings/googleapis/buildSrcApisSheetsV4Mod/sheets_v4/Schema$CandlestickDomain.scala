package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The domain of a CandlestickChart.
  */
@js.native
trait Schema$CandlestickDomain extends js.Object {
  /**
    * The data of the CandlestickDomain.
    */
  var data: js.UndefOr[Schema$ChartData] = js.native
  /**
    * True to reverse the order of the domain values (horizontal axis).
    */
  var reversed: js.UndefOr[Boolean] = js.native
}

object Schema$CandlestickDomain {
  @scala.inline
  def apply(data: Schema$ChartData = null, reversed: js.UndefOr[Boolean] = js.undefined): Schema$CandlestickDomain = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CandlestickDomain]
  }
}

