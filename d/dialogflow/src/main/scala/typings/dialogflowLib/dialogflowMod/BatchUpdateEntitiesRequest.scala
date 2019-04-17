package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateEntitiesRequest extends js.Object {
  var entities: js.Array[Entity]
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var parent: java.lang.String
  /** @link https://github.com/google/protobuf/blob/master/src/google/protobuf/field_mask.proto */
  var updateMask: js.UndefOr[js.Any] = js.undefined
}

object BatchUpdateEntitiesRequest {
  @scala.inline
  def apply(
    entities: js.Array[Entity],
    parent: java.lang.String,
    languageCode: java.lang.String = null,
    updateMask: js.Any = null
  ): BatchUpdateEntitiesRequest = {
    val __obj = js.Dynamic.literal(entities = entities, parent = parent)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask)
    __obj.asInstanceOf[BatchUpdateEntitiesRequest]
  }
}

