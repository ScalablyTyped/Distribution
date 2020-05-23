package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.PrettyPrint
import typings.gapiClientCompute.anon.RegionTargetVpnGateway
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetVpnGatewaysResource extends js.Object {
  /** Retrieves an aggregated list of target VPN gateways. */
  def aggregatedList(request: Alt): Request[TargetVpnGatewayAggregatedList]
  /** Deletes the specified target VPN gateway. */
  def delete(request: typings.gapiClientCompute.anon.TargetVpnGateway): Request[Operation]
  /** Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request. */
  def get(request: RegionTargetVpnGateway): Request[TargetVpnGateway]
  /** Creates a target VPN gateway in the specified project and region using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation]
  /** Retrieves a list of target VPN gateways available to the specified project and region. */
  def list(request: Filter): Request[TargetVpnGatewayList]
}

object TargetVpnGatewaysResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[TargetVpnGatewayAggregatedList],
    delete: typings.gapiClientCompute.anon.TargetVpnGateway => Request[Operation],
    get: RegionTargetVpnGateway => Request[TargetVpnGateway],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[TargetVpnGatewayList]
  ): TargetVpnGatewaysResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TargetVpnGatewaysResource]
  }
}

