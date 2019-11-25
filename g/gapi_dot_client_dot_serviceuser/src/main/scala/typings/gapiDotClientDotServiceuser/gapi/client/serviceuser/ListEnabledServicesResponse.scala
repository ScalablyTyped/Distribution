package typings.gapiDotClientDotServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEnabledServicesResponse extends js.Object {
  /**
    * Token that can be passed to `ListEnabledServices` to resume a paginated
    * query.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Services enabled for the specified parent. */
  var services: js.UndefOr[js.Array[PublishedService]] = js.undefined
}

object ListEnabledServicesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, services: js.Array[PublishedService] = null): ListEnabledServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnabledServicesResponse]
  }
}

