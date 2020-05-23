package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.IEntity
import typings.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchUpdateEntitiesRequest. */
trait IBatchUpdateEntitiesRequest extends js.Object {
  /** BatchUpdateEntitiesRequest entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.undefined
  /** BatchUpdateEntitiesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** BatchUpdateEntitiesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  /** BatchUpdateEntitiesRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IBatchUpdateEntitiesRequest {
  @scala.inline
  def apply(
    entities: js.UndefOr[Null | js.Array[IEntity]] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined,
    updateMask: js.UndefOr[Null | IFieldMask] = js.undefined
  ): IBatchUpdateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entities)) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(updateMask)) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchUpdateEntitiesRequest]
  }
}

