package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSslpoliciesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  /**
    * Name of the SSL policy to update. The name must be 1-63 characters long,
    * and comply with RFC1035.
    */
  var sslPolicy: js.UndefOr[String] = js.native
}

object ParamsResourceSslpoliciesGet {
  @scala.inline
  def apply(): ParamsResourceSslpoliciesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSslpoliciesGet]
  }
  @scala.inline
  implicit class ParamsResourceSslpoliciesGetOps[Self <: ParamsResourceSslpoliciesGet] (val x: Self) extends AnyVal {
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
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    @scala.inline
    def setSslPolicy(value: String): Self = this.set("sslPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslPolicy: Self = this.set("sslPolicy", js.undefined)
  }
  
}

