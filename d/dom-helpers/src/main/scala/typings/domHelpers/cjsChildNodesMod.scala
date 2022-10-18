package typings.domHelpers

import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsChildNodesMod {
  
  @JSImport("dom-helpers/cjs/childNodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[Node]]
  inline def default(node: Element): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
}
