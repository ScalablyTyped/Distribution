package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionListResponse extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var eventId: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[ChannelSection]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var visitorId: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelSectionListResponse {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    eventId: java.lang.String = null,
    items: js.Array[ChannelSection] = null,
    kind: java.lang.String = null,
    visitorId: java.lang.String = null
  ): ChannelSectionListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId)
    __obj.asInstanceOf[ChannelSectionListResponse]
  }
}

