package typings.dndCore

import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/utils/matchesType", JSImport.Namespace)
@js.native
object matchesTypeMod extends js.Object {
  def matchesType(): Boolean = js.native
  def matchesType(targetType: js.Array[Identifier]): Boolean = js.native
  def matchesType(targetType: js.Array[Identifier], draggedItemType: Identifier): Boolean = js.native
  def matchesType(targetType: Null, draggedItemType: Identifier): Boolean = js.native
  def matchesType(targetType: Identifier): Boolean = js.native
  def matchesType(targetType: Identifier, draggedItemType: Identifier): Boolean = js.native
}

