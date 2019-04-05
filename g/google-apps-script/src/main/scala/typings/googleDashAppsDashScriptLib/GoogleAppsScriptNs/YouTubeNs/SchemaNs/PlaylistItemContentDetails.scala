package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemContentDetails extends js.Object {
  var endAt: js.UndefOr[java.lang.String] = js.undefined
  var note: js.UndefOr[java.lang.String] = js.undefined
  var startAt: js.UndefOr[java.lang.String] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
  var videoPublishedAt: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistItemContentDetails {
  @scala.inline
  def apply(
    endAt: java.lang.String = null,
    note: java.lang.String = null,
    startAt: java.lang.String = null,
    videoId: java.lang.String = null,
    videoPublishedAt: java.lang.String = null
  ): PlaylistItemContentDetails = {
    val __obj = js.Dynamic.literal()
    if (endAt != null) __obj.updateDynamic("endAt")(endAt)
    if (note != null) __obj.updateDynamic("note")(note)
    if (startAt != null) __obj.updateDynamic("startAt")(startAt)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    if (videoPublishedAt != null) __obj.updateDynamic("videoPublishedAt")(videoPublishedAt)
    __obj.asInstanceOf[PlaylistItemContentDetails]
  }
}

