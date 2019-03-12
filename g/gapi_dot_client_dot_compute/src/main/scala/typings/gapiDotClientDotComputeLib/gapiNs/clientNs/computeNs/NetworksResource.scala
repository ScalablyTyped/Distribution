package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworksResource extends js.Object {
  /** Adds a peering to the specified network. */
  def addPeering(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes the specified network. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified network. Get a list of available networks by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetworkOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Network]
  /** Creates a network in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of networks available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[NetworkList]
  /** Patches the specified network with the data included in the request. */
  def patch(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Removes a peering from the specified network. */
  def removePeering(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Switches the network mode from auto subnet mode to custom subnet mode. */
  def switchToCustomMode(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object NetworksResource {
  @scala.inline
  def apply(
    addPeering: gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    delete: gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    get: gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetworkOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[Network],
    insert: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    list: gapiDotClientDotComputeLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[NetworkList],
    patch: gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    removePeering: gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    switchToCustomMode: gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork => gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  ): NetworksResource = {
    val __obj = js.Dynamic.literal(addPeering = js.Any.fromFunction1(addPeering), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), removePeering = js.Any.fromFunction1(removePeering), switchToCustomMode = js.Any.fromFunction1(switchToCustomMode))
  
    __obj.asInstanceOf[NetworksResource]
  }
}

