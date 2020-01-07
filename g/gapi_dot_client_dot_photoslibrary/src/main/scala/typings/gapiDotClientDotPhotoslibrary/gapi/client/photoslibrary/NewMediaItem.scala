package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewMediaItem extends js.Object {
  /**
    * Description of the media item. This will be shown to the user in the item's
    * info section in the Google Photos app.
    * This string shouldn't be more than 1000 characters.
    */
  var description: js.UndefOr[String] = js.undefined
  /** A new media item that has been uploaded via the included `uploadToken`. */
  var simpleMediaItem: js.UndefOr[SimpleMediaItem] = js.undefined
}

object NewMediaItem {
  @scala.inline
  def apply(description: String = null, simpleMediaItem: SimpleMediaItem = null): NewMediaItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (simpleMediaItem != null) __obj.updateDynamic("simpleMediaItem")(simpleMediaItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewMediaItem]
  }
}

