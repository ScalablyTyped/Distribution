package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait isAdGroupChild extends isCampaignChild {
  def getAdGroup(): AdGroup
}

object isAdGroupChild {
  @scala.inline
  def apply(getAdGroup: js.Function0[AdGroup], getCampaign: js.Function0[Campaign]): isAdGroupChild = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup)
    __obj.updateDynamic("getCampaign")(getCampaign)
    __obj.asInstanceOf[isAdGroupChild]
  }
}

