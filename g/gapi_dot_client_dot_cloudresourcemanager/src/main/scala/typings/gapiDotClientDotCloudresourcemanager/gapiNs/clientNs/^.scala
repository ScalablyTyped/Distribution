package typings.gapiDotClientDotCloudresourcemanager.gapiNs.clientNs

import typings.gapiDotClientDotCloudresourcemanager.gapiDotClientDotCloudresourcemanagerStrings.cloudresourcemanager
import typings.gapiDotClientDotCloudresourcemanager.gapiDotClientDotCloudresourcemanagerStrings.v1
import typings.gapiDotClientDotCloudresourcemanager.gapiNs.clientNs.cloudresourcemanagerNs.FoldersResource
import typings.gapiDotClientDotCloudresourcemanager.gapiNs.clientNs.cloudresourcemanagerNs.LiensResource
import typings.gapiDotClientDotCloudresourcemanager.gapiNs.clientNs.cloudresourcemanagerNs.OperationsResource
import typings.gapiDotClientDotCloudresourcemanager.gapiNs.clientNs.cloudresourcemanagerNs.OrganizationsResource
import typings.gapiDotClientDotCloudresourcemanager.gapiNs.clientNs.cloudresourcemanagerNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val folders: FoldersResource = js.native
  val liens: LiensResource = js.native
  val operations: OperationsResource = js.native
  val organizations: OrganizationsResource = js.native
  val projects: ProjectsResource = js.native
  /** Load Google Cloud Resource Manager API v1 */
  def load(name: cloudresourcemanager, version: v1): js.Thenable[Unit] = js.native
  def load(name: cloudresourcemanager, version: v1, callback: js.Function0[_]): Unit = js.native
}

