package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to update the metadata of photos. Updating the pixels of photos is
  * not supported.
  */
@js.native
trait Schema$BatchUpdatePhotosRequest extends js.Object {
  /**
    * Required. List of UpdatePhotoRequests.
    */
  var updatePhotoRequests: js.UndefOr[js.Array[Schema$UpdatePhotoRequest]] = js.native
}

object Schema$BatchUpdatePhotosRequest {
  @scala.inline
  def apply(updatePhotoRequests: js.Array[Schema$UpdatePhotoRequest] = null): Schema$BatchUpdatePhotosRequest = {
    val __obj = js.Dynamic.literal()
    if (updatePhotoRequests != null) __obj.updateDynamic("updatePhotoRequests")(updatePhotoRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchUpdatePhotosRequest]
  }
}

