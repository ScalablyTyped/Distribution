package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait isCampaignChild extends js.Object {
  def getCampaign(): Campaign
}

object isCampaignChild {
  @scala.inline
  def apply(getCampaign: js.Function0[Campaign]): isCampaignChild = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCampaign")(getCampaign)
    __obj.asInstanceOf[isCampaignChild]
  }
}

