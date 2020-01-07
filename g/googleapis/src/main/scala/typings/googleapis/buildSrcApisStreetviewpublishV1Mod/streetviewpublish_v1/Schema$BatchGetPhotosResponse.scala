package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to batch get of Photos.
  */
@js.native
trait Schema$BatchGetPhotosResponse extends js.Object {
  /**
    * List of results for each individual Photo requested, in the same order as
    * the requests in BatchGetPhotos.
    */
  var results: js.UndefOr[js.Array[Schema$PhotoResponse]] = js.native
}

object Schema$BatchGetPhotosResponse {
  @scala.inline
  def apply(results: js.Array[Schema$PhotoResponse] = null): Schema$BatchGetPhotosResponse = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchGetPhotosResponse]
  }
}

