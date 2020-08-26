package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Fields
import typings.gapiClientCompute.anon.QuotaUser
import typings.gapiClientCompute.anon.QuotaUserTargetInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetInstancesResource extends js.Object {
  /** Retrieves an aggregated list of target instances. */
  def aggregatedList(request: Alt): Request[TargetInstanceAggregatedList] = js.native
  /** Deletes the specified TargetInstance resource. */
  def delete(request: typings.gapiClientCompute.anon.TargetInstance): Request[Operation] = js.native
  /** Returns the specified TargetInstance resource. Get a list of available target instances by making a list() request. */
  def get(request: QuotaUserTargetInstance): Request[TargetInstance] = js.native
  /** Creates a TargetInstance resource in the specified project and zone using the data included in the request. */
  def insert(request: QuotaUser): Request[Operation] = js.native
  /** Retrieves a list of TargetInstance resources available to the specified project and zone. */
  def list(request: Fields): Request[TargetInstanceList] = js.native
}

object TargetInstancesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[TargetInstanceAggregatedList],
    delete: typings.gapiClientCompute.anon.TargetInstance => Request[Operation],
    get: QuotaUserTargetInstance => Request[TargetInstance],
    insert: QuotaUser => Request[Operation],
    list: Fields => Request[TargetInstanceList]
  ): TargetInstancesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TargetInstancesResource]
  }
  @scala.inline
  implicit class TargetInstancesResourceOps[Self <: TargetInstancesResource] (val x: Self) extends AnyVal {
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
    def setAggregatedList(value: Alt => Request[TargetInstanceAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.TargetInstance => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: QuotaUserTargetInstance => Request[TargetInstance]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[TargetInstanceList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

