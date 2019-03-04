package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnTunnelsResource extends js.Object {
  /** Retrieves an aggregated list of VPN tunnels. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[VpnTunnelAggregatedList]
  /** Deletes the specified VpnTunnel resource. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdUserIp
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified VpnTunnel resource. Get a list of available VPN tunnels by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionUserIp
  ): gapiDotClientLib.gapiNs.clientNs.Request[VpnTunnel]
  /** Creates a VpnTunnel resource in the specified project and region using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of VpnTunnel resources contained in the specified project and region. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[VpnTunnelList]
}

object VpnTunnelsResource {
  @scala.inline
  def apply(
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[VpnTunnelAggregatedList]
    ],
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdUserIp, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionUserIp, 
      gapiDotClientLib.gapiNs.clientNs.Request[VpnTunnel]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[VpnTunnelList]
    ]
  ): VpnTunnelsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = aggregatedList, delete = delete, get = get, insert = insert, list = list)
  
    __obj.asInstanceOf[VpnTunnelsResource]
  }
}

