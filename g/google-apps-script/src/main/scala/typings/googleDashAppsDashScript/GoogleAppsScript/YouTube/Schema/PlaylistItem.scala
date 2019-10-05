package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItem extends js.Object {
  var contentDetails: js.UndefOr[PlaylistItemContentDetails] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var snippet: js.UndefOr[PlaylistItemSnippet] = js.undefined
  var status: js.UndefOr[PlaylistItemStatus] = js.undefined
}

object PlaylistItem {
  @scala.inline
  def apply(
    contentDetails: PlaylistItemContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: PlaylistItemSnippet = null,
    status: PlaylistItemStatus = null
  ): PlaylistItem = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[PlaylistItem]
  }
}

