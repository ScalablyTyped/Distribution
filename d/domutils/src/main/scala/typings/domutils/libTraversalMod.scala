package typings.domutils

import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.libNodeMod.ChildNode
import typings.domhandler.libNodeMod.ParentNode
import typings.domhandler.mod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTraversalMod {
  
  @JSImport("domutils/lib/traversal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAttributeValue(elem: Element, name: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValue")(elem.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getChildren(elem: AnyNode): js.Array[ChildNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Array[ChildNode]]
  
  inline def getName(elem: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getParent(elem: AnyNode): ParentNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(elem.asInstanceOf[js.Any]).asInstanceOf[ParentNode | Null]
  
  inline def getSiblings(elem: AnyNode): js.Array[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSiblings")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Array[AnyNode]]
  
  inline def hasAttrib(elem: Element, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAttrib")(elem.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def nextElementSibling(elem: AnyNode): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("nextElementSibling")(elem.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def prevElementSibling(elem: AnyNode): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("prevElementSibling")(elem.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
}
