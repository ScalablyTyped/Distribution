package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchCampaignAudienceBuilder[SearchCampaignAudience] extends AdWordsBuilder[SearchCampaignAudience] {
  
  def exclude(): AdWordsOperation[SearchCampaignAudience] = js.native
  
  def withAudience(userList: UserList): SearchCampaignAudienceBuilder[SearchCampaignAudience] = js.native
  
  def withAudienceId(audienceId: Double): SearchCampaignAudienceBuilder[SearchCampaignAudience] = js.native
  
  def withBidModifier(modifier: Double): SearchCampaignAudienceBuilder[SearchCampaignAudience] = js.native
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
  
  @scala.inline
  implicit class SearchCampaignAudienceBuilderOps[Self <: SearchCampaignAudienceBuilder[_], SearchCampaignAudience] (val x: Self with SearchCampaignAudienceBuilder[SearchCampaignAudience]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExclude(value: () => AdWordsOperation[SearchCampaignAudience]): Self = this.set("exclude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithAudience(value: UserList => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = this.set("withAudience", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithAudienceId(value: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = this.set("withAudienceId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithBidModifier(value: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = this.set("withBidModifier", js.Any.fromFunction1(value))
  }
}
