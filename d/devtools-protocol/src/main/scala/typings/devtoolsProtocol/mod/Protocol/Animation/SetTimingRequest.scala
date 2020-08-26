package typings.devtoolsProtocol.mod.Protocol.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTimingRequest extends js.Object {
  /**
    * Animation id.
    */
  var animationId: String = js.native
  /**
    * Delay of the animation.
    */
  var delay: Double = js.native
  /**
    * Duration of the animation.
    */
  var duration: Double = js.native
}

object SetTimingRequest {
  @scala.inline
  def apply(animationId: String, delay: Double, duration: Double): SetTimingRequest = {
    val __obj = js.Dynamic.literal(animationId = animationId.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimingRequest]
  }
  @scala.inline
  implicit class SetTimingRequestOps[Self <: SetTimingRequest] (val x: Self) extends AnyVal {
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
    def setAnimationId(value: String): Self = this.set("animationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
  }
  
}

