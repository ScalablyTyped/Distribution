package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportInfo extends js.Object {
  /** The Operation.operation_id value from the request. */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  /** Quota usage info when processing the `Operation`. */
  var quotaInfo: js.UndefOr[QuotaInfo] = js.undefined
}

object ReportInfo {
  @scala.inline
  def apply(operationId: java.lang.String = null, quotaInfo: QuotaInfo = null): ReportInfo = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (quotaInfo != null) __obj.updateDynamic("quotaInfo")(quotaInfo)
    __obj.asInstanceOf[ReportInfo]
  }
}

