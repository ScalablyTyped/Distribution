package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrganizationsecuritypoliciesListassociations extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The target resource to list associations. It is an organization, or a
    * folder.
    */
  var targetResource: js.UndefOr[String] = js.native
}

object ParamsResourceOrganizationsecuritypoliciesListassociations {
  @scala.inline
  def apply(): ParamsResourceOrganizationsecuritypoliciesListassociations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsecuritypoliciesListassociations]
  }
  @scala.inline
  implicit class ParamsResourceOrganizationsecuritypoliciesListassociationsOps[Self <: ParamsResourceOrganizationsecuritypoliciesListassociations] (val x: Self) extends AnyVal {
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
    def setTargetResource(value: String): Self = this.set("targetResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetResource: Self = this.set("targetResource", js.undefined)
  }
  
}

