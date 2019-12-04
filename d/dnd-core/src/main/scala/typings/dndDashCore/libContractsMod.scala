package typings.dndDashCore

import typings.dndDashCore.libInterfacesMod.DragSource
import typings.dndDashCore.libInterfacesMod.DropTarget
import typings.dndDashCore.libInterfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/contracts", JSImport.Namespace)
@js.native
object libContractsMod extends js.Object {
  def validateSourceContract(source: DragSource): Unit = js.native
  def validateTargetContract(target: DropTarget): Unit = js.native
  def validateType(`type`: js.Array[Identifier]): Unit = js.native
  def validateType(`type`: js.Array[Identifier], allowArray: Boolean): Unit = js.native
  def validateType(`type`: Identifier): Unit = js.native
  def validateType(`type`: Identifier, allowArray: Boolean): Unit = js.native
}

