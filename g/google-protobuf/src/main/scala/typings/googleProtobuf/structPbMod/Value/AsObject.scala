package typings.googleProtobuf.structPbMod.Value

import typings.googleProtobuf.structPbMod.NullValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var boolValue: Boolean
  var listValue: js.UndefOr[typings.googleProtobuf.structPbMod.ListValue.AsObject] = js.undefined
  var nullValue: NullValue
  var numberValue: Double
  var stringValue: String
  var structValue: js.UndefOr[typings.googleProtobuf.structPbMod.Struct.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    boolValue: Boolean,
    nullValue: NullValue,
    numberValue: Double,
    stringValue: String,
    listValue: typings.googleProtobuf.structPbMod.ListValue.AsObject = null,
    structValue: typings.googleProtobuf.structPbMod.Struct.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(boolValue = boolValue.asInstanceOf[js.Any], nullValue = nullValue.asInstanceOf[js.Any], numberValue = numberValue.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    if (listValue != null) __obj.updateDynamic("listValue")(listValue.asInstanceOf[js.Any])
    if (structValue != null) __obj.updateDynamic("structValue")(structValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

