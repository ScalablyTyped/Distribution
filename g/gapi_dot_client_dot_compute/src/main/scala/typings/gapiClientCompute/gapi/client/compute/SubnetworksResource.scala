package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonFilter
import typings.gapiClientCompute.AnonPrettyPrint
import typings.gapiClientCompute.AnonRegionSubnetwork
import typings.gapiClientCompute.AnonSubnetwork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetworksResource extends js.Object {
  /** Retrieves an aggregated list of subnetworks. */
  def aggregatedList(request: AnonAlt): Request_[SubnetworkAggregatedList]
  /** Deletes the specified subnetwork. */
  def delete(request: AnonSubnetwork): Request_[Operation]
  /** Expands the IP CIDR range of the subnetwork to a specified value. */
  def expandIpCidrRange(request: AnonSubnetwork): Request_[Operation]
  /** Returns the specified subnetwork. Get a list of available subnetworks list() request. */
  def get(request: AnonRegionSubnetwork): Request_[Subnetwork]
  /** Creates a subnetwork in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of subnetworks available to the specified project. */
  def list(request: AnonFilter): Request_[SubnetworkList]
  /** Set whether VMs in this subnet can access Google services without assigning external IP addresses through Private Google Access. */
  def setPrivateIpGoogleAccess(request: AnonSubnetwork): Request_[Operation]
}

object SubnetworksResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[SubnetworkAggregatedList],
    delete: AnonSubnetwork => Request_[Operation],
    expandIpCidrRange: AnonSubnetwork => Request_[Operation],
    get: AnonRegionSubnetwork => Request_[Subnetwork],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[SubnetworkList],
    setPrivateIpGoogleAccess: AnonSubnetwork => Request_[Operation]
  ): SubnetworksResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), expandIpCidrRange = js.Any.fromFunction1(expandIpCidrRange), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setPrivateIpGoogleAccess = js.Any.fromFunction1(setPrivateIpGoogleAccess))
  
    __obj.asInstanceOf[SubnetworksResource]
  }
}

