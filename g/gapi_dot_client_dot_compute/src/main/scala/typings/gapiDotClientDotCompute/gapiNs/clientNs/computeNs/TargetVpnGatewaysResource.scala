package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilter
import typings.gapiDotClientDotCompute.Anon_AltFieldsKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetVpnGateway
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetVpnGateway
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetVpnGatewaysResource extends js.Object {
  /** Retrieves an aggregated list of target VPN gateways. */
  def aggregatedList(request: Anon_Alt): Request[TargetVpnGatewayAggregatedList]
  /** Deletes the specified target VPN gateway. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetVpnGateway): Request[Operation]
  /** Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetVpnGateway): Request[TargetVpnGateway]
  /** Creates a target VPN gateway in the specified project and region using the data included in the request. */
  def insert(request: Anon_AltFieldsKey): Request[Operation]
  /** Retrieves a list of target VPN gateways available to the specified project and region. */
  def list(request: Anon_AltFieldsFilter): Request[TargetVpnGatewayList]
}

object TargetVpnGatewaysResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[TargetVpnGatewayAggregatedList],
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetVpnGateway => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetVpnGateway => Request[TargetVpnGateway],
    insert: Anon_AltFieldsKey => Request[Operation],
    list: Anon_AltFieldsFilter => Request[TargetVpnGatewayList]
  ): TargetVpnGatewaysResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TargetVpnGatewaysResource]
  }
}

