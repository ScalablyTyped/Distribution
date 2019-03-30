package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionListResponse extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var eventId: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[Caption]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var visitorId: js.UndefOr[java.lang.String] = js.undefined
}

object CaptionListResponse {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    eventId: java.lang.String = null,
    items: js.Array[Caption] = null,
    kind: java.lang.String = null,
    visitorId: java.lang.String = null
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

