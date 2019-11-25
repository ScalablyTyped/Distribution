package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsStats extends js.Object {
  /** Histogram of frame render times. There should be 154 buckets ranging from [5ms, 6ms) to [4950ms, infinity) */
  var buckets: js.UndefOr[js.Array[GraphicsStatsBucket]] = js.undefined
  /** Total "high input latency" events. */
  var highInputLatencyCount: js.UndefOr[String] = js.undefined
  /** Total frames with slow render time. Should be <= total_frames. */
  var jankyFrames: js.UndefOr[String] = js.undefined
  /** Total "missed vsync" events. */
  var missedVsyncCount: js.UndefOr[String] = js.undefined
  /** 50th percentile frame render time in milliseconds. */
  var p50Millis: js.UndefOr[String] = js.undefined
  /** 90th percentile frame render time in milliseconds. */
  var p90Millis: js.UndefOr[String] = js.undefined
  /** 95th percentile frame render time in milliseconds. */
  var p95Millis: js.UndefOr[String] = js.undefined
  /** 99th percentile frame render time in milliseconds. */
  var p99Millis: js.UndefOr[String] = js.undefined
  /** Total "slow bitmap upload" events. */
  var slowBitmapUploadCount: js.UndefOr[String] = js.undefined
  /** Total "slow draw" events. */
  var slowDrawCount: js.UndefOr[String] = js.undefined
  /** Total "slow UI thread" events. */
  var slowUiThreadCount: js.UndefOr[String] = js.undefined
  /** Total frames rendered by package. */
  var totalFrames: js.UndefOr[String] = js.undefined
}

object GraphicsStats {
  @scala.inline
  def apply(
    buckets: js.Array[GraphicsStatsBucket] = null,
    highInputLatencyCount: String = null,
    jankyFrames: String = null,
    missedVsyncCount: String = null,
    p50Millis: String = null,
    p90Millis: String = null,
    p95Millis: String = null,
    p99Millis: String = null,
    slowBitmapUploadCount: String = null,
    slowDrawCount: String = null,
    slowUiThreadCount: String = null,
    totalFrames: String = null
  ): GraphicsStats = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    if (highInputLatencyCount != null) __obj.updateDynamic("highInputLatencyCount")(highInputLatencyCount.asInstanceOf[js.Any])
    if (jankyFrames != null) __obj.updateDynamic("jankyFrames")(jankyFrames.asInstanceOf[js.Any])
    if (missedVsyncCount != null) __obj.updateDynamic("missedVsyncCount")(missedVsyncCount.asInstanceOf[js.Any])
    if (p50Millis != null) __obj.updateDynamic("p50Millis")(p50Millis.asInstanceOf[js.Any])
    if (p90Millis != null) __obj.updateDynamic("p90Millis")(p90Millis.asInstanceOf[js.Any])
    if (p95Millis != null) __obj.updateDynamic("p95Millis")(p95Millis.asInstanceOf[js.Any])
    if (p99Millis != null) __obj.updateDynamic("p99Millis")(p99Millis.asInstanceOf[js.Any])
    if (slowBitmapUploadCount != null) __obj.updateDynamic("slowBitmapUploadCount")(slowBitmapUploadCount.asInstanceOf[js.Any])
    if (slowDrawCount != null) __obj.updateDynamic("slowDrawCount")(slowDrawCount.asInstanceOf[js.Any])
    if (slowUiThreadCount != null) __obj.updateDynamic("slowUiThreadCount")(slowUiThreadCount.asInstanceOf[js.Any])
    if (totalFrames != null) __obj.updateDynamic("totalFrames")(totalFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsStats]
  }
}

