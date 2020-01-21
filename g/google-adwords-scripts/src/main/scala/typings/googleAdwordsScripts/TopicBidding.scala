package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicBidding extends AdWordsBidding {
  def clearCpc(): Unit
  def clearCpm(): Unit
  def getCpc(): Double
  def getCpm(): Double
  def setCpc(cpc: Double): Unit
  def setCpm(cpm: Double): Unit
}

object TopicBidding {
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
  ): TopicBidding = {
    val __obj = js.Dynamic.literal(clearCpc = js.Any.fromFunction0(clearCpc), clearCpm = js.Any.fromFunction0(clearCpm), getCpc = js.Any.fromFunction0(getCpc), getCpm = js.Any.fromFunction0(getCpm), getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), setCpc = js.Any.fromFunction1(setCpc), setCpm = js.Any.fromFunction1(setCpm))
  
    __obj.asInstanceOf[TopicBidding]
  }
}

