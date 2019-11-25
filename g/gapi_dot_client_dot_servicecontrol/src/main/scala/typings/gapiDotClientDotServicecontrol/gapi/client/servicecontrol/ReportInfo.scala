package typings.gapiDotClientDotServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportInfo extends js.Object {
  /** The Operation.operation_id value from the request. */
  var operationId: js.UndefOr[String] = js.undefined
  /** Quota usage info when processing the `Operation`. */
  var quotaInfo: js.UndefOr[QuotaInfo] = js.undefined
}

object ReportInfo {
  @scala.inline
  def apply(operationId: String = null, quotaInfo: QuotaInfo = null): ReportInfo = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (quotaInfo != null) __obj.updateDynamic("quotaInfo")(quotaInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportInfo]
  }
}

