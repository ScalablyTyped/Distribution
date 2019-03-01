package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivisionRepresentativeInfoRequest extends js.Object {
  var contextParams: js.UndefOr[ContextParams] = js.undefined
}

object DivisionRepresentativeInfoRequest {
  @scala.inline
  def apply(contextParams: ContextParams = null): DivisionRepresentativeInfoRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams)
    __obj.asInstanceOf[DivisionRepresentativeInfoRequest]
  }
}

