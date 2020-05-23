package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchCreateEntitiesRequest. */
trait IBatchCreateEntitiesRequest extends js.Object {
  /** BatchCreateEntitiesRequest entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.undefined
  /** BatchCreateEntitiesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** BatchCreateEntitiesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IBatchCreateEntitiesRequest {
  @scala.inline
  def apply(
    entities: js.UndefOr[Null | js.Array[IEntity]] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): IBatchCreateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entities)) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchCreateEntitiesRequest]
  }
}

