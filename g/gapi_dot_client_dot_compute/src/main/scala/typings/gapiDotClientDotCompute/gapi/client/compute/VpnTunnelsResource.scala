package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilter
import typings.gapiDotClientDotCompute.Anon_AltFieldsKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdUserIp
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnTunnelsResource extends js.Object {
  /** Retrieves an aggregated list of VPN tunnels. */
  def aggregatedList(request: Anon_Alt): Request[VpnTunnelAggregatedList]
  /** Deletes the specified VpnTunnel resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdUserIp): Request[Operation]
  /** Returns the specified VpnTunnel resource. Get a list of available VPN tunnels by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionUserIp): Request[VpnTunnel]
  /** Creates a VpnTunnel resource in the specified project and region using the data included in the request. */
  def insert(request: Anon_AltFieldsKey): Request[Operation]
  /** Retrieves a list of VpnTunnel resources contained in the specified project and region. */
  def list(request: Anon_AltFieldsFilter): Request[VpnTunnelList]
}

object VpnTunnelsResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[VpnTunnelAggregatedList],
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdUserIp => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionUserIp => Request[VpnTunnel],
    insert: Anon_AltFieldsKey => Request[Operation],
    list: Anon_AltFieldsFilter => Request[VpnTunnelList]
  ): VpnTunnelsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VpnTunnelsResource]
  }
}

