package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait isCampaignChild extends js.Object {
  def getCampaign(): Campaign
}

object isCampaignChild {
  @scala.inline
  def apply(getCampaign: () => Campaign): isCampaignChild = {
    val __obj = js.Dynamic.literal(getCampaign = js.Any.fromFunction0(getCampaign))
  
    __obj.asInstanceOf[isCampaignChild]
  }
}

