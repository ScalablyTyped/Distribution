package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServicesResponse extends js.Object {
  /** Token that can be passed to `ListServices` to resume a paginated query. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The returned services will only have the name field set. */
  var services: js.UndefOr[js.Array[ManagedService]] = js.undefined
}

object ListServicesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, services: js.Array[ManagedService] = null): ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServicesResponse]
  }
}

