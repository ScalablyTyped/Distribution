package typings.devtoolsProtocol.mod.Protocol.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationStartedEvent extends js.Object {
  /**
    * Animation that was started.
    */
  var animation: typings.devtoolsProtocol.mod.Protocol.Animation.Animation = js.native
}

object AnimationStartedEvent {
  @scala.inline
  def apply(animation: typings.devtoolsProtocol.mod.Protocol.Animation.Animation): AnimationStartedEvent = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStartedEvent]
  }
  @scala.inline
  implicit class AnimationStartedEventOps[Self <: AnimationStartedEvent] (val x: Self) extends AnyVal {
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
    def setAnimation(value: typings.devtoolsProtocol.mod.Protocol.Animation.Animation): Self = this.set("animation", value.asInstanceOf[js.Any])
  }
  
}

