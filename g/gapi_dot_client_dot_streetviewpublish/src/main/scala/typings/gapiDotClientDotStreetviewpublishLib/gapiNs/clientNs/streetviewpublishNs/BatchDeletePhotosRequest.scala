package typings
package gapiDotClientDotStreetviewpublishLib.gapiNs.clientNs.streetviewpublishNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeletePhotosRequest extends js.Object {
  /**
    * Required. IDs of the Photos. For HTTP
    * GET requests, the URL query parameter should be
    * `photoIds=<id1>&photoIds=<id2>&...`.
    */
  var photoIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object BatchDeletePhotosRequest {
  @scala.inline
  def apply(photoIds: js.Array[java.lang.String] = null): BatchDeletePhotosRequest = {
    val __obj = js.Dynamic.literal()
    if (photoIds != null) __obj.updateDynamic("photoIds")(photoIds)
    __obj.asInstanceOf[BatchDeletePhotosRequest]
  }
}

