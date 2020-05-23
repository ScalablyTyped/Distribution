package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.Alt
import typings.gapiClientGames.anon.Language
import typings.gapiClientGames.anon.QuotaUser
import typings.gapiClientGames.anon.RoomId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomsResource extends js.Object {
  /** Create a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def create(request: Language): Request[Room]
  /** Decline an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def decline(request: QuotaUser): Request[Room]
  /** Dismiss an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def dismiss(request: RoomId): Request[Unit]
  /** Get the data for a room. */
  def get(request: QuotaUser): Request[Room]
  /** Join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def join(request: QuotaUser): Request[Room]
  /** Leave a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def leave(request: QuotaUser): Request[Room]
  /** Returns invitations to join rooms. */
  def list(request: Alt): Request[RoomList]
  /** Updates sent by a client reporting the status of peers in a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def reportStatus(request: QuotaUser): Request[RoomStatus]
}

object RoomsResource {
  @scala.inline
  def apply(
    create: Language => Request[Room],
    decline: QuotaUser => Request[Room],
    dismiss: RoomId => Request[Unit],
    get: QuotaUser => Request[Room],
    join: QuotaUser => Request[Room],
    leave: QuotaUser => Request[Room],
    list: Alt => Request[RoomList],
    reportStatus: QuotaUser => Request[RoomStatus]
  ): RoomsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), decline = js.Any.fromFunction1(decline), dismiss = js.Any.fromFunction1(dismiss), get = js.Any.fromFunction1(get), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), list = js.Any.fromFunction1(list), reportStatus = js.Any.fromFunction1(reportStatus))
    __obj.asInstanceOf[RoomsResource]
  }
}

