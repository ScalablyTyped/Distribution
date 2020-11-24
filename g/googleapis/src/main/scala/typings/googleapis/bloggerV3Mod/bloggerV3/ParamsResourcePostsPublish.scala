package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePostsPublish extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the Blog.
    */
  var blogId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Post.
    */
  var postId: js.UndefOr[String] = js.native
  
  /**
    * Optional date and time to schedule the publishing of the Blog. If no
    * publishDate parameter is given, the post is either published at the a
    * previously saved schedule date (if present), or the current time. If a
    * future date is given, the post will be scheduled to be published.
    */
  var publishDate: js.UndefOr[String] = js.native
}
object ParamsResourcePostsPublish {
  
  @scala.inline
  def apply(): ParamsResourcePostsPublish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsPublish]
  }
  
  @scala.inline
  implicit class ParamsResourcePostsPublishOps[Self <: ParamsResourcePostsPublish] (val x: Self) extends AnyVal {
    
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
    def setPostId(value: String): Self = this.set("postId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostId: Self = this.set("postId", js.undefined)
    
    @scala.inline
    def setPublishDate(value: String): Self = this.set("publishDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishDate: Self = this.set("publishDate", js.undefined)
  }
}
