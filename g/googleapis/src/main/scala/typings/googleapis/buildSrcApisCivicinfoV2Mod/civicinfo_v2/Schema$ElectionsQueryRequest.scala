package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ElectionsQueryRequest extends js.Object {
  var contextParams: js.UndefOr[Schema$ContextParams] = js.native
}

object Schema$ElectionsQueryRequest {
  @scala.inline
  def apply(contextParams: Schema$ContextParams = null): Schema$ElectionsQueryRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ElectionsQueryRequest]
  }
}

