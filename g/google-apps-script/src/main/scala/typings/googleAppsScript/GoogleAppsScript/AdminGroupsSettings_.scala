package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Collection.GroupsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminGroupsSettings_ extends js.Object {
  var Groups: js.UndefOr[GroupsCollection] = js.undefined
  // Create a new instance of Groups
  def newGroups(): typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
}

object AdminGroupsSettings_ {
  @scala.inline
  def apply(
    newGroups: () => typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
    Groups: GroupsCollection = null
  ): AdminGroupsSettings_ = {
    val __obj = js.Dynamic.literal(newGroups = js.Any.fromFunction0(newGroups))
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminGroupsSettings_]
  }
}

