package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomP2PStatus extends js.Object {
  /** The amount of time in milliseconds it took to establish connections with this peer. */
  var connectionSetupLatencyMillis: js.UndefOr[Double] = js.native
  /**
    * The error code in event of a failure.
    * Possible values are:
    * - "P2P_FAILED" - The client failed to establish a P2P connection with the peer.
    * - "PRESENCE_FAILED" - The client failed to register to receive P2P connections.
    * - "RELAY_SERVER_FAILED" - The client received an error when trying to use the relay server to establish a P2P connection with the peer.
    */
  var error: js.UndefOr[String] = js.native
  /** More detailed diagnostic message returned in event of a failure. */
  var error_reason: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomP2PStatus. */
  var kind: js.UndefOr[String] = js.native
  /** The ID of the participant. */
  var participantId: js.UndefOr[String] = js.native
  /**
    * The status of the peer in the room.
    * Possible values are:
    * - "CONNECTION_ESTABLISHED" - The client established a P2P connection with the peer.
    * - "CONNECTION_FAILED" - The client failed to establish directed presence with the peer.
    */
  var status: js.UndefOr[String] = js.native
  /** The amount of time in milliseconds it took to send packets back and forth on the unreliable channel with this peer. */
  var unreliableRoundtripLatencyMillis: js.UndefOr[Double] = js.native
}

object RoomP2PStatus {
  @scala.inline
  def apply(): RoomP2PStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomP2PStatus]
  }
  @scala.inline
  implicit class RoomP2PStatusOps[Self <: RoomP2PStatus] (val x: Self) extends AnyVal {
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
    def setConnectionSetupLatencyMillis(value: Double): Self = this.set("connectionSetupLatencyMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionSetupLatencyMillis: Self = this.set("connectionSetupLatencyMillis", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setError_reason(value: String): Self = this.set("error_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_reason: Self = this.set("error_reason", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setParticipantId(value: String): Self = this.set("participantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParticipantId: Self = this.set("participantId", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUnreliableRoundtripLatencyMillis(value: Double): Self = this.set("unreliableRoundtripLatencyMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnreliableRoundtripLatencyMillis: Self = this.set("unreliableRoundtripLatencyMillis", js.undefined)
  }
  
}

