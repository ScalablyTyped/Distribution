package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneNodeMixin extends js.Object {
  var locked: Boolean = js.native
  var visible: Boolean = js.native
}

object SceneNodeMixin {
  @scala.inline
  def apply(locked: Boolean, visible: Boolean): SceneNodeMixin = {
    val __obj = js.Dynamic.literal(locked = locked.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneNodeMixin]
  }
  @scala.inline
  implicit class SceneNodeMixinOps[Self <: SceneNodeMixin] (val x: Self) extends AnyVal {
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
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

