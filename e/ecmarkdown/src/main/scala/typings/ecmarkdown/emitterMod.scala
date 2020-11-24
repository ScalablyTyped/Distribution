package typings.ecmarkdown

import typings.ecmarkdown.nodeTypesMod.AlgorithmNode
import typings.ecmarkdown.nodeTypesMod.CommentNode
import typings.ecmarkdown.nodeTypesMod.Node
import typings.ecmarkdown.nodeTypesMod.OpaqueTagNode
import typings.ecmarkdown.nodeTypesMod.OrderedListItemNode
import typings.ecmarkdown.nodeTypesMod.OrderedListNode
import typings.ecmarkdown.nodeTypesMod.PipeNode
import typings.ecmarkdown.nodeTypesMod.StarNode
import typings.ecmarkdown.nodeTypesMod.TagNode
import typings.ecmarkdown.nodeTypesMod.TextNode
import typings.ecmarkdown.nodeTypesMod.TickNode
import typings.ecmarkdown.nodeTypesMod.TildeNode
import typings.ecmarkdown.nodeTypesMod.UnderscoreNode
import typings.ecmarkdown.nodeTypesMod.UnorderedListItemNode
import typings.ecmarkdown.nodeTypesMod.UnorderedListNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkdown/dist/emitter", JSImport.Namespace)
@js.native
object emitterMod extends js.Object {
  
  @js.native
  class Emitter () extends js.Object {
    
    def emit(node: js.Array[Node]): String = js.native
    def emit(node: Node): String = js.native
    
    def emitAlgorithm(algorithm: AlgorithmNode): Unit = js.native
    
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
    
    def wrapFragment(wrapping: String, fragment: js.Array[Node]): Unit = js.native
  }
  /* static members */
  @js.native
  object Emitter extends js.Object {
    
    def emit(node: js.Array[Node]): String = js.native
    def emit(node: Node): String = js.native
  }
}
