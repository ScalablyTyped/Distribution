package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.GroupsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Alias
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Aliases
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasesCollection extends js.Object {
  // Add a alias for the group
  def insert(resource: Alias, groupKey: String): Alias
  // List all aliases for a group
  def list(groupKey: String): Aliases
  // Remove a alias for the group
  def remove(groupKey: String, alias: String): Unit
}

object AliasesCollection {
  @scala.inline
  def apply(insert: (Alias, String) => Alias, list: String => Aliases, remove: (String, String) => Unit): AliasesCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[AliasesCollection]
  }
}

