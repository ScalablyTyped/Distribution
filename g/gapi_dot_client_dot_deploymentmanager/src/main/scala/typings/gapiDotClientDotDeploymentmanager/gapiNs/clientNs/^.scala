package typings.gapiDotClientDotDeploymentmanager.gapiNs.clientNs

import typings.gapiDotClientDotDeploymentmanager.gapiDotClientDotDeploymentmanagerStrings.deploymentmanager
import typings.gapiDotClientDotDeploymentmanager.gapiDotClientDotDeploymentmanagerStrings.v2
import typings.gapiDotClientDotDeploymentmanager.gapiNs.clientNs.deploymentmanagerNs.DeploymentsResource
import typings.gapiDotClientDotDeploymentmanager.gapiNs.clientNs.deploymentmanagerNs.ManifestsResource
import typings.gapiDotClientDotDeploymentmanager.gapiNs.clientNs.deploymentmanagerNs.OperationsResource
import typings.gapiDotClientDotDeploymentmanager.gapiNs.clientNs.deploymentmanagerNs.ResourcesResource
import typings.gapiDotClientDotDeploymentmanager.gapiNs.clientNs.deploymentmanagerNs.TypesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val deployments: DeploymentsResource = js.native
  val manifests: ManifestsResource = js.native
  val operations: OperationsResource = js.native
  val resources: ResourcesResource = js.native
  val types: TypesResource = js.native
  /** Load Google Cloud Deployment Manager API v2 */
  def load(name: deploymentmanager, version: v2): js.Thenable[Unit] = js.native
  def load(name: deploymentmanager, version: v2, callback: js.Function0[_]): Unit = js.native
}

