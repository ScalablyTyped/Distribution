package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomJoinRequest extends js.Object {
  /** The capabilities that this client supports for realtime communication. */
  var capabilities: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Client address for the player joining the room. */
  var clientAddress: js.UndefOr[RoomClientAddress] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomJoinRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Network diagnostics for the client joining the room. */
  var networkDiagnostics: js.UndefOr[NetworkDiagnostics] = js.undefined
}

