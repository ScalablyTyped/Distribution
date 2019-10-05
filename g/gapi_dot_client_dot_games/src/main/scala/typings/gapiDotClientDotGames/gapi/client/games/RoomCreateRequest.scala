package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomCreateRequest extends js.Object {
  /** Criteria for auto-matching players into this room. */
  var autoMatchingCriteria: js.UndefOr[RoomAutoMatchingCriteria] = js.undefined
  /** The capabilities that this client supports for realtime communication. */
  var capabilities: js.UndefOr[js.Array[String]] = js.undefined
  /** Client address for the player creating the room. */
  var clientAddress: js.UndefOr[RoomClientAddress] = js.undefined
  /** The player IDs to invite to the room. */
  var invitedPlayerIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomCreateRequest. */
  var kind: js.UndefOr[String] = js.undefined
  /** Network diagnostics for the client creating the room. */
  var networkDiagnostics: js.UndefOr[NetworkDiagnostics] = js.undefined
  /** A randomly generated numeric ID. This number is used at the server to ensure that the request is handled correctly across retries. */
  var requestId: js.UndefOr[String] = js.undefined
  /**
    * The variant / mode of the application to be played. This can be any integer value, or left blank. You should use a small number of variants to keep the
    * auto-matching pool as large as possible.
    */
  var variant: js.UndefOr[Double] = js.undefined
}

object RoomCreateRequest {
  @scala.inline
  def apply(
    autoMatchingCriteria: RoomAutoMatchingCriteria = null,
    capabilities: js.Array[String] = null,
    clientAddress: RoomClientAddress = null,
    invitedPlayerIds: js.Array[String] = null,
    kind: String = null,
    networkDiagnostics: NetworkDiagnostics = null,
    requestId: String = null,
    variant: Int | Double = null
  ): RoomCreateRequest = {
    val __obj = js.Dynamic.literal()
    if (autoMatchingCriteria != null) __obj.updateDynamic("autoMatchingCriteria")(autoMatchingCriteria)
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (clientAddress != null) __obj.updateDynamic("clientAddress")(clientAddress)
    if (invitedPlayerIds != null) __obj.updateDynamic("invitedPlayerIds")(invitedPlayerIds)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (networkDiagnostics != null) __obj.updateDynamic("networkDiagnostics")(networkDiagnostics)
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomCreateRequest]
  }
}

