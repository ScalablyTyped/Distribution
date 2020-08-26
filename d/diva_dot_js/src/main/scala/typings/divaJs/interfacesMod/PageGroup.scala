package typings.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageGroup extends js.Object {
  var dimensions: Dimensions = js.native
  var index: Double = js.native
  var padding: Offset = js.native
  var pages: js.Array[Double] = js.native
  var region: Region = js.native
}

object PageGroup {
  @scala.inline
  def apply(dimensions: Dimensions, index: Double, padding: Offset, pages: js.Array[Double], region: Region): PageGroup = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageGroup]
  }
  @scala.inline
  implicit class PageGroupOps[Self <: PageGroup] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setPadding(value: Offset): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagesVarargs(value: Double*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[Double]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
  }
  
}

