package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCampaignExcludedAudience extends isCampaignChild {
  def getAudienceId(): scala.Double
  def getId(): scala.Double
  def getName(): java.lang.String
  def remove(): scala.Unit
}

object SearchCampaignExcludedAudience {
  @scala.inline
  def apply(
    getAudienceId: js.Function0[scala.Double],
    getCampaign: js.Function0[Campaign],
    getId: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    remove: js.Function0[scala.Unit]
  ): SearchCampaignExcludedAudience = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAudienceId")(getAudienceId)
    __obj.updateDynamic("getCampaign")(getCampaign)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[SearchCampaignExcludedAudience]
  }
}

