package typings.firebaseDatabase

import typings.firebaseDatabase.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/snap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def priorityHashText(priority: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("priorityHashText")(priority.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def priorityHashText(priority: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("priorityHashText")(priority.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def setMaxNode(`val`: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxNode")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def validatePriorityNode(priorityNode: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePriorityNode")(priorityNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
