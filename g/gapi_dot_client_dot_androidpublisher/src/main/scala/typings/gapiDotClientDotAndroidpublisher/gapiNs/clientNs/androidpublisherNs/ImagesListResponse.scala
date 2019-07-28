package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesListResponse extends js.Object {
  var images: js.UndefOr[js.Array[Image]] = js.undefined
}

object ImagesListResponse {
  @scala.inline
  def apply(images: js.Array[Image] = null): ImagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (images != null) __obj.updateDynamic("images")(images)
    __obj.asInstanceOf[ImagesListResponse]
  }
}

