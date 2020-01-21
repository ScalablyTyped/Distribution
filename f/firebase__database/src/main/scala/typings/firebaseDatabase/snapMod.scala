package typings.firebaseDatabase

import typings.firebaseDatabase.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/snap", JSImport.Namespace)
@js.native
object snapMod extends js.Object {
  def priorityHashText(priority: String): String = js.native
  def priorityHashText(priority: Double): String = js.native
  def setMaxNode(`val`: Node): Unit = js.native
  def validatePriorityNode(priorityNode: Node): Unit = js.native
}

