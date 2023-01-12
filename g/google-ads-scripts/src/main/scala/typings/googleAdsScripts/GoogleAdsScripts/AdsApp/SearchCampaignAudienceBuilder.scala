package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for SearchCampaignAudience and SearchCampaignExcludedAudience objects.
  *
  * Example usage:
  *
  *      var audienceBuilder = campaign.targeting().newUserListBuilder();
  *      var audienceOperation = audienceBuilder
  *          .withAudienceId(3)       // required
  *          .build();                // add the audience, or .exclude() to exclude the audience.
  *      var audience = audienceOperation.getResult();
  */
trait SearchCampaignAudienceBuilder
  extends StObject
     with Builder[SearchCampaignAudienceOperation] {
  
  /** Builds the excluded audience. */
  def exclude(): SearchCampaignExcludedAudienceOperation
  
  /** Sets the user list of the audience. */
  def withAudience(userList: UserList): this.type
  
  /** Sets the audience ID of the audience. */
  def withAudienceId(audienceId: Double): this.type
  
  /** Sets the bid modifier value for this audience to the specified value. */
  def withBidModifier(modifier: Double): this.type
}
object SearchCampaignAudienceBuilder {
  
  inline def apply(
    build: () => SearchCampaignAudienceOperation,
    exclude: () => SearchCampaignExcludedAudienceOperation,
    withAudience: UserList => SearchCampaignAudienceBuilder,
    withAudienceId: Double => SearchCampaignAudienceBuilder,
    withBidModifier: Double => SearchCampaignAudienceBuilder
  ): SearchCampaignAudienceBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
    __obj.asInstanceOf[SearchCampaignAudienceBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchCampaignAudienceBuilder] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: () => SearchCampaignExcludedAudienceOperation): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithAudience(value: UserList => SearchCampaignAudienceBuilder): Self = StObject.set(x, "withAudience", js.Any.fromFunction1(value))
    
    inline def setWithAudienceId(value: Double => SearchCampaignAudienceBuilder): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    inline def setWithBidModifier(value: Double => SearchCampaignAudienceBuilder): Self = StObject.set(x, "withBidModifier", js.Any.fromFunction1(value))
  }
}
