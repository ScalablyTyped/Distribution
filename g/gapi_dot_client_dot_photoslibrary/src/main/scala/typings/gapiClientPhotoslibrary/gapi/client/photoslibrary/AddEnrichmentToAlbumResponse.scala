package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddEnrichmentToAlbumResponse extends js.Object {
  /** Output only. Enrichment which was added. */
  var enrichmentItem: js.UndefOr[EnrichmentItem] = js.undefined
}

object AddEnrichmentToAlbumResponse {
  @scala.inline
  def apply(enrichmentItem: EnrichmentItem = null): AddEnrichmentToAlbumResponse = {
    val __obj = js.Dynamic.literal()
    if (enrichmentItem != null) __obj.updateDynamic("enrichmentItem")(enrichmentItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEnrichmentToAlbumResponse]
  }
}

