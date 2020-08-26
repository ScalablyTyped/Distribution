package typings.gapiClientContainer.gapi.client.container

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContainer.anon.Bearertoken
import typings.gapiClientContainer.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationsResource extends js.Object {
  /** Cancels the specified operation. */
  def cancel(request: Callback): Request[js.Object] = js.native
  /** Gets the specified operation. */
  def get(request: Callback): Request[Operation] = js.native
  /** Lists all operations in a project in a specific zone or all zones. */
  def list(request: Bearertoken): Request[ListOperationsResponse] = js.native
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: Callback => Request[js.Object],
    get: Callback => Request[Operation],
    list: Bearertoken => Request[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
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
    def setCancel(value: Callback => Request[js.Object]): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Callback => Request[Operation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Bearertoken => Request[ListOperationsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

