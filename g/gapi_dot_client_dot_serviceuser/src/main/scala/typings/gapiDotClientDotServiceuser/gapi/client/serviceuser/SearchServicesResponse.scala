package typings.gapiDotClientDotServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchServicesResponse extends js.Object {
  /**
    * Token that can be passed to `ListAvailableServices` to resume a paginated
    * query.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Services available publicly or available to the authenticated caller. */
  var services: js.UndefOr[js.Array[PublishedService]] = js.undefined
}

object SearchServicesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, services: js.Array[PublishedService] = null): SearchServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[SearchServicesResponse]
  }
}

