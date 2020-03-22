package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  /**
    * Equivalent to KeyboardEvent.altKey.
    */
  var alt: Boolean
  /**
    * Equivalent to KeyboardEvent.code.
    */
  var code: String
  /**
    * Equivalent to KeyboardEvent.controlKey.
    */
  var control: Boolean
  /**
    * Equivalent to KeyboardEvent.repeat.
    */
  var isAutoRepeat: Boolean
  /**
    * Equivalent to KeyboardEvent.key.
    */
  var key: String
  /**
    * Equivalent to KeyboardEvent.metaKey.
    */
  var meta: Boolean
  /**
    * Equivalent to KeyboardEvent.shiftKey.
    */
  var shift: Boolean
  /**
    * Either `keyUp` or `keyDown`.
    */
  var `type`: String
}

object Input {
  @scala.inline
  def apply(
    alt: Boolean,
    code: String,
    control: Boolean,
    isAutoRepeat: Boolean,
    key: String,
    meta: Boolean,
    shift: Boolean,
    `type`: String
  ): Input = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], isAutoRepeat = isAutoRepeat.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
}

