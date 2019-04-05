package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsCollection extends js.Object {
  // Gets one resource by id.
  def get(groupUniqueId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups
  // Updates an existing resource. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups,
    groupUniqueId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups
  // Updates an existing resource.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups,
    groupUniqueId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups
}

object GroupsCollection {
  @scala.inline
  def apply(
    get: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups,
    patch: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups,
    update: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsSettingsNs.SchemaNs.Groups
  ): GroupsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction2(patch), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[GroupsCollection]
  }
}

