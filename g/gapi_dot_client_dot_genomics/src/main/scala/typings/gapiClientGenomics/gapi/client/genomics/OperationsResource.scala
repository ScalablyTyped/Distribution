package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGenomics.anon.Filter
import typings.gapiClientGenomics.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationsResource extends js.Object {
  /**
    * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed.
    * Clients may use Operations.GetOperation or Operations.ListOperations to check whether the cancellation succeeded or the operation completed despite
    * cancellation.
    */
  def cancel(request: Name): Request[js.Object] = js.native
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Name): Request[Operation] = js.native
  /** Lists operations that match the specified filter in the request. */
  def list(request: Filter): Request[ListOperationsResponse] = js.native
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: Name => Request[js.Object],
    get: Name => Request[Operation],
    list: Filter => Request[ListOperationsResponse]
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
    def setCancel(value: Name => Request[js.Object]): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Name => Request[Operation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[ListOperationsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

