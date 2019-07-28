package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.PublishContainerVersionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionsCollection extends js.Object {
  // Gets a Container Version.
  def get(path: String): ContainerVersion = js.native
  // Gets a Container Version.
  def get(path: String, optionalArgs: js.Object): ContainerVersion = js.native
  // Gets the live (i.e. published) container version
  def live(parent: String): ContainerVersion = js.native
  // Publishes a Container Version.
  def publish(path: String): PublishContainerVersionResponse = js.native
  // Publishes a Container Version.
  def publish(path: String, optionalArgs: js.Object): PublishContainerVersionResponse = js.native
  // Deletes a Container Version.
  def remove(path: String): Unit = js.native
  // Sets the latest version used for synchronization of workspaces when detecting conflicts and errors.
  def set_latest(path: String): ContainerVersion = js.native
  // Undeletes a Container Version.
  def undelete(path: String): ContainerVersion = js.native
  // Updates a Container Version.
  def update(resource: ContainerVersion, path: String): ContainerVersion = js.native
  // Updates a Container Version.
  def update(resource: ContainerVersion, path: String, optionalArgs: js.Object): ContainerVersion = js.native
}

