package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.PrettyPrint
import typings.gapiClientCompute.anon.RegionTargetVpnGateway
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetVpnGatewaysResource extends js.Object {
  /** Retrieves an aggregated list of target VPN gateways. */
  def aggregatedList(request: Alt): Request[TargetVpnGatewayAggregatedList] = js.native
  /** Deletes the specified target VPN gateway. */
  def delete(request: typings.gapiClientCompute.anon.TargetVpnGateway): Request[Operation] = js.native
  /** Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request. */
  def get(request: RegionTargetVpnGateway): Request[TargetVpnGateway] = js.native
  /** Creates a target VPN gateway in the specified project and region using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of target VPN gateways available to the specified project and region. */
  def list(request: Filter): Request[TargetVpnGatewayList] = js.native
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
  @scala.inline
  implicit class TargetVpnGatewaysResourceOps[Self <: TargetVpnGatewaysResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAggregatedList(value: Alt => Request[TargetVpnGatewayAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.TargetVpnGateway => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: RegionTargetVpnGateway => Request[TargetVpnGateway]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: PrettyPrint => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[TargetVpnGatewayList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

