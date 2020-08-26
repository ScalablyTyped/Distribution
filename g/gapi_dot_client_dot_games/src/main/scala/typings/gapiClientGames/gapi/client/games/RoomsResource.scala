package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.Alt
import typings.gapiClientGames.anon.Language
import typings.gapiClientGames.anon.QuotaUser
import typings.gapiClientGames.anon.RoomId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomsResource extends js.Object {
  /** Create a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def create(request: Language): Request[Room] = js.native
  /** Decline an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def decline(request: QuotaUser): Request[Room] = js.native
  /** Dismiss an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def dismiss(request: RoomId): Request[Unit] = js.native
  /** Get the data for a room. */
  def get(request: QuotaUser): Request[Room] = js.native
  /** Join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def join(request: QuotaUser): Request[Room] = js.native
  /** Leave a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def leave(request: QuotaUser): Request[Room] = js.native
  /** Returns invitations to join rooms. */
  def list(request: Alt): Request[RoomList] = js.native
  /** Updates sent by a client reporting the status of peers in a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def reportStatus(request: QuotaUser): Request[RoomStatus] = js.native
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
  @scala.inline
  implicit class RoomsResourceOps[Self <: RoomsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Language => Request[Room]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDecline(value: QuotaUser => Request[Room]): Self = this.set("decline", js.Any.fromFunction1(value))
    @scala.inline
    def setDismiss(value: RoomId => Request[Unit]): Self = this.set("dismiss", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: QuotaUser => Request[Room]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setJoin(value: QuotaUser => Request[Room]): Self = this.set("join", js.Any.fromFunction1(value))
    @scala.inline
    def setLeave(value: QuotaUser => Request[Room]): Self = this.set("leave", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[RoomList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setReportStatus(value: QuotaUser => Request[RoomStatus]): Self = this.set("reportStatus", js.Any.fromFunction1(value))
  }
  
}

