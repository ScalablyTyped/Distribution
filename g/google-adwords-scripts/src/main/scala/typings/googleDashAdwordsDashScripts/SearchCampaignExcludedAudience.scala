package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCampaignExcludedAudience extends isCampaignChild {
  def getAudienceId(): Double
  def getId(): Double
  def getName(): String
  def remove(): Unit
}

object SearchCampaignExcludedAudience {
  @scala.inline
  def apply(
    getAudienceId: () => Double,
    getCampaign: () => Campaign,
    getId: () => Double,
    getName: () => String,
    remove: () => Unit
  ): SearchCampaignExcludedAudience = {
    val __obj = js.Dynamic.literal(getAudienceId = js.Any.fromFunction0(getAudienceId), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[SearchCampaignExcludedAudience]
  }
}

