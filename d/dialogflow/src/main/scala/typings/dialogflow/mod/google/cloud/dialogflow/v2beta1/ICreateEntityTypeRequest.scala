package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CreateEntityTypeRequest. */
trait ICreateEntityTypeRequest extends js.Object {
  /** CreateEntityTypeRequest entityType */
  var entityType: js.UndefOr[IEntityType | Null] = js.undefined
  /** CreateEntityTypeRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** CreateEntityTypeRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object ICreateEntityTypeRequest {
  @scala.inline
  def apply(
    entityType: js.UndefOr[Null | IEntityType] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): ICreateEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entityType)) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateEntityTypeRequest]
  }
}

