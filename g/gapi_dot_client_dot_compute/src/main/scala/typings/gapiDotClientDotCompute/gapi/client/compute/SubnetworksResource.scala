package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilter
import typings.gapiDotClientDotCompute.Anon_AltFieldsKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionSubnetwork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetworksResource extends js.Object {
  /** Retrieves an aggregated list of subnetworks. */
  def aggregatedList(request: Anon_Alt): Request[SubnetworkAggregatedList]
  /** Deletes the specified subnetwork. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork): Request[Operation]
  /** Expands the IP CIDR range of the subnetwork to a specified value. */
  def expandIpCidrRange(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork): Request[Operation]
  /** Returns the specified subnetwork. Get a list of available subnetworks list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionSubnetwork): Request[Subnetwork]
  /** Creates a subnetwork in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKey): Request[Operation]
  /** Retrieves a list of subnetworks available to the specified project. */
  def list(request: Anon_AltFieldsFilter): Request[SubnetworkList]
  /** Set whether VMs in this subnet can access Google services without assigning external IP addresses through Private Google Access. */
  def setPrivateIpGoogleAccess(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork): Request[Operation]
}

object SubnetworksResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[SubnetworkAggregatedList],
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork => Request[Operation],
    expandIpCidrRange: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionSubnetwork => Request[Subnetwork],
    insert: Anon_AltFieldsKey => Request[Operation],
    list: Anon_AltFieldsFilter => Request[SubnetworkList],
    setPrivateIpGoogleAccess: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork => Request[Operation]
  ): SubnetworksResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), expandIpCidrRange = js.Any.fromFunction1(expandIpCidrRange), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setPrivateIpGoogleAccess = js.Any.fromFunction1(setPrivateIpGoogleAccess))
  
    __obj.asInstanceOf[SubnetworksResource]
  }
}

