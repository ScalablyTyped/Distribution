package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.protobuf.IFieldMask
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
  def apply(entityType: IEntityType = null, languageCode: String = null, updateMask: IFieldMask = null): IUpdateEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateEntityTypeRequest]
  }
}

