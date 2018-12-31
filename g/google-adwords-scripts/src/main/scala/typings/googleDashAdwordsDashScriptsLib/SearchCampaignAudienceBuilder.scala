package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCampaignAudienceBuilder[SearchCampaignAudience] extends AdWordsBuilder[SearchCampaignAudience] {
  def exclude(): AdWordsOperation[SearchCampaignAudience]
  def withAudience(userList: UserList): SearchCampaignAudienceBuilder[SearchCampaignAudience]
  def withAudienceId(audienceId: scala.Double): SearchCampaignAudienceBuilder[SearchCampaignAudience]
  def withBidModifier(modifier: scala.Double): SearchCampaignAudienceBuilder[SearchCampaignAudience]
}

