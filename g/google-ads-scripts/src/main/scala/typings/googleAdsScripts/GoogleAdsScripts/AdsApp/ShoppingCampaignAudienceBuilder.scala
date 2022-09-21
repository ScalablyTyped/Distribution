package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for ShoppingCampaignAudience objects.
  *
  * Example usage:
  *
  *  var audienceBuilder = shoppingCampaign.targeting().newUserListBuilder();
  *  var audienceOperation = audienceBuilder
  *      .withAudienceId(3)              // required
  *      .build();                       // add the audience
  *
  *  var audience = audienceOperation.getResult();
  */
trait ShoppingCampaignAudienceBuilder
  extends StObject
     with Builder[ShoppingCampaignAudienceOperation] {
  
  /** Sets the audience ID of the audience. */
  def withAudienceId(audienceId: Double): ShoppingCampaignAudienceBuilder
  
  /** Sets the bid modifier value for this audience to the specified value. */
  def withBidModifier(modifier: Double): ShoppingCampaignAudienceBuilder
}
object ShoppingCampaignAudienceBuilder {
  
  inline def apply(
    build: () => ShoppingCampaignAudienceOperation,
    withAudienceId: Double => ShoppingCampaignAudienceBuilder,
    withBidModifier: Double => ShoppingCampaignAudienceBuilder
  ): ShoppingCampaignAudienceBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
    __obj.asInstanceOf[ShoppingCampaignAudienceBuilder]
  }
  
  extension [Self <: ShoppingCampaignAudienceBuilder](x: Self) {
    
    inline def setWithAudienceId(value: Double => ShoppingCampaignAudienceBuilder): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    inline def setWithBidModifier(value: Double => ShoppingCampaignAudienceBuilder): Self = StObject.set(x, "withBidModifier", js.Any.fromFunction1(value))
  }
}
