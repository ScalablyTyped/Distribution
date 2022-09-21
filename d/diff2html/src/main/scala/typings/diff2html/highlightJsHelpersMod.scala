package typings.diff2html

import typings.diff2html.diff2htmlStrings.start
import typings.diff2html.diff2htmlStrings.stop
import typings.highlightJs.mod.HighlightResult
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightJsHelpersMod {
  
  @JSImport("diff2html/lib/ui/js/highlight.js-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closeTags(res: HighlightResult): HighlightResult = ^.asInstanceOf[js.Dynamic].applyDynamic("closeTags")(res.asInstanceOf[js.Any]).asInstanceOf[HighlightResult]
  
  inline def getLanguage(fileExtension: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")(fileExtension.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mergeStreams(original: js.Array[NodeEvent], highlighted: js.Array[NodeEvent], value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStreams")(original.asInstanceOf[js.Any], highlighted.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def nodeStream(node: Node): js.Array[NodeEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeStream")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[NodeEvent]]
  
  trait NodeEvent extends StObject {
    
    var event: start | stop
    
    var node: Node
    
    var offset: Double
  }
  object NodeEvent {
    
    inline def apply(event: start | stop, node: Node, offset: Double): NodeEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeEvent]
    }
    
    extension [Self <: NodeEvent](x: Self) {
      
      inline def setEvent(value: start | stop): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
