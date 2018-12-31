package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomModification extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomModification. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp at which they modified the room, in milliseconds since the epoch in UTC. */
  var modifiedTimestampMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the participant that modified the room. */
  var participantId: js.UndefOr[java.lang.String] = js.undefined
}

