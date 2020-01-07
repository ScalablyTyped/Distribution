package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewEnrichmentItem extends js.Object {
  /** Location to be added to the album. */
  var locationEnrichment: js.UndefOr[LocationEnrichment] = js.undefined
  /** Map to be added to the album. */
  var mapEnrichment: js.UndefOr[MapEnrichment] = js.undefined
  /** Text to be added to the album. */
  var textEnrichment: js.UndefOr[TextEnrichment] = js.undefined
}

object NewEnrichmentItem {
  @scala.inline
  def apply(
    locationEnrichment: LocationEnrichment = null,
    mapEnrichment: MapEnrichment = null,
    textEnrichment: TextEnrichment = null
  ): NewEnrichmentItem = {
    val __obj = js.Dynamic.literal()
    if (locationEnrichment != null) __obj.updateDynamic("locationEnrichment")(locationEnrichment.asInstanceOf[js.Any])
    if (mapEnrichment != null) __obj.updateDynamic("mapEnrichment")(mapEnrichment.asInstanceOf[js.Any])
    if (textEnrichment != null) __obj.updateDynamic("textEnrichment")(textEnrichment.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewEnrichmentItem]
  }
}

