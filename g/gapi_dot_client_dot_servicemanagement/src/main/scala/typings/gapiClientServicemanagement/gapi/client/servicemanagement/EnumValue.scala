package typings.gapiClientServicemanagement.gapi.client.servicemanagement

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
  def apply(name: String = null, number: js.UndefOr[Double] = js.undefined, options: js.Array[Option] = null): EnumValue = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValue]
  }
}

