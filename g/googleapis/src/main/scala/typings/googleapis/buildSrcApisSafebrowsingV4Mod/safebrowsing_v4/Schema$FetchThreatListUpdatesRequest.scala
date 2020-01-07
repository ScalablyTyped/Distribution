package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a Safe Browsing API update request. Clients can request updates
  * for multiple lists in a single request. NOTE: Field index 2 is unused.
  * NEXT: 5
  */
@js.native
trait Schema$FetchThreatListUpdatesRequest extends js.Object {
  /**
    * The client metadata.
    */
  var client: js.UndefOr[Schema$ClientInfo] = js.native
  /**
    * The requested threat list updates.
    */
  var listUpdateRequests: js.UndefOr[js.Array[Schema$ListUpdateRequest]] = js.native
}

object Schema$FetchThreatListUpdatesRequest {
  @scala.inline
  def apply(client: Schema$ClientInfo = null, listUpdateRequests: js.Array[Schema$ListUpdateRequest] = null): Schema$FetchThreatListUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (listUpdateRequests != null) __obj.updateDynamic("listUpdateRequests")(listUpdateRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FetchThreatListUpdatesRequest]
  }
}

