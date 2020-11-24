package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentSnippet extends js.Object {
  
  var authorChannelId: js.UndefOr[js.Object] = js.native
  
  var authorChannelUrl: js.UndefOr[String] = js.native
  
  var authorDisplayName: js.UndefOr[String] = js.native
  
  var authorProfileImageUrl: js.UndefOr[String] = js.native
  
  var canRate: js.UndefOr[Boolean] = js.native
  
  var channelId: js.UndefOr[String] = js.native
  
  var likeCount: js.UndefOr[Double] = js.native
  
  var moderationStatus: js.UndefOr[String] = js.native
  
  var parentId: js.UndefOr[String] = js.native
  
  var publishedAt: js.UndefOr[String] = js.native
  
  var textDisplay: js.UndefOr[String] = js.native
  
  var textOriginal: js.UndefOr[String] = js.native
  
  var updatedAt: js.UndefOr[String] = js.native
  
  var videoId: js.UndefOr[String] = js.native
  
  var viewerRating: js.UndefOr[String] = js.native
}
object CommentSnippet {
  
  @scala.inline
  def apply(): CommentSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentSnippet]
  }
  
  @scala.inline
  implicit class CommentSnippetOps[Self <: CommentSnippet] (val x: Self) extends AnyVal {
    
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
    def setAuthorChannelId(value: js.Object): Self = this.set("authorChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorChannelId: Self = this.set("authorChannelId", js.undefined)
    
    @scala.inline
    def setAuthorChannelUrl(value: String): Self = this.set("authorChannelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorChannelUrl: Self = this.set("authorChannelUrl", js.undefined)
    
    @scala.inline
    def setAuthorDisplayName(value: String): Self = this.set("authorDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorDisplayName: Self = this.set("authorDisplayName", js.undefined)
    
    @scala.inline
    def setAuthorProfileImageUrl(value: String): Self = this.set("authorProfileImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorProfileImageUrl: Self = this.set("authorProfileImageUrl", js.undefined)
    
    @scala.inline
    def setCanRate(value: Boolean): Self = this.set("canRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanRate: Self = this.set("canRate", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setLikeCount(value: Double): Self = this.set("likeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLikeCount: Self = this.set("likeCount", js.undefined)
    
    @scala.inline
    def setModerationStatus(value: String): Self = this.set("moderationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModerationStatus: Self = this.set("moderationStatus", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    
    @scala.inline
    def setTextDisplay(value: String): Self = this.set("textDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDisplay: Self = this.set("textDisplay", js.undefined)
    
    @scala.inline
    def setTextOriginal(value: String): Self = this.set("textOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOriginal: Self = this.set("textOriginal", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
    
    @scala.inline
    def setViewerRating(value: String): Self = this.set("viewerRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewerRating: Self = this.set("viewerRating", js.undefined)
  }
}
