package typings.devtoolsProtocol.mod.Protocol.WebAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAudioContext extends js.Object {
  /**
    * Platform-dependent callback buffer size.
    */
  var callbackBufferSize: Double = js.native
  var contextId: GraphObjectId = js.native
  var contextState: ContextState = js.native
  var contextType: ContextType = js.native
  /**
    * Number of output channels supported by audio hardware in use.
    */
  var maxOutputChannelCount: Double = js.native
  var realtimeData: js.UndefOr[ContextRealtimeData] = js.native
  /**
    * Context sample rate.
    */
  var sampleRate: Double = js.native
}

object BaseAudioContext {
  @scala.inline
  def apply(
    callbackBufferSize: Double,
    contextId: GraphObjectId,
    contextState: ContextState,
    contextType: ContextType,
    maxOutputChannelCount: Double,
    sampleRate: Double
  ): BaseAudioContext = {
    val __obj = js.Dynamic.literal(callbackBufferSize = callbackBufferSize.asInstanceOf[js.Any], contextId = contextId.asInstanceOf[js.Any], contextState = contextState.asInstanceOf[js.Any], contextType = contextType.asInstanceOf[js.Any], maxOutputChannelCount = maxOutputChannelCount.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAudioContext]
  }
  @scala.inline
  implicit class BaseAudioContextOps[Self <: BaseAudioContext] (val x: Self) extends AnyVal {
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
    def setCallbackBufferSize(value: Double): Self = this.set("callbackBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextId(value: GraphObjectId): Self = this.set("contextId", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextState(value: ContextState): Self = this.set("contextState", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextType(value: ContextType): Self = this.set("contextType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxOutputChannelCount(value: Double): Self = this.set("maxOutputChannelCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealtimeData(value: ContextRealtimeData): Self = this.set("realtimeData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealtimeData: Self = this.set("realtimeData", js.undefined)
  }
  
}

