package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for ShoppingAdGroupAudience objects.
  *
  * Example usage:
  *
  *  var shoppingAudienceBuilder = adGroup.targeting().newUserListBuilder();
  *  var shoppingAudience = shoppingAudienceBuilder
  *    .withAudienceId(3)              // required
  *    .withBidModifier(1)             // optional
  *    .build();                       // add the audience
  */
trait ShoppingAdGroupAudienceBuilder
  extends StObject
     with Builder[ShoppingAdGroupAudienceOperation] {
  
  /** Sets the audience ID of the audience. */
  def withAudienceId(audienceId: Double): this.type
  
  /** Sets the bid modifier value for this audience to the specified value. */
  def withBidModifier(modifier: Double): this.type
}
object ShoppingAdGroupAudienceBuilder {
  
  inline def apply(
    build: () => ShoppingAdGroupAudienceOperation,
    withAudienceId: Double => ShoppingAdGroupAudienceBuilder,
    withBidModifier: Double => ShoppingAdGroupAudienceBuilder
  ): ShoppingAdGroupAudienceBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
    __obj.asInstanceOf[ShoppingAdGroupAudienceBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShoppingAdGroupAudienceBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithAudienceId(value: Double => ShoppingAdGroupAudienceBuilder): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    inline def setWithBidModifier(value: Double => ShoppingAdGroupAudienceBuilder): Self = StObject.set(x, "withBidModifier", js.Any.fromFunction1(value))
  }
}
