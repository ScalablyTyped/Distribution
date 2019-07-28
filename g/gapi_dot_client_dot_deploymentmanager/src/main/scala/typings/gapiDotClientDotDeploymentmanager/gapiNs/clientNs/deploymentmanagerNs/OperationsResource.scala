package typings.gapiDotClientDotDeploymentmanager.gapiNs.clientNs.deploymentmanagerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDeploymentmanager.Anon_AltFieldsFilter
import typings.gapiDotClientDotDeploymentmanager.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Gets information about a specific operation. */
  def get(request: Anon_AltFieldsKeyOauthtoken): Request[Operation]
  /** Lists all operations for a project. */
  def list(request: Anon_AltFieldsFilter): Request[OperationsListResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKeyOauthtoken => Request[Operation],
    list: Anon_AltFieldsFilter => Request[OperationsListResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

