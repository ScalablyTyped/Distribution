package typings.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetIdPayload extends js.Object {
  var targetId: Identifier = js.native
}

object TargetIdPayload {
  @scala.inline
  def apply(targetId: Identifier): TargetIdPayload = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetIdPayload]
  }
  @scala.inline
  implicit class TargetIdPayloadOps[Self <: TargetIdPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTargetId(value: Identifier): Self = this.set("targetId", value.asInstanceOf[js.Any])
  }
  
}

