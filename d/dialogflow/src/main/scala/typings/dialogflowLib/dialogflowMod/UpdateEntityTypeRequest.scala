package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEntityTypeRequest extends js.Object {
  var entityType: EntityType
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  /** @link https://github.com/google/protobuf/blob/master/src/google/protobuf/field_mask.proto */
  var updateMask: js.UndefOr[js.Any] = js.undefined
}

object UpdateEntityTypeRequest {
  @scala.inline
  def apply(entityType: EntityType, languageCode: java.lang.String = null, updateMask: js.Any = null): UpdateEntityTypeRequest = {
    val __obj = js.Dynamic.literal(entityType = entityType)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask)
    __obj.asInstanceOf[UpdateEntityTypeRequest]
  }
}

