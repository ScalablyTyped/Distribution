package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAudienceBidding extends canSetBidModifier {
  def clearBidModifier(): scala.Unit
}

object SearchAudienceBidding {
  @scala.inline
  def apply(
    clearBidModifier: js.Function0[scala.Unit],
    getBidModifier: js.Function0[scala.Double],
    setBidModifier: js.Function1[scala.Double, scala.Unit]
  ): SearchAudienceBidding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearBidModifier")(clearBidModifier)
    __obj.updateDynamic("getBidModifier")(getBidModifier)
    __obj.updateDynamic("setBidModifier")(setBidModifier)
    __obj.asInstanceOf[SearchAudienceBidding]
  }
}

