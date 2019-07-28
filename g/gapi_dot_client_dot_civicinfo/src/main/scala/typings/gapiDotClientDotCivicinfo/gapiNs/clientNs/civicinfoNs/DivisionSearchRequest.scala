package typings.gapiDotClientDotCivicinfo.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivisionSearchRequest extends js.Object {
  var contextParams: js.UndefOr[ContextParams] = js.undefined
}

object DivisionSearchRequest {
  @scala.inline
  def apply(contextParams: ContextParams = null): DivisionSearchRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams)
    __obj.asInstanceOf[DivisionSearchRequest]
  }
}

