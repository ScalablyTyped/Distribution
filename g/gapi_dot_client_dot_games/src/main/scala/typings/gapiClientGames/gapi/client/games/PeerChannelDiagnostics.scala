package typings.gapiClientGames.gapi.client.games

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
    numMessagesLost: js.UndefOr[Double] = js.undefined,
    numMessagesReceived: js.UndefOr[Double] = js.undefined,
    numMessagesSent: js.UndefOr[Double] = js.undefined,
    numSendFailures: js.UndefOr[Double] = js.undefined,
    roundtripLatencyMillis: AggregateStats = null
  ): PeerChannelDiagnostics = {
    val __obj = js.Dynamic.literal()
    if (bytesReceived != null) __obj.updateDynamic("bytesReceived")(bytesReceived.asInstanceOf[js.Any])
    if (bytesSent != null) __obj.updateDynamic("bytesSent")(bytesSent.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(numMessagesLost)) __obj.updateDynamic("numMessagesLost")(numMessagesLost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numMessagesReceived)) __obj.updateDynamic("numMessagesReceived")(numMessagesReceived.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numMessagesSent)) __obj.updateDynamic("numMessagesSent")(numMessagesSent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numSendFailures)) __obj.updateDynamic("numSendFailures")(numSendFailures.get.asInstanceOf[js.Any])
    if (roundtripLatencyMillis != null) __obj.updateDynamic("roundtripLatencyMillis")(roundtripLatencyMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerChannelDiagnostics]
  }
}

