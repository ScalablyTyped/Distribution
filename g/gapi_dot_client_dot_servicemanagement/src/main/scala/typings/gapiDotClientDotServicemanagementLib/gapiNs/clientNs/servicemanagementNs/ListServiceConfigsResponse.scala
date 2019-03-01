package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServiceConfigsResponse extends js.Object {
  /** The token of the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of service configuration resources. */
  var serviceConfigs: js.UndefOr[js.Array[Service]] = js.undefined
}

object ListServiceConfigsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, serviceConfigs: js.Array[Service] = null): ListServiceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (serviceConfigs != null) __obj.updateDynamic("serviceConfigs")(serviceConfigs)
    __obj.asInstanceOf[ListServiceConfigsResponse]
  }
}

