package typings.dndCore.dirtyHandlerIdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirtyHandlerIdPayload extends js.Object {
  var prevTargetIds: js.Array[String] = js.native
  var targetIds: js.Array[String] = js.native
}

object DirtyHandlerIdPayload {
  @scala.inline
  def apply(prevTargetIds: js.Array[String], targetIds: js.Array[String]): DirtyHandlerIdPayload = {
    val __obj = js.Dynamic.literal(prevTargetIds = prevTargetIds.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirtyHandlerIdPayload]
  }
  @scala.inline
  implicit class DirtyHandlerIdPayloadOps[Self <: DirtyHandlerIdPayload] (val x: Self) extends AnyVal {
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
    def setPrevTargetIdsVarargs(value: String*): Self = this.set("prevTargetIds", js.Array(value :_*))
    @scala.inline
    def setPrevTargetIds(value: js.Array[String]): Self = this.set("prevTargetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetIdsVarargs(value: String*): Self = this.set("targetIds", js.Array(value :_*))
    @scala.inline
    def setTargetIds(value: js.Array[String]): Self = this.set("targetIds", value.asInstanceOf[js.Any])
  }
  
}

