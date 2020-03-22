package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonFilter
import typings.gapiClientCompute.AnonPrettyPrint
import typings.gapiClientCompute.AnonRegionTargetVpnGateway
import typings.gapiClientCompute.AnonTargetVpnGateway
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetVpnGatewaysResource extends js.Object {
  /** Retrieves an aggregated list of target VPN gateways. */
  def aggregatedList(request: AnonAlt): Request_[TargetVpnGatewayAggregatedList]
  /** Deletes the specified target VPN gateway. */
  def delete(request: AnonTargetVpnGateway): Request_[Operation]
  /** Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request. */
  def get(request: AnonRegionTargetVpnGateway): Request_[TargetVpnGateway]
  /** Creates a target VPN gateway in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of target VPN gateways available to the specified project and region. */
  def list(request: AnonFilter): Request_[TargetVpnGatewayList]
}

object TargetVpnGatewaysResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[TargetVpnGatewayAggregatedList],
    delete: AnonTargetVpnGateway => Request_[Operation],
    get: AnonRegionTargetVpnGateway => Request_[TargetVpnGateway],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[TargetVpnGatewayList]
  ): TargetVpnGatewaysResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TargetVpnGatewaysResource]
  }
}

