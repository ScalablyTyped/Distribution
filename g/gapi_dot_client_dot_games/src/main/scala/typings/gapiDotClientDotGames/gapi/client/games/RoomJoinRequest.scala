package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomJoinRequest extends js.Object {
  /** The capabilities that this client supports for realtime communication. */
  var capabilities: js.UndefOr[js.Array[String]] = js.undefined
  /** Client address for the player joining the room. */
  var clientAddress: js.UndefOr[RoomClientAddress] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomJoinRequest. */
  var kind: js.UndefOr[String] = js.undefined
  /** Network diagnostics for the client joining the room. */
  var networkDiagnostics: js.UndefOr[NetworkDiagnostics] = js.undefined
}

object RoomJoinRequest {
  @scala.inline
  def apply(
    capabilities: js.Array[String] = null,
    clientAddress: RoomClientAddress = null,
    kind: String = null,
    networkDiagnostics: NetworkDiagnostics = null
  ): RoomJoinRequest = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (clientAddress != null) __obj.updateDynamic("clientAddress")(clientAddress)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (networkDiagnostics != null) __obj.updateDynamic("networkDiagnostics")(networkDiagnostics)
    __obj.asInstanceOf[RoomJoinRequest]
  }
}

