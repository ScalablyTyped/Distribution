package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndReconciliationRequest extends js.Object {
  /** Operation that describes the quota reconciliation. */
  var reconciliationOperation: js.UndefOr[QuotaOperation] = js.undefined
  /**
    * Specifies which version of service configuration should be used to process
    * the request. If unspecified or no matching version can be found, the latest
    * one will be used.
    */
  var serviceConfigId: js.UndefOr[java.lang.String] = js.undefined
}

object EndReconciliationRequest {
  @scala.inline
  def apply(reconciliationOperation: QuotaOperation = null, serviceConfigId: java.lang.String = null): EndReconciliationRequest = {
    val __obj = js.Dynamic.literal()
    if (reconciliationOperation != null) __obj.updateDynamic("reconciliationOperation")(reconciliationOperation)
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId)
    __obj.asInstanceOf[EndReconciliationRequest]
  }
}

