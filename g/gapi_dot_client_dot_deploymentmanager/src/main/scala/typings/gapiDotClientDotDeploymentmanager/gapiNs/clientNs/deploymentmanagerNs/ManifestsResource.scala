package typings.gapiDotClientDotDeploymentmanager.gapiNs.clientNs.deploymentmanagerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDeploymentmanager.Anon_AltDeployment
import typings.gapiDotClientDotDeploymentmanager.Anon_AltDeploymentFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestsResource extends js.Object {
  /** Gets information about a specific manifest. */
  def get(request: Anon_AltDeployment): Request[Manifest]
  /** Lists all manifests for a given deployment. */
  def list(request: Anon_AltDeploymentFields): Request[ManifestsListResponse]
}

object ManifestsResource {
  @scala.inline
  def apply(
    get: Anon_AltDeployment => Request[Manifest],
    list: Anon_AltDeploymentFields => Request[ManifestsListResponse]
  ): ManifestsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ManifestsResource]
  }
}

