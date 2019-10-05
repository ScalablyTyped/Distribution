package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailSetResponse extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[String] = js.undefined
  /** A list of thumbnails. */
  var items: js.UndefOr[js.Array[ThumbnailDetails]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#thumbnailSetResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[String] = js.undefined
}

object ThumbnailSetResponse {
  @scala.inline
  def apply(
    etag: String = null,
    eventId: String = null,
    items: js.Array[ThumbnailDetails] = null,
    kind: String = null,
    visitorId: String = null
  ): ThumbnailSetResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId)
    __obj.asInstanceOf[ThumbnailSetResponse]
  }
}

