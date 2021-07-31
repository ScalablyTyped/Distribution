package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePurchasesSubscriptionsCancel
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The package name of the application for which this subscription was
    * purchased (for example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * The purchased subscription ID (for example, 'monthly001').
    */
  var subscriptionId: js.UndefOr[String] = js.undefined
  
  /**
    * The token provided to the user's device when the subscription was
    * purchased.
    */
  var token: js.UndefOr[String] = js.undefined
}
object ParamsResourcePurchasesSubscriptionsCancel {
  
  @scala.inline
  def apply(): ParamsResourcePurchasesSubscriptionsCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePurchasesSubscriptionsCancel]
  }
  
  @scala.inline
  implicit class ParamsResourcePurchasesSubscriptionsCancelMutableBuilder[Self <: ParamsResourcePurchasesSubscriptionsCancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
