package typings.devtoolsProtocol.mod.Protocol.WebAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextRealtimeData extends js.Object {
  /**
    * A running mean of callback interval.
    */
  var callbackIntervalMean: Double = js.native
  /**
    * A running variance of callback interval.
    */
  var callbackIntervalVariance: Double = js.native
  /**
    * The current context time in second in BaseAudioContext.
    */
  var currentTime: Double = js.native
  /**
    * The time spent on rendering graph divided by render qunatum duration,
    * and multiplied by 100. 100 means the audio renderer reached the full
    * capacity and glitch may occur.
    */
  var renderCapacity: Double = js.native
}

object ContextRealtimeData {
  @scala.inline
  def apply(
    callbackIntervalMean: Double,
    callbackIntervalVariance: Double,
    currentTime: Double,
    renderCapacity: Double
  ): ContextRealtimeData = {
    val __obj = js.Dynamic.literal(callbackIntervalMean = callbackIntervalMean.asInstanceOf[js.Any], callbackIntervalVariance = callbackIntervalVariance.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], renderCapacity = renderCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextRealtimeData]
  }
  @scala.inline
  implicit class ContextRealtimeDataOps[Self <: ContextRealtimeData] (val x: Self) extends AnyVal {
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
    def setCallbackIntervalMean(value: Double): Self = this.set("callbackIntervalMean", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackIntervalVariance(value: Double): Self = this.set("callbackIntervalVariance", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderCapacity(value: Double): Self = this.set("renderCapacity", value.asInstanceOf[js.Any])
  }
  
}

