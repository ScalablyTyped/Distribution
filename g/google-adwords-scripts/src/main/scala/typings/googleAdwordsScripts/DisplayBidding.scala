package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayBidding extends AdWordsBidding {
  def clearCpc(): Unit = js.native
  def clearCpm(): Unit = js.native
  def getCpc(): Double = js.native
  def getCpm(): Double = js.native
  def setCpc(cpc: Double): Unit = js.native
  def setCpm(cpm: Double): Unit = js.native
}

object DisplayBidding {
  @scala.inline
  def apply(
    clearCpc: () => Unit,
    clearCpm: () => Unit,
    getCpc: () => Double,
    getCpm: () => Double,
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => BiddingStrategySource,
    getStrategyType: () => String,
    setCpc: Double => Unit,
    setCpm: Double => Unit
  ): DisplayBidding = {
    val __obj = js.Dynamic.literal(clearCpc = js.Any.fromFunction0(clearCpc), clearCpm = js.Any.fromFunction0(clearCpm), getCpc = js.Any.fromFunction0(getCpc), getCpm = js.Any.fromFunction0(getCpm), getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), setCpc = js.Any.fromFunction1(setCpc), setCpm = js.Any.fromFunction1(setCpm))
    __obj.asInstanceOf[DisplayBidding]
  }
  @scala.inline
  implicit class DisplayBiddingOps[Self <: DisplayBidding] (val x: Self) extends AnyVal {
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
    def setClearCpc(value: () => Unit): Self = this.set("clearCpc", js.Any.fromFunction0(value))
    @scala.inline
    def setClearCpm(value: () => Unit): Self = this.set("clearCpm", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCpc(value: () => Double): Self = this.set("getCpc", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCpm(value: () => Double): Self = this.set("getCpm", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCpc(value: Double => Unit): Self = this.set("setCpc", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCpm(value: Double => Unit): Self = this.set("setCpm", js.Any.fromFunction1(value))
  }
  
}

