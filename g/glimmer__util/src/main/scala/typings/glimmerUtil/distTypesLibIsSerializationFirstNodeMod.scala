package typings.glimmerUtil

import typings.simpleDomInterface.mod.SimpleNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibIsSerializationFirstNodeMod {
  
  @JSImport("@glimmer/util/dist/types/lib/is-serialization-first-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@glimmer/util/dist/types/lib/is-serialization-first-node", "SERIALIZATION_FIRST_NODE_STRING")
  @js.native
  val SERIALIZATION_FIRST_NODE_STRING: /* "%+b:0%" */ String = js.native
  
  inline def isSerializationFirstNode(node: SimpleNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSerializationFirstNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
