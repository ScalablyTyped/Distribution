package typings.gapiDotClientDotServicemanagement.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedService extends js.Object {
  /** ID of the project that produces and owns this service. */
  var producerProjectId: js.UndefOr[String] = js.undefined
  /**
    * The name of the service. See the [overview](/service-management/overview)
    * for naming requirements.
    */
  var serviceName: js.UndefOr[String] = js.undefined
}

object ManagedService {
  @scala.inline
  def apply(producerProjectId: String = null, serviceName: String = null): ManagedService = {
    val __obj = js.Dynamic.literal()
    if (producerProjectId != null) __obj.updateDynamic("producerProjectId")(producerProjectId)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[ManagedService]
  }
}

