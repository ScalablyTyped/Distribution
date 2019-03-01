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
    clearCpc: js.Function0[scala.Unit],
    clearCpm: js.Function0[scala.Unit],
    getCpc: js.Function0[scala.Double],
    getCpm: js.Function0[scala.Double],
    getStrategy: js.Function0[BiddingStrategy],
    getStrategySource: js.Function0[BiddingStrategySource],
    getStrategyType: js.Function0[java.lang.String],
    setCpc: js.Function1[scala.Double, scala.Unit],
    setCpm: js.Function1[scala.Double, scala.Unit]
  ): DisplayBidding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearCpc")(clearCpc)
    __obj.updateDynamic("clearCpm")(clearCpm)
    __obj.updateDynamic("getCpc")(getCpc)
    __obj.updateDynamic("getCpm")(getCpm)
    __obj.updateDynamic("getStrategy")(getStrategy)
    __obj.updateDynamic("getStrategySource")(getStrategySource)
    __obj.updateDynamic("getStrategyType")(getStrategyType)
    __obj.updateDynamic("setCpc")(setCpc)
    __obj.updateDynamic("setCpm")(setCpm)
    __obj.asInstanceOf[DisplayBidding]
  }
}

