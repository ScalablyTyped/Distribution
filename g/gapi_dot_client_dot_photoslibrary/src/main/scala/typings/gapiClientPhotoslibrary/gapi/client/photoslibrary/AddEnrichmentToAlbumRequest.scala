package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddEnrichmentToAlbumRequest extends js.Object {
  /** The position in the album where the enrichment is to be inserted. */
  var albumPosition: js.UndefOr[AlbumPosition] = js.native
  /** The enrichment to be added. */
  var newEnrichmentItem: js.UndefOr[NewEnrichmentItem] = js.native
}

object AddEnrichmentToAlbumRequest {
  @scala.inline
  def apply(): AddEnrichmentToAlbumRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddEnrichmentToAlbumRequest]
  }
  @scala.inline
  implicit class AddEnrichmentToAlbumRequestOps[Self <: AddEnrichmentToAlbumRequest] (val x: Self) extends AnyVal {
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
    def setAlbumPosition(value: AlbumPosition): Self = this.set("albumPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbumPosition: Self = this.set("albumPosition", js.undefined)
    @scala.inline
    def setNewEnrichmentItem(value: NewEnrichmentItem): Self = this.set("newEnrichmentItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewEnrichmentItem: Self = this.set("newEnrichmentItem", js.undefined)
  }
  
}

