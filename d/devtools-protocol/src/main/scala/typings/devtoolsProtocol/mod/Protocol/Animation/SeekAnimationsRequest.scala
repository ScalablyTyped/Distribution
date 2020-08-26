package typings.devtoolsProtocol.mod.Protocol.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeekAnimationsRequest extends js.Object {
  /**
    * List of animation ids to seek.
    */
  var animations: js.Array[String] = js.native
  /**
    * Set the current time of each animation.
    */
  var currentTime: Double = js.native
}

object SeekAnimationsRequest {
  @scala.inline
  def apply(animations: js.Array[String], currentTime: Double): SeekAnimationsRequest = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeekAnimationsRequest]
  }
  @scala.inline
  implicit class SeekAnimationsRequestOps[Self <: SeekAnimationsRequest] (val x: Self) extends AnyVal {
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
    def setAnimationsVarargs(value: String*): Self = this.set("animations", js.Array(value :_*))
    @scala.inline
    def setAnimations(value: js.Array[String]): Self = this.set("animations", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
  }
  
}

