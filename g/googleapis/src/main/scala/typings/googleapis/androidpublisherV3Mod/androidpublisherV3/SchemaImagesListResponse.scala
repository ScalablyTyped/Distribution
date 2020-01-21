package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaImagesListResponse extends js.Object {
  var images: js.UndefOr[js.Array[SchemaImage]] = js.native
}

object SchemaImagesListResponse {
  @scala.inline
  def apply(images: js.Array[SchemaImage] = null): SchemaImagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImagesListResponse]
  }
}

