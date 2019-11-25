package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  /**
    * Equivalent to .
    */
  var alt: Boolean
  /**
    * Equivalent to .
    */
  var code: String
  /**
    * Equivalent to .
    */
  var control: Boolean
  /**
    * Equivalent to .
    */
  var isAutoRepeat: Boolean
  /**
    * Equivalent to .
    */
  var key: String
  /**
    * Equivalent to .
    */
  var meta: Boolean
  /**
    * Equivalent to .
    */
  var shift: Boolean
  /**
    * Either keyUp or keyDown.
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

