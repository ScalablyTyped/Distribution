package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContactGroupsResponse extends js.Object {
  var contactGroups: js.UndefOr[js.Array[ContactGroup]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var nextSyncToken: js.UndefOr[String] = js.undefined
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

