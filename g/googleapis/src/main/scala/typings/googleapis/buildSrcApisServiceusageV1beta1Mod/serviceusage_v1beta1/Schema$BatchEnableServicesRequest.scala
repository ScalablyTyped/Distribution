package typings.googleapis.buildSrcApisServiceusageV1beta1Mod.serviceusage_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the `BatchEnableServices` method.
  */
@js.native
trait Schema$BatchEnableServicesRequest extends js.Object {
  /**
    * The identifiers of the services to enable on the project.  A valid
    * identifier would be: serviceusage.googleapis.com  Enabling services
    * requires that each service is public or is shared with the user enabling
    * the service.  Two or more services must be specified. To enable a single
    * service, use the `EnableService` method instead.  A single request can
    * enable a maximum of 20 services at a time. If more than 20 services are
    * specified, the request will fail, and no state changes will occur.
    */
  var serviceIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$BatchEnableServicesRequest {
  @scala.inline
  def apply(serviceIds: js.Array[String] = null): Schema$BatchEnableServicesRequest = {
    val __obj = js.Dynamic.literal()
    if (serviceIds != null) __obj.updateDynamic("serviceIds")(serviceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchEnableServicesRequest]
  }
}

