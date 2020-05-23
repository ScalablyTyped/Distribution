package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.KeyNetwork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworksResource extends js.Object {
  /** Adds a peering to the specified network. */
  def addPeering(request: typings.gapiClientCompute.anon.Network): Request[Operation]
  /** Deletes the specified network. */
  def delete(request: typings.gapiClientCompute.anon.Network): Request[Operation]
  /** Returns the specified network. Get a list of available networks by making a list() request. */
  def get(request: KeyNetwork): Request[Network]
  /** Creates a network in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of networks available to the specified project. */
  def list(request: Alt): Request[NetworkList]
  /** Patches the specified network with the data included in the request. */
  def patch(request: typings.gapiClientCompute.anon.Network): Request[Operation]
  /** Removes a peering from the specified network. */
  def removePeering(request: typings.gapiClientCompute.anon.Network): Request[Operation]
  /** Switches the network mode from auto subnet mode to custom subnet mode. */
  def switchToCustomMode(request: typings.gapiClientCompute.anon.Network): Request[Operation]
}

object NetworksResource {
  @scala.inline
  def apply(
    addPeering: typings.gapiClientCompute.anon.Network => Request[Operation],
    delete: typings.gapiClientCompute.anon.Network => Request[Operation],
    get: KeyNetwork => Request[Network],
    insert: AltFields => Request[Operation],
    list: Alt => Request[NetworkList],
    patch: typings.gapiClientCompute.anon.Network => Request[Operation],
    removePeering: typings.gapiClientCompute.anon.Network => Request[Operation],
    switchToCustomMode: typings.gapiClientCompute.anon.Network => Request[Operation]
  ): NetworksResource = {
    val __obj = js.Dynamic.literal(addPeering = js.Any.fromFunction1(addPeering), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), removePeering = js.Any.fromFunction1(removePeering), switchToCustomMode = js.Any.fromFunction1(switchToCustomMode))
    __obj.asInstanceOf[NetworksResource]
  }
}

