package typings.dndDashCore

import typings.dndDashCore.libInterfacesMod.Action
import typings.dndDashCore.libInterfacesMod.BeginDragOptions
import typings.dndDashCore.libInterfacesMod.BeginDragPayload
import typings.dndDashCore.libInterfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/dragDrop/beginDrag", JSImport.Namespace)
@js.native
object libActionsDragDropBeginDragMod extends js.Object {
  def default(manager: DragDropManager): js.Function2[
    /* sourceIds */ js.UndefOr[js.Array[String]], 
    /* options */ js.UndefOr[BeginDragOptions], 
    js.UndefOr[Action[BeginDragPayload]]
  ] = js.native
}

