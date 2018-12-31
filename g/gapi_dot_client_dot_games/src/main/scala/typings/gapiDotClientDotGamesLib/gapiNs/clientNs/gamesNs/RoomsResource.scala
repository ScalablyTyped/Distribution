package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomsResource extends js.Object {
  /** Create a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def create(request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenPrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Room]
  /** Decline an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def decline(request: gapiDotClientDotGamesLib.Anon_RoomId): gapiDotClientLib.gapiNs.clientNs.Request[Room]
  /** Dismiss an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def dismiss(request: gapiDotClientDotGamesLib.Anon_RoomIdConsistencyToken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Get the data for a room. */
  def get(request: gapiDotClientDotGamesLib.Anon_RoomId): gapiDotClientLib.gapiNs.clientNs.Request[Room]
  /** Join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def join(request: gapiDotClientDotGamesLib.Anon_RoomId): gapiDotClientLib.gapiNs.clientNs.Request[Room]
  /** Leave a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def leave(request: gapiDotClientDotGamesLib.Anon_RoomId): gapiDotClientLib.gapiNs.clientNs.Request[Room]
  /** Returns invitations to join rooms. */
  def list(request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[RoomList]
  /** Updates sent by a client reporting the status of peers in a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def reportStatus(request: gapiDotClientDotGamesLib.Anon_RoomId): gapiDotClientLib.gapiNs.clientNs.Request[RoomStatus]
}

