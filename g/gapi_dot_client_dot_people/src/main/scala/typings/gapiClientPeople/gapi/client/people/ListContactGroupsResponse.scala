package typings.gapiClientPeople.gapi.client.people

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
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The token that can be used to retrieve changes since the last request. */
  var nextSyncToken: js.UndefOr[String] = js.undefined
  /** The total number of items in the list without pagination. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object ListContactGroupsResponse {
  @scala.inline
  def apply(
    contactGroups: js.Array[ContactGroup] = null,
    nextPageToken: String = null,
    nextSyncToken: String = null,
    totalItems: Int | Double = null
  ): ListContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (contactGroups != null) __obj.updateDynamic("contactGroups")(contactGroups.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactGroupsResponse]
  }
}

