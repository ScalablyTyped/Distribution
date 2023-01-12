package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for Audience objects.
  *
  * Example usage:
  *
  *  var audienceBuilder = adGroup.display().newAudienceBuilder();
  *  var audience = audienceBuilder
  *    .withAudienceType('USER_LIST')  // required
  *    .withAudienceId(3)              // required
  *    .withCpc(0.50)                  // optional
  *    .build()                        // create the audience
  */
trait AudienceBuilder
  extends StObject
     with Builder[AudienceOperation] {
  
  /** Builds the excluded audience. */
  def exclude(): ExcludedAudienceOperation
  
  /** Sets the user list of the audience. */
  def withAudience(userList: UserList): this.type
  
  /** Sets the audience ID of the audience. */
  def withAudienceId(audienceId: Double): this.type
  
  /** Sets the type of the audience, either USER_INTEREST or USER_LIST. */
  def withAudienceType(audienceType: AudienceTypeType): this.type
  
  /** Sets the max CPC bid of the new audience to the specified value. */
  def withCpc(cpc: Double): this.type
  
  /** Sets the CPM bid of the new audience to the specified value. */
  def withCpm(cpm: Double): this.type
}
object AudienceBuilder {
  
  inline def apply(
    build: () => AudienceOperation,
    exclude: () => ExcludedAudienceOperation,
    withAudience: UserList => AudienceBuilder,
    withAudienceId: Double => AudienceBuilder,
    withAudienceType: AudienceTypeType => AudienceBuilder,
    withCpc: Double => AudienceBuilder,
    withCpm: Double => AudienceBuilder
  ): AudienceBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withAudienceType = js.Any.fromFunction1(withAudienceType), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm))
    __obj.asInstanceOf[AudienceBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudienceBuilder] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: () => ExcludedAudienceOperation): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithAudience(value: UserList => AudienceBuilder): Self = StObject.set(x, "withAudience", js.Any.fromFunction1(value))
    
    inline def setWithAudienceId(value: Double => AudienceBuilder): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    inline def setWithAudienceType(value: AudienceTypeType => AudienceBuilder): Self = StObject.set(x, "withAudienceType", js.Any.fromFunction1(value))
    
    inline def setWithCpc(value: Double => AudienceBuilder): Self = StObject.set(x, "withCpc", js.Any.fromFunction1(value))
    
    inline def setWithCpm(value: Double => AudienceBuilder): Self = StObject.set(x, "withCpm", js.Any.fromFunction1(value))
  }
}
