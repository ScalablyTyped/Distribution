package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent

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
    defaultValue: js.UndefOr[Null | String] = js.undefined,
    displayName: js.UndefOr[Null | String] = js.undefined,
    entityTypeDisplayName: js.UndefOr[Null | String] = js.undefined,
    isList: js.UndefOr[Null | Boolean] = js.undefined,
    mandatory: js.UndefOr[Null | Boolean] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    prompts: js.UndefOr[Null | js.Array[String]] = js.undefined,
    value: js.UndefOr[Null | String] = js.undefined
  ): IParameter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(entityTypeDisplayName)) __obj.updateDynamic("entityTypeDisplayName")(entityTypeDisplayName.asInstanceOf[js.Any])
    if (!js.isUndefined(isList)) __obj.updateDynamic("isList")(isList.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(prompts)) __obj.updateDynamic("prompts")(prompts.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParameter]
  }
}

