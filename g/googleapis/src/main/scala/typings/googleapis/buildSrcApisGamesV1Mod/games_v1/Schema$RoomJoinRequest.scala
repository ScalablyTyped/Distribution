package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a join room request.
  */
@js.native
trait Schema$RoomJoinRequest extends js.Object {
  /**
    * The capabilities that this client supports for realtime communication.
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  /**
    * Client address for the player joining the room.
    */
  var clientAddress: js.UndefOr[Schema$RoomClientAddress] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomJoinRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Network diagnostics for the client joining the room.
    */
  var networkDiagnostics: js.UndefOr[Schema$NetworkDiagnostics] = js.native
}

object Schema$RoomJoinRequest {
  @scala.inline
  def apply(
    capabilities: js.Array[String] = null,
    clientAddress: Schema$RoomClientAddress = null,
    kind: String = null,
    networkDiagnostics: Schema$NetworkDiagnostics = null
  ): Schema$RoomJoinRequest = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (clientAddress != null) __obj.updateDynamic("clientAddress")(clientAddress.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (networkDiagnostics != null) __obj.updateDynamic("networkDiagnostics")(networkDiagnostics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RoomJoinRequest]
  }
}

