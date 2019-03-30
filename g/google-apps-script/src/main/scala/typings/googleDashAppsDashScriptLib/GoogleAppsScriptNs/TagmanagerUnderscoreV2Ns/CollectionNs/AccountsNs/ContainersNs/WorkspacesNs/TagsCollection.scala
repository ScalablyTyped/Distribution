package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsCollection extends js.Object {
  // Creates a GTM Tag.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Tag,
    parent: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Tag = js.native
  // Gets a GTM Tag.
  def get(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Tag = js.native
  // Lists all GTM Tags of a Container.
  def list(parent: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.ListTagsResponse = js.native
  // Lists all GTM Tags of a Container.
  def list(parent: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.ListTagsResponse = js.native
  // Deletes a GTM Tag.
  def remove(path: java.lang.String): scala.Unit = js.native
  // Reverts changes to a GTM Tag in a GTM Workspace.
  def revert(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.RevertTagResponse = js.native
  // Reverts changes to a GTM Tag in a GTM Workspace.
  def revert(path: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.RevertTagResponse = js.native
  // Updates a GTM Tag.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Tag,
    path: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Tag = js.native
  // Updates a GTM Tag.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Tag,
    path: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Tag = js.native
}

