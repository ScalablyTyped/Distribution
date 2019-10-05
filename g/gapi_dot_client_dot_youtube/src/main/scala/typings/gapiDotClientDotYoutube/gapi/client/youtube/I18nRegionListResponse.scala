package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nRegionListResponse extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[String] = js.undefined
  /** A list of regions where YouTube is available. In this map, the i18n region ID is the map key, and its value is the corresponding i18nRegion resource. */
  var items: js.UndefOr[js.Array[I18nRegion]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#i18nRegionListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[String] = js.undefined
}

object I18nRegionListResponse {
  @scala.inline
  def apply(
    etag: String = null,
    eventId: String = null,
    items: js.Array[I18nRegion] = null,
    kind: String = null,
    visitorId: String = null
  ): I18nRegionListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId)
    __obj.asInstanceOf[I18nRegionListResponse]
  }
}

