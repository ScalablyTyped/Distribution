package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleMediaItem extends js.Object {
  /**
    * File name with extension of the media item. This is shown to the user in
    * Google Photos. The file name specified during the <a
    * href="https://developers.google.com/photos/library/guides/upload-media">byte
    * upload process</a> is ignored if this field is set. The file name,
    * including the file extension, shouldn't be more than 255 characters. This
    * is an optional field.
    */
  var fileName: js.UndefOr[String] = js.undefined
  /** Token identifying the media bytes that have been uploaded to Google. */
  var uploadToken: js.UndefOr[String] = js.undefined
}

object SimpleMediaItem {
  @scala.inline
  def apply(fileName: String = null, uploadToken: String = null): SimpleMediaItem = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (uploadToken != null) __obj.updateDynamic("uploadToken")(uploadToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMediaItem]
  }
}

