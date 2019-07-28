package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersionHeader
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListContainerVersionsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Version_headersCollection extends js.Object {
  // Gets the latest container version header
  def latest(parent: String): ContainerVersionHeader = js.native
  // Lists all Container Versions of a GTM Container.
  def list(parent: String): ListContainerVersionsResponse = js.native
  // Lists all Container Versions of a GTM Container.
  def list(parent: String, optionalArgs: js.Object): ListContainerVersionsResponse = js.native
}

