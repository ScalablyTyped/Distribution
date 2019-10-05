package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemContentDetails extends js.Object {
  var endAt: js.UndefOr[String] = js.undefined
  var note: js.UndefOr[String] = js.undefined
  var startAt: js.UndefOr[String] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
  var videoPublishedAt: js.UndefOr[String] = js.undefined
}

object PlaylistItemContentDetails {
  @scala.inline
  def apply(
    endAt: String = null,
    note: String = null,
    startAt: String = null,
    videoId: String = null,
    videoPublishedAt: String = null
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

