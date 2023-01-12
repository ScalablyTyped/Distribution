package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access to ad group-level targeting criteria.
  *
  * For instance, to select all audiences targeted by an ad group you might use:
  *
  *      var adgroup = AdsApp.shoppingAdGroups().get().next();
  *      var audiences = adgroup.targeting().audiences().get();
  *      while (audiences.hasNext()) {
  *        var audience = audiences.next();
  *      }
  */
trait ShoppingAdGroupTargeting extends StObject {
  
  /** Specializes this selector to return ShoppingAdGroupAudience criteria. */
  def audiences(): ShoppingAdGroupAudienceSelector
  
  /** Returns the current targeting setting of the specified criterion type group for this shopping ad group. */
  def getTargetingSetting(criterionTypeGroup: String): String
  
  /** Returns a new user list audience builder for this ad group. */
  def newUserListBuilder(): ShoppingAdGroupAudienceBuilder
  
  /** Sets the targeting setting for this ad group. */
  def setTargetingSetting(criterionTypeGroup: String, targetingSetting: String): Unit
}
object ShoppingAdGroupTargeting {
  
  inline def apply(
    audiences: () => ShoppingAdGroupAudienceSelector,
    getTargetingSetting: String => String,
    newUserListBuilder: () => ShoppingAdGroupAudienceBuilder,
    setTargetingSetting: (String, String) => Unit
  ): ShoppingAdGroupTargeting = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), getTargetingSetting = js.Any.fromFunction1(getTargetingSetting), newUserListBuilder = js.Any.fromFunction0(newUserListBuilder), setTargetingSetting = js.Any.fromFunction2(setTargetingSetting))
    __obj.asInstanceOf[ShoppingAdGroupTargeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShoppingAdGroupTargeting] (val x: Self) extends AnyVal {
    
    inline def setAudiences(value: () => ShoppingAdGroupAudienceSelector): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    inline def setGetTargetingSetting(value: String => String): Self = StObject.set(x, "getTargetingSetting", js.Any.fromFunction1(value))
    
    inline def setNewUserListBuilder(value: () => ShoppingAdGroupAudienceBuilder): Self = StObject.set(x, "newUserListBuilder", js.Any.fromFunction0(value))
    
    inline def setSetTargetingSetting(value: (String, String) => Unit): Self = StObject.set(x, "setTargetingSetting", js.Any.fromFunction2(value))
  }
}
