package typings.dndDashCore.libReducersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var dirtyHandlerIds: typings.dndDashCore.libReducersDirtyHandlerIdsMod.State
  var dragOffset: typings.dndDashCore.libReducersDragOffsetMod.State
  var dragOperation: typings.dndDashCore.libReducersDragOperationMod.State
  var refCount: typings.dndDashCore.libReducersRefCountMod.State
  var stateId: typings.dndDashCore.libReducersStateIdMod.State
}

object State {
  @scala.inline
  def apply(
    dirtyHandlerIds: typings.dndDashCore.libReducersDirtyHandlerIdsMod.State,
    dragOffset: typings.dndDashCore.libReducersDragOffsetMod.State,
    dragOperation: typings.dndDashCore.libReducersDragOperationMod.State,
    refCount: typings.dndDashCore.libReducersRefCountMod.State,
    stateId: typings.dndDashCore.libReducersStateIdMod.State
  ): State = {
    val __obj = js.Dynamic.literal(dirtyHandlerIds = dirtyHandlerIds.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], dragOperation = dragOperation.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], stateId = stateId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

