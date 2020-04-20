package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDeploymentmanager.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypesResource extends js.Object {
  /** Lists all resource types for Deployment Manager. */
  def list(request: AnonFilter): Request_[TypesListResponse]
}

object TypesResource {
  @scala.inline
  def apply(list: AnonFilter => Request_[TypesListResponse]): TypesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TypesResource]
  }
}

