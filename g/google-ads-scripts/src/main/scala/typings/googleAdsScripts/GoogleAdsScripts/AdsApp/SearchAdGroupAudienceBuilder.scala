package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for SearchAdGroupAudience objects.
  *
  * Example usage:
  *
  *      var audienceBuilder = adGroup.targeting().newUserListBuilder();
  *      var audienceOperation = audienceBuilder
  *        .withAudienceId(3)              // required
  *        .withBidModifier(1)             // optional
  *        .build();                       // add the audience
  *      var audience = audienceOperation.getResult();
  */
trait SearchAdGroupAudienceBuilder
  extends StObject
     with Builder[SearchAdGroupAudienceOperation] {
  
  /** Builds the excluded audience. */
  def exclude(): SearchAdGroupExcludedAudienceOperation
  
  /** Sets the user list of the audience. */
  def withAudience(userList: UserList): this.type
  
  /** Sets the audience ID of the audience. */
  def withAudienceId(audienceId: Double): this.type
  
  /** Sets the bid modifier value for this audience to the specified value. */
  def withBidModifier(modifier: Double): this.type
}
object SearchAdGroupAudienceBuilder {
  
  inline def apply(
    build: () => SearchAdGroupAudienceOperation,
    exclude: () => SearchAdGroupExcludedAudienceOperation,
    withAudience: UserList => SearchAdGroupAudienceBuilder,
    withAudienceId: Double => SearchAdGroupAudienceBuilder,
    withBidModifier: Double => SearchAdGroupAudienceBuilder
  ): SearchAdGroupAudienceBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
    __obj.asInstanceOf[SearchAdGroupAudienceBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchAdGroupAudienceBuilder] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: () => SearchAdGroupExcludedAudienceOperation): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithAudience(value: UserList => SearchAdGroupAudienceBuilder): Self = StObject.set(x, "withAudience", js.Any.fromFunction1(value))
    
    inline def setWithAudienceId(value: Double => SearchAdGroupAudienceBuilder): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    inline def setWithBidModifier(value: Double => SearchAdGroupAudienceBuilder): Self = StObject.set(x, "withBidModifier", js.Any.fromFunction1(value))
  }
}
