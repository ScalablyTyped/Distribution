package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsBidding extends js.Object {
  def getStrategy(): BiddingStrategy
  def getStrategySource(): BiddingStrategySource
  def getStrategyType(): String
}

object AdWordsBidding {
  @scala.inline
  def apply(
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => BiddingStrategySource,
    getStrategyType: () => String
  ): AdWordsBidding = {
    val __obj = js.Dynamic.literal(getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType))
  
    __obj.asInstanceOf[AdWordsBidding]
  }
}

