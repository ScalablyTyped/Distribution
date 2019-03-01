package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServicesResponse extends js.Object {
  /** Token that can be passed to `ListServices` to resume a paginated query. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The returned services will only have the name field set. */
  var services: js.UndefOr[js.Array[ManagedService]] = js.undefined
}

object ListServicesResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, services: js.Array[ManagedService] = null): ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[ListServicesResponse]
  }
}

