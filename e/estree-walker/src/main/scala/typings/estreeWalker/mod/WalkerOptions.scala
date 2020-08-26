package typings.estreeWalker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkerOptions extends js.Object {
  var enter: js.UndefOr[WalkerListener] = js.native
  var leave: js.UndefOr[WalkerListener] = js.native
}

object WalkerOptions {
  @scala.inline
  def apply(): WalkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkerOptions]
  }
  @scala.inline
  implicit class WalkerOptionsOps[Self <: WalkerOptions] (val x: Self) extends AnyVal {
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
    def setEnter(value: WalkerListener): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setLeave(value: WalkerListener): Self = this.set("leave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
  }
  
}

