package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.tick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TickNode
  extends FormatNode
     with Node {
  var contents: js.Array[FragmentNode] = js.native
  var location: js.UndefOr[LocationRange] = js.native
  var name: tick = js.native
}

object TickNode {
  @scala.inline
  def apply(contents: js.Array[FragmentNode], name: tick): TickNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickNode]
  }
  @scala.inline
  implicit class TickNodeOps[Self <: TickNode] (val x: Self) extends AnyVal {
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
    def setContentsVarargs(value: FragmentNode*): Self = this.set("contents", js.Array(value :_*))
    @scala.inline
    def setContents(value: js.Array[FragmentNode]): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: tick): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LocationRange): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

