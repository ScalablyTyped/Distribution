package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The full representation of a Service that is managed by Google Service
  * Management.
  */
@js.native
trait Schema$ManagedService extends js.Object {
  /**
    * ID of the project that produces and owns this service.
    */
  var producerProjectId: js.UndefOr[String] = js.native
  /**
    * The name of the service. See the [overview](/service-management/overview)
    * for naming requirements.
    */
  var serviceName: js.UndefOr[String] = js.native
}

object Schema$ManagedService {
  @scala.inline
  def apply(producerProjectId: String = null, serviceName: String = null): Schema$ManagedService = {
    val __obj = js.Dynamic.literal()
    if (producerProjectId != null) __obj.updateDynamic("producerProjectId")(producerProjectId.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedService]
  }
}

