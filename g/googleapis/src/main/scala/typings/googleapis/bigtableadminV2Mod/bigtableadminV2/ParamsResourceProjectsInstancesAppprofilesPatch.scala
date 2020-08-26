package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsInstancesAppprofilesPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If true, ignore safety checks when updating the app profile.
    */
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  /**
    * (`OutputOnly`) The unique name of the app profile. Values are of the form
    * `projects/<project>/instances/<instance>/appProfiles/_a-zA-Z0-9*`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAppProfile] = js.native
  /**
    * The subset of app profile fields which should be replaced. If unset, all
    * fields will be replaced.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsInstancesAppprofilesPatch {
  @scala.inline
  def apply(): ParamsResourceProjectsInstancesAppprofilesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesAppprofilesPatch]
  }
  @scala.inline
  implicit class ParamsResourceProjectsInstancesAppprofilesPatchOps[Self <: ParamsResourceProjectsInstancesAppprofilesPatch] (val x: Self) extends AnyVal {
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
    def setIgnoreWarnings(value: Boolean): Self = this.set("ignoreWarnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreWarnings: Self = this.set("ignoreWarnings", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaAppProfile): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

