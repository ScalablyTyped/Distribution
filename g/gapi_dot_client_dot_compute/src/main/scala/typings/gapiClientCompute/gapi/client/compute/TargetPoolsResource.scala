package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonFailoverRatio
import typings.gapiClientCompute.AnonFilter
import typings.gapiClientCompute.AnonPrettyPrint
import typings.gapiClientCompute.AnonRegionTargetPool
import typings.gapiClientCompute.AnonTargetPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPoolsResource extends js.Object {
  /** Adds health check URLs to a target pool. */
  def addHealthCheck(request: AnonTargetPool): Request_[Operation]
  /** Adds an instance to a target pool. */
  def addInstance(request: AnonTargetPool): Request_[Operation]
  /** Retrieves an aggregated list of target pools. */
  def aggregatedList(request: AnonAlt): Request_[TargetPoolAggregatedList]
  /** Deletes the specified target pool. */
  def delete(request: AnonTargetPool): Request_[Operation]
  /** Returns the specified target pool. Get a list of available target pools by making a list() request. */
  def get(request: AnonRegionTargetPool): Request_[TargetPool]
  /** Gets the most recent health check results for each IP for the instance that is referenced by the given target pool. */
  def getHealth(request: AnonRegionTargetPool): Request_[TargetPoolInstanceHealth]
  /** Creates a target pool in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of target pools available to the specified project and region. */
  def list(request: AnonFilter): Request_[TargetPoolList]
  /** Removes health check URL from a target pool. */
  def removeHealthCheck(request: AnonTargetPool): Request_[Operation]
  /** Removes instance URL from a target pool. */
  def removeInstance(request: AnonTargetPool): Request_[Operation]
  /** Changes a backup target pool's configurations. */
  def setBackup(request: AnonFailoverRatio): Request_[Operation]
}

object TargetPoolsResource {
  @scala.inline
  def apply(
    addHealthCheck: AnonTargetPool => Request_[Operation],
    addInstance: AnonTargetPool => Request_[Operation],
    aggregatedList: AnonAlt => Request_[TargetPoolAggregatedList],
    delete: AnonTargetPool => Request_[Operation],
    get: AnonRegionTargetPool => Request_[TargetPool],
    getHealth: AnonRegionTargetPool => Request_[TargetPoolInstanceHealth],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[TargetPoolList],
    removeHealthCheck: AnonTargetPool => Request_[Operation],
    removeInstance: AnonTargetPool => Request_[Operation],
    setBackup: AnonFailoverRatio => Request_[Operation]
  ): TargetPoolsResource = {
    val __obj = js.Dynamic.literal(addHealthCheck = js.Any.fromFunction1(addHealthCheck), addInstance = js.Any.fromFunction1(addInstance), aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removeHealthCheck = js.Any.fromFunction1(removeHealthCheck), removeInstance = js.Any.fromFunction1(removeInstance), setBackup = js.Any.fromFunction1(setBackup))
    __obj.asInstanceOf[TargetPoolsResource]
  }
}

