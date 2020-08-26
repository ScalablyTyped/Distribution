package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceRegiontargethttpsproxiesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  /**
    * Name of the region scoping this request.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Name of the TargetHttpsProxy resource to return.
    */
  var targetHttpsProxy: js.UndefOr[String] = js.native
}

object ParamsResourceRegiontargethttpsproxiesGet {
  @scala.inline
  def apply(): ParamsResourceRegiontargethttpsproxiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegiontargethttpsproxiesGet]
  }
  @scala.inline
  implicit class ParamsResourceRegiontargethttpsproxiesGetOps[Self <: ParamsResourceRegiontargethttpsproxiesGet] (val x: Self) extends AnyVal {
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
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setTargetHttpsProxy(value: String): Self = this.set("targetHttpsProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetHttpsProxy: Self = this.set("targetHttpsProxy", js.undefined)
  }
  
}

