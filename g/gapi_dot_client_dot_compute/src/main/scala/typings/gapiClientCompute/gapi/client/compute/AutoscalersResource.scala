package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Fields
import typings.gapiClientCompute.anon.QuotaUser
import typings.gapiClientCompute.anon.RequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoscalersResource extends js.Object {
  /** Retrieves an aggregated list of autoscalers. */
  def aggregatedList(request: Alt): Request[AutoscalerAggregatedList] = js.native
  /** Deletes the specified autoscaler. */
  def delete(request: typings.gapiClientCompute.anon.Autoscaler): Request[Operation] = js.native
  /** Returns the specified autoscaler resource. Get a list of available autoscalers by making a list() request. */
  def get(request: typings.gapiClientCompute.anon.Project): Request[Autoscaler] = js.native
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: QuotaUser): Request[Operation] = js.native
  /** Retrieves a list of autoscalers contained within the specified zone. */
  def list(request: Fields): Request[AutoscalerList] = js.native
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: RequestId): Request[Operation] = js.native
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: RequestId): Request[Operation] = js.native
}

object AutoscalersResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[AutoscalerAggregatedList],
    delete: typings.gapiClientCompute.anon.Autoscaler => Request[Operation],
    get: typings.gapiClientCompute.anon.Project => Request[Autoscaler],
    insert: QuotaUser => Request[Operation],
    list: Fields => Request[AutoscalerList],
    patch: RequestId => Request[Operation],
    update: RequestId => Request[Operation]
  ): AutoscalersResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AutoscalersResource]
  }
  @scala.inline
  implicit class AutoscalersResourceOps[Self <: AutoscalersResource] (val x: Self) extends AnyVal {
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
    def setAggregatedList(value: Alt => Request[AutoscalerAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.Autoscaler => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: typings.gapiClientCompute.anon.Project => Request[Autoscaler]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[AutoscalerList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: RequestId => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: RequestId => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

