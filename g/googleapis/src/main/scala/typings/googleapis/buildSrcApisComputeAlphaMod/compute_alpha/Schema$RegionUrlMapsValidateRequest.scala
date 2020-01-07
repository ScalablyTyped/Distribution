package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RegionUrlMapsValidateRequest extends js.Object {
  /**
    * Content of the UrlMap to be validated.
    */
  var resource: js.UndefOr[Schema$UrlMap] = js.native
}

object Schema$RegionUrlMapsValidateRequest {
  @scala.inline
  def apply(resource: Schema$UrlMap = null): Schema$RegionUrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionUrlMapsValidateRequest]
  }
}

