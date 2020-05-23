package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.PrettyPrint
import typings.gapiClientCompute.anon.UserIpVpnTunnel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnTunnelsResource extends js.Object {
  /** Retrieves an aggregated list of VPN tunnels. */
  def aggregatedList(request: Alt): Request[VpnTunnelAggregatedList]
  /** Deletes the specified VpnTunnel resource. */
  def delete(request: typings.gapiClientCompute.anon.VpnTunnel): Request[Operation]
  /** Returns the specified VpnTunnel resource. Get a list of available VPN tunnels by making a list() request. */
  def get(request: UserIpVpnTunnel): Request[VpnTunnel]
  /** Creates a VpnTunnel resource in the specified project and region using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation]
  /** Retrieves a list of VpnTunnel resources contained in the specified project and region. */
  def list(request: Filter): Request[VpnTunnelList]
}

object VpnTunnelsResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[VpnTunnelAggregatedList],
    delete: typings.gapiClientCompute.anon.VpnTunnel => Request[Operation],
    get: UserIpVpnTunnel => Request[VpnTunnel],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[VpnTunnelList]
  ): VpnTunnelsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VpnTunnelsResource]
  }
}

