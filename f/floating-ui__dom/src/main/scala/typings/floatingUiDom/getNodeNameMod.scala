package typings.floatingUiDom

import typings.floatingUiDom.isMod.global.Window
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNodeNameMod {
  
  @JSImport("@floating-ui/dom/src/utils/getNodeName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNodeName(node: Window): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeName")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getNodeName(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeName")(node.asInstanceOf[js.Any]).asInstanceOf[String]
}
