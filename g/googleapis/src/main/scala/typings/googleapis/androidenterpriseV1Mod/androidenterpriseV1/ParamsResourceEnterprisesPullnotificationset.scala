package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceEnterprisesPullnotificationset extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The request mode for pulling notifications. Specifying
    * waitForNotifications will cause the request to block and wait until one
    * or more notifications are present, or return an empty notification list
    * if no notifications are present after some time. Speciying
    * returnImmediately will cause the request to immediately return the
    * pending notifications, or an empty list if no notifications are present.
    * If omitted, defaults to waitForNotifications.
    */
  var requestMode: js.UndefOr[String] = js.native
}
object ParamsResourceEnterprisesPullnotificationset {
  
  @scala.inline
  def apply(): ParamsResourceEnterprisesPullnotificationset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesPullnotificationset]
  }
  
  @scala.inline
  implicit class ParamsResourceEnterprisesPullnotificationsetOps[Self <: ParamsResourceEnterprisesPullnotificationset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setRequestMode(value: String): Self = this.set("requestMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMode: Self = this.set("requestMode", js.undefined)
  }
}
