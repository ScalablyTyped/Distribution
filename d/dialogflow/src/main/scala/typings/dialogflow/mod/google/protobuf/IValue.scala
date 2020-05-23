package typings.dialogflow.mod.google.protobuf

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
  var nullValue: js.UndefOr[
    NullValue | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.NullValue * / any */ String) | Null
  ] = js.undefined
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
    boolValue: js.UndefOr[Null | Boolean] = js.undefined,
    listValue: js.UndefOr[Null | IListValue] = js.undefined,
    nullValue: js.UndefOr[
      Null | NullValue | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.NullValue * / any */ String)
    ] = js.undefined,
    numberValue: js.UndefOr[Null | Double] = js.undefined,
    stringValue: js.UndefOr[Null | String] = js.undefined,
    structValue: js.UndefOr[Null | IStruct] = js.undefined
  ): IValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (!js.isUndefined(listValue)) __obj.updateDynamic("listValue")(listValue.asInstanceOf[js.Any])
    if (!js.isUndefined(nullValue)) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (!js.isUndefined(numberValue)) __obj.updateDynamic("numberValue")(numberValue.asInstanceOf[js.Any])
    if (!js.isUndefined(stringValue)) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    if (!js.isUndefined(structValue)) __obj.updateDynamic("structValue")(structValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValue]
  }
}

