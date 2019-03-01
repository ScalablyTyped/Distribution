package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferSize extends js.Object {
  /**
    * The maximum size in bytes of the buffer used to store profiling data. A larger value allows capturing a
    * profile that covers a greater amount of time.
    */
  var bufferSize: scala.Double
  /** A list of active features for the profiler. */
  var features: js.Array[firefoxDashWebextDashBrowserLib.browserNs.geckoProfilerNs.ProfilerFeature]
  /**
    * Interval in milliseconds between samples of profiling data. A smaller value will increase the detail of the
    * profiles captured.
    */
  var interval: scala.Double
  /** A list of thread names for which to capture profiles. */
  var threads: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The length of the window of time that's kept in the buffer. Any collected samples are discarded as soon as
    * they are older than the number of seconds specified in this setting. Zero means no duration restriction.
    */
  var windowLength: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BufferSize {
  @scala.inline
  def apply(
    bufferSize: scala.Double,
    features: js.Array[firefoxDashWebextDashBrowserLib.browserNs.geckoProfilerNs.ProfilerFeature],
    interval: scala.Double,
    threads: js.Array[java.lang.String] = null,
    windowLength: scala.Int | scala.Double = null
  ): Anon_BufferSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bufferSize")(bufferSize)
    __obj.updateDynamic("features")(features)
    __obj.updateDynamic("interval")(interval)
    if (threads != null) __obj.updateDynamic("threads")(threads)
    if (windowLength != null) __obj.updateDynamic("windowLength")(windowLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BufferSize]
  }
}

