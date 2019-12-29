package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/indexes/PriorityIndex", JSImport.Namespace)
@js.native
object distSrcCoreSnapIndexesPriorityIndexMod extends js.Object {
  @js.native
  class PriorityIndex () extends Index
  
  val PRIORITY_INDEX: PriorityIndex = js.native
  def setMaxNode(`val`: Node): Unit = js.native
  def setNodeFromJSON(`val`: js.Function1[/* a */ js.Any, Node]): Unit = js.native
}

