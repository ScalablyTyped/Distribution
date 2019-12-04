package typings.dndDashCore

import typings.dndDashCore.dndDashCoreStrings.`dnd-core/BEGIN_DRAG`
import typings.dndDashCore.dndDashCoreStrings.`dnd-core/DROP`
import typings.dndDashCore.dndDashCoreStrings.`dnd-core/END_DRAG`
import typings.dndDashCore.dndDashCoreStrings.`dnd-core/HOVER`
import typings.dndDashCore.dndDashCoreStrings.`dnd-core/INIT_COORDS`
import typings.dndDashCore.dndDashCoreStrings.`dnd-core/PUBLISH_DRAG_SOURCE`
import typings.dndDashCore.libInterfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/dragDrop", JSImport.Namespace)
@js.native
object libActionsDragDropMod extends js.Object {
  val BEGIN_DRAG: `dnd-core/BEGIN_DRAG` = js.native
  val DROP: `dnd-core/DROP` = js.native
  val END_DRAG: `dnd-core/END_DRAG` = js.native
  val HOVER: `dnd-core/HOVER` = js.native
  val INIT_COORDS: `dnd-core/INIT_COORDS` = js.native
  val PUBLISH_DRAG_SOURCE: `dnd-core/PUBLISH_DRAG_SOURCE` = js.native
  def default(manager: DragDropManager): Anon_BeginDrag = js.native
}

