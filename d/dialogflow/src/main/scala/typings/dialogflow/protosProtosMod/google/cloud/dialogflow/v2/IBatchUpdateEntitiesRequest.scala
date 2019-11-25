package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType.IEntity
import typings.dialogflow.protosProtosMod.google.protobuf.IFieldMask
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
    entities: js.Array[IEntity] = null,
    languageCode: String = null,
    parent: String = null,
    updateMask: IFieldMask = null
  ): IBatchUpdateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchUpdateEntitiesRequest]
  }
}

