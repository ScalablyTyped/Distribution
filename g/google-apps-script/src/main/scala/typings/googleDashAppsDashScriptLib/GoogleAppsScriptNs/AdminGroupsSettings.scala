package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminGroupsSettings extends js.Object {
  var Groups: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.CollectionNs.GroupsCollection
  ] = js.undefined
  // Create a new instance of Groups
  def newGroups(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups
}

object AdminGroupsSettings {
  @scala.inline
  def apply(
    newGroups: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups,
    Groups: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.CollectionNs.GroupsCollection = null
  ): AdminGroupsSettings = {
    val __obj = js.Dynamic.literal(newGroups = js.Any.fromFunction0(newGroups))
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    __obj.asInstanceOf[AdminGroupsSettings]
  }
}

