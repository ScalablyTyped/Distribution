package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoStatistics extends js.Object {
  var commentCount: js.UndefOr[java.lang.String] = js.undefined
  var dislikeCount: js.UndefOr[java.lang.String] = js.undefined
  var favoriteCount: js.UndefOr[java.lang.String] = js.undefined
  var likeCount: js.UndefOr[java.lang.String] = js.undefined
  var viewCount: js.UndefOr[java.lang.String] = js.undefined
}

object VideoStatistics {
  @scala.inline
  def apply(
    commentCount: java.lang.String = null,
    dislikeCount: java.lang.String = null,
    favoriteCount: java.lang.String = null,
    likeCount: java.lang.String = null,
    viewCount: java.lang.String = null
  ): VideoStatistics = {
    val __obj = js.Dynamic.literal()
    if (commentCount != null) __obj.updateDynamic("commentCount")(commentCount)
    if (dislikeCount != null) __obj.updateDynamic("dislikeCount")(dislikeCount)
    if (favoriteCount != null) __obj.updateDynamic("favoriteCount")(favoriteCount)
    if (likeCount != null) __obj.updateDynamic("likeCount")(likeCount)
    if (viewCount != null) __obj.updateDynamic("viewCount")(viewCount)
    __obj.asInstanceOf[VideoStatistics]
  }
}

