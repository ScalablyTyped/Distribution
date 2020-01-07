package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RoutersPreviewResponse extends js.Object {
  /**
    * Preview of given router.
    */
  var resource: js.UndefOr[Schema$Router] = js.native
}

object Schema$RoutersPreviewResponse {
  @scala.inline
  def apply(resource: Schema$Router = null): Schema$RoutersPreviewResponse = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RoutersPreviewResponse]
  }
}

