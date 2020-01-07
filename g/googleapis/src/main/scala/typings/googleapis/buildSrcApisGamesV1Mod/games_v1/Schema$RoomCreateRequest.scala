package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a room creation request.
  */
@js.native
trait Schema$RoomCreateRequest extends js.Object {
  /**
    * Criteria for auto-matching players into this room.
    */
  var autoMatchingCriteria: js.UndefOr[Schema$RoomAutoMatchingCriteria] = js.native
  /**
    * The capabilities that this client supports for realtime communication.
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  /**
    * Client address for the player creating the room.
    */
  var clientAddress: js.UndefOr[Schema$RoomClientAddress] = js.native
  /**
    * The player IDs to invite to the room.
    */
  var invitedPlayerIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomCreateRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Network diagnostics for the client creating the room.
    */
  var networkDiagnostics: js.UndefOr[Schema$NetworkDiagnostics] = js.native
  /**
    * A randomly generated numeric ID. This number is used at the server to
    * ensure that the request is handled correctly across retries.
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * The variant / mode of the application to be played. This can be any
    * integer value, or left blank. You should use a small number of variants
    * to keep the auto-matching pool as large as possible.
    */
  var variant: js.UndefOr[Double] = js.native
}

object Schema$RoomCreateRequest {
  @scala.inline
  def apply(
    autoMatchingCriteria: Schema$RoomAutoMatchingCriteria = null,
    capabilities: js.Array[String] = null,
    clientAddress: Schema$RoomClientAddress = null,
    invitedPlayerIds: js.Array[String] = null,
    kind: String = null,
    networkDiagnostics: Schema$NetworkDiagnostics = null,
    requestId: String = null,
    variant: Int | Double = null
  ): Schema$RoomCreateRequest = {
    val __obj = js.Dynamic.literal()
    if (autoMatchingCriteria != null) __obj.updateDynamic("autoMatchingCriteria")(autoMatchingCriteria.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (clientAddress != null) __obj.updateDynamic("clientAddress")(clientAddress.asInstanceOf[js.Any])
    if (invitedPlayerIds != null) __obj.updateDynamic("invitedPlayerIds")(invitedPlayerIds.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (networkDiagnostics != null) __obj.updateDynamic("networkDiagnostics")(networkDiagnostics.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RoomCreateRequest]
  }
}

