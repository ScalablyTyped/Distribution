package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListTagsResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.RevertTagResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsCollection extends js.Object {
  // Creates a GTM Tag.
  def create(resource: Tag, parent: String): Tag = js.native
  // Gets a GTM Tag.
  def get(path: String): Tag = js.native
  // Lists all GTM Tags of a Container.
  def list(parent: String): ListTagsResponse = js.native
  // Lists all GTM Tags of a Container.
  def list(parent: String, optionalArgs: js.Object): ListTagsResponse = js.native
  // Deletes a GTM Tag.
  def remove(path: String): Unit = js.native
  // Reverts changes to a GTM Tag in a GTM Workspace.
  def revert(path: String): RevertTagResponse = js.native
  // Reverts changes to a GTM Tag in a GTM Workspace.
  def revert(path: String, optionalArgs: js.Object): RevertTagResponse = js.native
  // Updates a GTM Tag.
  def update(resource: Tag, path: String): Tag = js.native
  // Updates a GTM Tag.
  def update(resource: Tag, path: String, optionalArgs: js.Object): Tag = js.native
}

