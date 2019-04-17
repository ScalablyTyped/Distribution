package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateEntityTypesRequest extends js.Object {
  var entityTypeBatchInline: js.UndefOr[EntityTypeBatch] = js.undefined
  // Union field entity_type_batch can be only one of the following:
  var entityTypeBatchUri: js.UndefOr[java.lang.String] = js.undefined
  // End of list of possible types for union field entity_type_batch.
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var parent: java.lang.String
  /** @link https://github.com/google/protobuf/blob/master/src/google/protobuf/field_mask.proto */
  var updateMask: js.UndefOr[js.Any] = js.undefined
}

object BatchUpdateEntityTypesRequest {
  @scala.inline
  def apply(
    parent: java.lang.String,
    entityTypeBatchInline: EntityTypeBatch = null,
    entityTypeBatchUri: java.lang.String = null,
    languageCode: java.lang.String = null,
    updateMask: js.Any = null
  ): BatchUpdateEntityTypesRequest = {
    val __obj = js.Dynamic.literal(parent = parent)
    if (entityTypeBatchInline != null) __obj.updateDynamic("entityTypeBatchInline")(entityTypeBatchInline)
    if (entityTypeBatchUri != null) __obj.updateDynamic("entityTypeBatchUri")(entityTypeBatchUri)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask)
    __obj.asInstanceOf[BatchUpdateEntityTypesRequest]
  }
}

