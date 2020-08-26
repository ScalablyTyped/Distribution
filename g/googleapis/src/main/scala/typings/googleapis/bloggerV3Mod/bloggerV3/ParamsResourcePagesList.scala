package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePagesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * ID of the blog to fetch Pages from.
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * Whether to retrieve the Page bodies.
    */
  var fetchBodies: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of Pages to fetch.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Continuation token if the request is paged.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    *
    */
  var status: js.UndefOr[js.Array[String]] = js.native
  /**
    * Access level with which to view the returned result. Note that some
    * fields require elevated access.
    */
  var view: js.UndefOr[String] = js.native
}

object ParamsResourcePagesList {
  @scala.inline
  def apply(): ParamsResourcePagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagesList]
  }
  @scala.inline
  implicit class ParamsResourcePagesListOps[Self <: ParamsResourcePagesList] (val x: Self) extends AnyVal {
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
    def setBlogId(value: String): Self = this.set("blogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlogId: Self = this.set("blogId", js.undefined)
    @scala.inline
    def setFetchBodies(value: Boolean): Self = this.set("fetchBodies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchBodies: Self = this.set("fetchBodies", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setStatusVarargs(value: String*): Self = this.set("status", js.Array(value :_*))
    @scala.inline
    def setStatus(value: js.Array[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

