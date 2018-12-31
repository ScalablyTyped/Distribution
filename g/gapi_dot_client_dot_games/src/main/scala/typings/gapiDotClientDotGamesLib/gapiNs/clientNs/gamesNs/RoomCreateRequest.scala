package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomCreateRequest extends js.Object {
  /** Criteria for auto-matching players into this room. */
  var autoMatchingCriteria: js.UndefOr[RoomAutoMatchingCriteria] = js.undefined
  /** The capabilities that this client supports for realtime communication. */
  var capabilities: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Client address for the player creating the room. */
  var clientAddress: js.UndefOr[RoomClientAddress] = js.undefined
  /** The player IDs to invite to the room. */
  var invitedPlayerIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomCreateRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Network diagnostics for the client creating the room. */
  var networkDiagnostics: js.UndefOr[NetworkDiagnostics] = js.undefined
  /** A randomly generated numeric ID. This number is used at the server to ensure that the request is handled correctly across retries. */
  var requestId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The variant / mode of the application to be played. This can be any integer value, or left blank. You should use a small number of variants to keep the
    * auto-matching pool as large as possible.
    */
  var variant: js.UndefOr[scala.Double] = js.undefined
}

