package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to look up representative information for a single division.
  */
@js.native
trait Schema$DivisionRepresentativeInfoRequest extends js.Object {
  var contextParams: js.UndefOr[Schema$ContextParams] = js.native
}

object Schema$DivisionRepresentativeInfoRequest {
  @scala.inline
  def apply(contextParams: Schema$ContextParams = null): Schema$DivisionRepresentativeInfoRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DivisionRepresentativeInfoRequest]
  }
}

