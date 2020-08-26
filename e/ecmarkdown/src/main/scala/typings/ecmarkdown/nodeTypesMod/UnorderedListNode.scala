package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.ul
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnorderedListNode
  extends ListNode
     with Node {
  var contents: js.Array[UnorderedListItemNode] = js.native
  var indent: Double = js.native
  var location: js.UndefOr[LocationRange] = js.native
  var name: ul = js.native
}

object UnorderedListNode {
  @scala.inline
  def apply(contents: js.Array[UnorderedListItemNode], indent: Double, name: ul): UnorderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnorderedListNode]
  }
  @scala.inline
  implicit class UnorderedListNodeOps[Self <: UnorderedListNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentsVarargs(value: UnorderedListItemNode*): Self = this.set("contents", js.Array(value :_*))
    @scala.inline
    def setContents(value: js.Array[UnorderedListItemNode]): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ul): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LocationRange): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

