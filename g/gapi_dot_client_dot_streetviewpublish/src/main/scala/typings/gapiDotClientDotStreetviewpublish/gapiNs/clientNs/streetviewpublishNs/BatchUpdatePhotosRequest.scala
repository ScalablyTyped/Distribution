package typings.gapiDotClientDotStreetviewpublish.gapiNs.clientNs.streetviewpublishNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdatePhotosRequest extends js.Object {
  /**
    * Required. List of
    * UpdatePhotoRequests.
    */
  var updatePhotoRequests: js.UndefOr[js.Array[UpdatePhotoRequest]] = js.undefined
}

object BatchUpdatePhotosRequest {
  @scala.inline
  def apply(updatePhotoRequests: js.Array[UpdatePhotoRequest] = null): BatchUpdatePhotosRequest = {
    val __obj = js.Dynamic.literal()
    if (updatePhotoRequests != null) __obj.updateDynamic("updatePhotoRequests")(updatePhotoRequests)
    __obj.asInstanceOf[BatchUpdatePhotosRequest]
  }
}

