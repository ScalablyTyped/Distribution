package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateQuotaRequest extends js.Object {
  /** Operation that describes the quota allocation. */
  var allocateOperation: js.UndefOr[QuotaOperation] = js.undefined
  /**
    * Specifies which version of service configuration should be used to process
    * the request. If unspecified or no matching version can be found, the latest
    * one will be used.
    */
  var serviceConfigId: js.UndefOr[java.lang.String] = js.undefined
}

object AllocateQuotaRequest {
  @scala.inline
  def apply(allocateOperation: QuotaOperation = null, serviceConfigId: java.lang.String = null): AllocateQuotaRequest = {
    val __obj = js.Dynamic.literal()
    if (allocateOperation != null) __obj.updateDynamic("allocateOperation")(allocateOperation)
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId)
    __obj.asInstanceOf[AllocateQuotaRequest]
  }
}

