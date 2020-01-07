package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A search request for political geographies.
  */
@js.native
trait Schema$DivisionSearchRequest extends js.Object {
  var contextParams: js.UndefOr[Schema$ContextParams] = js.native
}

object Schema$DivisionSearchRequest {
  @scala.inline
  def apply(contextParams: Schema$ContextParams = null): Schema$DivisionSearchRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DivisionSearchRequest]
  }
}

