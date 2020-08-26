package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.FailoverRatio
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.PrettyPrint
import typings.gapiClientCompute.anon.RegionTargetPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetPoolsResource extends js.Object {
  /** Adds health check URLs to a target pool. */
  def addHealthCheck(request: typings.gapiClientCompute.anon.TargetPool): Request[Operation] = js.native
  /** Adds an instance to a target pool. */
  def addInstance(request: typings.gapiClientCompute.anon.TargetPool): Request[Operation] = js.native
  /** Retrieves an aggregated list of target pools. */
  def aggregatedList(request: Alt): Request[TargetPoolAggregatedList] = js.native
  /** Deletes the specified target pool. */
  def delete(request: typings.gapiClientCompute.anon.TargetPool): Request[Operation] = js.native
  /** Returns the specified target pool. Get a list of available target pools by making a list() request. */
  def get(request: RegionTargetPool): Request[TargetPool] = js.native
  /** Gets the most recent health check results for each IP for the instance that is referenced by the given target pool. */
  def getHealth(request: RegionTargetPool): Request[TargetPoolInstanceHealth] = js.native
  /** Creates a target pool in the specified project and region using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of target pools available to the specified project and region. */
  def list(request: Filter): Request[TargetPoolList] = js.native
  /** Removes health check URL from a target pool. */
  def removeHealthCheck(request: typings.gapiClientCompute.anon.TargetPool): Request[Operation] = js.native
  /** Removes instance URL from a target pool. */
  def removeInstance(request: typings.gapiClientCompute.anon.TargetPool): Request[Operation] = js.native
  /** Changes a backup target pool's configurations. */
  def setBackup(request: FailoverRatio): Request[Operation] = js.native
}

object TargetPoolsResource {
  @scala.inline
  def apply(
    addHealthCheck: typings.gapiClientCompute.anon.TargetPool => Request[Operation],
    addInstance: typings.gapiClientCompute.anon.TargetPool => Request[Operation],
    aggregatedList: Alt => Request[TargetPoolAggregatedList],
    delete: typings.gapiClientCompute.anon.TargetPool => Request[Operation],
    get: RegionTargetPool => Request[TargetPool],
    getHealth: RegionTargetPool => Request[TargetPoolInstanceHealth],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[TargetPoolList],
    removeHealthCheck: typings.gapiClientCompute.anon.TargetPool => Request[Operation],
    removeInstance: typings.gapiClientCompute.anon.TargetPool => Request[Operation],
    setBackup: FailoverRatio => Request[Operation]
  ): TargetPoolsResource = {
    val __obj = js.Dynamic.literal(addHealthCheck = js.Any.fromFunction1(addHealthCheck), addInstance = js.Any.fromFunction1(addInstance), aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removeHealthCheck = js.Any.fromFunction1(removeHealthCheck), removeInstance = js.Any.fromFunction1(removeInstance), setBackup = js.Any.fromFunction1(setBackup))
    __obj.asInstanceOf[TargetPoolsResource]
  }
  @scala.inline
  implicit class TargetPoolsResourceOps[Self <: TargetPoolsResource] (val x: Self) extends AnyVal {
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
    def setAddHealthCheck(value: typings.gapiClientCompute.anon.TargetPool => Request[Operation]): Self = this.set("addHealthCheck", js.Any.fromFunction1(value))
    @scala.inline
    def setAddInstance(value: typings.gapiClientCompute.anon.TargetPool => Request[Operation]): Self = this.set("addInstance", js.Any.fromFunction1(value))
    @scala.inline
    def setAggregatedList(value: Alt => Request[TargetPoolAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.TargetPool => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: RegionTargetPool => Request[TargetPool]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetHealth(value: RegionTargetPool => Request[TargetPoolInstanceHealth]): Self = this.set("getHealth", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: PrettyPrint => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[TargetPoolList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveHealthCheck(value: typings.gapiClientCompute.anon.TargetPool => Request[Operation]): Self = this.set("removeHealthCheck", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveInstance(value: typings.gapiClientCompute.anon.TargetPool => Request[Operation]): Self = this.set("removeInstance", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBackup(value: FailoverRatio => Request[Operation]): Self = this.set("setBackup", js.Any.fromFunction1(value))
  }
  
}

