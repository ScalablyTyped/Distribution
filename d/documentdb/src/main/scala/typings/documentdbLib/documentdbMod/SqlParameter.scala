package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlParameter extends js.Object {
  /** The name of the parameter. */
  var name: java.lang.String
  /** The value of the parameter. */
  var value: js.Any
}

object SqlParameter {
  @scala.inline
  def apply(name: java.lang.String, value: js.Any): SqlParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SqlParameter]
  }
}

