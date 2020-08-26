package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleMediaItem extends js.Object {
  /**
    * File name with extension of the media item. This is shown to the user in
    * Google Photos. The file name specified during the <a
    * href="https://developers.google.com/photos/library/guides/upload-media">byte
    * upload process</a> is ignored if this field is set. The file name,
    * including the file extension, shouldn't be more than 255 characters. This
    * is an optional field.
    */
  var fileName: js.UndefOr[String] = js.native
  /** Token identifying the media bytes that have been uploaded to Google. */
  var uploadToken: js.UndefOr[String] = js.native
}

object SimpleMediaItem {
  @scala.inline
  def apply(): SimpleMediaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleMediaItem]
  }
  @scala.inline
  implicit class SimpleMediaItemOps[Self <: SimpleMediaItem] (val x: Self) extends AnyVal {
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setUploadToken(value: String): Self = this.set("uploadToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadToken: Self = this.set("uploadToken", js.undefined)
  }
  
}

