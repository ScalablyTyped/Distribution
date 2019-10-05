package typings.gapiDotClientDotSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchThreatListUpdatesRequest extends js.Object {
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.undefined
  /** The requested threat list updates. */
  var listUpdateRequests: js.UndefOr[js.Array[ListUpdateRequest]] = js.undefined
}

object FetchThreatListUpdatesRequest {
  @scala.inline
  def apply(client: ClientInfo = null, listUpdateRequests: js.Array[ListUpdateRequest] = null): FetchThreatListUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (listUpdateRequests != null) __obj.updateDynamic("listUpdateRequests")(listUpdateRequests)
    __obj.asInstanceOf[FetchThreatListUpdatesRequest]
  }
}

