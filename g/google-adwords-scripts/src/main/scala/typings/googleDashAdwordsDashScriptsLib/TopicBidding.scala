package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicBidding extends AdWordsBidding {
  def clearCpc(): scala.Unit
  def clearCpm(): scala.Unit
  def getCpc(): scala.Double
  def getCpm(): scala.Double
  def setCpc(cpc: scala.Double): scala.Unit
  def setCpm(cpm: scala.Double): scala.Unit
}

object TopicBidding {
  @scala.inline
  def apply(
    clearCpc: js.Function0[scala.Unit],
    clearCpm: js.Function0[scala.Unit],
    getCpc: js.Function0[scala.Double],
    getCpm: js.Function0[scala.Double],
    getStrategy: js.Function0[BiddingStrategy],
    getStrategySource: js.Function0[BiddingStrategySource],
    getStrategyType: js.Function0[java.lang.String],
    setCpc: js.Function1[scala.Double, scala.Unit],
    setCpm: js.Function1[scala.Double, scala.Unit]
  ): TopicBidding = {
    val __obj = js.Dynamic.literal(clearCpc = clearCpc, clearCpm = clearCpm, getCpc = getCpc, getCpm = getCpm, getStrategy = getStrategy, getStrategySource = getStrategySource, getStrategyType = getStrategyType, setCpc = setCpc, setCpm = setCpm)
  
    __obj.asInstanceOf[TopicBidding]
  }
}

