package typings.dndCore.reducersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var dirtyHandlerIds: typings.dndCore.dirtyHandlerIdsMod.State
  var dragOffset: typings.dndCore.dragOffsetMod.State
  var dragOperation: typings.dndCore.dragOperationMod.State
  var refCount: typings.dndCore.refCountMod.State
  var stateId: typings.dndCore.stateIdMod.State
}

object State {
  @scala.inline
  def apply(
    dirtyHandlerIds: typings.dndCore.dirtyHandlerIdsMod.State,
    dragOffset: typings.dndCore.dragOffsetMod.State,
    dragOperation: typings.dndCore.dragOperationMod.State,
    refCount: typings.dndCore.refCountMod.State,
    stateId: typings.dndCore.stateIdMod.State
  ): State = {
    val __obj = js.Dynamic.literal(dirtyHandlerIds = dirtyHandlerIds.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], dragOperation = dragOperation.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], stateId = stateId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

