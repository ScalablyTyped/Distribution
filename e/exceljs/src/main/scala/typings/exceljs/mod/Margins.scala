package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Margins extends js.Object {
  var bottom: Double = js.native
  var footer: Double = js.native
  var header: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
}

object Margins {
  @scala.inline
  def apply(bottom: Double, footer: Double, header: Double, left: Double, right: Double, top: Double): Margins = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margins]
  }
  @scala.inline
  implicit class MarginsOps[Self <: Margins] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: Double): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: Double): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

