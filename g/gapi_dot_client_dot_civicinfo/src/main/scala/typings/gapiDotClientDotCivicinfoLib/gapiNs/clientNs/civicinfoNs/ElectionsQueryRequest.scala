package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectionsQueryRequest extends js.Object {
  var contextParams: js.UndefOr[ContextParams] = js.undefined
}

object ElectionsQueryRequest {
  @scala.inline
  def apply(contextParams: ContextParams = null): ElectionsQueryRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams)
    __obj.asInstanceOf[ElectionsQueryRequest]
  }
}

