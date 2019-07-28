package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminGroupsSettingsNs.CollectionNs.GroupsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminGroupsSettings extends js.Object {
  var Groups: js.UndefOr[GroupsCollection] = js.undefined
  // Create a new instance of Groups
  def newGroups(): Groups
}

object AdminGroupsSettings {
  @scala.inline
  def apply(newGroups: () => Groups, Groups: GroupsCollection = null): AdminGroupsSettings = {
    val __obj = js.Dynamic.literal(newGroups = js.Any.fromFunction0(newGroups))
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    __obj.asInstanceOf[AdminGroupsSettings]
  }
}

