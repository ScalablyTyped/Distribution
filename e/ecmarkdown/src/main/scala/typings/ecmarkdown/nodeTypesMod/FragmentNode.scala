package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.comment
import typings.ecmarkdown.ecmarkdownStrings.opaqueTag
import typings.ecmarkdown.ecmarkdownStrings.pipe
import typings.ecmarkdown.ecmarkdownStrings.star
import typings.ecmarkdown.ecmarkdownStrings.tag
import typings.ecmarkdown.ecmarkdownStrings.text
import typings.ecmarkdown.ecmarkdownStrings.tick
import typings.ecmarkdown.ecmarkdownStrings.tilde
import typings.ecmarkdown.ecmarkdownStrings.underscore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkdown.nodeTypesMod.TextNode
  - typings.ecmarkdown.nodeTypesMod.FormatNode
  - typings.ecmarkdown.nodeTypesMod.CommentNode
  - typings.ecmarkdown.nodeTypesMod.TagNode
  - typings.ecmarkdown.nodeTypesMod.OpaqueTagNode
*/
trait FragmentNode extends js.Object

object FragmentNode {
  @scala.inline
  def TagNode(contents: String, name: tag, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def PipeNode(
    contents: Null,
    name: pipe,
    nonTerminal: String,
    optional: Boolean,
    params: String,
    location: LocationRange = null
  ): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def TildeNode(contents: js.Array[FragmentNode], name: tilde, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def StarNode(contents: js.Array[FragmentNode], name: star, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def TextNode(contents: String, name: text, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def UnderscoreNode(contents: js.Array[FragmentNode], name: underscore, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def CommentNode(contents: String, name: comment, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def TickNode(contents: js.Array[FragmentNode], name: tick, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def OpaqueTagNode(contents: String, name: opaqueTag, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
}

