package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.ul
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnorderedListNode
  extends ListNode
     with Node {
  var contents: js.Array[UnorderedListItemNode]
  var indent: Double
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: ul
}

object UnorderedListNode {
  @scala.inline
  def apply(
    contents: js.Array[UnorderedListItemNode],
    indent: Double,
    name: ul,
    location: LocationRange = null
  ): UnorderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnorderedListNode]
  }
}

