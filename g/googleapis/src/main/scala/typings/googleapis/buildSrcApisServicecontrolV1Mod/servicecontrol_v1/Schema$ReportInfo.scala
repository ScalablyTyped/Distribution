package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains additional info about the report operation.
  */
@js.native
trait Schema$ReportInfo extends js.Object {
  /**
    * The Operation.operation_id value from the request.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Quota usage info when processing the `Operation`.
    */
  var quotaInfo: js.UndefOr[Schema$QuotaInfo] = js.native
}

object Schema$ReportInfo {
  @scala.inline
  def apply(operationId: String = null, quotaInfo: Schema$QuotaInfo = null): Schema$ReportInfo = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (quotaInfo != null) __obj.updateDynamic("quotaInfo")(quotaInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReportInfo]
  }
}

