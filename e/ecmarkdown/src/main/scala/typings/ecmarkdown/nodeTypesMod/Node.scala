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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Node extends js.Object

object Node {
  @scala.inline
  def TagNode(contents: String, name: tag, location: LocationRange = null): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def PipeNode(
    contents: Null,
    name: pipe,
    nonTerminal: String,
    optional: Boolean,
    params: String,
    location: LocationRange = null
  ): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def TildeNode(contents: js.Array[FragmentNode], name: tilde, location: LocationRange = null): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def OrderedListItemNode(
    contents: js.Array[FragmentNode],
    name: `ordered-list-item`,
    location: LocationRange = null,
    sublist: ListNode = null
  ): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sublist = sublist.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def StarNode(contents: js.Array[FragmentNode], name: star, location: LocationRange = null): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def AlgorithmNode(contents: OrderedListNode, name: algorithm, location: LocationRange = null): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def TextNode(contents: String, name: text, location: LocationRange = null): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def UnorderedListItemNode(
    contents: js.Array[FragmentNode],
    name: `unordered-list-item`,
    location: LocationRange = null,
    sublist: ListNode = null
  ): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sublist = sublist.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def UnderscoreNode(contents: js.Array[FragmentNode], name: underscore, location: LocationRange = null): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def CommentNode(contents: String, name: comment, location: LocationRange = null): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def OrderedListNode(
    contents: js.Array[OrderedListItemNode],
    indent: Double,
    name: ol,
    start: Double,
    location: LocationRange = null
  ): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def TickNode(contents: js.Array[FragmentNode], name: tick, location: LocationRange = null): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def OpaqueTagNode(contents: String, name: opaqueTag, location: LocationRange = null): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def UnorderedListNode(
    contents: js.Array[UnorderedListItemNode],
    indent: Double,
    name: ul,
    location: LocationRange = null
  ): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

