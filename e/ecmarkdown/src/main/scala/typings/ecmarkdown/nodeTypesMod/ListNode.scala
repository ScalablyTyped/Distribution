package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.ol
import typings.ecmarkdown.ecmarkdownStrings.ul
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkdown.nodeTypesMod.UnorderedListNode
  - typings.ecmarkdown.nodeTypesMod.OrderedListNode
*/
trait ListNode extends js.Object

object ListNode {
  @scala.inline
  def UnorderedListNode(
    contents: js.Array[UnorderedListItemNode],
    indent: Double,
    name: ul,
    location: LocationRange = null
  ): ListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNode]
  }
  @scala.inline
  def OrderedListNode(
    contents: js.Array[OrderedListItemNode],
    indent: Double,
    name: ol,
    start: Double,
    location: LocationRange = null
  ): ListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNode]
  }
}

