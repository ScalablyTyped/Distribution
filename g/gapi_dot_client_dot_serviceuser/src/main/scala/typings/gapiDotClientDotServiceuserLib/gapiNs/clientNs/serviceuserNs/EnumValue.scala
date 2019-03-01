package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumValue extends js.Object {
  /** Enum value name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Enum value number. */
  var number: js.UndefOr[scala.Double] = js.undefined
  /** Protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
}

object EnumValue {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    number: scala.Int | scala.Double = null,
    options: js.Array[Option] = null
  ): EnumValue = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[EnumValue]
  }
}

