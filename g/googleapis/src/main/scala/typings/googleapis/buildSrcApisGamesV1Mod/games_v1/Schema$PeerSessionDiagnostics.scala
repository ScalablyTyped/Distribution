package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for peer session diagnostics.
  */
@js.native
trait Schema$PeerSessionDiagnostics extends js.Object {
  /**
    * Connected time in milliseconds.
    */
  var connectedTimestampMillis: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#peerSessionDiagnostics.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The participant ID of the peer.
    */
  var participantId: js.UndefOr[String] = js.native
  /**
    * Reliable channel diagnostics.
    */
  var reliableChannel: js.UndefOr[Schema$PeerChannelDiagnostics] = js.native
  /**
    * Unreliable channel diagnostics.
    */
  var unreliableChannel: js.UndefOr[Schema$PeerChannelDiagnostics] = js.native
}

object Schema$PeerSessionDiagnostics {
  @scala.inline
  def apply(
    connectedTimestampMillis: String = null,
    kind: String = null,
    participantId: String = null,
    reliableChannel: Schema$PeerChannelDiagnostics = null,
    unreliableChannel: Schema$PeerChannelDiagnostics = null
  ): Schema$PeerSessionDiagnostics = {
    val __obj = js.Dynamic.literal()
    if (connectedTimestampMillis != null) __obj.updateDynamic("connectedTimestampMillis")(connectedTimestampMillis.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (participantId != null) __obj.updateDynamic("participantId")(participantId.asInstanceOf[js.Any])
    if (reliableChannel != null) __obj.updateDynamic("reliableChannel")(reliableChannel.asInstanceOf[js.Any])
    if (unreliableChannel != null) __obj.updateDynamic("unreliableChannel")(unreliableChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PeerSessionDiagnostics]
  }
}

