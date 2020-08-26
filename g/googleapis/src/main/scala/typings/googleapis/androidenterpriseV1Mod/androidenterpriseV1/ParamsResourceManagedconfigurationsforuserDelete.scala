package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceManagedconfigurationsforuserDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  /**
    * The ID of the managed configuration (a product ID), e.g.
    * "app:com.google.android.gm".
    */
  var managedConfigurationForUserId: js.UndefOr[String] = js.native
  /**
    * The ID of the user.
    */
  var userId: js.UndefOr[String] = js.native
}

object ParamsResourceManagedconfigurationsforuserDelete {
  @scala.inline
  def apply(): ParamsResourceManagedconfigurationsforuserDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagedconfigurationsforuserDelete]
  }
  @scala.inline
  implicit class ParamsResourceManagedconfigurationsforuserDeleteOps[Self <: ParamsResourceManagedconfigurationsforuserDelete] (val x: Self) extends AnyVal {
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
    def setEnterpriseId(value: String): Self = this.set("enterpriseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterpriseId: Self = this.set("enterpriseId", js.undefined)
    @scala.inline
    def setManagedConfigurationForUserId(value: String): Self = this.set("managedConfigurationForUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedConfigurationForUserId: Self = this.set("managedConfigurationForUserId", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

