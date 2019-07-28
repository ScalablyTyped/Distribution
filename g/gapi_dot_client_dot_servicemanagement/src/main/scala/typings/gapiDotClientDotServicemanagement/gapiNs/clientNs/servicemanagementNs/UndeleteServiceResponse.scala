package typings.gapiDotClientDotServicemanagement.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndeleteServiceResponse extends js.Object {
  /** Revived service resource. */
  var service: js.UndefOr[ManagedService] = js.undefined
}

object UndeleteServiceResponse {
  @scala.inline
  def apply(service: ManagedService = null): UndeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[UndeleteServiceResponse]
  }
}

