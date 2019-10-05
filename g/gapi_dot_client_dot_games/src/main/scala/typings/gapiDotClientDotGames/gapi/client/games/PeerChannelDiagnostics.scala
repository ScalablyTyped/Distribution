package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerChannelDiagnostics extends js.Object {
  /** Number of bytes received. */
  var bytesReceived: js.UndefOr[AggregateStats] = js.undefined
  /** Number of bytes sent. */
  var bytesSent: js.UndefOr[AggregateStats] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#peerChannelDiagnostics. */
  var kind: js.UndefOr[String] = js.undefined
  /** Number of messages lost. */
  var numMessagesLost: js.UndefOr[Double] = js.undefined
  /** Number of messages received. */
  var numMessagesReceived: js.UndefOr[Double] = js.undefined
  /** Number of messages sent. */
  var numMessagesSent: js.UndefOr[Double] = js.undefined
  /** Number of send failures. */
  var numSendFailures: js.UndefOr[Double] = js.undefined
  /** Roundtrip latency stats in milliseconds. */
  var roundtripLatencyMillis: js.UndefOr[AggregateStats] = js.undefined
}

object PeerChannelDiagnostics {
  @scala.inline
  def apply(
    bytesReceived: AggregateStats = null,
    bytesSent: AggregateStats = null,
    kind: String = null,
    numMessagesLost: Int | Double = null,
    numMessagesReceived: Int | Double = null,
    numMessagesSent: Int | Double = null,
    numSendFailures: Int | Double = null,
    roundtripLatencyMillis: AggregateStats = null
  ): PeerChannelDiagnostics = {
    val __obj = js.Dynamic.literal()
    if (bytesReceived != null) __obj.updateDynamic("bytesReceived")(bytesReceived)
    if (bytesSent != null) __obj.updateDynamic("bytesSent")(bytesSent)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (numMessagesLost != null) __obj.updateDynamic("numMessagesLost")(numMessagesLost.asInstanceOf[js.Any])
    if (numMessagesReceived != null) __obj.updateDynamic("numMessagesReceived")(numMessagesReceived.asInstanceOf[js.Any])
    if (numMessagesSent != null) __obj.updateDynamic("numMessagesSent")(numMessagesSent.asInstanceOf[js.Any])
    if (numSendFailures != null) __obj.updateDynamic("numSendFailures")(numSendFailures.asInstanceOf[js.Any])
    if (roundtripLatencyMillis != null) __obj.updateDynamic("roundtripLatencyMillis")(roundtripLatencyMillis)
    __obj.asInstanceOf[PeerChannelDiagnostics]
  }
}

