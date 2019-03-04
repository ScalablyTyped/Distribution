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
    build: js.Function0[AdWordsOperation[SearchCampaignAudience]],
    exclude: js.Function0[AdWordsOperation[SearchCampaignAudience]],
    withAudience: js.Function1[UserList, SearchCampaignAudienceBuilder[SearchCampaignAudience]],
    withAudienceId: js.Function1[scala.Double, SearchCampaignAudienceBuilder[SearchCampaignAudience]],
    withBidModifier: js.Function1[scala.Double, SearchCampaignAudienceBuilder[SearchCampaignAudience]]
  ): SearchCampaignAudienceBuilder[SearchCampaignAudience] = {
    val __obj = js.Dynamic.literal(build = build, exclude = exclude, withAudience = withAudience, withAudienceId = withAudienceId, withBidModifier = withBidModifier)
  
    __obj.asInstanceOf[SearchCampaignAudienceBuilder[SearchCampaignAudience]]
  }
}

