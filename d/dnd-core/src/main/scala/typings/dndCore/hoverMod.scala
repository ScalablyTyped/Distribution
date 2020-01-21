package typings.dndCore

import typings.dndCore.interfacesMod.Action
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.HoverOptions
import typings.dndCore.interfacesMod.HoverPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/dragDrop/hover", JSImport.Namespace)
@js.native
object hoverMod extends js.Object {
  def default(manager: DragDropManager): js.Function2[
    /* targetIdsArg */ js.Array[String], 
    /* hasClientOffset */ js.UndefOr[HoverOptions], 
    Action[HoverPayload]
  ] = js.native
}

