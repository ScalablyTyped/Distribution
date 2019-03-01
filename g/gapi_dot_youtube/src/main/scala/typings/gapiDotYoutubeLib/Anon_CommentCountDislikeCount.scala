package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentCountDislikeCount extends js.Object {
  /**
    * The number of comments for the video.
    */
  var commentCount: scala.Double
  /**
    * The number of users who have indicated that they disliked the video by giving it a negative rating.
    */
  var dislikeCount: scala.Double
  /**
    * The number of users who currently have the video marked as a favorite video.
    */
  var favoriteCount: scala.Double
  /**
    * The number of users who have indicated that they liked the video by giving it a positive rating.
    */
  var likeCount: scala.Double
  /**
    * The number of times the video has been viewed.
    */
  var viewCount: scala.Double
}

object Anon_CommentCountDislikeCount {
  @scala.inline
  def apply(
    commentCount: scala.Double,
    dislikeCount: scala.Double,
    favoriteCount: scala.Double,
    likeCount: scala.Double,
    viewCount: scala.Double
  ): Anon_CommentCountDislikeCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commentCount")(commentCount)
    __obj.updateDynamic("dislikeCount")(dislikeCount)
    __obj.updateDynamic("favoriteCount")(favoriteCount)
    __obj.updateDynamic("likeCount")(likeCount)
    __obj.updateDynamic("viewCount")(viewCount)
    __obj.asInstanceOf[Anon_CommentCountDislikeCount]
  }
}

