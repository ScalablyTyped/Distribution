package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait isAdGroupChild extends isCampaignChild {
  def getAdGroup(): AdGroup
}

object isAdGroupChild {
  @scala.inline
  def apply(getAdGroup: () => AdGroup, getCampaign: () => Campaign): isAdGroupChild = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getCampaign = js.Any.fromFunction0(getCampaign))
  
    __obj.asInstanceOf[isAdGroupChild]
  }
}

