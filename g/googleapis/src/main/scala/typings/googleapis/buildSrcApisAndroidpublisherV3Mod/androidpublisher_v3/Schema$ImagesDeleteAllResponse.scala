package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ImagesDeleteAllResponse extends js.Object {
  var deleted: js.UndefOr[js.Array[Schema$Image]] = js.native
}

object Schema$ImagesDeleteAllResponse {
  @scala.inline
  def apply(deleted: js.Array[Schema$Image] = null): Schema$ImagesDeleteAllResponse = {
    val __obj = js.Dynamic.literal()
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImagesDeleteAllResponse]
  }
}

