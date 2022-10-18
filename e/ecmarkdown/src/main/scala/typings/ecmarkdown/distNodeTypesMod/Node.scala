package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkdown.distNodeTypesMod.OpaqueTagNode
  - typings.ecmarkdown.distNodeTypesMod.TagNode
  - typings.ecmarkdown.distNodeTypesMod.CommentNode
  - typings.ecmarkdown.distNodeTypesMod.AlgorithmNode
  - typings.ecmarkdown.distNodeTypesMod.TextNode
  - typings.ecmarkdown.distNodeTypesMod.StarNode
  - typings.ecmarkdown.distNodeTypesMod.UnderscoreNode
  - typings.ecmarkdown.distNodeTypesMod.TickNode
  - typings.ecmarkdown.distNodeTypesMod.TildeNode
  - typings.ecmarkdown.distNodeTypesMod.PipeNode
  - typings.ecmarkdown.distNodeTypesMod.UnorderedListNode
  - typings.ecmarkdown.distNodeTypesMod.OrderedListNode
  - typings.ecmarkdown.distNodeTypesMod.UnorderedListItemNode
  - typings.ecmarkdown.distNodeTypesMod.OrderedListItemNode
*/
trait Node extends StObject
object Node {
  
  inline def AlgorithmNode(contents: OrderedListNode, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.AlgorithmNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "algorithm")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.AlgorithmNode]
  }
  
  inline def CommentNode(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.CommentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "comment")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.CommentNode]
  }
  
  inline def OpaqueTagNode(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.OpaqueTagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "opaqueTag")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.OpaqueTagNode]
  }
  
  inline def OrderedListItemNode(attrs: js.Array[Key], contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.distNodeTypesMod.OrderedListItemNode = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ordered-list-item", sublist = null)
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.OrderedListItemNode]
  }
  
  inline def OrderedListNode(contents: js.Array[OrderedListItemNode], indent: Double, location: LocationRange, start: Double): typings.ecmarkdown.distNodeTypesMod.OrderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ol", start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.OrderedListNode]
  }
  
  inline def PipeNode(contents: Null, location: LocationRange, nonTerminal: String, optional: Boolean, params: String): typings.ecmarkdown.distNodeTypesMod.PipeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "pipe", nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.PipeNode]
  }
  
  inline def StarNode(contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.distNodeTypesMod.StarNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "star")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.StarNode]
  }
  
  inline def TagNode(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.TagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tag")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.TagNode]
  }
  
  inline def TextNode(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.TextNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "text")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.TextNode]
  }
  
  inline def TickNode(contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.distNodeTypesMod.TickNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tick")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.TickNode]
  }
  
  inline def TildeNode(contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.distNodeTypesMod.TildeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tilde")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.TildeNode]
  }
  
  inline def UnderscoreNode(contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.distNodeTypesMod.UnderscoreNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "underscore")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.UnderscoreNode]
  }
  
  inline def UnorderedListItemNode(attrs: js.Array[Key], contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.distNodeTypesMod.UnorderedListItemNode = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "unordered-list-item", sublist = null)
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.UnorderedListItemNode]
  }
  
  inline def UnorderedListNode(contents: js.Array[UnorderedListItemNode], indent: Double, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.UnorderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ul")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.UnorderedListNode]
  }
}
