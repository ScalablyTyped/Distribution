package typings.firebaseDatabase

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object priorityIndexMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/PriorityIndex", "PRIORITY_INDEX")
  @js.native
  val PRIORITY_INDEX: PriorityIndex = js.native
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/PriorityIndex", "PriorityIndex")
  @js.native
  class PriorityIndex () extends Index
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/PriorityIndex", "setMaxNode")
  @js.native
  def setMaxNode(`val`: Node): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/PriorityIndex", "setNodeFromJSON")
  @js.native
  def setNodeFromJSON(`val`: js.Function1[/* a */ js.Any, Node]): Unit = js.native
}
