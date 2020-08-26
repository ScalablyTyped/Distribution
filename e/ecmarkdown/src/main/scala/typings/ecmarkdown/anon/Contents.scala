package typings.ecmarkdown.anon

import typings.ecmarkdown.ecmarkdownStrings.algorithm
import typings.ecmarkdown.nodeTypesMod.OrderedListNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contents extends js.Object {
  var contents: OrderedListNode = js.native
  var name: algorithm = js.native
}

object Contents {
  @scala.inline
  def apply(contents: OrderedListNode, name: algorithm): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
  @scala.inline
  implicit class ContentsOps[Self <: Contents] (val x: Self) extends AnyVal {
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
    def setContents(value: OrderedListNode): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: algorithm): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

