package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewMediaItem extends js.Object {
  /**
    * Description of the media item. This will be shown to the user in the item's
    * info section in the Google Photos app.
    * This string shouldn't be more than 1000 characters.
    */
  var description: js.UndefOr[String] = js.native
  /** A new media item that has been uploaded via the included `uploadToken`. */
  var simpleMediaItem: js.UndefOr[SimpleMediaItem] = js.native
}

object NewMediaItem {
  @scala.inline
  def apply(): NewMediaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewMediaItem]
  }
  @scala.inline
  implicit class NewMediaItemOps[Self <: NewMediaItem] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setSimpleMediaItem(value: SimpleMediaItem): Self = this.set("simpleMediaItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleMediaItem: Self = this.set("simpleMediaItem", js.undefined)
  }
  
}

