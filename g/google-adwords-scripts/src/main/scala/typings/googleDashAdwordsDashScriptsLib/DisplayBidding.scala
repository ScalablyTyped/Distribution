package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayBidding extends AdWordsBidding {
  def clearCpc(): scala.Unit
  def clearCpm(): scala.Unit
  def getCpc(): scala.Double
  def getCpm(): scala.Double
  def setCpc(cpc: scala.Double): scala.Unit
  def setCpm(cpm: scala.Double): scala.Unit
}

object DisplayBidding {
  @scala.inline
  def apply(
    clearCpc: () => scala.Unit,
    clearCpm: () => scala.Unit,
    getCpc: () => scala.Double,
    getCpm: () => scala.Double,
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => BiddingStrategySource,
    getStrategyType: () => java.lang.String,
    setCpc: scala.Double => scala.Unit,
    setCpm: scala.Double => scala.Unit
  ): DisplayBidding = {
    val __obj = js.Dynamic.literal(clearCpc = js.Any.fromFunction0(clearCpc), clearCpm = js.Any.fromFunction0(clearCpm), getCpc = js.Any.fromFunction0(getCpc), getCpm = js.Any.fromFunction0(getCpm), getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), setCpc = js.Any.fromFunction1(setCpc), setCpm = js.Any.fromFunction1(setCpm))
  
    __obj.asInstanceOf[DisplayBidding]
  }
}

