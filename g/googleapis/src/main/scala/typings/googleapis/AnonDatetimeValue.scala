package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDatetimeValue extends js.Object {
  var boolValue: js.UndefOr[Boolean] = js.native
  var datetimeValue: js.UndefOr[String] = js.native
  var intValue: js.UndefOr[String] = js.native
  var msgValue: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  var name: js.UndefOr[String] = js.native
  var stringValue: js.UndefOr[String] = js.native
}

object AnonDatetimeValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    datetimeValue: String = null,
    intValue: String = null,
    msgValue: js.Array[StringDictionary[_]] = null,
    name: String = null,
    stringValue: String = null
  ): AnonDatetimeValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (datetimeValue != null) __obj.updateDynamic("datetimeValue")(datetimeValue.asInstanceOf[js.Any])
    if (intValue != null) __obj.updateDynamic("intValue")(intValue.asInstanceOf[js.Any])
    if (msgValue != null) __obj.updateDynamic("msgValue")(msgValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatetimeValue]
  }
}

