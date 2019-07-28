package typings.gapiDotClientDotAppengine.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServicesResponse extends js.Object {
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The services belonging to the requested application. */
  var services: js.UndefOr[js.Array[Service]] = js.undefined
}

object ListServicesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, services: js.Array[Service] = null): ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[ListServicesResponse]
  }
}

