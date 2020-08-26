package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePostsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * ID of the blog to fetch the post from.
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * Whether the body content of the post is included (default: true). This
    * should be set to false when the post bodies are not required, to help
    * minimize traffic.
    */
  var fetchBody: js.UndefOr[Boolean] = js.native
  /**
    * Whether image URL metadata for each post is included (default: false).
    */
  var fetchImages: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of comments to pull back on a post.
    */
  var maxComments: js.UndefOr[Double] = js.native
  /**
    * The ID of the post
    */
  var postId: js.UndefOr[String] = js.native
  /**
    * Access level with which to view the returned result. Note that some
    * fields require elevated access.
    */
  var view: js.UndefOr[String] = js.native
}

object ParamsResourcePostsGet {
  @scala.inline
  def apply(): ParamsResourcePostsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsGet]
  }
  @scala.inline
  implicit class ParamsResourcePostsGetOps[Self <: ParamsResourcePostsGet] (val x: Self) extends AnyVal {
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
    def setFetchBody(value: Boolean): Self = this.set("fetchBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchBody: Self = this.set("fetchBody", js.undefined)
    @scala.inline
    def setFetchImages(value: Boolean): Self = this.set("fetchImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchImages: Self = this.set("fetchImages", js.undefined)
    @scala.inline
    def setMaxComments(value: Double): Self = this.set("maxComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxComments: Self = this.set("maxComments", js.undefined)
    @scala.inline
    def setPostId(value: String): Self = this.set("postId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostId: Self = this.set("postId", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

