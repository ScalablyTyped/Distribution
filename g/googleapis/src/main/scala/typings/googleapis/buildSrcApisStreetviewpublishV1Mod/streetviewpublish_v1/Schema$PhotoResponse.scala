package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response payload for a single Photo in batch operations including
  * BatchGetPhotos and BatchUpdatePhotos.
  */
@js.native
trait Schema$PhotoResponse extends js.Object {
  /**
    * The Photo resource, if the request was successful.
    */
  var photo: js.UndefOr[Schema$Photo] = js.native
  /**
    * The status for the operation to get or update a single photo in the batch
    * request.
    */
  var status: js.UndefOr[Schema$Status] = js.native
}

object Schema$PhotoResponse {
  @scala.inline
  def apply(photo: Schema$Photo = null, status: Schema$Status = null): Schema$PhotoResponse = {
    val __obj = js.Dynamic.literal()
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PhotoResponse]
  }
}

