package typings.dialogflow.protosProtosMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Value. */
trait IValue extends js.Object {
  /** Value boolValue */
  var boolValue: js.UndefOr[Boolean | Null] = js.undefined
  /** Value listValue */
  var listValue: js.UndefOr[IListValue | Null] = js.undefined
  /** Value nullValue */
  var nullValue: js.UndefOr[NullValue | Null] = js.undefined
  /** Value numberValue */
  var numberValue: js.UndefOr[Double | Null] = js.undefined
  /** Value stringValue */
  var stringValue: js.UndefOr[String | Null] = js.undefined
  /** Value structValue */
  var structValue: js.UndefOr[IStruct | Null] = js.undefined
}

object IValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    listValue: IListValue = null,
    nullValue: NullValue = null,
    numberValue: Int | Double = null,
    stringValue: String = null,
    structValue: IStruct = null
  ): IValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (listValue != null) __obj.updateDynamic("listValue")(listValue.asInstanceOf[js.Any])
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (numberValue != null) __obj.updateDynamic("numberValue")(numberValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    if (structValue != null) __obj.updateDynamic("structValue")(structValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValue]
  }
}

