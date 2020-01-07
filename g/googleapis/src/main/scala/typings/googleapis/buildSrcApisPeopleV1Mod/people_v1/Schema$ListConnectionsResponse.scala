package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListConnectionsResponse extends js.Object {
  /**
    * The list of people that the requestor is connected to.
    */
  var connections: js.UndefOr[js.Array[Schema$Person]] = js.native
  /**
    * The token that can be used to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The token that can be used to retrieve changes since the last request.
    */
  var nextSyncToken: js.UndefOr[String] = js.native
  /**
    * The total number of items in the list without pagination.
    */
  var totalItems: js.UndefOr[Double] = js.native
  /**
    * **DEPRECATED** (Please use totalItems) The total number of people in the
    * list without pagination.
    */
  var totalPeople: js.UndefOr[Double] = js.native
}

object Schema$ListConnectionsResponse {
  @scala.inline
  def apply(
    connections: js.Array[Schema$Person] = null,
    nextPageToken: String = null,
    nextSyncToken: String = null,
    totalItems: Int | Double = null,
    totalPeople: Int | Double = null
  ): Schema$ListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    if (totalPeople != null) __obj.updateDynamic("totalPeople")(totalPeople.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListConnectionsResponse]
  }
}

