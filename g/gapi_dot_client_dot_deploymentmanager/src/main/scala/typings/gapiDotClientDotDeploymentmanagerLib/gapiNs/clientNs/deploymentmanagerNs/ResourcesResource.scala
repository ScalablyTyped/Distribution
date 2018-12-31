package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesResource extends js.Object {
  /** Gets information about a single resource. */
  def get(request: gapiDotClientDotDeploymentmanagerLib.Anon_Deployment): gapiDotClientLib.gapiNs.clientNs.Request[Resource]
  /** Lists all resources in a given deployment. */
  def list(request: gapiDotClientDotDeploymentmanagerLib.Anon_DeploymentProject): gapiDotClientLib.gapiNs.clientNs.Request[ResourcesListResponse]
}

