package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServicesResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListServices` again with the `page_token` field set to this
    * value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** A list of services. */
  var services: js.UndefOr[js.Array[Service]] = js.undefined
}

object ListServicesResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, services: js.Array[Service] = null): ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[ListServicesResponse]
  }
}

