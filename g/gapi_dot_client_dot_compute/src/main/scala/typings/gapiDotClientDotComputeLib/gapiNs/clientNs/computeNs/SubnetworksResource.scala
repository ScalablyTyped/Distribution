package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetworksResource extends js.Object {
  /** Retrieves an aggregated list of subnetworks. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[SubnetworkAggregatedList]
  /** Deletes the specified subnetwork. */
  def delete(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenSubnetwork): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Expands the IP CIDR range of the subnetwork to a specified value. */
  def expandIpCidrRange(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenSubnetwork): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified subnetwork. Get a list of available subnetworks list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenSubnetworkAlt
  ): gapiDotClientLib.gapiNs.clientNs.Request[Subnetwork]
  /** Creates a subnetwork in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of subnetworks available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_ProjectMaxResultsPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[SubnetworkList]
  /** Set whether VMs in this subnet can access Google services without assigning external IP addresses through Private Google Access. */
  def setPrivateIpGoogleAccess(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenSubnetwork): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

