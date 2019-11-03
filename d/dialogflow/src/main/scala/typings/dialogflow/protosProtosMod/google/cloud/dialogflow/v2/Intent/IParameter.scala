package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Parameter. */
trait IParameter extends js.Object {
  /** Parameter defaultValue */
  var defaultValue: js.UndefOr[String | Null] = js.undefined
  /** Parameter displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  /** Parameter entityTypeDisplayName */
  var entityTypeDisplayName: js.UndefOr[String | Null] = js.undefined
  /** Parameter isList */
  var isList: js.UndefOr[Boolean | Null] = js.undefined
  /** Parameter mandatory */
  var mandatory: js.UndefOr[Boolean | Null] = js.undefined
  /** Parameter name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** Parameter prompts */
  var prompts: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** Parameter value */
  var value: js.UndefOr[String | Null] = js.undefined
}

object IParameter {
  @scala.inline
  def apply(
    defaultValue: String = null,
    displayName: String = null,
    entityTypeDisplayName: String = null,
    isList: js.UndefOr[Boolean] = js.undefined,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    prompts: js.Array[String] = null,
    value: String = null
  ): IParameter = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (entityTypeDisplayName != null) __obj.updateDynamic("entityTypeDisplayName")(entityTypeDisplayName)
    if (!js.isUndefined(isList)) __obj.updateDynamic("isList")(isList)
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prompts != null) __obj.updateDynamic("prompts")(prompts)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IParameter]
  }
}

