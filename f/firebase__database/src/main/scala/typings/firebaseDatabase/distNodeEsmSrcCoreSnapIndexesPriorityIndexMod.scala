package typings.firebaseDatabase

import typings.firebaseDatabase.distNodeEsmSrcCoreSnapIndexesIndexMod.Index
import typings.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreSnapIndexesPriorityIndexMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/snap/indexes/PriorityIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/snap/indexes/PriorityIndex", "PRIORITY_INDEX")
  @js.native
  val PRIORITY_INDEX: PriorityIndex = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/snap/indexes/PriorityIndex", "PriorityIndex")
  @js.native
  open class PriorityIndex () extends Index
  
  inline def setMaxNode(`val`: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxNode")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setNodeFromJSON(`val`: js.Function1[/* a */ Any, Node]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNodeFromJSON")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
