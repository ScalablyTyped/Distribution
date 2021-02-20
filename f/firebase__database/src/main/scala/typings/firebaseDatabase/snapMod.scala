package typings.firebaseDatabase

import typings.firebaseDatabase.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/snap", "priorityHashText")
  @js.native
  def priorityHashText(priority: String): String = js.native
  @JSImport("@firebase/database/dist/src/core/snap/snap", "priorityHashText")
  @js.native
  def priorityHashText(priority: Double): String = js.native
  
  @JSImport("@firebase/database/dist/src/core/snap/snap", "setMaxNode")
  @js.native
  def setMaxNode(`val`: Node): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/core/snap/snap", "validatePriorityNode")
  @js.native
  def validatePriorityNode(priorityNode: Node): Unit = js.native
}
