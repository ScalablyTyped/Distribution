package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The series of a CandlestickData.
  */
@js.native
trait Schema$CandlestickSeries extends js.Object {
  /**
    * The data of the CandlestickSeries.
    */
  var data: js.UndefOr[Schema$ChartData] = js.native
}

object Schema$CandlestickSeries {
  @scala.inline
  def apply(data: Schema$ChartData = null): Schema$CandlestickSeries = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CandlestickSeries]
  }
}

