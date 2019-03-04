package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  /**
    * Equivalent to .
    */
  var alt: scala.Boolean
  /**
    * Equivalent to .
    */
  var code: java.lang.String
  /**
    * Equivalent to .
    */
  var control: scala.Boolean
  /**
    * Equivalent to .
    */
  var isAutoRepeat: scala.Boolean
  /**
    * Equivalent to .
    */
  var key: java.lang.String
  /**
    * Equivalent to .
    */
  var meta: scala.Boolean
  /**
    * Equivalent to .
    */
  var shift: scala.Boolean
  /**
    * Either keyUp or keyDown.
    */
  var `type`: java.lang.String
}

object Input {
  @scala.inline
  def apply(
    alt: scala.Boolean,
    code: java.lang.String,
    control: scala.Boolean,
    isAutoRepeat: scala.Boolean,
    key: java.lang.String,
    meta: scala.Boolean,
    shift: scala.Boolean,
    `type`: java.lang.String
  ): Input = {
    val __obj = js.Dynamic.literal(alt = alt, code = code, control = control, isAutoRepeat = isAutoRepeat, key = key, meta = meta, shift = shift)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Input]
  }
}

