package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeerSessionDiagnostics extends js.Object {
  /** Connected time in milliseconds. */
  var connectedTimestampMillis: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#peerSessionDiagnostics. */
  var kind: js.UndefOr[String] = js.native
  /** The participant ID of the peer. */
  var participantId: js.UndefOr[String] = js.native
  /** Reliable channel diagnostics. */
  var reliableChannel: js.UndefOr[PeerChannelDiagnostics] = js.native
  /** Unreliable channel diagnostics. */
  var unreliableChannel: js.UndefOr[PeerChannelDiagnostics] = js.native
}

object PeerSessionDiagnostics {
  @scala.inline
  def apply(): PeerSessionDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeerSessionDiagnostics]
  }
  @scala.inline
  implicit class PeerSessionDiagnosticsOps[Self <: PeerSessionDiagnostics] (val x: Self) extends AnyVal {
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
    def setConnectedTimestampMillis(value: String): Self = this.set("connectedTimestampMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectedTimestampMillis: Self = this.set("connectedTimestampMillis", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setParticipantId(value: String): Self = this.set("participantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParticipantId: Self = this.set("participantId", js.undefined)
    @scala.inline
    def setReliableChannel(value: PeerChannelDiagnostics): Self = this.set("reliableChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReliableChannel: Self = this.set("reliableChannel", js.undefined)
    @scala.inline
    def setUnreliableChannel(value: PeerChannelDiagnostics): Self = this.set("unreliableChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnreliableChannel: Self = this.set("unreliableChannel", js.undefined)
  }
  
}

