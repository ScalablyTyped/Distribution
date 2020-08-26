package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddEnrichmentToAlbumResponse extends js.Object {
  /** Output only. Enrichment which was added. */
  var enrichmentItem: js.UndefOr[EnrichmentItem] = js.native
}

object AddEnrichmentToAlbumResponse {
  @scala.inline
  def apply(): AddEnrichmentToAlbumResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddEnrichmentToAlbumResponse]
  }
  @scala.inline
  implicit class AddEnrichmentToAlbumResponseOps[Self <: AddEnrichmentToAlbumResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnrichmentItem(value: EnrichmentItem): Self = this.set("enrichmentItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnrichmentItem: Self = this.set("enrichmentItem", js.undefined)
  }
  
}

