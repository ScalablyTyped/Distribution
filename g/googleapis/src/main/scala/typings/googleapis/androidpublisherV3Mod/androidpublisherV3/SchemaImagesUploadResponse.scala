package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaImagesUploadResponse extends js.Object {
  var image: js.UndefOr[SchemaImage] = js.native
}

object SchemaImagesUploadResponse {
  @scala.inline
  def apply(image: SchemaImage = null): SchemaImagesUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImagesUploadResponse]
  }
}

