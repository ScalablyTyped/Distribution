package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checked extends js.Object {
  var checked: js.UndefOr[js.Any] = js.native
  var unchecked: js.UndefOr[js.Any] = js.native
}

object Checked {
  @scala.inline
  def apply(): Checked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checked]
  }
  @scala.inline
  implicit class CheckedOps[Self <: Checked] (val x: Self) extends AnyVal {
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
    def setChecked(value: js.Any): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setUnchecked(value: js.Any): Self = this.set("unchecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnchecked: Self = this.set("unchecked", js.undefined)
  }
  
}

