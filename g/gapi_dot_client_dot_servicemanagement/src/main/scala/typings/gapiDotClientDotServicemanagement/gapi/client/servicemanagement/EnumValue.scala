package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumValue extends js.Object {
  /** Enum value name. */
  var name: js.UndefOr[String] = js.undefined
  /** Enum value number. */
  var number: js.UndefOr[Double] = js.undefined
  /** Protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
}

object EnumValue {
  @scala.inline
  def apply(name: String = null, number: Int | Double = null, options: js.Array[Option] = null): EnumValue = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[EnumValue]
  }
}

