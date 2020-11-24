package typings.firebaseDatabase

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/snap/indexes/PriorityIndex", JSImport.Namespace)
@js.native
object priorityIndexMod extends js.Object {
  
  val PRIORITY_INDEX: PriorityIndex = js.native
  
  def setMaxNode(`val`: Node): Unit = js.native
  
  def setNodeFromJSON(`val`: js.Function1[/* a */ js.Any, Node]): Unit = js.native
  
  @js.native
  class PriorityIndex () extends Index
}
