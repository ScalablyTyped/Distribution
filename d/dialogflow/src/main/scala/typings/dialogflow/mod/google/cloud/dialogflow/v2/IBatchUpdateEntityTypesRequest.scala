package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IFieldMask
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
    entityTypeBatchInline: js.UndefOr[Null | IEntityTypeBatch] = js.undefined,
    entityTypeBatchUri: js.UndefOr[Null | String] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined,
    updateMask: js.UndefOr[Null | IFieldMask] = js.undefined
  ): IBatchUpdateEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entityTypeBatchInline)) __obj.updateDynamic("entityTypeBatchInline")(entityTypeBatchInline.asInstanceOf[js.Any])
    if (!js.isUndefined(entityTypeBatchUri)) __obj.updateDynamic("entityTypeBatchUri")(entityTypeBatchUri.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(updateMask)) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchUpdateEntityTypesRequest]
  }
}

