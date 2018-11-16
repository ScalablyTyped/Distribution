package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PeerSessionDiagnostics extends js.Object {
  /** Connected time in milliseconds. */
  var connectedTimestampMillis: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#peerSessionDiagnostics. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The participant ID of the peer. */
  var participantId: js.UndefOr[java.lang.String] = js.undefined
  /** Reliable channel diagnostics. */
  var reliableChannel: js.UndefOr[PeerChannelDiagnostics] = js.undefined
  /** Unreliable channel diagnostics. */
  var unreliableChannel: js.UndefOr[PeerChannelDiagnostics] = js.undefined
}

