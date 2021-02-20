package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.`ordered-list-item`
import typings.ecmarkdown.ecmarkdownStrings.`unordered-list-item`
import typings.ecmarkdown.ecmarkdownStrings.algorithm
import typings.ecmarkdown.ecmarkdownStrings.comment
import typings.ecmarkdown.ecmarkdownStrings.ol
import typings.ecmarkdown.ecmarkdownStrings.opaqueTag
import typings.ecmarkdown.ecmarkdownStrings.pipe
import typings.ecmarkdown.ecmarkdownStrings.star
import typings.ecmarkdown.ecmarkdownStrings.tag
import typings.ecmarkdown.ecmarkdownStrings.text
import typings.ecmarkdown.ecmarkdownStrings.tick
import typings.ecmarkdown.ecmarkdownStrings.tilde
import typings.ecmarkdown.ecmarkdownStrings.ul
import typings.ecmarkdown.ecmarkdownStrings.underscore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def AlgorithmNode(contents: OrderedListNode, location: LocationRange, name: algorithm): typings.ecmarkdown.nodeTypesMod.AlgorithmNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.AlgorithmNode]
  }
  
  @scala.inline
  def CommentNode(contents: String, location: LocationRange, name: comment): typings.ecmarkdown.nodeTypesMod.CommentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.CommentNode]
  }
  
  @scala.inline
  def OpaqueTagNode(contents: String, location: LocationRange, name: opaqueTag): typings.ecmarkdown.nodeTypesMod.OpaqueTagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.OpaqueTagNode]
  }
  
  @scala.inline
  def OrderedListItemNode(contents: js.Array[FragmentNode], location: LocationRange, name: `ordered-list-item`): typings.ecmarkdown.nodeTypesMod.OrderedListItemNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.OrderedListItemNode]
  }
  
  @scala.inline
  def OrderedListNode(
    contents: js.Array[OrderedListItemNode],
    indent: Double,
    location: LocationRange,
    name: ol,
    start: Double
  ): typings.ecmarkdown.nodeTypesMod.OrderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.OrderedListNode]
  }
  
  @scala.inline
  def PipeNode(
    contents: Null,
    location: LocationRange,
    name: pipe,
    nonTerminal: String,
    optional: Boolean,
    params: String
  ): typings.ecmarkdown.nodeTypesMod.PipeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.PipeNode]
  }
  
  @scala.inline
  def StarNode(contents: js.Array[FragmentNode], location: LocationRange, name: star): typings.ecmarkdown.nodeTypesMod.StarNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.StarNode]
  }
  
  @scala.inline
  def TagNode(contents: String, location: LocationRange, name: tag): typings.ecmarkdown.nodeTypesMod.TagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TagNode]
  }
  
  @scala.inline
  def TextNode(contents: String, location: LocationRange, name: text): typings.ecmarkdown.nodeTypesMod.TextNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TextNode]
  }
  
  @scala.inline
  def TickNode(contents: js.Array[FragmentNode], location: LocationRange, name: tick): typings.ecmarkdown.nodeTypesMod.TickNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TickNode]
  }
  
  @scala.inline
  def TildeNode(contents: js.Array[FragmentNode], location: LocationRange, name: tilde): typings.ecmarkdown.nodeTypesMod.TildeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TildeNode]
  }
  
  @scala.inline
  def UnderscoreNode(contents: js.Array[FragmentNode], location: LocationRange, name: underscore): typings.ecmarkdown.nodeTypesMod.UnderscoreNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.UnderscoreNode]
  }
  
  @scala.inline
  def UnorderedListItemNode(contents: js.Array[FragmentNode], location: LocationRange, name: `unordered-list-item`): typings.ecmarkdown.nodeTypesMod.UnorderedListItemNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.UnorderedListItemNode]
  }
  
  @scala.inline
  def UnorderedListNode(contents: js.Array[UnorderedListItemNode], indent: Double, location: LocationRange, name: ul): typings.ecmarkdown.nodeTypesMod.UnorderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.UnorderedListNode]
  }
}
