package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddEnrichmentToAlbumRequest extends js.Object {
  /** The position in the album where the enrichment is to be inserted. */
  var albumPosition: js.UndefOr[AlbumPosition] = js.undefined
  /** The enrichment to be added. */
  var newEnrichmentItem: js.UndefOr[NewEnrichmentItem] = js.undefined
}

object AddEnrichmentToAlbumRequest {
  @scala.inline
  def apply(albumPosition: AlbumPosition = null, newEnrichmentItem: NewEnrichmentItem = null): AddEnrichmentToAlbumRequest = {
    val __obj = js.Dynamic.literal()
    if (albumPosition != null) __obj.updateDynamic("albumPosition")(albumPosition.asInstanceOf[js.Any])
    if (newEnrichmentItem != null) __obj.updateDynamic("newEnrichmentItem")(newEnrichmentItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEnrichmentToAlbumRequest]
  }
}

