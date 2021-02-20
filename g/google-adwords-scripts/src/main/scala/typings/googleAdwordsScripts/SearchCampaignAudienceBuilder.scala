package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
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
  implicit class SearchCampaignAudienceBuilderMutableBuilder[Self <: SearchCampaignAudienceBuilder[_], SearchCampaignAudience] (val x: Self with SearchCampaignAudienceBuilder[SearchCampaignAudience]) extends AnyVal {
    
    @scala.inline
    def setExclude(value: () => AdWordsOperation[SearchCampaignAudience]): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithAudience(value: UserList => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = StObject.set(x, "withAudience", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithAudienceId(value: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithBidModifier(value: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = StObject.set(x, "withBidModifier", js.Any.fromFunction1(value))
  }
}
