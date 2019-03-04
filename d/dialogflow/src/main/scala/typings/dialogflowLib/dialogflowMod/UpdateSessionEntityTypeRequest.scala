package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSessionEntityTypeRequest extends js.Object {
  var sessionEntityType: SessionEntityType
  /** @link https://github.com/google/protobuf/blob/master/src/google/protobuf/field_mask.proto */
  var updateMask: js.Any
}

object UpdateSessionEntityTypeRequest {
  @scala.inline
  def apply(sessionEntityType: SessionEntityType, updateMask: js.Any): UpdateSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal(sessionEntityType = sessionEntityType, updateMask = updateMask)
  
    __obj.asInstanceOf[UpdateSessionEntityTypeRequest]
  }
}

