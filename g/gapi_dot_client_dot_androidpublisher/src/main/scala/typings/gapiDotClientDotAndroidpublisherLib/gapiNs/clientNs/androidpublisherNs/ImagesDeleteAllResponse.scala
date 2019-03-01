package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesDeleteAllResponse extends js.Object {
  var deleted: js.UndefOr[js.Array[Image]] = js.undefined
}

object ImagesDeleteAllResponse {
  @scala.inline
  def apply(deleted: js.Array[Image] = null): ImagesDeleteAllResponse = {
    val __obj = js.Dynamic.literal()
    if (deleted != null) __obj.updateDynamic("deleted")(deleted)
    __obj.asInstanceOf[ImagesDeleteAllResponse]
  }
}

