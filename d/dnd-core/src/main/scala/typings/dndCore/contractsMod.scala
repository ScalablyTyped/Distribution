package typings.dndCore

import typings.dndCore.interfacesMod.DragSource
import typings.dndCore.interfacesMod.DropTarget
import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/contracts", JSImport.Namespace)
@js.native
object contractsMod extends js.Object {
  def validateSourceContract(source: DragSource): Unit = js.native
  def validateTargetContract(target: DropTarget): Unit = js.native
  def validateType(`type`: js.Array[Identifier]): Unit = js.native
  def validateType(`type`: js.Array[Identifier], allowArray: Boolean): Unit = js.native
  def validateType(`type`: Identifier): Unit = js.native
  def validateType(`type`: Identifier, allowArray: Boolean): Unit = js.native
}

