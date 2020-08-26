package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.geckoProfiler.ProfilerFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferSize extends js.Object {
  /**
    * The maximum size in bytes of the buffer used to store profiling data. A larger value allows capturing a
    * profile that covers a greater amount of time.
    */
  var bufferSize: Double = js.native
  /** A list of active features for the profiler. */
  var features: js.Array[ProfilerFeature] = js.native
  /**
    * Interval in milliseconds between samples of profiling data. A smaller value will increase the detail of the
    * profiles captured.
    */
  var interval: Double = js.native
  /** A list of thread names for which to capture profiles. */
  var threads: js.UndefOr[js.Array[String]] = js.native
  /**
    * The length of the window of time that's kept in the buffer. Any collected samples are discarded as soon as
    * they are older than the number of seconds specified in this setting. Zero means no duration restriction.
    */
  var windowLength: js.UndefOr[Double] = js.native
}

object BufferSize {
  @scala.inline
  def apply(bufferSize: Double, features: js.Array[ProfilerFeature], interval: Double): BufferSize = {
    val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferSize]
  }
  @scala.inline
  implicit class BufferSizeOps[Self <: BufferSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeaturesVarargs(value: ProfilerFeature*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[ProfilerFeature]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreadsVarargs(value: String*): Self = this.set("threads", js.Array(value :_*))
    @scala.inline
    def setThreads(value: js.Array[String]): Self = this.set("threads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreads: Self = this.set("threads", js.undefined)
    @scala.inline
    def setWindowLength(value: Double): Self = this.set("windowLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowLength: Self = this.set("windowLength", js.undefined)
  }
  
}

