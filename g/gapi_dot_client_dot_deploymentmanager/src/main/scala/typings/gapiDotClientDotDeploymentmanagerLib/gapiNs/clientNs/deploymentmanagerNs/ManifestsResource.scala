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
    get: js.Function1[
      gapiDotClientDotDeploymentmanagerLib.Anon_AltDeployment, 
      gapiDotClientLib.gapiNs.clientNs.Request[Manifest]
    ],
    list: js.Function1[
      gapiDotClientDotDeploymentmanagerLib.Anon_AltDeploymentFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ManifestsListResponse]
    ]
  ): ManifestsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[ManifestsResource]
  }
}

