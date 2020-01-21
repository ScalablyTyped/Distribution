package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaImagesDeleteAllResponse extends js.Object {
  var deleted: js.UndefOr[js.Array[SchemaImage]] = js.native
}

object SchemaImagesDeleteAllResponse {
  @scala.inline
  def apply(deleted: js.Array[SchemaImage] = null): SchemaImagesDeleteAllResponse = {
    val __obj = js.Dynamic.literal()
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImagesDeleteAllResponse]
  }
}

