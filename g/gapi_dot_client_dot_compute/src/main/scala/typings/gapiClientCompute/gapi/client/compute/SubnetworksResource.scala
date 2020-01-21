package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsFilter
import typings.gapiClientCompute.AnonAltFieldsKey
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionSubnetwork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetworksResource extends js.Object {
  /** Retrieves an aggregated list of subnetworks. */
  def aggregatedList(request: AnonAlt): Request_[SubnetworkAggregatedList]
  /** Deletes the specified subnetwork. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork): Request_[Operation]
  /** Expands the IP CIDR range of the subnetwork to a specified value. */
  def expandIpCidrRange(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork): Request_[Operation]
  /** Returns the specified subnetwork. Get a list of available subnetworks list() request. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionSubnetwork): Request_[Subnetwork]
  /** Creates a subnetwork in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKey): Request_[Operation]
  /** Retrieves a list of subnetworks available to the specified project. */
  def list(request: AnonAltFieldsFilter): Request_[SubnetworkList]
  /** Set whether VMs in this subnet can access Google services without assigning external IP addresses through Private Google Access. */
  def setPrivateIpGoogleAccess(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork): Request_[Operation]
}

object SubnetworksResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[SubnetworkAggregatedList],
    delete: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork => Request_[Operation],
    expandIpCidrRange: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork => Request_[Operation],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionSubnetwork => Request_[Subnetwork],
    insert: AnonAltFieldsKey => Request_[Operation],
    list: AnonAltFieldsFilter => Request_[SubnetworkList],
    setPrivateIpGoogleAccess: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdSubnetwork => Request_[Operation]
  ): SubnetworksResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), expandIpCidrRange = js.Any.fromFunction1(expandIpCidrRange), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setPrivateIpGoogleAccess = js.Any.fromFunction1(setPrivateIpGoogleAccess))
  
    __obj.asInstanceOf[SubnetworksResource]
  }
}

