package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ImagesListResponse extends js.Object {
  var images: js.UndefOr[js.Array[Schema$Image]] = js.native
}

object Schema$ImagesListResponse {
  @scala.inline
  def apply(images: js.Array[Schema$Image] = null): Schema$ImagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImagesListResponse]
  }
}

