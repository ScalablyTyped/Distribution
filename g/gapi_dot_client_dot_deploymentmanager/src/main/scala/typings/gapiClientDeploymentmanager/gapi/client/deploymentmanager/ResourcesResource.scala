package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDeploymentmanager.AnonMaxResults
import typings.gapiClientDeploymentmanager.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesResource extends js.Object {
  /** Gets information about a single resource. */
  def get(request: AnonPrettyPrint): Request_[Resource]
  /** Lists all resources in a given deployment. */
  def list(request: AnonMaxResults): Request_[ResourcesListResponse]
}

object ResourcesResource {
  @scala.inline
  def apply(
    get: AnonPrettyPrint => Request_[Resource],
    list: AnonMaxResults => Request_[ResourcesListResponse]
  ): ResourcesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ResourcesResource]
  }
}

