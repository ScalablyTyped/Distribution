package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoStatistics extends js.Object {
  var commentCount: js.UndefOr[String] = js.undefined
  var dislikeCount: js.UndefOr[String] = js.undefined
  var favoriteCount: js.UndefOr[String] = js.undefined
  var likeCount: js.UndefOr[String] = js.undefined
  var viewCount: js.UndefOr[String] = js.undefined
}

object VideoStatistics {
  @scala.inline
  def apply(
    commentCount: String = null,
    dislikeCount: String = null,
    favoriteCount: String = null,
    likeCount: String = null,
    viewCount: String = null
  ): VideoStatistics = {
    val __obj = js.Dynamic.literal()
    if (commentCount != null) __obj.updateDynamic("commentCount")(commentCount.asInstanceOf[js.Any])
    if (dislikeCount != null) __obj.updateDynamic("dislikeCount")(dislikeCount.asInstanceOf[js.Any])
    if (favoriteCount != null) __obj.updateDynamic("favoriteCount")(favoriteCount.asInstanceOf[js.Any])
    if (likeCount != null) __obj.updateDynamic("likeCount")(likeCount.asInstanceOf[js.Any])
    if (viewCount != null) __obj.updateDynamic("viewCount")(viewCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStatistics]
  }
}

