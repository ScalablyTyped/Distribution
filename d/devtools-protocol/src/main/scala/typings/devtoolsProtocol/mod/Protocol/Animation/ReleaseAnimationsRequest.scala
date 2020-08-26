package typings.devtoolsProtocol.mod.Protocol.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseAnimationsRequest extends js.Object {
  /**
    * List of animation ids to seek.
    */
  var animations: js.Array[String] = js.native
}

object ReleaseAnimationsRequest {
  @scala.inline
  def apply(animations: js.Array[String]): ReleaseAnimationsRequest = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseAnimationsRequest]
  }
  @scala.inline
  implicit class ReleaseAnimationsRequestOps[Self <: ReleaseAnimationsRequest] (val x: Self) extends AnyVal {
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
  }
  
}

