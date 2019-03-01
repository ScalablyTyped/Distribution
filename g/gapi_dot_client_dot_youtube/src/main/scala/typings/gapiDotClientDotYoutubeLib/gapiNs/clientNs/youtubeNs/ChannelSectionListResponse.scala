package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionListResponse extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[java.lang.String] = js.undefined
  /** A list of ChannelSections that match the request criteria. */
  var items: js.UndefOr[js.Array[ChannelSection]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#channelSectionListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The visitorId identifies the visitor. */
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

