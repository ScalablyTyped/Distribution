package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFailoverRatio
import typings.gapiClientCompute.AnonAltFieldsFilter
import typings.gapiClientCompute.AnonAltFieldsKey
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPoolsResource extends js.Object {
  /** Adds health check URLs to a target pool. */
  def addHealthCheck(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool): Request_[Operation]
  /** Adds an instance to a target pool. */
  def addInstance(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool): Request_[Operation]
  /** Retrieves an aggregated list of target pools. */
  def aggregatedList(request: AnonAlt): Request_[TargetPoolAggregatedList]
  /** Deletes the specified target pool. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool): Request_[Operation]
  /** Returns the specified target pool. Get a list of available target pools by making a list() request. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool): Request_[TargetPool]
  /** Gets the most recent health check results for each IP for the instance that is referenced by the given target pool. */
  def getHealth(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool): Request_[TargetPoolInstanceHealth]
  /** Creates a target pool in the specified project and region using the data included in the request. */
  def insert(request: AnonAltFieldsKey): Request_[Operation]
  /** Retrieves a list of target pools available to the specified project and region. */
  def list(request: AnonAltFieldsFilter): Request_[TargetPoolList]
  /** Removes health check URL from a target pool. */
  def removeHealthCheck(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool): Request_[Operation]
  /** Removes instance URL from a target pool. */
  def removeInstance(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool): Request_[Operation]
  /** Changes a backup target pool's configurations. */
  def setBackup(request: AnonAltFailoverRatio): Request_[Operation]
}

object TargetPoolsResource {
  @scala.inline
  def apply(
    addHealthCheck: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool => Request_[Operation],
    addInstance: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool => Request_[Operation],
    aggregatedList: AnonAlt => Request_[TargetPoolAggregatedList],
    delete: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool => Request_[Operation],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool => Request_[TargetPool],
    getHealth: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool => Request_[TargetPoolInstanceHealth],
    insert: AnonAltFieldsKey => Request_[Operation],
    list: AnonAltFieldsFilter => Request_[TargetPoolList],
    removeHealthCheck: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool => Request_[Operation],
    removeInstance: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool => Request_[Operation],
    setBackup: AnonAltFailoverRatio => Request_[Operation]
  ): TargetPoolsResource = {
    val __obj = js.Dynamic.literal(addHealthCheck = js.Any.fromFunction1(addHealthCheck), addInstance = js.Any.fromFunction1(addInstance), aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removeHealthCheck = js.Any.fromFunction1(removeHealthCheck), removeInstance = js.Any.fromFunction1(removeInstance), setBackup = js.Any.fromFunction1(setBackup))
  
    __obj.asInstanceOf[TargetPoolsResource]
  }
}

