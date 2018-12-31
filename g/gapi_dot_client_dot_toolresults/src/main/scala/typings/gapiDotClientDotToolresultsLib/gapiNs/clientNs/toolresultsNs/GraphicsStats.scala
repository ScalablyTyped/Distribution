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

