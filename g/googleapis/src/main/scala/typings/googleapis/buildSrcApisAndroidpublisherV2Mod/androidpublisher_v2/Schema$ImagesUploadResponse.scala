package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ImagesUploadResponse extends js.Object {
  var image: js.UndefOr[Schema$Image] = js.native
}

object Schema$ImagesUploadResponse {
  @scala.inline
  def apply(image: Schema$Image = null): Schema$ImagesUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImagesUploadResponse]
  }
}

