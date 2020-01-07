package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$I18nRegionListResponse extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Serialized EventId of the request which produced this response.
    */
  var eventId: js.UndefOr[String] = js.native
  /**
    * A list of regions where YouTube is available. In this map, the i18n
    * region ID is the map key, and its value is the corresponding i18nRegion
    * resource.
    */
  var items: js.UndefOr[js.Array[Schema$I18nRegion]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#i18nRegionListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The visitorId identifies the visitor.
    */
  var visitorId: js.UndefOr[String] = js.native
}

object Schema$I18nRegionListResponse {
  @scala.inline
  def apply(
    etag: String = null,
    eventId: String = null,
    items: js.Array[Schema$I18nRegion] = null,
    kind: String = null,
    visitorId: String = null
  ): Schema$I18nRegionListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (eventId != null) __obj.updateDynamic("eventId")(eventId.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$I18nRegionListResponse]
  }
}

