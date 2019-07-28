package typings.gapiDotClientDotServicecontrol.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseQuotaRequest extends js.Object {
  /** Operation that describes the quota release. */
  var releaseOperation: js.UndefOr[QuotaOperation] = js.undefined
  /**
    * Specifies which version of service configuration should be used to process
    * the request. If unspecified or no matching version can be found, the latest
    * one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.undefined
}

object ReleaseQuotaRequest {
  @scala.inline
  def apply(releaseOperation: QuotaOperation = null, serviceConfigId: String = null): ReleaseQuotaRequest = {
    val __obj = js.Dynamic.literal()
    if (releaseOperation != null) __obj.updateDynamic("releaseOperation")(releaseOperation)
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId)
    __obj.asInstanceOf[ReleaseQuotaRequest]
  }
}

