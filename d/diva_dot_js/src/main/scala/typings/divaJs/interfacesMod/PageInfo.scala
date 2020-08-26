package typings.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInfo extends js.Object {
  var dimensions: Dimensions = js.native
  var group: PageGroup = js.native
  var groupOffset: Offset = js.native
  var index: Double = js.native
}

object PageInfo {
  @scala.inline
  def apply(dimensions: Dimensions, group: PageGroup, groupOffset: Offset, index: Double): PageInfo = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], groupOffset = groupOffset.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
  @scala.inline
  implicit class PageInfoOps[Self <: PageInfo] (val x: Self) extends AnyVal {
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
    def setDimensions(value: Dimensions): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: PageGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupOffset(value: Offset): Self = this.set("groupOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
  
}

