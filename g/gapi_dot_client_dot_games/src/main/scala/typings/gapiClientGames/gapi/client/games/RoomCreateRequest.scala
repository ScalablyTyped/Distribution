package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomCreateRequest extends js.Object {
  /** Criteria for auto-matching players into this room. */
  var autoMatchingCriteria: js.UndefOr[RoomAutoMatchingCriteria] = js.native
  /** The capabilities that this client supports for realtime communication. */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  /** Client address for the player creating the room. */
  var clientAddress: js.UndefOr[RoomClientAddress] = js.native
  /** The player IDs to invite to the room. */
  var invitedPlayerIds: js.UndefOr[js.Array[String]] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomCreateRequest. */
  var kind: js.UndefOr[String] = js.native
  /** Network diagnostics for the client creating the room. */
  var networkDiagnostics: js.UndefOr[NetworkDiagnostics] = js.native
  /** A randomly generated numeric ID. This number is used at the server to ensure that the request is handled correctly across retries. */
  var requestId: js.UndefOr[String] = js.native
  /**
    * The variant / mode of the application to be played. This can be any integer value, or left blank. You should use a small number of variants to keep the
    * auto-matching pool as large as possible.
    */
  var variant: js.UndefOr[Double] = js.native
}

object RoomCreateRequest {
  @scala.inline
  def apply(): RoomCreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomCreateRequest]
  }
  @scala.inline
  implicit class RoomCreateRequestOps[Self <: RoomCreateRequest] (val x: Self) extends AnyVal {
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
    def setAutoMatchingCriteria(value: RoomAutoMatchingCriteria): Self = this.set("autoMatchingCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMatchingCriteria: Self = this.set("autoMatchingCriteria", js.undefined)
    @scala.inline
    def setCapabilitiesVarargs(value: String*): Self = this.set("capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: js.Array[String]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    @scala.inline
    def setClientAddress(value: RoomClientAddress): Self = this.set("clientAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientAddress: Self = this.set("clientAddress", js.undefined)
    @scala.inline
    def setInvitedPlayerIdsVarargs(value: String*): Self = this.set("invitedPlayerIds", js.Array(value :_*))
    @scala.inline
    def setInvitedPlayerIds(value: js.Array[String]): Self = this.set("invitedPlayerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedPlayerIds: Self = this.set("invitedPlayerIds", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNetworkDiagnostics(value: NetworkDiagnostics): Self = this.set("networkDiagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkDiagnostics: Self = this.set("networkDiagnostics", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    @scala.inline
    def setVariant(value: Double): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
  
}

