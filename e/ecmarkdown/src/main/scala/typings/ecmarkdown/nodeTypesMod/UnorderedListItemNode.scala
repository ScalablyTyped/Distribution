package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.`unordered-list-item`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnorderedListItemNode extends Node {
  var contents: js.Array[FragmentNode]
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: `unordered-list-item`
  var sublist: ListNode | Null
}

object UnorderedListItemNode {
  @scala.inline
  def apply(
    contents: js.Array[FragmentNode],
    name: `unordered-list-item`,
    location: LocationRange = null,
    sublist: ListNode = null
  ): UnorderedListItemNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sublist = sublist.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnorderedListItemNode]
  }
}

