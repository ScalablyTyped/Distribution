package typings.ecmarkdown

import typings.ecmarkdown.distNodeTypesMod.AlgorithmNode
import typings.ecmarkdown.distNodeTypesMod.CommentNode
import typings.ecmarkdown.distNodeTypesMod.DoubleBracketsNode
import typings.ecmarkdown.distNodeTypesMod.Node
import typings.ecmarkdown.distNodeTypesMod.OpaqueTagNode
import typings.ecmarkdown.distNodeTypesMod.OrderedListItemNode
import typings.ecmarkdown.distNodeTypesMod.OrderedListNode
import typings.ecmarkdown.distNodeTypesMod.PipeNode
import typings.ecmarkdown.distNodeTypesMod.StarNode
import typings.ecmarkdown.distNodeTypesMod.TagNode
import typings.ecmarkdown.distNodeTypesMod.TextNode
import typings.ecmarkdown.distNodeTypesMod.TickNode
import typings.ecmarkdown.distNodeTypesMod.TildeNode
import typings.ecmarkdown.distNodeTypesMod.UnderscoreNode
import typings.ecmarkdown.distNodeTypesMod.UnorderedListItemNode
import typings.ecmarkdown.distNodeTypesMod.UnorderedListNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEmitterMod {
  
  @JSImport("ecmarkdown/dist/emitter", "Emitter")
  @js.native
  open class Emitter () extends StObject {
    
    def emit(node: js.Array[Node]): String = js.native
    def emit(node: Node): String = js.native
    
    def emitAlgorithm(algorithm: AlgorithmNode): Unit = js.native
    
    def emitFieldOrSlot(node: DoubleBracketsNode): Unit = js.native
    
    def emitFragment(fragment: js.Array[Node]): Unit = js.native
    
    def emitListItem(li: OrderedListItemNode): Unit = js.native
    def emitListItem(li: UnorderedListItemNode): Unit = js.native
    
    def emitNode(node: js.Array[Node]): Unit = js.native
    def emitNode(node: Node): Unit = js.native
    
    def emitOrderedList(ol: OrderedListNode): Unit = js.native
    
    def emitPipe(pipe: PipeNode): Unit = js.native
    
    def emitStar(node: StarNode): Unit = js.native
    
    def emitTag(tag: CommentNode): Unit = js.native
    def emitTag(tag: OpaqueTagNode): Unit = js.native
    def emitTag(tag: TagNode): Unit = js.native
    
    def emitText(text: TextNode): Unit = js.native
    
    def emitTick(node: TickNode): Unit = js.native
    
    def emitTilde(node: TildeNode): Unit = js.native
    
    def emitUnderscore(node: UnderscoreNode): Unit = js.native
    
    def emitUnorderedList(ul: UnorderedListNode): Unit = js.native
    
    var str: String = js.native
    
    def wrapFragment(tagName: String, fragment: js.Array[Node]): Unit = js.native
    def wrapFragment(tagName: String, fragment: js.Array[Node], attrs: String): Unit = js.native
  }
  /* static members */
  object Emitter {
    
    @JSImport("ecmarkdown/dist/emitter", "Emitter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def emit(node: js.Array[Node]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def emit(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
