package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PeerChannelDiagnostics extends js.Object {
  /** Number of bytes received. */
  var bytesReceived: js.UndefOr[AggregateStats] = js.undefined
  /** Number of bytes sent. */
  var bytesSent: js.UndefOr[AggregateStats] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#peerChannelDiagnostics. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Number of messages lost. */
  var numMessagesLost: js.UndefOr[scala.Double] = js.undefined
  /** Number of messages received. */
  var numMessagesReceived: js.UndefOr[scala.Double] = js.undefined
  /** Number of messages sent. */
  var numMessagesSent: js.UndefOr[scala.Double] = js.undefined
  /** Number of send failures. */
  var numSendFailures: js.UndefOr[scala.Double] = js.undefined
  /** Roundtrip latency stats in milliseconds. */
  var roundtripLatencyMillis: js.UndefOr[AggregateStats] = js.undefined
}

