package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Groups.AliasesCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupsCollection extends js.Object {
  
  var Aliases: js.UndefOr[AliasesCollection] = js.native
  
  // Retrieve Group
  def get(groupKey: String): Group = js.native
  
  // Create Group
  def insert(resource: Group): Group = js.native
  
  // Retrieve all groups of a domain or of a user given a userKey (paginated)
  def list(): typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Groups = js.native
  // Retrieve all groups of a domain or of a user given a userKey (paginated)
  def list(optionalArgs: js.Object): typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Groups = js.native
  
  // Update Group. This method supports patch semantics.
  def patch(resource: Group, groupKey: String): Group = js.native
  
  // Delete Group
  def remove(groupKey: String): Unit = js.native
  
  // Update Group
  def update(resource: Group, groupKey: String): Group = js.native
}
