package typings.dndCore.dirtyHandlerIdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirtyHandlerIdPayload extends js.Object {
  var prevTargetIds: js.Array[String]
  var targetIds: js.Array[String]
}

object DirtyHandlerIdPayload {
  @scala.inline
  def apply(prevTargetIds: js.Array[String], targetIds: js.Array[String]): DirtyHandlerIdPayload = {
    val __obj = js.Dynamic.literal(prevTargetIds = prevTargetIds.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirtyHandlerIdPayload]
  }
}

