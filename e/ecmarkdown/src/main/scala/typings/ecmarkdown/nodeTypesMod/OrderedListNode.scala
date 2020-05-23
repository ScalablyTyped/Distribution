package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.ol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderedListNode
  extends ListNode
     with Node {
  var contents: js.Array[OrderedListItemNode]
  var indent: Double
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: ol
  var start: Double
}

object OrderedListNode {
  @scala.inline
  def apply(
    contents: js.Array[OrderedListItemNode],
    indent: Double,
    name: ol,
    start: Double,
    location: LocationRange = null
  ): OrderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedListNode]
  }
}

