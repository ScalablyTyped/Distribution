package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceGrouplicenseusersList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  /**
    * The ID of the product the group license is for, e.g.
    * "app:com.google.android.gm".
    */
  var groupLicenseId: js.UndefOr[String] = js.native
}

object ParamsResourceGrouplicenseusersList {
  @scala.inline
  def apply(): ParamsResourceGrouplicenseusersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGrouplicenseusersList]
  }
  @scala.inline
  implicit class ParamsResourceGrouplicenseusersListOps[Self <: ParamsResourceGrouplicenseusersList] (val x: Self) extends AnyVal {
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
    def setGroupLicenseId(value: String): Self = this.set("groupLicenseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupLicenseId: Self = this.set("groupLicenseId", js.undefined)
  }
  
}

