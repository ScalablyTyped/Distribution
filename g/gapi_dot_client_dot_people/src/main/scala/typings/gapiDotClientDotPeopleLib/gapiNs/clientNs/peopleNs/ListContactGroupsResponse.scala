package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContactGroupsResponse extends js.Object {
  /**
    * The list of contact groups. Members of the contact groups are not
    * populated.
    */
  var contactGroups: js.UndefOr[js.Array[ContactGroup]] = js.undefined
  /** The token that can be used to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The token that can be used to retrieve changes since the last request. */
  var nextSyncToken: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of items in the list without pagination. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object ListContactGroupsResponse {
  @scala.inline
  def apply(
    contactGroups: js.Array[ContactGroup] = null,
    nextPageToken: java.lang.String = null,
    nextSyncToken: java.lang.String = null,
    totalItems: scala.Int | scala.Double = null
  ): ListContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (contactGroups != null) __obj.updateDynamic("contactGroups")(contactGroups)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactGroupsResponse]
  }
}

