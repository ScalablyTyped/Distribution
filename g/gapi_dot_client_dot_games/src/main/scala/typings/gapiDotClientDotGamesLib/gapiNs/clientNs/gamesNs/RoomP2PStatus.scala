package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomP2PStatus extends js.Object {
  /** The amount of time in milliseconds it took to establish connections with this peer. */
  var connectionSetupLatencyMillis: js.UndefOr[scala.Double] = js.undefined
  /**
    * The error code in event of a failure.
    * Possible values are:
    * - "P2P_FAILED" - The client failed to establish a P2P connection with the peer.
    * - "PRESENCE_FAILED" - The client failed to register to receive P2P connections.
    * - "RELAY_SERVER_FAILED" - The client received an error when trying to use the relay server to establish a P2P connection with the peer.
    */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /** More detailed diagnostic message returned in event of a failure. */
  var error_reason: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomP2PStatus. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the participant. */
  var participantId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The status of the peer in the room.
    * Possible values are:
    * - "CONNECTION_ESTABLISHED" - The client established a P2P connection with the peer.
    * - "CONNECTION_FAILED" - The client failed to establish directed presence with the peer.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The amount of time in milliseconds it took to send packets back and forth on the unreliable channel with this peer. */
  var unreliableRoundtripLatencyMillis: js.UndefOr[scala.Double] = js.undefined
}

object RoomP2PStatus {
  @scala.inline
  def apply(
    connectionSetupLatencyMillis: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    error_reason: java.lang.String = null,
    kind: java.lang.String = null,
    participantId: java.lang.String = null,
    status: java.lang.String = null,
    unreliableRoundtripLatencyMillis: scala.Int | scala.Double = null
  ): RoomP2PStatus = {
    val __obj = js.Dynamic.literal()
    if (connectionSetupLatencyMillis != null) __obj.updateDynamic("connectionSetupLatencyMillis")(connectionSetupLatencyMillis.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (error_reason != null) __obj.updateDynamic("error_reason")(error_reason)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (participantId != null) __obj.updateDynamic("participantId")(participantId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (unreliableRoundtripLatencyMillis != null) __obj.updateDynamic("unreliableRoundtripLatencyMillis")(unreliableRoundtripLatencyMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomP2PStatus]
  }
}

