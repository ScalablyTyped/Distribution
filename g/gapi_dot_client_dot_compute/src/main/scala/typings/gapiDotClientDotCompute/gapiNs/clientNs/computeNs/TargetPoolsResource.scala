package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFailoverRatio
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilter
import typings.gapiDotClientDotCompute.Anon_AltFieldsKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPoolsResource extends js.Object {
  /** Adds health check URLs to a target pool. */
  def addHealthCheck(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool): Request[Operation]
  /** Adds an instance to a target pool. */
  def addInstance(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool): Request[Operation]
  /** Retrieves an aggregated list of target pools. */
  def aggregatedList(request: Anon_Alt): Request[TargetPoolAggregatedList]
  /** Deletes the specified target pool. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool): Request[Operation]
  /** Returns the specified target pool. Get a list of available target pools by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool): Request[TargetPool]
  /** Gets the most recent health check results for each IP for the instance that is referenced by the given target pool. */
  def getHealth(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool): Request[TargetPoolInstanceHealth]
  /** Creates a target pool in the specified project and region using the data included in the request. */
  def insert(request: Anon_AltFieldsKey): Request[Operation]
  /** Retrieves a list of target pools available to the specified project and region. */
  def list(request: Anon_AltFieldsFilter): Request[TargetPoolList]
  /** Removes health check URL from a target pool. */
  def removeHealthCheck(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool): Request[Operation]
  /** Removes instance URL from a target pool. */
  def removeInstance(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool): Request[Operation]
  /** Changes a backup target pool's configurations. */
  def setBackup(request: Anon_AltFailoverRatio): Request[Operation]
}

object TargetPoolsResource {
  @scala.inline
  def apply(
    addHealthCheck: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool => Request[Operation],
    addInstance: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool => Request[Operation],
    aggregatedList: Anon_Alt => Request[TargetPoolAggregatedList],
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool => Request[TargetPool],
    getHealth: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool => Request[TargetPoolInstanceHealth],
    insert: Anon_AltFieldsKey => Request[Operation],
    list: Anon_AltFieldsFilter => Request[TargetPoolList],
    removeHealthCheck: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool => Request[Operation],
    removeInstance: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool => Request[Operation],
    setBackup: Anon_AltFailoverRatio => Request[Operation]
  ): TargetPoolsResource = {
    val __obj = js.Dynamic.literal(addHealthCheck = js.Any.fromFunction1(addHealthCheck), addInstance = js.Any.fromFunction1(addInstance), aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removeHealthCheck = js.Any.fromFunction1(removeHealthCheck), removeInstance = js.Any.fromFunction1(removeInstance), setBackup = js.Any.fromFunction1(setBackup))
  
    __obj.asInstanceOf[TargetPoolsResource]
  }
}

