package typings.ecmarkdown.nodeTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkdown.nodeTypesMod.TextNode
  - typings.ecmarkdown.nodeTypesMod.FormatNode
  - typings.ecmarkdown.nodeTypesMod.CommentNode
  - typings.ecmarkdown.nodeTypesMod.TagNode
  - typings.ecmarkdown.nodeTypesMod.OpaqueTagNode
*/
trait FragmentNode extends StObject
object FragmentNode {
  
  @scala.inline
  def CommentNode(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.CommentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "comment")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.CommentNode]
  }
  
  @scala.inline
  def OpaqueTagNode(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.OpaqueTagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "opaqueTag")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.OpaqueTagNode]
  }
  
  @scala.inline
  def PipeNode(contents: Null, location: LocationRange, nonTerminal: String, optional: Boolean, params: String): typings.ecmarkdown.nodeTypesMod.PipeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "pipe", nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.PipeNode]
  }
  
  @scala.inline
  def StarNode(contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.nodeTypesMod.StarNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "star")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.StarNode]
  }
  
  @scala.inline
  def TagNode(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.TagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tag")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TagNode]
  }
  
  @scala.inline
  def TextNode(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.TextNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "text")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TextNode]
  }
  
  @scala.inline
  def TickNode(contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.nodeTypesMod.TickNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tick")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TickNode]
  }
  
  @scala.inline
  def TildeNode(contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.nodeTypesMod.TildeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tilde")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TildeNode]
  }
  
  @scala.inline
  def UnderscoreNode(contents: js.Array[FragmentNode], location: LocationRange): typings.ecmarkdown.nodeTypesMod.UnderscoreNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "underscore")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.UnderscoreNode]
  }
}
