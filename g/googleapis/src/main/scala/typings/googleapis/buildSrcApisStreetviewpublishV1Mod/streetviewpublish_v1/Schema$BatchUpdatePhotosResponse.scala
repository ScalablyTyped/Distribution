package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to batch update of metadata of one or more Photos.
  */
@js.native
trait Schema$BatchUpdatePhotosResponse extends js.Object {
  /**
    * List of results for each individual Photo updated, in the same order as
    * the request.
    */
  var results: js.UndefOr[js.Array[Schema$PhotoResponse]] = js.native
}

object Schema$BatchUpdatePhotosResponse {
  @scala.inline
  def apply(results: js.Array[Schema$PhotoResponse] = null): Schema$BatchUpdatePhotosResponse = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchUpdatePhotosResponse]
  }
}

