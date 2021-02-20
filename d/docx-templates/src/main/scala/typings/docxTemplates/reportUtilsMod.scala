package typings.docxTemplates

import typings.docxTemplates.typesMod.Context
import typings.docxTemplates.typesMod.LoopStatus
import typings.docxTemplates.typesMod.Node
import typings.docxTemplates.typesMod.NonTextNode
import typings.docxTemplates.typesMod.TextNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportUtilsMod {
  
  @JSImport("docx-templates/lib/reportUtils", "addChild")
  @js.native
  def addChild(parent: Node, child: Node): Node = js.native
  
  @JSImport("docx-templates/lib/reportUtils", "cloneNodeForLogging")
  @js.native
  def cloneNodeForLogging(node: Node): js.Object = js.native
  
  @JSImport("docx-templates/lib/reportUtils", "cloneNodeWithoutChildren")
  @js.native
  def cloneNodeWithoutChildren(node: Node): Node = js.native
  
  @JSImport("docx-templates/lib/reportUtils", "getCurLoop")
  @js.native
  def getCurLoop(ctx: Context): LoopStatus | Null = js.native
  
  @JSImport("docx-templates/lib/reportUtils", "getNextSibling")
  @js.native
  def getNextSibling(node: Node): Node | Null = js.native
  
  @JSImport("docx-templates/lib/reportUtils", "insertTextSiblingAfter")
  @js.native
  def insertTextSiblingAfter(textNode: TextNode): TextNode = js.native
  
  @JSImport("docx-templates/lib/reportUtils", "isLoopExploring")
  @js.native
  def isLoopExploring(ctx: Context): Boolean = js.native
  
  @JSImport("docx-templates/lib/reportUtils", "logLoop")
  @js.native
  def logLoop(loops: js.Array[LoopStatus]): Unit = js.native
  
  @JSImport("docx-templates/lib/reportUtils", "newNonTextNode")
  @js.native
  def newNonTextNode(tag: String): NonTextNode = js.native
  @JSImport("docx-templates/lib/reportUtils", "newNonTextNode")
  @js.native
  def newNonTextNode(tag: String, attrs: js.UndefOr[scala.Nothing], children: js.Array[Node]): NonTextNode = js.native
  @JSImport("docx-templates/lib/reportUtils", "newNonTextNode")
  @js.native
  def newNonTextNode(tag: String, attrs: js.Object): NonTextNode = js.native
  @JSImport("docx-templates/lib/reportUtils", "newNonTextNode")
  @js.native
  def newNonTextNode(tag: String, attrs: js.Object, children: js.Array[Node]): NonTextNode = js.native
  
  @JSImport("docx-templates/lib/reportUtils", "newTextNode")
  @js.native
  def newTextNode(text: String): TextNode = js.native
}
