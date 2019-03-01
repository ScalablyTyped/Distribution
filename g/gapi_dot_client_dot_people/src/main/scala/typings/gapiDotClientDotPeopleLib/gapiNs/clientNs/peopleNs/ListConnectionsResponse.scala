package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConnectionsResponse extends js.Object {
  /** The list of people that the requestor is connected to. */
  var connections: js.UndefOr[js.Array[Person]] = js.undefined
  /** The token that can be used to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The token that can be used to retrieve changes since the last request. */
  var nextSyncToken: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of items in the list without pagination. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
  /**
    * &#42;&#42;DEPRECATED&#42;&#42; (Please use totalItems)
    * The total number of people in the list without pagination.
    */
  var totalPeople: js.UndefOr[scala.Double] = js.undefined
}

object ListConnectionsResponse {
  @scala.inline
  def apply(
    connections: js.Array[Person] = null,
    nextPageToken: java.lang.String = null,
    nextSyncToken: java.lang.String = null,
    totalItems: scala.Int | scala.Double = null,
    totalPeople: scala.Int | scala.Double = null
  ): ListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (connections != null) __obj.updateDynamic("connections")(connections)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    if (totalPeople != null) __obj.updateDynamic("totalPeople")(totalPeople.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConnectionsResponse]
  }
}

