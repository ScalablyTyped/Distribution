package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /** A human readable display name for this service. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The resource name for the service.
    * Example: "services/DA34-426B-A397"
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The identifier for the service.
    * Example: "DA34-426B-A397"
    */
  var serviceId: js.UndefOr[java.lang.String] = js.undefined
}

object Service {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    name: java.lang.String = null,
    serviceId: java.lang.String = null
  ): Service = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId)
    __obj.asInstanceOf[Service]
  }
}

