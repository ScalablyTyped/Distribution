package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Fields
import typings.gapiClientCompute.anon.QuotaUser
import typings.gapiClientCompute.anon.QuotaUserTargetInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetInstancesResource extends js.Object {
  /** Retrieves an aggregated list of target instances. */
  def aggregatedList(request: Alt): Request[TargetInstanceAggregatedList]
  /** Deletes the specified TargetInstance resource. */
  def delete(request: typings.gapiClientCompute.anon.TargetInstance): Request[Operation]
  /** Returns the specified TargetInstance resource. Get a list of available target instances by making a list() request. */
  def get(request: QuotaUserTargetInstance): Request[TargetInstance]
  /** Creates a TargetInstance resource in the specified project and zone using the data included in the request. */
  def insert(request: QuotaUser): Request[Operation]
  /** Retrieves a list of TargetInstance resources available to the specified project and zone. */
  def list(request: Fields): Request[TargetInstanceList]
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
}

