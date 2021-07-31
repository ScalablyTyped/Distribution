package typings.firebaseDatabase

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object priorityIndexMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/PriorityIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/PriorityIndex", "PRIORITY_INDEX")
  @js.native
  val PRIORITY_INDEX: PriorityIndex = js.native
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/PriorityIndex", "PriorityIndex")
  @js.native
  class PriorityIndex () extends Index
  
  @scala.inline
  def setMaxNode(`val`: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxNode")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setNodeFromJSON(`val`: js.Function1[/* a */ js.Any, Node]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNodeFromJSON")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
