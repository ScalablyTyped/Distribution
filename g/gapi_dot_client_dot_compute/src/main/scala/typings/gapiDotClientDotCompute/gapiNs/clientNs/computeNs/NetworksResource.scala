package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyNetwork
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyNetworkOauthtoken
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworksResource extends js.Object {
  /** Adds a peering to the specified network. */
  def addPeering(request: Anon_AltFieldsKeyNetwork): Request[Operation]
  /** Deletes the specified network. */
  def delete(request: Anon_AltFieldsKeyNetwork): Request[Operation]
  /** Returns the specified network. Get a list of available networks by making a list() request. */
  def get(request: Anon_AltFieldsKeyNetworkOauthtoken): Request[Network]
  /** Creates a network in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves the list of networks available to the specified project. */
  def list(request: Anon_Alt): Request[NetworkList]
  /** Patches the specified network with the data included in the request. */
  def patch(request: Anon_AltFieldsKeyNetwork): Request[Operation]
  /** Removes a peering from the specified network. */
  def removePeering(request: Anon_AltFieldsKeyNetwork): Request[Operation]
  /** Switches the network mode from auto subnet mode to custom subnet mode. */
  def switchToCustomMode(request: Anon_AltFieldsKeyNetwork): Request[Operation]
}

object NetworksResource {
  @scala.inline
  def apply(
    addPeering: Anon_AltFieldsKeyNetwork => Request[Operation],
    delete: Anon_AltFieldsKeyNetwork => Request[Operation],
    get: Anon_AltFieldsKeyNetworkOauthtoken => Request[Network],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[NetworkList],
    patch: Anon_AltFieldsKeyNetwork => Request[Operation],
    removePeering: Anon_AltFieldsKeyNetwork => Request[Operation],
    switchToCustomMode: Anon_AltFieldsKeyNetwork => Request[Operation]
  ): NetworksResource = {
    val __obj = js.Dynamic.literal(addPeering = js.Any.fromFunction1(addPeering), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), removePeering = js.Any.fromFunction1(removePeering), switchToCustomMode = js.Any.fromFunction1(switchToCustomMode))
  
    __obj.asInstanceOf[NetworksResource]
  }
}

