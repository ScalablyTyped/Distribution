package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ManifestsResource extends js.Object {
  /** Gets information about a specific manifest. */
  def get(request: gapiDotClientDotDeploymentmanagerLib.Anon_DeploymentProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Manifest]
  /** Lists all manifests for a given deployment. */
  def list(request: gapiDotClientDotDeploymentmanagerLib.Anon_DeploymentProject): gapiDotClientLib.gapiNs.clientNs.Request[ManifestsListResponse]
}

