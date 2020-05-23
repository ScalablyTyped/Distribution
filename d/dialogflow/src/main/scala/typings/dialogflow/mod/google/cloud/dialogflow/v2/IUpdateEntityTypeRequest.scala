package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateEntityTypeRequest. */
trait IUpdateEntityTypeRequest extends js.Object {
  /** UpdateEntityTypeRequest entityType */
  var entityType: js.UndefOr[IEntityType | Null] = js.undefined
  /** UpdateEntityTypeRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** UpdateEntityTypeRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IUpdateEntityTypeRequest {
  @scala.inline
  def apply(
    entityType: js.UndefOr[Null | IEntityType] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    updateMask: js.UndefOr[Null | IFieldMask] = js.undefined
  ): IUpdateEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entityType)) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(updateMask)) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateEntityTypeRequest]
  }
}

