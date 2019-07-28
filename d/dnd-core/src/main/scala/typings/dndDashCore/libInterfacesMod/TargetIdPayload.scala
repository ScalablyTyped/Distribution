package typings.dndDashCore.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetIdPayload extends js.Object {
  var targetId: Identifier
}

object TargetIdPayload {
  @scala.inline
  def apply(targetId: Identifier): TargetIdPayload = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TargetIdPayload]
  }
}

