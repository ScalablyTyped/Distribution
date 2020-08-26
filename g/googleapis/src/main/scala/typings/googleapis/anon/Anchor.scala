package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anchor extends js.Object {
  var anchor: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var label_with_op: js.UndefOr[String] = js.native
}

object Anchor {
  @scala.inline
  def apply(): Anchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anchor]
  }
  @scala.inline
  implicit class AnchorOps[Self <: Anchor] (val x: Self) extends AnyVal {
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
    def setAnchor(value: String): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabel_with_op(value: String): Self = this.set("label_with_op", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel_with_op: Self = this.set("label_with_op", js.undefined)
  }
  
}

