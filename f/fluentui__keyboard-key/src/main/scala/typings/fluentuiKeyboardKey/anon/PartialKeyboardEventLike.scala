package typings.fluentuiKeyboardKey.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@fluentui/keyboard-key.@fluentui/keyboard-key.KeyboardEventLike> */
@js.native
trait PartialKeyboardEventLike extends js.Object {
  var key: js.UndefOr[String] = js.native
  var keyCode: js.UndefOr[Double] = js.native
  var shiftKey: js.UndefOr[Boolean] = js.native
  var which: js.UndefOr[Double] = js.native
}

object PartialKeyboardEventLike {
  @scala.inline
  def apply(): PartialKeyboardEventLike = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialKeyboardEventLike]
  }
  @scala.inline
  implicit class PartialKeyboardEventLikeOps[Self <: PartialKeyboardEventLike] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyCode(value: Double): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyCode: Self = this.set("keyCode", js.undefined)
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftKey: Self = this.set("shiftKey", js.undefined)
    @scala.inline
    def setWhich(value: Double): Self = this.set("which", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhich: Self = this.set("which", js.undefined)
  }
  
}

