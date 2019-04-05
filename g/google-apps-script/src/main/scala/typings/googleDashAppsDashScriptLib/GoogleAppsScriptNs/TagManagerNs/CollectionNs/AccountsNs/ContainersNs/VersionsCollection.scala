package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionsCollection extends js.Object {
  // Gets a Container Version.
  def get(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion = js.native
  // Gets a Container Version.
  def get(path: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion = js.native
  // Gets the live (i.e. published) container version
  def live(parent: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion = js.native
  // Publishes a Container Version.
  def publish(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.PublishContainerVersionResponse = js.native
  // Publishes a Container Version.
  def publish(path: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.PublishContainerVersionResponse = js.native
  // Deletes a Container Version.
  def remove(path: java.lang.String): scala.Unit = js.native
  // Sets the latest version used for synchronization of workspaces when detecting conflicts and errors.
  def set_latest(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion = js.native
  // Undeletes a Container Version.
  def undelete(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion = js.native
  // Updates a Container Version.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion,
    path: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion = js.native
  // Updates a Container Version.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion,
    path: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion = js.native
}

