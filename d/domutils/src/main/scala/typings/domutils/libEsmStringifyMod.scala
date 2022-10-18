package typings.domutils

import typings.domSerializer.mod.DomSerializerOptions
import typings.domhandler.libNodeMod.AnyNode
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmStringifyMod {
  
  @JSImport("domutils/lib/esm/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInnerHTML(node: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInnerHTML")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getInnerHTML(node: AnyNode, options: DomSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getInnerHTML")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getOuterHTML(node: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHTML")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getOuterHTML(node: AnyNode, options: DomSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHTML")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getOuterHTML(node: ArrayLike[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHTML")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getOuterHTML(node: ArrayLike[AnyNode], options: DomSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHTML")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getText(node: js.Array[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getText(node: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def innerText(node: js.Array[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("innerText")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def innerText(node: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("innerText")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def textContent(node: js.Array[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textContent")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def textContent(node: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textContent")(node.asInstanceOf[js.Any]).asInstanceOf[String]
}
