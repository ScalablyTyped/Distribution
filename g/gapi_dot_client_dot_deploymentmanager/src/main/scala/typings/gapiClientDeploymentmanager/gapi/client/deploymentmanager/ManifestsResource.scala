package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDeploymentmanager.AnonAltDeployment
import typings.gapiClientDeploymentmanager.AnonAltDeploymentFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestsResource extends js.Object {
  /** Gets information about a specific manifest. */
  def get(request: AnonAltDeployment): Request_[Manifest]
  /** Lists all manifests for a given deployment. */
  def list(request: AnonAltDeploymentFields): Request_[ManifestsListResponse]
}

object ManifestsResource {
  @scala.inline
  def apply(
    get: AnonAltDeployment => Request_[Manifest],
    list: AnonAltDeploymentFields => Request_[ManifestsListResponse]
  ): ManifestsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ManifestsResource]
  }
}

