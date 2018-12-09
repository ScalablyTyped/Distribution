package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val deployments: gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs.DeploymentsResource = js.native
  val manifests: gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs.ManifestsResource = js.native
  val operations: gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs.OperationsResource = js.native
  val resources: gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs.ResourcesResource = js.native
  val types: gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs.TypesResource = js.native
  /** Load Google Cloud Deployment Manager API v2 */
  def load(
    name: gapiDotClientDotDeploymentmanagerLib.gapiDotClientDotDeploymentmanagerLibStrings.deploymentmanager,
    version: gapiDotClientDotDeploymentmanagerLib.gapiDotClientDotDeploymentmanagerLibStrings.v2
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotDeploymentmanagerLib.gapiDotClientDotDeploymentmanagerLibStrings.deploymentmanager,
    version: gapiDotClientDotDeploymentmanagerLib.gapiDotClientDotDeploymentmanagerLibStrings.v2,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

