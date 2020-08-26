package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientServicemanagement.anon.Accesstoken
import typings.gapiClientServicemanagement.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationsResource extends js.Object {
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Accesstoken): Request[Operation] = js.native
  /** Lists service operations that match the specified filter in the request. */
  def list(request: Alt): Request[ListOperationsResponse] = js.native
}

object OperationsResource {
  @scala.inline
  def apply(get: Accesstoken => Request[Operation], list: Alt => Request[ListOperationsResponse]): OperationsResource = {
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
    def setGet(value: Accesstoken => Request[Operation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ListOperationsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

