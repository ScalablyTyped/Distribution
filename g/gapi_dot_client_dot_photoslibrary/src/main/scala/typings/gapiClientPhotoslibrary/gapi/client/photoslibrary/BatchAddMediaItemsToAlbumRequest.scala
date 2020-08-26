package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAddMediaItemsToAlbumRequest extends js.Object {
  /**
    * Identifiers of the MediaItems to be
    * added.
    * The maximum number of media items that can be added in one call is 50.
    */
  var mediaItemIds: js.UndefOr[js.Array[String]] = js.native
}

object BatchAddMediaItemsToAlbumRequest {
  @scala.inline
  def apply(): BatchAddMediaItemsToAlbumRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAddMediaItemsToAlbumRequest]
  }
  @scala.inline
  implicit class BatchAddMediaItemsToAlbumRequestOps[Self <: BatchAddMediaItemsToAlbumRequest] (val x: Self) extends AnyVal {
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
    def setMediaItemIdsVarargs(value: String*): Self = this.set("mediaItemIds", js.Array(value :_*))
    @scala.inline
    def setMediaItemIds(value: js.Array[String]): Self = this.set("mediaItemIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaItemIds: Self = this.set("mediaItemIds", js.undefined)
  }
  
}

