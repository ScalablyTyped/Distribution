package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworksResource extends js.Object {
  /** Adds a peering to the specified network. */
  def addPeering(request: gapiDotClientDotComputeLib.Anon_Network): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes the specified network. */
  def delete(request: gapiDotClientDotComputeLib.Anon_Network): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified network. Get a list of available networks by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_NetworkProject): gapiDotClientLib.gapiNs.clientNs.Request[Network]
  /** Creates a network in the specified project using the data included in the request. */
  def insert(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of networks available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[NetworkList]
  /** Patches the specified network with the data included in the request. */
  def patch(request: gapiDotClientDotComputeLib.Anon_Network): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Removes a peering from the specified network. */
  def removePeering(request: gapiDotClientDotComputeLib.Anon_Network): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Switches the network mode from auto subnet mode to custom subnet mode. */
  def switchToCustomMode(request: gapiDotClientDotComputeLib.Anon_Network): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

