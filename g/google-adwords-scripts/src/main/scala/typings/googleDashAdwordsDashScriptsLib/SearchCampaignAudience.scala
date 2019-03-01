package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCampaignAudience extends SearchCampaignExcludedAudience {
  def bidding(): SearchAudienceBidding
  def isEnabled(): scala.Boolean
  def isPaused(): scala.Boolean
}

object SearchCampaignAudience {
  @scala.inline
  def apply(
    bidding: js.Function0[SearchAudienceBidding],
    getAudienceId: js.Function0[scala.Double],
    getCampaign: js.Function0[Campaign],
    getId: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    isEnabled: js.Function0[scala.Boolean],
    isPaused: js.Function0[scala.Boolean],
    remove: js.Function0[scala.Unit]
  ): SearchCampaignAudience = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bidding")(bidding)
    __obj.updateDynamic("getAudienceId")(getAudienceId)
    __obj.updateDynamic("getCampaign")(getCampaign)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("isPaused")(isPaused)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[SearchCampaignAudience]
  }
}

