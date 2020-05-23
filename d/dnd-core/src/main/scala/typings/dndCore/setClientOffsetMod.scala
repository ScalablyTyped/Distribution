package typings.dndCore

import typings.dndCore.anon.Payload
import typings.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/dragDrop/local/setClientOffset", JSImport.Namespace)
@js.native
object setClientOffsetMod extends js.Object {
  def setClientOffset(): Payload = js.native
  def setClientOffset(clientOffset: Null, sourceClientOffset: XYCoord): Payload = js.native
  def setClientOffset(clientOffset: XYCoord): Payload = js.native
  def setClientOffset(clientOffset: XYCoord, sourceClientOffset: XYCoord): Payload = js.native
}

