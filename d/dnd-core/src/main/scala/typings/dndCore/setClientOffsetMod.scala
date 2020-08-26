package typings.dndCore

import typings.dndCore.interfacesMod.XYCoord
import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/dragDrop/local/setClientOffset", JSImport.Namespace)
@js.native
object setClientOffsetMod extends js.Object {
  def setClientOffset(): AnyAction = js.native
  def setClientOffset(clientOffset: js.UndefOr[scala.Nothing], sourceClientOffset: XYCoord): AnyAction = js.native
  def setClientOffset(clientOffset: Null, sourceClientOffset: XYCoord): AnyAction = js.native
  def setClientOffset(clientOffset: XYCoord): AnyAction = js.native
  def setClientOffset(clientOffset: XYCoord, sourceClientOffset: XYCoord): AnyAction = js.native
}

