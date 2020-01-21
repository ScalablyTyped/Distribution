package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartReconciliationRequest extends js.Object {
  /** Operation that describes the quota reconciliation. */
  var reconciliationOperation: js.UndefOr[QuotaOperation] = js.undefined
  /**
    * Specifies which version of service configuration should be used to process
    * the request. If unspecified or no matching version can be found, the latest
    * one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.undefined
}

object StartReconciliationRequest {
  @scala.inline
  def apply(reconciliationOperation: QuotaOperation = null, serviceConfigId: String = null): StartReconciliationRequest = {
    val __obj = js.Dynamic.literal()
    if (reconciliationOperation != null) __obj.updateDynamic("reconciliationOperation")(reconciliationOperation.asInstanceOf[js.Any])
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReconciliationRequest]
  }
}

