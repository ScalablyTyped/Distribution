package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonFields
import typings.gapiClientCompute.AnonQuotaUser
import typings.gapiClientCompute.AnonQuotaUserTargetInstance
import typings.gapiClientCompute.AnonTargetInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetInstancesResource extends js.Object {
  /** Retrieves an aggregated list of target instances. */
  def aggregatedList(request: AnonAlt): Request_[TargetInstanceAggregatedList]
  /** Deletes the specified TargetInstance resource. */
  def delete(request: AnonTargetInstance): Request_[Operation]
  /** Returns the specified TargetInstance resource. Get a list of available target instances by making a list() request. */
  def get(request: AnonQuotaUserTargetInstance): Request_[TargetInstance]
  /** Creates a TargetInstance resource in the specified project and zone using the data included in the request. */
  def insert(request: AnonQuotaUser): Request_[Operation]
  /** Retrieves a list of TargetInstance resources available to the specified project and zone. */
  def list(request: AnonFields): Request_[TargetInstanceList]
}

object TargetInstancesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[TargetInstanceAggregatedList],
    delete: AnonTargetInstance => Request_[Operation],
    get: AnonQuotaUserTargetInstance => Request_[TargetInstance],
    insert: AnonQuotaUser => Request_[Operation],
    list: AnonFields => Request_[TargetInstanceList]
  ): TargetInstancesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TargetInstancesResource]
  }
}

