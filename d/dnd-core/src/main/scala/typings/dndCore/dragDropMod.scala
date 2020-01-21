package typings.dndCore

import typings.dndCore.dndCoreStrings.`dnd-coreSlashBEGIN_DRAG`
import typings.dndCore.dndCoreStrings.`dnd-coreSlashDROP`
import typings.dndCore.dndCoreStrings.`dnd-coreSlashEND_DRAG`
import typings.dndCore.dndCoreStrings.`dnd-coreSlashHOVER`
import typings.dndCore.dndCoreStrings.`dnd-coreSlashINIT_COORDS`
import typings.dndCore.dndCoreStrings.`dnd-coreSlashPUBLISH_DRAG_SOURCE`
import typings.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/dragDrop", JSImport.Namespace)
@js.native
object dragDropMod extends js.Object {
  val BEGIN_DRAG: `dnd-coreSlashBEGIN_DRAG` = js.native
  val DROP: `dnd-coreSlashDROP` = js.native
  val END_DRAG: `dnd-coreSlashEND_DRAG` = js.native
  val HOVER: `dnd-coreSlashHOVER` = js.native
  val INIT_COORDS: `dnd-coreSlashINIT_COORDS` = js.native
  val PUBLISH_DRAG_SOURCE: `dnd-coreSlashPUBLISH_DRAG_SOURCE` = js.native
  def default(manager: DragDropManager): AnonBeginDrag = js.native
}

