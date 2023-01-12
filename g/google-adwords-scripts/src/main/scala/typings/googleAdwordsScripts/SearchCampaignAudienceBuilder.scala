package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCampaignAudienceBuilder[SearchCampaignAudience]
  extends StObject
     with AdWordsBuilder[SearchCampaignAudience] {
  
  def exclude(): AdWordsOperation[SearchCampaignAudience]
  
  def withAudience(userList: UserList): SearchCampaignAudienceBuilder[SearchCampaignAudience]
  
  def withAudienceId(audienceId: Double): SearchCampaignAudienceBuilder[SearchCampaignAudience]
  
  def withBidModifier(modifier: Double): SearchCampaignAudienceBuilder[SearchCampaignAudience]
}
object SearchCampaignAudienceBuilder {
  
  inline def apply[SearchCampaignAudience](
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
  implicit open class MutableBuilder[Self <: SearchCampaignAudienceBuilder[?], SearchCampaignAudience] (val x: Self & SearchCampaignAudienceBuilder[SearchCampaignAudience]) extends AnyVal {
    
    inline def setExclude(value: () => AdWordsOperation[SearchCampaignAudience]): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithAudience(value: UserList => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = StObject.set(x, "withAudience", js.Any.fromFunction1(value))
    
    inline def setWithAudienceId(value: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    inline def setWithBidModifier(value: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = StObject.set(x, "withBidModifier", js.Any.fromFunction1(value))
  }
}
