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
    addPeering: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetworkOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Network]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[NetworkList]
    ],
    patch: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    removePeering: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    switchToCustomMode: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyNetwork, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): NetworksResource = {
    val __obj = js.Dynamic.literal(addPeering = addPeering, delete = delete, get = get, insert = insert, list = list, patch = patch, removePeering = removePeering, switchToCustomMode = switchToCustomMode)
  
    __obj.asInstanceOf[NetworksResource]
  }
}

