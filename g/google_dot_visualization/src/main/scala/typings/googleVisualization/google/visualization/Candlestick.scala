package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Candlestick extends js.Object {
  var fallingColor: js.UndefOr[ChartStrokeFill] = js.native
  var hollowIsRising: js.UndefOr[Boolean] = js.native
  var risingColor: js.UndefOr[ChartStrokeFill] = js.native
}

object Candlestick {
  @scala.inline
  def apply(): Candlestick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Candlestick]
  }
  @scala.inline
  implicit class CandlestickOps[Self <: Candlestick] (val x: Self) extends AnyVal {
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
    def setFallingColor(value: ChartStrokeFill): Self = this.set("fallingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallingColor: Self = this.set("fallingColor", js.undefined)
    @scala.inline
    def setHollowIsRising(value: Boolean): Self = this.set("hollowIsRising", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHollowIsRising: Self = this.set("hollowIsRising", js.undefined)
    @scala.inline
    def setRisingColor(value: ChartStrokeFill): Self = this.set("risingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRisingColor: Self = this.set("risingColor", js.undefined)
  }
  
}

