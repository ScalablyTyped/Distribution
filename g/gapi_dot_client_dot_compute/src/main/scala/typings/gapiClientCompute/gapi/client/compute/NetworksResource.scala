package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsKeyNetwork
import typings.gapiClientCompute.AnonAltFieldsKeyNetworkOauthtoken
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworksResource extends js.Object {
  /** Adds a peering to the specified network. */
  def addPeering(request: AnonAltFieldsKeyNetwork): Request_[Operation]
  /** Deletes the specified network. */
  def delete(request: AnonAltFieldsKeyNetwork): Request_[Operation]
  /** Returns the specified network. Get a list of available networks by making a list() request. */
  def get(request: AnonAltFieldsKeyNetworkOauthtoken): Request_[Network]
  /** Creates a network in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Retrieves the list of networks available to the specified project. */
  def list(request: AnonAlt): Request_[NetworkList]
  /** Patches the specified network with the data included in the request. */
  def patch(request: AnonAltFieldsKeyNetwork): Request_[Operation]
  /** Removes a peering from the specified network. */
  def removePeering(request: AnonAltFieldsKeyNetwork): Request_[Operation]
  /** Switches the network mode from auto subnet mode to custom subnet mode. */
  def switchToCustomMode(request: AnonAltFieldsKeyNetwork): Request_[Operation]
}

object NetworksResource {
  @scala.inline
  def apply(
    addPeering: AnonAltFieldsKeyNetwork => Request_[Operation],
    delete: AnonAltFieldsKeyNetwork => Request_[Operation],
    get: AnonAltFieldsKeyNetworkOauthtoken => Request_[Network],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    list: AnonAlt => Request_[NetworkList],
    patch: AnonAltFieldsKeyNetwork => Request_[Operation],
    removePeering: AnonAltFieldsKeyNetwork => Request_[Operation],
    switchToCustomMode: AnonAltFieldsKeyNetwork => Request_[Operation]
  ): NetworksResource = {
    val __obj = js.Dynamic.literal(addPeering = js.Any.fromFunction1(addPeering), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), removePeering = js.Any.fromFunction1(removePeering), switchToCustomMode = js.Any.fromFunction1(switchToCustomMode))
  
    __obj.asInstanceOf[NetworksResource]
  }
}

