package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDeploymentmanager.AnonAltFieldsFilter
import typings.gapiClientDeploymentmanager.AnonAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Gets information about a specific operation. */
  def get(request: AnonAltFieldsKeyOauthtoken): Request_[Operation]
  /** Lists all operations for a project. */
  def list(request: AnonAltFieldsFilter): Request_[OperationsListResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsKeyOauthtoken => Request_[Operation],
    list: AnonAltFieldsFilter => Request_[OperationsListResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

