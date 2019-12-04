package typings.dndDashCore

import typings.dndDashCore.libReducersDragOffsetMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DirtyHandlerIds extends js.Object {
  var dirtyHandlerIds: js.Array[String]
  var dragOffset: State
  var dragOperation: typings.dndDashCore.libReducersDragOperationMod.State
  var refCount: Double
  var stateId: Double
}

object Anon_DirtyHandlerIds {
  @scala.inline
  def apply(
    dirtyHandlerIds: js.Array[String],
    dragOffset: State,
    dragOperation: typings.dndDashCore.libReducersDragOperationMod.State,
    refCount: Double,
    stateId: Double
  ): Anon_DirtyHandlerIds = {
    val __obj = js.Dynamic.literal(dirtyHandlerIds = dirtyHandlerIds.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], dragOperation = dragOperation.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], stateId = stateId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DirtyHandlerIds]
  }
}

