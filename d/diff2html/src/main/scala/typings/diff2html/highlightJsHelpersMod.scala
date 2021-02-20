package typings.diff2html

import typings.diff2html.diff2htmlStrings.start
import typings.diff2html.diff2htmlStrings.stop
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightJsHelpersMod {
  
  @JSImport("diff2html/lib/ui/js/highlight.js-helpers", "mergeStreams")
  @js.native
  def mergeStreams(original: js.Array[NodeEvent], highlighted: js.Array[NodeEvent], value: String): String = js.native
  
  @JSImport("diff2html/lib/ui/js/highlight.js-helpers", "nodeStream")
  @js.native
  def nodeStream(node: Node): js.Array[NodeEvent] = js.native
  
  @js.native
  trait NodeEvent extends StObject {
    
    var event: start | stop = js.native
    
    var node: Node = js.native
    
    var offset: Double = js.native
  }
  object NodeEvent {
    
    @scala.inline
    def apply(event: start | stop, node: Node, offset: Double): NodeEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeEvent]
    }
    
    @scala.inline
    implicit class NodeEventMutableBuilder[Self <: NodeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: start | stop): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
