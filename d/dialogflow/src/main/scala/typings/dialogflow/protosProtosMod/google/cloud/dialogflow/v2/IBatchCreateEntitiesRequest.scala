package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType.IEntity
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
  def apply(entities: js.Array[IEntity] = null, languageCode: String = null, parent: String = null): IBatchCreateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchCreateEntitiesRequest]
  }
}

