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

object SearchCampaignAudienceBuilder {
  @scala.inline
  def apply[SearchCampaignAudience](
    build: () => AdWordsOperation[SearchCampaignAudience],
    exclude: () => AdWordsOperation[SearchCampaignAudience],
    withAudience: UserList => SearchCampaignAudienceBuilder[SearchCampaignAudience],
    withAudienceId: scala.Double => SearchCampaignAudienceBuilder[SearchCampaignAudience],
    withBidModifier: scala.Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]
  ): SearchCampaignAudienceBuilder[SearchCampaignAudience] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
  
    __obj.asInstanceOf[SearchCampaignAudienceBuilder[SearchCampaignAudience]]
  }
}

