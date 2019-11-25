package typings.gapiDotClientDotCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /** A human readable display name for this service. */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The resource name for the service.
    * Example: "services/DA34-426B-A397"
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The identifier for the service.
    * Example: "DA34-426B-A397"
    */
  var serviceId: js.UndefOr[String] = js.undefined
}

object Service {
  @scala.inline
  def apply(displayName: String = null, name: String = null, serviceId: String = null): Service = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

