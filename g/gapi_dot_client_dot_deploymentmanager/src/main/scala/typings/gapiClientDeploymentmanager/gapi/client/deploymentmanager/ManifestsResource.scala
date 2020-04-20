package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDeploymentmanager.AnonDeployment
import typings.gapiClientDeploymentmanager.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestsResource extends js.Object {
  /** Gets information about a specific manifest. */
  def get(request: AnonDeployment): Request_[Manifest]
  /** Lists all manifests for a given deployment. */
  def list(request: AnonMaxResults): Request_[ManifestsListResponse]
}

object ManifestsResource {
  @scala.inline
  def apply(get: AnonDeployment => Request_[Manifest], list: AnonMaxResults => Request_[ManifestsListResponse]): ManifestsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ManifestsResource]
  }
}

