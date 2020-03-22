package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonAlt
import typings.gapiClientGames.AnonLanguage
import typings.gapiClientGames.AnonQuotaUser
import typings.gapiClientGames.AnonRoomId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomsResource extends js.Object {
  /** Create a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def create(request: AnonLanguage): Request_[Room]
  /** Decline an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def decline(request: AnonQuotaUser): Request_[Room]
  /** Dismiss an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def dismiss(request: AnonRoomId): Request_[Unit]
  /** Get the data for a room. */
  def get(request: AnonQuotaUser): Request_[Room]
  /** Join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def join(request: AnonQuotaUser): Request_[Room]
  /** Leave a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def leave(request: AnonQuotaUser): Request_[Room]
  /** Returns invitations to join rooms. */
  def list(request: AnonAlt): Request_[RoomList]
  /** Updates sent by a client reporting the status of peers in a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def reportStatus(request: AnonQuotaUser): Request_[RoomStatus]
}

object RoomsResource {
  @scala.inline
  def apply(
    create: AnonLanguage => Request_[Room],
    decline: AnonQuotaUser => Request_[Room],
    dismiss: AnonRoomId => Request_[Unit],
    get: AnonQuotaUser => Request_[Room],
    join: AnonQuotaUser => Request_[Room],
    leave: AnonQuotaUser => Request_[Room],
    list: AnonAlt => Request_[RoomList],
    reportStatus: AnonQuotaUser => Request_[RoomStatus]
  ): RoomsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), decline = js.Any.fromFunction1(decline), dismiss = js.Any.fromFunction1(dismiss), get = js.Any.fromFunction1(get), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), list = js.Any.fromFunction1(list), reportStatus = js.Any.fromFunction1(reportStatus))
  
    __obj.asInstanceOf[RoomsResource]
  }
}

