package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDeploymentmanager.anon.MaxResults
import typings.gapiClientDeploymentmanager.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesResource extends js.Object {
  /** Gets information about a single resource. */
  def get(request: PrettyPrint): Request[Resource]
  /** Lists all resources in a given deployment. */
  def list(request: MaxResults): Request[ResourcesListResponse]
}

object ResourcesResource {
  @scala.inline
  def apply(get: PrettyPrint => Request[Resource], list: MaxResults => Request[ResourcesListResponse]): ResourcesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ResourcesResource]
  }
}

