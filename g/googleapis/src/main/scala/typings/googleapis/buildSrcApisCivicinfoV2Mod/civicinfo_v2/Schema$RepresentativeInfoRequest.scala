package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for political geography and representative information for an
  * address.
  */
@js.native
trait Schema$RepresentativeInfoRequest extends js.Object {
  var contextParams: js.UndefOr[Schema$ContextParams] = js.native
}

object Schema$RepresentativeInfoRequest {
  @scala.inline
  def apply(contextParams: Schema$ContextParams = null): Schema$RepresentativeInfoRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RepresentativeInfoRequest]
  }
}

