package typings.gapiDotClientDotStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetPhotosResponse extends js.Object {
  /**
    * List of results for each individual
    * Photo requested, in the same order as
    * the requests in
    * BatchGetPhotos.
    */
  var results: js.UndefOr[js.Array[PhotoResponse]] = js.undefined
}

object BatchGetPhotosResponse {
  @scala.inline
  def apply(results: js.Array[PhotoResponse] = null): BatchGetPhotosResponse = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetPhotosResponse]
  }
}

