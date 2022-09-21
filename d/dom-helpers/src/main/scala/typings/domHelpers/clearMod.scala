package typings.domHelpers

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clearMod {
  
  @JSImport("dom-helpers/cjs/clear", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Node | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Node | Null]
  inline def default(node: Node): Node | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Node | Null]
}
