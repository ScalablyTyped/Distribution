package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCampaignAudienceBuilder[SearchCampaignAudience] extends AdWordsBuilder[SearchCampaignAudience] {
  def exclude(): AdWordsOperation[SearchCampaignAudience]
  def withAudience(userList: UserList): SearchCampaignAudienceBuilder[SearchCampaignAudience]
  def withAudienceId(audienceId: Double): SearchCampaignAudienceBuilder[SearchCampaignAudience]
  def withBidModifier(modifier: Double): SearchCampaignAudienceBuilder[SearchCampaignAudience]
}

object SearchCampaignAudienceBuilder {
  @scala.inline
  def apply[SearchCampaignAudience](
    build: () => AdWordsOperation[SearchCampaignAudience],
    exclude: () => AdWordsOperation[SearchCampaignAudience],
    withAudience: UserList => SearchCampaignAudienceBuilder[SearchCampaignAudience],
    withAudienceId: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience],
    withBidModifier: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]
  ): SearchCampaignAudienceBuilder[SearchCampaignAudience] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
  
    __obj.asInstanceOf[SearchCampaignAudienceBuilder[SearchCampaignAudience]]
  }
}

