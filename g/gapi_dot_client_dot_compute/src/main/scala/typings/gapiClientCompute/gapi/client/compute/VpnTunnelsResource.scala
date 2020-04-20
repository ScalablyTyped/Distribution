package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonFilter
import typings.gapiClientCompute.AnonPrettyPrint
import typings.gapiClientCompute.AnonUserIpVpnTunnel
import typings.gapiClientCompute.AnonVpnTunnel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnTunnelsResource extends js.Object {
  /** Retrieves an aggregated list of VPN tunnels. */
  def aggregatedList(request: AnonAlt): Request_[VpnTunnelAggregatedList]
  /** Deletes the specified VpnTunnel resource. */
  def delete(request: AnonVpnTunnel): Request_[Operation]
  /** Returns the specified VpnTunnel resource. Get a list of available VPN tunnels by making a list() request. */
  def get(request: AnonUserIpVpnTunnel): Request_[VpnTunnel]
  /** Creates a VpnTunnel resource in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of VpnTunnel resources contained in the specified project and region. */
  def list(request: AnonFilter): Request_[VpnTunnelList]
}

object VpnTunnelsResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[VpnTunnelAggregatedList],
    delete: AnonVpnTunnel => Request_[Operation],
    get: AnonUserIpVpnTunnel => Request_[VpnTunnel],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[VpnTunnelList]
  ): VpnTunnelsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VpnTunnelsResource]
  }
}

