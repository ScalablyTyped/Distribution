package typings.ecmarkdown.distNodeTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkdown.distNodeTypesMod.StarNode
  - typings.ecmarkdown.distNodeTypesMod.UnderscoreNode
  - typings.ecmarkdown.distNodeTypesMod.TickNode
  - typings.ecmarkdown.distNodeTypesMod.TildeNode
  - typings.ecmarkdown.distNodeTypesMod.PipeNode
*/
trait FormatNode
  extends StObject
     with FragmentNode
object FormatNode {
  
  inline def PipeNode(contents: Null, location: LocationRange, nonTerminal: String, optional: Boolean, params: String): typings.ecmarkdown.distNodeTypesMod.PipeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "pipe", nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.PipeNode]
  }
  
  inline def StarNode(contents: js.Array[TextNode | CommentNode | TagNode], location: LocationRange): typings.ecmarkdown.distNodeTypesMod.StarNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "star")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.StarNode]
  }
  
  inline def TickNode(contents: js.Array[TextNode | CommentNode | TagNode], location: LocationRange): typings.ecmarkdown.distNodeTypesMod.TickNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tick")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.TickNode]
  }
  
  inline def TildeNode(contents: js.Array[TextNode | CommentNode | TagNode], location: LocationRange): typings.ecmarkdown.distNodeTypesMod.TildeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tilde")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.TildeNode]
  }
  
  inline def UnderscoreNode(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.UnderscoreNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "underscore")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.UnderscoreNode]
  }
}
