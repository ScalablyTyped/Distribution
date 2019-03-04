package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetVpnGatewaysResource extends js.Object {
  /** Retrieves an aggregated list of target VPN gateways. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TargetVpnGatewayAggregatedList]
  /** Deletes the specified target VPN gateway. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetVpnGateway
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetVpnGateway
  ): gapiDotClientLib.gapiNs.clientNs.Request[TargetVpnGateway]
  /** Creates a target VPN gateway in the specified project and region using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of target VPN gateways available to the specified project and region. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[TargetVpnGatewayList]
}

object TargetVpnGatewaysResource {
  @scala.inline
  def apply(
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetVpnGatewayAggregatedList]
    ],
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetVpnGateway, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetVpnGateway, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetVpnGateway]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetVpnGatewayList]
    ]
  ): TargetVpnGatewaysResource = {
    val __obj = js.Dynamic.literal(aggregatedList = aggregatedList, delete = delete, get = get, insert = insert, list = list)
  
    __obj.asInstanceOf[TargetVpnGatewaysResource]
  }
}

