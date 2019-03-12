package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestsResource extends js.Object {
  /** Gets information about a specific manifest. */
  def get(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltDeployment): gapiDotClientLib.gapiNs.clientNs.Request[Manifest]
  /** Lists all manifests for a given deployment. */
  def list(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltDeploymentFields): gapiDotClientLib.gapiNs.clientNs.Request[ManifestsListResponse]
}

object ManifestsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotDeploymentmanagerLib.Anon_AltDeployment => gapiDotClientLib.gapiNs.clientNs.Request[Manifest],
    list: gapiDotClientDotDeploymentmanagerLib.Anon_AltDeploymentFields => gapiDotClientLib.gapiNs.clientNs.Request[ManifestsListResponse]
  ): ManifestsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ManifestsResource]
  }
}

