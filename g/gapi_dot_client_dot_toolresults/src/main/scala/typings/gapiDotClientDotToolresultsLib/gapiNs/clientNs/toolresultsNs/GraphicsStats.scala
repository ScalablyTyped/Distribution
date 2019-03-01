package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsStats extends js.Object {
  /** Histogram of frame render times. There should be 154 buckets ranging from [5ms, 6ms) to [4950ms, infinity) */
  var buckets: js.UndefOr[js.Array[GraphicsStatsBucket]] = js.undefined
  /** Total "high input latency" events. */
  var highInputLatencyCount: js.UndefOr[java.lang.String] = js.undefined
  /** Total frames with slow render time. Should be <= total_frames. */
  var jankyFrames: js.UndefOr[java.lang.String] = js.undefined
  /** Total "missed vsync" events. */
  var missedVsyncCount: js.UndefOr[java.lang.String] = js.undefined
  /** 50th percentile frame render time in milliseconds. */
  var p50Millis: js.UndefOr[java.lang.String] = js.undefined
  /** 90th percentile frame render time in milliseconds. */
  var p90Millis: js.UndefOr[java.lang.String] = js.undefined
  /** 95th percentile frame render time in milliseconds. */
  var p95Millis: js.UndefOr[java.lang.String] = js.undefined
  /** 99th percentile frame render time in milliseconds. */
  var p99Millis: js.UndefOr[java.lang.String] = js.undefined
  /** Total "slow bitmap upload" events. */
  var slowBitmapUploadCount: js.UndefOr[java.lang.String] = js.undefined
  /** Total "slow draw" events. */
  var slowDrawCount: js.UndefOr[java.lang.String] = js.undefined
  /** Total "slow UI thread" events. */
  var slowUiThreadCount: js.UndefOr[java.lang.String] = js.undefined
  /** Total frames rendered by package. */
  var totalFrames: js.UndefOr[java.lang.String] = js.undefined
}

object GraphicsStats {
  @scala.inline
  def apply(
    buckets: js.Array[GraphicsStatsBucket] = null,
    highInputLatencyCount: java.lang.String = null,
    jankyFrames: java.lang.String = null,
    missedVsyncCount: java.lang.String = null,
    p50Millis: java.lang.String = null,
    p90Millis: java.lang.String = null,
    p95Millis: java.lang.String = null,
    p99Millis: java.lang.String = null,
    slowBitmapUploadCount: java.lang.String = null,
    slowDrawCount: java.lang.String = null,
    slowUiThreadCount: java.lang.String = null,
    totalFrames: java.lang.String = null
  ): GraphicsStats = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets)
    if (highInputLatencyCount != null) __obj.updateDynamic("highInputLatencyCount")(highInputLatencyCount)
    if (jankyFrames != null) __obj.updateDynamic("jankyFrames")(jankyFrames)
    if (missedVsyncCount != null) __obj.updateDynamic("missedVsyncCount")(missedVsyncCount)
    if (p50Millis != null) __obj.updateDynamic("p50Millis")(p50Millis)
    if (p90Millis != null) __obj.updateDynamic("p90Millis")(p90Millis)
    if (p95Millis != null) __obj.updateDynamic("p95Millis")(p95Millis)
    if (p99Millis != null) __obj.updateDynamic("p99Millis")(p99Millis)
    if (slowBitmapUploadCount != null) __obj.updateDynamic("slowBitmapUploadCount")(slowBitmapUploadCount)
    if (slowDrawCount != null) __obj.updateDynamic("slowDrawCount")(slowDrawCount)
    if (slowUiThreadCount != null) __obj.updateDynamic("slowUiThreadCount")(slowUiThreadCount)
    if (totalFrames != null) __obj.updateDynamic("totalFrames")(totalFrames)
    __obj.asInstanceOf[GraphicsStats]
  }
}

