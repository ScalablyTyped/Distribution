package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.GroupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasesCollection extends js.Object {
  // Add a alias for the group
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Alias,
    groupKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Alias
  // List all aliases for a group
  def list(groupKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Aliases
  // Remove a alias for the group
  def remove(groupKey: java.lang.String, alias: java.lang.String): scala.Unit
}

object AliasesCollection {
  @scala.inline
  def apply(
    insert: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Alias, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Alias,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Aliases,
    remove: (java.lang.String, java.lang.String) => scala.Unit
  ): AliasesCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[AliasesCollection]
  }
}

