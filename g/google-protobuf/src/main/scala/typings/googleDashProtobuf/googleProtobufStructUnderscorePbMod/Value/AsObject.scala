package typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Value

import typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.NullValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var boolValue: Boolean
  var listValue: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValue.AsObject
  ] = js.undefined
  var nullValue: NullValue
  var numberValue: Double
  var stringValue: String
  var structValue: js.UndefOr[typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Struct.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    boolValue: Boolean,
    nullValue: NullValue,
    numberValue: Double,
    stringValue: String,
    listValue: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValue.AsObject = null,
    structValue: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Struct.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(boolValue = boolValue, nullValue = nullValue, numberValue = numberValue, stringValue = stringValue)
    if (listValue != null) __obj.updateDynamic("listValue")(listValue)
    if (structValue != null) __obj.updateDynamic("structValue")(structValue)
    __obj.asInstanceOf[AsObject]
  }
}

