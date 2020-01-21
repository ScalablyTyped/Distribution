package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubeVideo extends js.Object {
  /**
    * URL that can be used to view the YouTube video.
    *
    * Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.undefined
  /** YouTube API resource ID. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * URL of a thumbnail image of the YouTube video.
    *
    * Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  /**
    * Title of the YouTube video.
    *
    * Read-only.
    */
  var title: js.UndefOr[String] = js.undefined
}

object YouTubeVideo {
  @scala.inline
  def apply(alternateLink: String = null, id: String = null, thumbnailUrl: String = null, title: String = null): YouTubeVideo = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[YouTubeVideo]
  }
}

