package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the AllocateQuota method.
  */
@js.native
trait Schema$AllocateQuotaRequest extends js.Object {
  /**
    * Operation that describes the quota allocation.
    */
  var allocateOperation: js.UndefOr[Schema$QuotaOperation] = js.native
  /**
    * Specifies which version of service configuration should be used to
    * process the request. If unspecified or no matching version can be found,
    * the latest one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object Schema$AllocateQuotaRequest {
  @scala.inline
  def apply(allocateOperation: Schema$QuotaOperation = null, serviceConfigId: String = null): Schema$AllocateQuotaRequest = {
    val __obj = js.Dynamic.literal()
    if (allocateOperation != null) __obj.updateDynamic("allocateOperation")(allocateOperation.asInstanceOf[js.Any])
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AllocateQuotaRequest]
  }
}

