package typings.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeletePhotosResponse extends js.Object {
  /**
    * The status for the operation to delete a single
    * Photo in the batch request.
    */
  var status: js.UndefOr[js.Array[Status]] = js.undefined
}

object BatchDeletePhotosResponse {
  @scala.inline
  def apply(status: js.Array[Status] = null): BatchDeletePhotosResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeletePhotosResponse]
  }
}

