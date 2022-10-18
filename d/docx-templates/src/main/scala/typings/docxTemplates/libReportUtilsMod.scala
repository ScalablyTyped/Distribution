package typings.docxTemplates

import typings.docxTemplates.libTypesMod.Context
import typings.docxTemplates.libTypesMod.LoopStatus
import typings.docxTemplates.libTypesMod.Node
import typings.docxTemplates.libTypesMod.NonTextNode
import typings.docxTemplates.libTypesMod.TextNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReportUtilsMod {
  
  @JSImport("docx-templates/lib/reportUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addChild(parent: Node, child: Node): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("addChild")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def cloneNodeWithoutChildren(node: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneNodeWithoutChildren")(node.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  inline def getCurLoop(ctx: Context): LoopStatus | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurLoop")(ctx.asInstanceOf[js.Any]).asInstanceOf[LoopStatus | Null]
  
  inline def getNextSibling(node: Node): Node | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextSibling")(node.asInstanceOf[js.Any]).asInstanceOf[Node | Null]
  
  inline def insertTextSiblingAfter(textNode: TextNode): TextNode = ^.asInstanceOf[js.Dynamic].applyDynamic("insertTextSiblingAfter")(textNode.asInstanceOf[js.Any]).asInstanceOf[TextNode]
  
  inline def isLoopExploring(ctx: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoopExploring")(ctx.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def logLoop(loops: js.Array[LoopStatus]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logLoop")(loops.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def newNonTextNode(tag: String): NonTextNode = ^.asInstanceOf[js.Dynamic].applyDynamic("newNonTextNode")(tag.asInstanceOf[js.Any]).asInstanceOf[NonTextNode]
  inline def newNonTextNode(tag: String, attrs: js.Object): NonTextNode = (^.asInstanceOf[js.Dynamic].applyDynamic("newNonTextNode")(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[NonTextNode]
  inline def newNonTextNode(tag: String, attrs: js.Object, children: js.Array[Node]): NonTextNode = (^.asInstanceOf[js.Dynamic].applyDynamic("newNonTextNode")(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[NonTextNode]
  inline def newNonTextNode(tag: String, attrs: Unit, children: js.Array[Node]): NonTextNode = (^.asInstanceOf[js.Dynamic].applyDynamic("newNonTextNode")(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[NonTextNode]
  
  inline def newTextNode(text: String): TextNode = ^.asInstanceOf[js.Dynamic].applyDynamic("newTextNode")(text.asInstanceOf[js.Any]).asInstanceOf[TextNode]
}
