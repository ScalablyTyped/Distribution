package typings.fbjs

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContainsNodeMod {
  
  inline def apply(): Boolean = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boolean]
  inline def apply(outerNode: Null, innerNode: Node): Boolean = (^.asInstanceOf[js.Dynamic].apply(outerNode.asInstanceOf[js.Any], innerNode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(outerNode: Node): Boolean = ^.asInstanceOf[js.Dynamic].apply(outerNode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(outerNode: Node, innerNode: Node): Boolean = (^.asInstanceOf[js.Dynamic].apply(outerNode.asInstanceOf[js.Any], innerNode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("fbjs/lib/containsNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
