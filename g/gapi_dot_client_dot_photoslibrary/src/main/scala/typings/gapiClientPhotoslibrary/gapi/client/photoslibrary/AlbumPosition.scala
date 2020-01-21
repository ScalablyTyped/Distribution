package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlbumPosition extends js.Object {
  /** Type of position, for a media or enrichment item. */
  var position: js.UndefOr[String] = js.undefined
  /**
    * The enrichment item to which the position is relative to.
    * Only used when position type is AFTER_ENRICHMENT_ITEM.
    */
  var relativeEnrichmentItemId: js.UndefOr[String] = js.undefined
  /**
    * The media item to which the position is relative to.
    * Only used when position type is AFTER_MEDIA_ITEM.
    */
  var relativeMediaItemId: js.UndefOr[String] = js.undefined
}

object AlbumPosition {
  @scala.inline
  def apply(
    position: String = null,
    relativeEnrichmentItemId: String = null,
    relativeMediaItemId: String = null
  ): AlbumPosition = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (relativeEnrichmentItemId != null) __obj.updateDynamic("relativeEnrichmentItemId")(relativeEnrichmentItemId.asInstanceOf[js.Any])
    if (relativeMediaItemId != null) __obj.updateDynamic("relativeMediaItemId")(relativeMediaItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumPosition]
  }
}

