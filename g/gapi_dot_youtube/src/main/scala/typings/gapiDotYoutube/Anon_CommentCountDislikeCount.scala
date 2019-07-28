package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentCountDislikeCount extends js.Object {
  /**
    * The number of comments for the video.
    */
  var commentCount: Double
  /**
    * The number of users who have indicated that they disliked the video by giving it a negative rating.
    */
  var dislikeCount: Double
  /**
    * The number of users who currently have the video marked as a favorite video.
    */
  var favoriteCount: Double
  /**
    * The number of users who have indicated that they liked the video by giving it a positive rating.
    */
  var likeCount: Double
  /**
    * The number of times the video has been viewed.
    */
  var viewCount: Double
}

object Anon_CommentCountDislikeCount {
  @scala.inline
  def apply(
    commentCount: Double,
    dislikeCount: Double,
    favoriteCount: Double,
    likeCount: Double,
    viewCount: Double
  ): Anon_CommentCountDislikeCount = {
    val __obj = js.Dynamic.literal(commentCount = commentCount, dislikeCount = dislikeCount, favoriteCount = favoriteCount, likeCount = likeCount, viewCount = viewCount)
  
    __obj.asInstanceOf[Anon_CommentCountDislikeCount]
  }
}

