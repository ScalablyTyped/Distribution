package typings.docxTemplates

import typings.docxTemplates.typesMod.Context
import typings.docxTemplates.typesMod.LoopStatus
import typings.docxTemplates.typesMod.Node
import typings.docxTemplates.typesMod.NonTextNode
import typings.docxTemplates.typesMod.TextNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docx-templates/lib/reportUtils", JSImport.Namespace)
@js.native
object reportUtilsMod extends js.Object {
  
  def addChild(parent: Node, child: Node): Node = js.native
  
  def cloneNodeForLogging(node: Node): js.Object = js.native
  
  def cloneNodeWithoutChildren(node: Node): Node = js.native
  
  def getCurLoop(ctx: Context): LoopStatus | Null = js.native
  
  def getNextSibling(node: Node): Node | Null = js.native
  
  def insertTextSiblingAfter(textNode: TextNode): TextNode = js.native
  
  def isLoopExploring(ctx: Context): Boolean = js.native
  
  def logLoop(loops: js.Array[LoopStatus]): Unit = js.native
  
  def newNonTextNode(tag: String): NonTextNode = js.native
  def newNonTextNode(tag: String, attrs: js.UndefOr[scala.Nothing], children: js.Array[Node]): NonTextNode = js.native
  def newNonTextNode(tag: String, attrs: js.Object): NonTextNode = js.native
  def newNonTextNode(tag: String, attrs: js.Object, children: js.Array[Node]): NonTextNode = js.native
  
  def newTextNode(text: String): TextNode = js.native
}
