package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a list contact groups request.
  */
@js.native
trait Schema$ListContactGroupsResponse extends js.Object {
  /**
    * The list of contact groups. Members of the contact groups are not
    * populated.
    */
  var contactGroups: js.UndefOr[js.Array[Schema$ContactGroup]] = js.native
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
}

object Schema$ListContactGroupsResponse {
  @scala.inline
  def apply(
    contactGroups: js.Array[Schema$ContactGroup] = null,
    nextPageToken: String = null,
    nextSyncToken: String = null,
    totalItems: Int | Double = null
  ): Schema$ListContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (contactGroups != null) __obj.updateDynamic("contactGroups")(contactGroups.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListContactGroupsResponse]
  }
}

