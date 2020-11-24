package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoStatistics extends js.Object {
  
  var commentCount: js.UndefOr[String] = js.native
  
  var dislikeCount: js.UndefOr[String] = js.native
  
  var favoriteCount: js.UndefOr[String] = js.native
  
  var likeCount: js.UndefOr[String] = js.native
  
  var viewCount: js.UndefOr[String] = js.native
}
object VideoStatistics {
  
  @scala.inline
  def apply(): VideoStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoStatistics]
  }
  
  @scala.inline
  implicit class VideoStatisticsOps[Self <: VideoStatistics] (val x: Self) extends AnyVal {
    
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
    def setCommentCount(value: String): Self = this.set("commentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentCount: Self = this.set("commentCount", js.undefined)
    
    @scala.inline
    def setDislikeCount(value: String): Self = this.set("dislikeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDislikeCount: Self = this.set("dislikeCount", js.undefined)
    
    @scala.inline
    def setFavoriteCount(value: String): Self = this.set("favoriteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavoriteCount: Self = this.set("favoriteCount", js.undefined)
    
    @scala.inline
    def setLikeCount(value: String): Self = this.set("likeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLikeCount: Self = this.set("likeCount", js.undefined)
    
    @scala.inline
    def setViewCount(value: String): Self = this.set("viewCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewCount: Self = this.set("viewCount", js.undefined)
  }
}
