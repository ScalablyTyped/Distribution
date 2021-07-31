package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesPullnotificationset
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The request mode for pulling notifications. Specifying
    * waitForNotifications will cause the request to block and wait until one
    * or more notifications are present, or return an empty notification list
    * if no notifications are present after some time. Speciying
    * returnImmediately will cause the request to immediately return the
    * pending notifications, or an empty list if no notifications are present.
    * If omitted, defaults to waitForNotifications.
    */
  var requestMode: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesPullnotificationset {
  
  @scala.inline
  def apply(): ParamsResourceEnterprisesPullnotificationset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesPullnotificationset]
  }
  
  @scala.inline
  implicit class ParamsResourceEnterprisesPullnotificationsetMutableBuilder[Self <: ParamsResourceEnterprisesPullnotificationset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestMode(value: String): Self = StObject.set(x, "requestMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestModeUndefined: Self = StObject.set(x, "requestMode", js.undefined)
  }
}
