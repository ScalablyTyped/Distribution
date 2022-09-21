package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkdown.nodeTypesMod.OpaqueTagNode
  - typings.ecmarkdown.nodeTypesMod.TagNode
  - typings.ecmarkdown.nodeTypesMod.CommentNode
  - typings.ecmarkdown.nodeTypesMod.AlgorithmNode
  - typings.ecmarkdown.nodeTypesMod.TextNode
  - typings.ecmarkdown.nodeTypesMod.StarNode
  - typings.ecmarkdown.nodeTypesMod.UnderscoreNode
  - typings.ecmarkdown.nodeTypesMod.TickNode
  - typings.ecmarkdown.nodeTypesMod.TildeNode
  - typings.ecmarkdown.nodeTypesMod.PipeNode
  - typings.ecmarkdown.nodeTypesMod.UnorderedListNode
  - typings.ecmarkdown.nodeTypesMod.OrderedListNode
  - typings.ecmarkdown.nodeTypesMod.UnorderedListItemNode
  - typings.ecmarkdown.nodeTypesMod.OrderedListItemNode
*/
trait Node extends StObject
object Node {
  
  inline def AlgorithmNode(contents: OrderedListNode, location: LocationRange): typings.ecmarkdown.nodeTypesMod.AlgorithmNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "algorithm")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.AlgorithmNode]
  }
  
  inline def CommentNode(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.CommentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "comment")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.CommentNode]
  }
  
  inline def OpaqueTagNode(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.OpaqueTagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "opaqueTag")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.OpaqueTagNode]
  }
  
  inline def OrderedListItemNode(attrs: js.Array[Key], contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.nodeTypesMod.OrderedListItemNode = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ordered-list-item", sublist = null)
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.OrderedListItemNode]
  }
  
  inline def OrderedListNode(contents: js.Array[OrderedListItemNode], indent: Double, location: LocationRange, start: Double): typings.ecmarkdown.nodeTypesMod.OrderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ol", start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.OrderedListNode]
  }
  
  inline def PipeNode(contents: Null, location: LocationRange, nonTerminal: String, optional: Boolean, params: String): typings.ecmarkdown.nodeTypesMod.PipeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "pipe", nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.PipeNode]
  }
  
  inline def StarNode(contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.nodeTypesMod.StarNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "star")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.StarNode]
  }
  
  inline def TagNode(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.TagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tag")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TagNode]
  }
  
  inline def TextNode(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.TextNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "text")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TextNode]
  }
  
  inline def TickNode(contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.nodeTypesMod.TickNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tick")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TickNode]
  }
  
  inline def TildeNode(contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.nodeTypesMod.TildeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tilde")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TildeNode]
  }
  
  inline def UnderscoreNode(contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.nodeTypesMod.UnderscoreNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "underscore")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.UnderscoreNode]
  }
  
  inline def UnorderedListItemNode(attrs: js.Array[Key], contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.nodeTypesMod.UnorderedListItemNode = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "unordered-list-item", sublist = null)
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.UnorderedListItemNode]
  }
  
  inline def UnorderedListNode(contents: js.Array[UnorderedListItemNode], indent: Double, location: LocationRange): typings.ecmarkdown.nodeTypesMod.UnorderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ul")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.UnorderedListNode]
  }
}
