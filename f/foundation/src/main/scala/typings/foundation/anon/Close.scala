package typings.foundation.anon

import typings.foundation.Foundation.RevealCSSOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Close extends js.Object {
  var close: js.UndefOr[RevealCSSOptions] = js.native
  var open: js.UndefOr[RevealCSSOptions] = js.native
}

object Close {
  @scala.inline
  def apply(): Close = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Close]
  }
  @scala.inline
  implicit class CloseOps[Self <: Close] (val x: Self) extends AnyVal {
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
    def setClose(value: RevealCSSOptions): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setOpen(value: RevealCSSOptions): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
  
}

