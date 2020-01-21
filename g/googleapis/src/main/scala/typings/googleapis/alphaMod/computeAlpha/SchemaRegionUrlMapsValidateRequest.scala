package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRegionUrlMapsValidateRequest extends js.Object {
  /**
    * Content of the UrlMap to be validated.
    */
  var resource: js.UndefOr[SchemaUrlMap] = js.native
}

object SchemaRegionUrlMapsValidateRequest {
  @scala.inline
  def apply(resource: SchemaUrlMap = null): SchemaRegionUrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionUrlMapsValidateRequest]
  }
}

