package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDeploymentmanager.AnonFilter
import typings.gapiClientDeploymentmanager.AnonOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Gets information about a specific operation. */
  def get(request: AnonOperation): Request_[Operation]
  /** Lists all operations for a project. */
  def list(request: AnonFilter): Request_[OperationsListResponse]
}

object OperationsResource {
  @scala.inline
  def apply(get: AnonOperation => Request_[Operation], list: AnonFilter => Request_[OperationsListResponse]): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperationsResource]
  }
}

