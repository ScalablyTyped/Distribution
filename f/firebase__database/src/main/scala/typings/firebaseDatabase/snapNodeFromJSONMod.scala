package typings.firebaseDatabase

import typings.firebaseDatabase.snapNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapNodeFromJSONMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/nodeFromJSON", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nodeFromJSON(): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeFromJSON")().asInstanceOf[Node]
  inline def nodeFromJSON(json: Any): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def nodeFromJSON(json: Any, priority: Any): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeFromJSON")(json.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Node]
  inline def nodeFromJSON(json: Null, priority: Any): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeFromJSON")(json.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Node]
}
