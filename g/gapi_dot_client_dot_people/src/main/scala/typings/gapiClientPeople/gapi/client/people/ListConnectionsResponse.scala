package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConnectionsResponse extends js.Object {
  /** The list of people that the requestor is connected to. */
  var connections: js.UndefOr[js.Array[Person]] = js.undefined
  /**
    * A token, which can be sent as `page_token` to retrieve the next page.
    * If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * A token, which can be sent as `sync_token` to retrieve changes since the
    * last request. Request must set `request_sync_token` to return the sync
    * token.
    */
  var nextSyncToken: js.UndefOr[String] = js.undefined
  /** The total number of items in the list without pagination. */
  var totalItems: js.UndefOr[Double] = js.undefined
  /**
    * &#42;&#42;DEPRECATED&#42;&#42; (Please use totalItems)
    * The total number of people in the list without pagination.
    */
  var totalPeople: js.UndefOr[Double] = js.undefined
}

object ListConnectionsResponse {
  @scala.inline
  def apply(
    connections: js.Array[Person] = null,
    nextPageToken: String = null,
    nextSyncToken: String = null,
    totalItems: js.UndefOr[Double] = js.undefined,
    totalPeople: js.UndefOr[Double] = js.undefined
  ): ListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalPeople)) __obj.updateDynamic("totalPeople")(totalPeople.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConnectionsResponse]
  }
}

