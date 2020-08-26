package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePostsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * ID of the blog to fetch posts from.
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * Latest post date to fetch, a date-time with RFC 3339 formatting.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Whether the body content of posts is included (default: true). This
    * should be set to false when the post bodies are not required, to help
    * minimize traffic.
    */
  var fetchBodies: js.UndefOr[Boolean] = js.native
  /**
    * Whether image URL metadata for each post is included.
    */
  var fetchImages: js.UndefOr[Boolean] = js.native
  /**
    * Comma-separated list of labels to search for.
    */
  var labels: js.UndefOr[String] = js.native
  /**
    * Maximum number of posts to fetch.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Sort search results
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Continuation token if the request is paged.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Earliest post date to fetch, a date-time with RFC 3339 formatting.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * Statuses to include in the results.
    */
  var status: js.UndefOr[js.Array[String]] = js.native
  /**
    * Access level with which to view the returned result. Note that some
    * fields require escalated access.
    */
  var view: js.UndefOr[String] = js.native
}

object ParamsResourcePostsList {
  @scala.inline
  def apply(): ParamsResourcePostsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsList]
  }
  @scala.inline
  implicit class ParamsResourcePostsListOps[Self <: ParamsResourcePostsList] (val x: Self) extends AnyVal {
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
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setFetchBodies(value: Boolean): Self = this.set("fetchBodies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchBodies: Self = this.set("fetchBodies", js.undefined)
    @scala.inline
    def setFetchImages(value: Boolean): Self = this.set("fetchImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchImages: Self = this.set("fetchImages", js.undefined)
    @scala.inline
    def setLabels(value: String): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
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

