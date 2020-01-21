package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for political geography and representative information for an
  * address.
  */
@js.native
trait SchemaRepresentativeInfoRequest extends js.Object {
  var contextParams: js.UndefOr[SchemaContextParams] = js.native
}

object SchemaRepresentativeInfoRequest {
  @scala.inline
  def apply(contextParams: SchemaContextParams = null): SchemaRepresentativeInfoRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRepresentativeInfoRequest]
  }
}

