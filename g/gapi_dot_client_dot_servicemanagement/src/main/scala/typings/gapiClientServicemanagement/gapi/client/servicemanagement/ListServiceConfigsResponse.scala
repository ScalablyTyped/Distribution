package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServiceConfigsResponse extends js.Object {
  /** The token of the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of service configuration resources. */
  var serviceConfigs: js.UndefOr[js.Array[Service]] = js.undefined
}

object ListServiceConfigsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, serviceConfigs: js.Array[Service] = null): ListServiceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (serviceConfigs != null) __obj.updateDynamic("serviceConfigs")(serviceConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceConfigsResponse]
  }
}

