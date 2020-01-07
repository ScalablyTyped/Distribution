package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to batch delete of one or more Photos.
  */
@js.native
trait Schema$BatchDeletePhotosResponse extends js.Object {
  /**
    * The status for the operation to delete a single Photo in the batch
    * request.
    */
  var status: js.UndefOr[js.Array[Schema$Status]] = js.native
}

object Schema$BatchDeletePhotosResponse {
  @scala.inline
  def apply(status: js.Array[Schema$Status] = null): Schema$BatchDeletePhotosResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchDeletePhotosResponse]
  }
}

