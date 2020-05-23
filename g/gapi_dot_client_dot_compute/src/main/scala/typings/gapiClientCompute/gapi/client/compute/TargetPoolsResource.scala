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

trait TargetPoolsResource extends js.Object {
  /** Adds health check URLs to a target pool. */
  def addHealthCheck(request: typings.gapiClientCompute.anon.TargetPool): Request[Operation]
  /** Adds an instance to a target pool. */
  def addInstance(request: typings.gapiClientCompute.anon.TargetPool): Request[Operation]
  /** Retrieves an aggregated list of target pools. */
  def aggregatedList(request: Alt): Request[TargetPoolAggregatedList]
  /** Deletes the specified target pool. */
  def delete(request: typings.gapiClientCompute.anon.TargetPool): Request[Operation]
  /** Returns the specified target pool. Get a list of available target pools by making a list() request. */
  def get(request: RegionTargetPool): Request[TargetPool]
  /** Gets the most recent health check results for each IP for the instance that is referenced by the given target pool. */
  def getHealth(request: RegionTargetPool): Request[TargetPoolInstanceHealth]
  /** Creates a target pool in the specified project and region using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation]
  /** Retrieves a list of target pools available to the specified project and region. */
  def list(request: Filter): Request[TargetPoolList]
  /** Removes health check URL from a target pool. */
  def removeHealthCheck(request: typings.gapiClientCompute.anon.TargetPool): Request[Operation]
  /** Removes instance URL from a target pool. */
  def removeInstance(request: typings.gapiClientCompute.anon.TargetPool): Request[Operation]
  /** Changes a backup target pool's configurations. */
  def setBackup(request: FailoverRatio): Request[Operation]
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
}

