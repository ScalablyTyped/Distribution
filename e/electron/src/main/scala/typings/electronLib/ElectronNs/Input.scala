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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("alt")(alt)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("control")(control)
    __obj.updateDynamic("isAutoRepeat")(isAutoRepeat)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("shift")(shift)
    __obj.asInstanceOf[Input]
  }
}

