package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsBidding extends js.Object {
  def getStrategy(): BiddingStrategy
  def getStrategySource(): BiddingStrategySource
  def getStrategyType(): java.lang.String
}

object AdWordsBidding {
  @scala.inline
  def apply(
    getStrategy: js.Function0[BiddingStrategy],
    getStrategySource: js.Function0[BiddingStrategySource],
    getStrategyType: js.Function0[java.lang.String]
  ): AdWordsBidding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStrategy")(getStrategy)
    __obj.updateDynamic("getStrategySource")(getStrategySource)
    __obj.updateDynamic("getStrategyType")(getStrategyType)
    __obj.asInstanceOf[AdWordsBidding]
  }
}

