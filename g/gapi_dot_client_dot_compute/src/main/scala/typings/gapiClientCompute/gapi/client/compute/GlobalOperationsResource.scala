package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalOperationsResource extends js.Object {
  /** Retrieves an aggregated list of all operations. */
  def aggregatedList(request: Alt): Request[OperationAggregatedList] = js.native
  /** Deletes the specified Operations resource. */
  def delete(request: typings.gapiClientCompute.anon.Operation): Request[Unit] = js.native
  /** Retrieves the specified Operations resource. Get a list of operations by making a list() request. */
  def get(request: typings.gapiClientCompute.anon.Operation): Request[Operation] = js.native
  /** Retrieves a list of Operation resources contained within the specified project. */
  def list(request: Alt): Request[OperationList] = js.native
}

object GlobalOperationsResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[OperationAggregatedList],
    delete: typings.gapiClientCompute.anon.Operation => Request[Unit],
    get: typings.gapiClientCompute.anon.Operation => Request[Operation],
    list: Alt => Request[OperationList]
  ): GlobalOperationsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GlobalOperationsResource]
  }
  @scala.inline
  implicit class GlobalOperationsResourceOps[Self <: GlobalOperationsResource] (val x: Self) extends AnyVal {
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
    def setAggregatedList(value: Alt => Request[OperationAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.Operation => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: typings.gapiClientCompute.anon.Operation => Request[Operation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[OperationList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

