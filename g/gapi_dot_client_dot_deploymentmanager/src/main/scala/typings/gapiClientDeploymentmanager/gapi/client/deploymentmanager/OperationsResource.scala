package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDeploymentmanager.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationsResource extends js.Object {
  /** Gets information about a specific operation. */
  def get(request: typings.gapiClientDeploymentmanager.anon.Operation): Request[Operation] = js.native
  /** Lists all operations for a project. */
  def list(request: Filter): Request[OperationsListResponse] = js.native
}

object OperationsResource {
  @scala.inline
  def apply(
    get: typings.gapiClientDeploymentmanager.anon.Operation => Request[Operation],
    list: Filter => Request[OperationsListResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperationsResource]
  }
  @scala.inline
  implicit class OperationsResourceOps[Self <: OperationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: typings.gapiClientDeploymentmanager.anon.Operation => Request[Operation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[OperationsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

