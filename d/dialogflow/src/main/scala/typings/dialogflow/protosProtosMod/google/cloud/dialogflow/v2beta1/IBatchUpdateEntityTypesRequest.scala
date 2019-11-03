package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.protosProtosMod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchUpdateEntityTypesRequest. */
trait IBatchUpdateEntityTypesRequest extends js.Object {
  /** BatchUpdateEntityTypesRequest entityTypeBatchInline */
  var entityTypeBatchInline: js.UndefOr[IEntityTypeBatch | Null] = js.undefined
  /** BatchUpdateEntityTypesRequest entityTypeBatchUri */
  var entityTypeBatchUri: js.UndefOr[String | Null] = js.undefined
  /** BatchUpdateEntityTypesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** BatchUpdateEntityTypesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  /** BatchUpdateEntityTypesRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IBatchUpdateEntityTypesRequest {
  @scala.inline
  def apply(
    entityTypeBatchInline: IEntityTypeBatch = null,
    entityTypeBatchUri: String = null,
    languageCode: String = null,
    parent: String = null,
    updateMask: IFieldMask = null
  ): IBatchUpdateEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (entityTypeBatchInline != null) __obj.updateDynamic("entityTypeBatchInline")(entityTypeBatchInline)
    if (entityTypeBatchUri != null) __obj.updateDynamic("entityTypeBatchUri")(entityTypeBatchUri)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask)
    __obj.asInstanceOf[IBatchUpdateEntityTypesRequest]
  }
}

