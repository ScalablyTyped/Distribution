package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBlogsListbyuser extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether the response is a list of blogs with per-user information instead
    * of just blogs.
    */
  var fetchUserInfo: js.UndefOr[Boolean] = js.native
  /**
    * User access types for blogs to include in the results, e.g. AUTHOR will
    * return blogs where the user has author level access. If no roles are
    * specified, defaults to ADMIN and AUTHOR roles.
    */
  var role: js.UndefOr[js.Array[String]] = js.native
  /**
    * Blog statuses to include in the result (default: Live blogs only). Note
    * that ADMIN access is required to view deleted blogs.
    */
  var status: js.UndefOr[js.Array[String]] = js.native
  /**
    * ID of the user whose blogs are to be fetched. Either the word 'self'
    * (sans quote marks) or the user's profile identifier.
    */
  var userId: js.UndefOr[String] = js.native
  /**
    * Access level with which to view the blogs. Note that some fields require
    * elevated access.
    */
  var view: js.UndefOr[String] = js.native
}

object ParamsResourceBlogsListbyuser {
  @scala.inline
  def apply(): ParamsResourceBlogsListbyuser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBlogsListbyuser]
  }
  @scala.inline
  implicit class ParamsResourceBlogsListbyuserOps[Self <: ParamsResourceBlogsListbyuser] (val x: Self) extends AnyVal {
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
    def setFetchUserInfo(value: Boolean): Self = this.set("fetchUserInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchUserInfo: Self = this.set("fetchUserInfo", js.undefined)
    @scala.inline
    def setRoleVarargs(value: String*): Self = this.set("role", js.Array(value :_*))
    @scala.inline
    def setRole(value: js.Array[String]): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setStatusVarargs(value: String*): Self = this.set("status", js.Array(value :_*))
    @scala.inline
    def setStatus(value: js.Array[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

