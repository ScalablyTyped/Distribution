package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to delete multiple Photos.
  */
@js.native
trait Schema$BatchDeletePhotosRequest extends js.Object {
  /**
    * Required. IDs of the Photos. HTTP GET requests require the following
    * syntax for the URL query parameter:
    * `photoIds=&lt;id1&gt;&amp;photoIds=&lt;id2&gt;&amp;...`.
    */
  var photoIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$BatchDeletePhotosRequest {
  @scala.inline
  def apply(photoIds: js.Array[String] = null): Schema$BatchDeletePhotosRequest = {
    val __obj = js.Dynamic.literal()
    if (photoIds != null) __obj.updateDynamic("photoIds")(photoIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchDeletePhotosRequest]
  }
}

