package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlbumPosition extends js.Object {
  /** Type of position, for a media or enrichment item. */
  var position: js.UndefOr[String] = js.native
  /**
    * The enrichment item to which the position is relative to.
    * Only used when position type is AFTER_ENRICHMENT_ITEM.
    */
  var relativeEnrichmentItemId: js.UndefOr[String] = js.native
  /**
    * The media item to which the position is relative to.
    * Only used when position type is AFTER_MEDIA_ITEM.
    */
  var relativeMediaItemId: js.UndefOr[String] = js.native
}

object AlbumPosition {
  @scala.inline
  def apply(): AlbumPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlbumPosition]
  }
  @scala.inline
  implicit class AlbumPositionOps[Self <: AlbumPosition] (val x: Self) extends AnyVal {
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
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRelativeEnrichmentItemId(value: String): Self = this.set("relativeEnrichmentItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeEnrichmentItemId: Self = this.set("relativeEnrichmentItemId", js.undefined)
    @scala.inline
    def setRelativeMediaItemId(value: String): Self = this.set("relativeMediaItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeMediaItemId: Self = this.set("relativeMediaItemId", js.undefined)
  }
  
}

