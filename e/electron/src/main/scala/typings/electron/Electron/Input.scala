package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends js.Object {
  /**
    * Equivalent to KeyboardEvent.altKey.
    */
  var alt: Boolean = js.native
  /**
    * Equivalent to KeyboardEvent.code.
    */
  var code: String = js.native
  /**
    * Equivalent to KeyboardEvent.controlKey.
    */
  var control: Boolean = js.native
  /**
    * Equivalent to KeyboardEvent.repeat.
    */
  var isAutoRepeat: Boolean = js.native
  /**
    * Equivalent to KeyboardEvent.isComposing.
    */
  var isComposing: Boolean = js.native
  /**
    * Equivalent to KeyboardEvent.key.
    */
  var key: String = js.native
  /**
    * Equivalent to KeyboardEvent.metaKey.
    */
  var meta: Boolean = js.native
  /**
    * Equivalent to KeyboardEvent.shiftKey.
    */
  var shift: Boolean = js.native
  /**
    * Either `keyUp` or `keyDown`.
    */
  var `type`: String = js.native
}

object Input {
  @scala.inline
  def apply(
    alt: Boolean,
    code: String,
    control: Boolean,
    isAutoRepeat: Boolean,
    isComposing: Boolean,
    key: String,
    meta: Boolean,
    shift: Boolean,
    `type`: String
  ): Input = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], isAutoRepeat = isAutoRepeat.asInstanceOf[js.Any], isComposing = isComposing.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
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
    def setAlt(value: Boolean): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setControl(value: Boolean): Self = this.set("control", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAutoRepeat(value: Boolean): Self = this.set("isAutoRepeat", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsComposing(value: Boolean): Self = this.set("isComposing", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: Boolean): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift(value: Boolean): Self = this.set("shift", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

