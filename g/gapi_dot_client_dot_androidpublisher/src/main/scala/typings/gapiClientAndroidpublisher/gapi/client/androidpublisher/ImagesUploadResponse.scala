package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesUploadResponse extends js.Object {
  var image: js.UndefOr[Image] = js.undefined
}

object ImagesUploadResponse {
  @scala.inline
  def apply(image: Image = null): ImagesUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagesUploadResponse]
  }
}

