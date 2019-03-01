package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubeVideo extends js.Object {
  /**
    * URL that can be used to view the YouTube video.
    *
    * Read-only.
    */
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  /** YouTube API resource ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL of a thumbnail image of the YouTube video.
    *
    * Read-only.
    */
  var thumbnailUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Title of the YouTube video.
    *
    * Read-only.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object YouTubeVideo {
  @scala.inline
  def apply(
    alternateLink: java.lang.String = null,
    id: java.lang.String = null,
    thumbnailUrl: java.lang.String = null,
    title: java.lang.String = null
  ): YouTubeVideo = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink)
    if (id != null) __obj.updateDynamic("id")(id)
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[YouTubeVideo]
  }
}

