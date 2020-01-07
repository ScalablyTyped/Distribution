package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * YouTube video item.
  */
@js.native
trait Schema$YouTubeVideo extends js.Object {
  /**
    * URL that can be used to view the YouTube video.  Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.native
  /**
    * YouTube API resource ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * URL of a thumbnail image of the YouTube video.  Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  /**
    * Title of the YouTube video.  Read-only.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$YouTubeVideo {
  @scala.inline
  def apply(alternateLink: String = null, id: String = null, thumbnailUrl: String = null, title: String = null): Schema$YouTubeVideo = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$YouTubeVideo]
  }
}

