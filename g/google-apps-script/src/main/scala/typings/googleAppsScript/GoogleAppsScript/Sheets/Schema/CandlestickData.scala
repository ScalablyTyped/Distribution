package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CandlestickData extends js.Object {
  var closeSeries: js.UndefOr[CandlestickSeries] = js.native
  var highSeries: js.UndefOr[CandlestickSeries] = js.native
  var lowSeries: js.UndefOr[CandlestickSeries] = js.native
  var openSeries: js.UndefOr[CandlestickSeries] = js.native
}

object CandlestickData {
  @scala.inline
  def apply(): CandlestickData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandlestickData]
  }
  @scala.inline
  implicit class CandlestickDataOps[Self <: CandlestickData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloseSeries(value: CandlestickSeries): Self = this.set("closeSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseSeries: Self = this.set("closeSeries", js.undefined)
    @scala.inline
    def setHighSeries(value: CandlestickSeries): Self = this.set("highSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighSeries: Self = this.set("highSeries", js.undefined)
    @scala.inline
    def setLowSeries(value: CandlestickSeries): Self = this.set("lowSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowSeries: Self = this.set("lowSeries", js.undefined)
    @scala.inline
    def setOpenSeries(value: CandlestickSeries): Self = this.set("openSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenSeries: Self = this.set("openSeries", js.undefined)
  }
  
}

