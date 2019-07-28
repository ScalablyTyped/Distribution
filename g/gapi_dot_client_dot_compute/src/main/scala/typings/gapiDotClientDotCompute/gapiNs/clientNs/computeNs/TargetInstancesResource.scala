package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFields
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtoken
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetInstance
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetInstancesResource extends js.Object {
  /** Retrieves an aggregated list of target instances. */
  def aggregatedList(request: Anon_Alt): Request[TargetInstanceAggregatedList]
  /** Deletes the specified TargetInstance resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetInstance): Request[Operation]
  /** Returns the specified TargetInstance resource. Get a list of available target instances by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetInstance): Request[TargetInstance]
  /** Creates a TargetInstance resource in the specified project and zone using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtoken): Request[Operation]
  /** Retrieves a list of TargetInstance resources available to the specified project and zone. */
  def list(request: Anon_AltFields): Request[TargetInstanceList]
}

object TargetInstancesResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[TargetInstanceAggregatedList],
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetInstance => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetInstance => Request[TargetInstance],
    insert: Anon_AltFieldsKeyOauthtoken => Request[Operation],
    list: Anon_AltFields => Request[TargetInstanceList]
  ): TargetInstancesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TargetInstancesResource]
  }
}

