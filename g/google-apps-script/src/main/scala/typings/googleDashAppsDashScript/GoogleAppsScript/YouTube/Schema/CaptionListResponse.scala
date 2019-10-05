package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionListResponse extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var eventId: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Caption]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var visitorId: js.UndefOr[String] = js.undefined
}

object CaptionListResponse {
  @scala.inline
  def apply(
    etag: String = null,
    eventId: String = null,
    items: js.Array[Caption] = null,
    kind: String = null,
    visitorId: String = null
  ): CaptionListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId)
    __obj.asInstanceOf[CaptionListResponse]
  }
}

