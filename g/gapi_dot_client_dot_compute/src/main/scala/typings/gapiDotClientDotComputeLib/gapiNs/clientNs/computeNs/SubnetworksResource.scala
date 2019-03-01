package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetworksResource extends js.Object {
  /** Retrieves an aggregated list of subnetworks. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[SubnetworkAggregatedList]
  /** Deletes the specified subnetwork. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Expands the IP CIDR range of the subnetwork to a specified value. */
  def expandIpCidrRange(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified subnetwork. Get a list of available subnetworks list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionSubnetwork
  ): gapiDotClientLib.gapiNs.clientNs.Request[Subnetwork]
  /** Creates a subnetwork in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of subnetworks available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[SubnetworkList]
  /** Set whether VMs in this subnet can access Google services without assigning external IP addresses through Private Google Access. */
  def setPrivateIpGoogleAccess(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object SubnetworksResource {
  @scala.inline
  def apply(
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[SubnetworkAggregatedList]
    ],
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    expandIpCidrRange: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionSubnetwork, 
      gapiDotClientLib.gapiNs.clientNs.Request[Subnetwork]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[SubnetworkList]
    ],
    setPrivateIpGoogleAccess: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): SubnetworksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(aggregatedList)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("expandIpCidrRange")(expandIpCidrRange)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("setPrivateIpGoogleAccess")(setPrivateIpGoogleAccess)
    __obj.asInstanceOf[SubnetworksResource]
  }
}

