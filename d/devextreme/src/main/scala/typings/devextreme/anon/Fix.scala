package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fix extends js.Object {
  var fix: js.UndefOr[String] = js.native
  var leftPosition: js.UndefOr[String] = js.native
  var rightPosition: js.UndefOr[String] = js.native
  var unfix: js.UndefOr[String] = js.native
}

object Fix {
  @scala.inline
  def apply(): Fix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fix]
  }
  @scala.inline
  implicit class FixOps[Self <: Fix] (val x: Self) extends AnyVal {
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
    def setFix(value: String): Self = this.set("fix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFix: Self = this.set("fix", js.undefined)
    @scala.inline
    def setLeftPosition(value: String): Self = this.set("leftPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftPosition: Self = this.set("leftPosition", js.undefined)
    @scala.inline
    def setRightPosition(value: String): Self = this.set("rightPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightPosition: Self = this.set("rightPosition", js.undefined)
    @scala.inline
    def setUnfix(value: String): Self = this.set("unfix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnfix: Self = this.set("unfix", js.undefined)
  }
  
}

