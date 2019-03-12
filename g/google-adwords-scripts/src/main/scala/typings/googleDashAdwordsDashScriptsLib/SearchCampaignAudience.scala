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
    bidding: () => SearchAudienceBidding,
    getAudienceId: () => scala.Double,
    getCampaign: () => Campaign,
    getId: () => scala.Double,
    getName: () => java.lang.String,
    isEnabled: () => scala.Boolean,
    isPaused: () => scala.Boolean,
    remove: () => scala.Unit
  ): SearchCampaignAudience = {
    val __obj = js.Dynamic.literal(bidding = js.Any.fromFunction0(bidding), getAudienceId = js.Any.fromFunction0(getAudienceId), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), isEnabled = js.Any.fromFunction0(isEnabled), isPaused = js.Any.fromFunction0(isPaused), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[SearchCampaignAudience]
  }
}

