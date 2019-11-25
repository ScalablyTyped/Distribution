package typings.gapiDotClientDotStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdatePhotosResponse extends js.Object {
  /**
    * List of results for each individual
    * Photo updated, in the same order as
    * the request.
    */
  var results: js.UndefOr[js.Array[PhotoResponse]] = js.undefined
}

object BatchUpdatePhotosResponse {
  @scala.inline
  def apply(results: js.Array[PhotoResponse] = null): BatchUpdatePhotosResponse = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdatePhotosResponse]
  }
}

